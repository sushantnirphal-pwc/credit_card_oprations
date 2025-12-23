package com.creditcard.customer.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@ConfigurationProperties(prefix = "security")
public class SecurityProperties {
    
    private Jwt jwt = new Jwt();
    
    private List<String> allowedOrigins = new ArrayList<>();
    public static class Jwt {
        private String secret;
        private long expiration = 86400000; // 24 hours
        private String header = "Authorization";
        private String prefix = "Bearer ";
		public String getSecret() {
			return secret;
		}
		public void setSecret(String secret) {
			this.secret = secret;
		}
		public long getExpiration() {
			return expiration;
		}
		public void setExpiration(long expiration) {
			this.expiration = expiration;
		}
		public String getHeader() {
			return header;
		}
		public void setHeader(String header) {
			this.header = header;
		}
		public String getPrefix() {
			return prefix;
		}
		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}
        
        
    }

    public Jwt getJwt() {
        return this.jwt;
    }

    public void setJwt(Jwt jwt) {
        this.jwt = jwt;
    }

    public List<String> getAllowedOrigins() {
        return this.allowedOrigins;
    }

    public void setAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public String getSecret() {
        return this.secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getHeader() {
        return this.header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}