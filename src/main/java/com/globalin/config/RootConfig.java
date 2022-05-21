package com.globalin.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// 스프링 설정 파일
@ComponentScan(basePackages = { "com.globalin.sample" })
@ComponentScan(basePackages = { "com.globalin.car" })
// myBatis 매퍼파일 스캔 위치 지정
@MapperScan(basePackages = { "com.globalin.mapper" })
public class RootConfig {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("spring");
		ds.setPassword("1234");
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		return ds;
	}

	@Bean
	public SqlSessionFactoryBean sessionFactory() {
		SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
		sfb.setDataSource(dataSource());
		return sfb;
	}

//	@Bean
//	public MyCar mycar() {
//		return new MyCar();
//	}
}
