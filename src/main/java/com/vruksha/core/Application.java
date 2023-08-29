package com.vruksha.core;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vruksha.core.config.AppConfig;
import com.vruksha.core.model.ExecutionFlow;

@SpringBootApplication

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Autowired
    AppConfig appConfig;
    
    @Bean
	CommandLineRunner runner() {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<ExecutionFlow> typeReference = new TypeReference<ExecutionFlow>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/flow.json");
			try {
				ExecutionFlow executionFlow = mapper.readValue(inputStream,typeReference);
				appConfig.setExecutionFlow(executionFlow);
			} catch (Exception e){
				e.printStackTrace();
			}
		};
	}

}
