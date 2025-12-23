package com.creditcard.auth.dto;

import java.time.LocalDateTime;

public class AuthResponse {
    private String token;
    private String refreshToken;
    private LocalDateTime expiresAt;
    private UserDTO user;

    public AuthResponse() {}

    public AuthResponse(String token, String refreshToken, LocalDateTime expiresAt, UserDTO user) {
        this.token = token;
        this.refreshToken = refreshToken;
        this.expiresAt = expiresAt;
        this.user = user;
    }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getRefreshToken() { return refreshToken; }
    public void setRefreshToken(String refreshToken) { this.refreshToken = refreshToken; }

    public LocalDateTime getExpiresAt() { return expiresAt; }
    public void setExpiresAt(LocalDateTime expiresAt) { this.expiresAt = expiresAt; }

    public UserDTO getUser() { return user; }
    public void setUser(UserDTO user) { this.user = user; }

    // ---- Builder ----
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String token;
        private String refreshToken;
        private LocalDateTime expiresAt;
        private UserDTO user;

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder expiresAt(LocalDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder user(UserDTO user) {
            this.user = user;
            return this;
        }

        public AuthResponse build() {
            return new AuthResponse(token, refreshToken, expiresAt, user);
        }
    }

    // ---- Inner DTO + its Builder (since you use AuthResponse.UserDTO.builder()) ----
    public static class UserDTO {
        private Long id;
        private String username;
        private String email;
        private String firstName;
        private String lastName;
        private Object role; // replace Object with your Role enum/class

        public UserDTO() {}

        public UserDTO(Long id, String username, String email, String firstName, String lastName, Object role) {
            this.id = id;
            this.username = username;
            this.email = email;
            this.firstName = firstName;
            this.lastName = lastName;
            this.role = role;
        }

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }

        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }

        public Object getRole() { return role; }
        public void setRole(Object role) { this.role = role; }

        public static UserDTOBuilder builder() {
            return new UserDTOBuilder();
        }

        public static class UserDTOBuilder {
            private Long id;
            private String username;
            private String email;
            private String firstName;
            private String lastName;
            private Object role; // replace with Role

            public UserDTOBuilder id(Long id) { this.id = id; return this; }
            public UserDTOBuilder username(String username) { this.username = username; return this; }
            public UserDTOBuilder email(String email) { this.email = email; return this; }
            public UserDTOBuilder firstName(String firstName) { this.firstName = firstName; return this; }
            public UserDTOBuilder lastName(String lastName) { this.lastName = lastName; return this; }
            public UserDTOBuilder role(Object role) { this.role = role; return this; }

            public UserDTO build() {
                return new UserDTO(id, username, email, firstName, lastName, role);
            }
        }
    }
}
