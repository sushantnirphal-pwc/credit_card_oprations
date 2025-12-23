package com.creditcard.creditcard_service.mapper;

import org.springframework.stereotype.Component;

import com.creditcard.creditcard_service.dto.CardRequestDTO;
import com.creditcard.creditcard_service.dto.CardResponseDTO;
import com.creditcard.creditcard_service.entity.Card;
import com.creditcard.creditcard_service.enums.CardType;

@Component
public class CardMapper {

    public Card toEntity(CardRequestDTO dto) {
        if (dto == null) {
            throw new IllegalArgumentException("CardRequestDTO cannot be null");
        }
        if (dto.getCardType() == null) {
            throw new IllegalArgumentException("cardType is required");
        }

        Card card = new Card();
        card.setCustomerId(dto.getCustomerId());
        card.setCardHolderName(dto.getCardHolderName());
        card.setCardType(dto.getCardType());

        Double creditLimit = dto.getCreditLimit();
        if (creditLimit == null) {
            creditLimit = defaultCreditLimit(dto.getCardType());
        }
        card.setCreditLimit(creditLimit);

        Double dailyLimit = dto.getDailyLimit();
        if (dailyLimit == null) {
            dailyLimit = defaultDailyLimit(dto.getCardType());
        }
        card.setDailyLimit(dailyLimit);

        card.setAvailableCredit(creditLimit);
        return card;
    }

    public CardResponseDTO toDTO(Card card) {
        if (card == null) return null;

        CardResponseDTO dto = new CardResponseDTO();
        dto.setId(card.getId());
        dto.setCardNumber(card.getCardNumber());
        dto.setMaskedCardNumber(maskCardNumber(card.getCardNumber()));

        dto.setCustomerId(card.getCustomerId());
        dto.setCardHolderName(card.getCardHolderName());
        dto.setCardType(card.getCardType());
        dto.setStatus(card.getStatus());
        dto.setCreditLimit(card.getCreditLimit());
        dto.setAvailableCredit(card.getAvailableCredit());
        dto.setDailyLimit(card.getDailyLimit());
        dto.setIssueDate(card.getIssueDate());
        dto.setExpiryDate(card.getExpiryDate());
        dto.setActivationDate(card.getActivationDate());
        dto.setLastUsedDate(card.getLastUsedDate());
        dto.setCreatedAt(card.getCreatedAt());
        dto.setUpdatedAt(card.getUpdatedAt());

        return dto;
    }

    // ---- helpers ----

    private Double defaultCreditLimit(CardType type) {
        // Works even if enum constants are different
        String t = type.name().toUpperCase();

        if (t.contains("SILVER")) return 50000.0;
        if (t.contains("GOLD")) return 100000.0;
        if (t.contains("PLATINUM")) return 200000.0;

        // fallback
        return 50000.0;
    }

    private Double defaultDailyLimit(CardType type) {
        String t = type.name().toUpperCase();

        if (t.contains("SILVER")) return 20000.0;
        if (t.contains("GOLD")) return 40000.0;
        if (t.contains("PLATINUM")) return 80000.0;

        return 20000.0;
    }

    private String maskCardNumber(String cardNumber) {
        if (cardNumber == null) return null;
        int len = cardNumber.length();
        if (len <= 4) return "****";
        return "**** **** **** " + cardNumber.substring(len - 4);
    }
}
