package fr.iamludal.batch;

import fr.iamludal.commonlib.CommonMethods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchApplication {
    private static final Logger logger = LoggerFactory.getLogger(BatchApplication.class);

    public static void main(String[] args) {
        logger.info(CommonMethods.concat("Hello", "Batch"));
        SpringApplication.run(BatchApplication.class, args);
    }

}
