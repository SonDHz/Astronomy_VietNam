package com.astronomy.Utils;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;

import com.astronomy.dto.MyUser;

public class SecurityUtils {
	public static MyUser getPrincipal() {
		MyUser myUser = (MyUser) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
        return myUser;
    }
}
