package com.ssafy.booxby.web.dto;

import lombok.*;

public class UserDto {

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class loginRequest {
        private String email;
        private String password;
    }

    @Getter
    @NoArgsConstructor
    public static class loginResponse {
        private String token;
        private Long userId;

        @Builder
        public loginResponse(String token, Long userId) {
            this.token = token;
            this.userId = userId;
        }
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class tokenResponse {
        private String token;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class signupRequest {
        private String email;
        private String nickname;
        private String password;
        private int age;
        private int gender;
        private String hashtag;
    }
}