package com.creditcard.creditcard_service.feign;
import org.springframework.stereotype.Component;

import com.creditcard.creditcard_service.dto.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class CustomerServiceClientFallback implements CustomerServiceClient {
    private static final Logger log = LoggerFactory.getLogger(CustomerServiceClientFallback.class);


    @Override
    public ApiResponse<CustomerDTO> getCustomerById(Long id) {
        log.error("Customer Service is down. Fallback triggered for getCustomerById: {}", id);
        return ApiResponse.error("Customer Service is temporarily unavailable");
    }

    @Override
    public ApiResponse<Boolean> customerExists(Long id) {
        log.error("Customer Service is down. Fallback triggered for customerExists: {}", id);
        return ApiResponse.error("Customer Service is temporarily unavailable");
    }
}