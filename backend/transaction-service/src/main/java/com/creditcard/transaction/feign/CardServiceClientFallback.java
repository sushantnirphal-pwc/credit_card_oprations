package com.creditcard.transaction.feign;

import com.creditcard.transaction.dto.ApiResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class CardServiceClientFallback implements CardServiceClient {
    private static final Logger log = LoggerFactory.getLogger(CardServiceClientFallback.class);


    @Override
    public ApiResponse<CardDTO> getCardById(Long id) {
        log.error("Card Service is down. Fallback triggered for getCardById: {}", id);
        
        return new ApiResponse<>(
            false,
            "Card Service is temporarily unavailable",
            null,
            null,
            LocalDateTime.now()
        );
    }

    @Override
    public ApiResponse<Boolean> cardExists(Long id) {
        log.error("Card Service is down. Fallback triggered for cardExists: {}", id);
        
        return new ApiResponse<>(
            false,
            "Card Service is temporarily unavailable",
            null,
            null,
            LocalDateTime.now()
        );
    }

    @Override
    public ApiResponse<CardDTO> updateCardBalance(Long id, BalanceUpdateRequest request) {
        log.error("Card Service is down. Fallback triggered for updateCardBalance - CardId: {}, Amount: {}, IsDebit: {}", 
            id, request != null ? request.getAmount() : null, request != null ? request.getIsDebit() : null);
        
        return new ApiResponse<>(
            false,
            "Card Service is temporarily unavailable. Please try again later.",
            null,
            null,
            LocalDateTime.now()
        );
    }
}