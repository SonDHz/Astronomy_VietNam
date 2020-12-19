package com.astronomy.Utils;

import javax.servlet.http.HttpServletRequest;

public class NavigateUtils {
	
	public static String toReferer(HttpServletRequest request) {
		return "redirect:" + request.getHeader("Referer");
	}
}
