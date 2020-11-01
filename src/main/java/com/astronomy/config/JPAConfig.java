package com.astronomy.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@EnableJpaRepositories(basePackages = { "com.green.dao" })
@EnableTransactionManagement // anotation handles the opening and closing of transactions, such as commit,
// rollback, close obj
public class JPAConfig {

	@Bean 
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource()); 
		em.setPersistenceUnitName("persistence-data");
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(additionalProperties());// put properties for JPA
		System.out.println("1");
		return em;
	}

	@Bean
	JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		System.out.println("2");
		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		System.out.println("3");
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://us-cdbr-east-02.cleardb.com:3306/heroku_4d641f9a0c79265");
//		dataSource.setUsername("b62957f381f14f");
//		dataSource.setPassword("ea1308b2");
		dataSource.setUrl("jdbc:mysql://localhost:3306/astronomy");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		System.out.println("4");
		return dataSource;
	}

	Properties additionalProperties() {
		Properties properties = new Properties();
// properties.setProperty("hibernate.hbm2ddl.auto", "create-drop"); // Create db
// from java entity class when we not have db, create db when we run and drop
// when we turn off server
		properties.setProperty("hibernate.hbm2ddl.auto", "none");
		properties.setProperty("hibernate.hbm2ddl.auto", "create");
		properties.setProperty("hibernate.enable_lazy_load_no_trans", "true");
		System.out.println("5");
		return properties;
	}
}
