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
		http.csrf().and().cors().disable()
		.authorizeRequests()//
				.antMatchers("/", "/shoppingTools/**", "/template/**", "/login", "/logout"//
						, "/page/**", "/getImageView", "/productViewDetail/**", "/registration", "/contact", "/getImageViewPost"
						, "/postViewDetail/**","/getImageViewPostDashboard", "/about_us")
				.permitAll()//
				.antMatchers("/admin/**").hasAnyAuthority("ADMIN")//
				.antMatchers("/user/**").hasAnyAuthority("USER")//
				.anyRequest().authenticated().and()//
				.formLogin()//
				.loginProcessingUrl("/j_spring_security_login")//
				.loginPage("/login")//
				.usernameParameter("j_username")//
				.passwordParameter("j_password")//
				.successHandler(successHander)//
				.failureUrl("/login?error")//
				.and().exceptionHandling().accessDeniedPage("/login");//
	}

}
