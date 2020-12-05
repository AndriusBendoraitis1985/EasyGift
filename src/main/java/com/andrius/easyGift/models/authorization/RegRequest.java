package com.andrius.easyGift.models.authorization;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class RegRequest {

    @NotNull
    private String userName;
    @NotNull
    private String password;
    @NotNull
    private String email;
    @NotNull
    private String logoPath;

}
