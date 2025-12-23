package com.creditcard.transaction.feign;

import com.creditcard.transaction.dto.ApiResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class CustomerServiceClientFallback implements CustomerServiceClient {
    private static final Logger log = LoggerFactory.getLogger(CustomerServiceClientFallback.class);


    @Override
    public ApiResponse<CustomerDTO> getCustomerById(Long id) {
        log.error("Customer Service is down. Fallback triggered for getCustomerById: {}", id);
        
        return new ApiResponse<>(
            false,
            "Customer Service is temporarily unavailable",
            null,
            null,
            LocalDateTime.now()
        );
    }

    @Override
    public ApiResponse<Boolean> customerExists(Long id) {
        log.error("Customer Service is down. Fallback triggered for customerExists: {}", id);
        
        return new ApiResponse<>(
            false,
            "Customer Service is temporarily unavailable",
            null,
            null,
            LocalDateTime.now()
        );
    }
}