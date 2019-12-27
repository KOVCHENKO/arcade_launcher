package ru.com.arcadelauncher.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("ru.com.arcadelauncher")
@EnableTransactionManagement
public class AppConfig {
}
