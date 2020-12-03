//package com.astronomy.security;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.domain.AuditorAware;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import org.springframework.security.core.context.SecurityContextHolder;
//
//import com.astronomy.entity.UserEntity;
//import com.astronomy.repository.UserRepository;
//
//@Configuration
//@EnableJpaAuditing
//public class JpaAuditingConfig {
//	
//	@Autowired
//	private static UserRepository repo;
//	
//	public AuditorAwareImpl auditorProvider() {
//		System.out.println("0");
//		return new AuditorAwareImpl();
//	}
//
//	public static class AuditorAwareImpl implements AuditorAware<UserEntity> {
//		@Override
//		public Optional<UserEntity> getCurrentAuditor() {
//			// Nơi spring security get thông tin để set field createBy...
//			String username = SecurityContextHolder.getContext().getAuthentication().getName();
//			if (username == null) {
//				return null;
//			}
//			System.out.println("5");
//			return Optional.ofNullable(repo.findByUsername(username));
//			
////			return Optional.ofNullable(authentication.getName());
//		}
//	}
//}


