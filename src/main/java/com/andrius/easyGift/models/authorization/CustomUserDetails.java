package com.andrius.easyGift.models.authorization;

import com.andrius.easyGift.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class CustomUserDetails implements UserDetails {
    private String userName;
    private String password;
    private String email;
    private String logoPath;
    private Collection<? extends GrantedAuthority> grantedAuthorities;

    public static CustomUserDetails fromUserToCustomUserDetails (User user){
        CustomUserDetails customUserDetails = new CustomUserDetails();
        customUserDetails.userName = user.getUserName();
        customUserDetails.password = user.getPassword();
        customUserDetails.email = user.getEmail();
        customUserDetails.logoPath = user.getLogoPath();
        customUserDetails.grantedAuthorities =
                Collections.singleton(new SimpleGrantedAuthority(user.getRole().getName()));
        return customUserDetails;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
