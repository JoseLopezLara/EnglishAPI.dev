package dev.englishapi.english_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class ModelMapperConfig {
    
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        // Key configuration: Ignore null fields when mapping.
        // This is crucial for partial updates (PATCH/PUT).
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        return modelMapper;
    }
}
