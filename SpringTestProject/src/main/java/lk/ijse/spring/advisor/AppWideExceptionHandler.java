package lk.ijse.spring.advisor;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Tharindu Nilanga
 * @created 6/19/2022
 */
@CrossOrigin
@RestControllerAdvice
public class AppWideExceptionHandler {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
