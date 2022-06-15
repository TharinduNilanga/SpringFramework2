package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Tharindu Nilanga
 * @created 6/13/2022
 */
@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {
}
