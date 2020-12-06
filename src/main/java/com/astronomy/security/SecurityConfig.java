package com.astronomy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.astronomy.Service.impl.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private MyUserDetailsService userDetailsService;
	
	@Autowired
	private CustomSuccessHandler successHander;

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// Set đặt dịch vụ để tìm kiếm User trong Database.
		// Và set đặt PasswordEncoder.
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http
			.csrf().disable()
			.authorizeRequests()//
				.antMatchers("/", "/shoppingTools/**", "/template/**", "/login", "/logout", "/page/**", "/getImageView").permitAll()//
				.antMatchers("/admin/**").hasAnyAuthority("ADMIN")//
				.antMatchers("/user/**").hasAnyAuthority("USER")//
				.anyRequest().authenticated()
				.and()//
			.formLogin()//
				.loginProcessingUrl("/j_spring_security_login")//
				.loginPage("/login")//
				.usernameParameter("j_username")//
				.passwordParameter("j_password")//
				.successHandler(successHander)//
                .failureUrl("/login?error")//
                .and()//
            .exceptionHandling()//
            	.and()
            	.exceptionHandling()
                .accessDeniedPage("/login");//
		
//		// Chỉ cho phép user có quyền ADMIN truy cập đường dẫn /admin/**
//		http.authorizeRequests().antMatchers("/admin/**").access("hasRole('ADMIN')");
//		// Chỉ cho phép user có quyền ADMIN hoặc USER truy cập đường dẫn
//		// /user/**
//		http.authorizeRequests().antMatchers("/user/**").access("hasRole('ADMIN') or hasRole('USER')");
//		// Khi người dùng đã login, với vai trò USER, Nhưng truy cập vào trang
//		// yêu cầu vai trò ADMIN, sẽ chuyển hướng tới trang /403
//		http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
//		// Cấu hình cho Login Form.
//		http.authorizeRequests().and().formLogin()//
//				.loginProcessingUrl("/j_spring_security_login")//
//				.loginPage("/login")//
//				.defaultSuccessUrl("/user")//
//				.failureUrl("/login?message=error")//
//				.usernameParameter("username")//
//				.passwordParameter("password")
//				// Cấu hình cho Logout Page.
//				.and().logout().logoutUrl("/j_spring_security_logout").logoutSuccessUrl("/login?message=logout");
	}

}
