package fr.iamludal.api;

import fr.iamludal.commonlib.CommonMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
    private static final Logger logger = LoggerFactory.getLogger(ApiApplication.class);

    public static void main(String[] args) {
        logger.info(CommonMethods.concat("Hello", "API"));
        SpringApplication.run(ApiApplication.class, args);
    }

}
