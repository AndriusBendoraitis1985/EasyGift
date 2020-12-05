package com.andrius.easyGift.models.authorization;

import com.andrius.easyGift.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {

    private String token;
    private User user;

}
