package com.ouchin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationContext.xml")
@Import(DatabaseConfig.class)
public class AppConfig {

}


@Configuration
class DatabaseConfig{

}