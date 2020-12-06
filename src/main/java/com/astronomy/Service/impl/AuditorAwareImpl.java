package com.astronomy.Service.impl;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuditorAwareImpl implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		// Nơi spring security get thông tin để set field createBy...
		String authentication = SecurityContextHolder.getContext().getAuthentication().getName();
		if (authentication == null) {
			return null;
		}
		return Optional.ofNullable(authentication);

//		return Optional.ofNullable(authentication.getName());
	}
}