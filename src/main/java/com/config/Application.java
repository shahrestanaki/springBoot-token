package com.config;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:application.properties"})
public class Application {
    /*private final Logger logger = LoggerFactory.getLogger(getClass());*/
    public static void main(String[] args) {
        /*logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");*/
        SpringApplication.run(Application.class, args);

    }

    /*@Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        return new JdbcTemplate(dataSource);
    }*/
}
