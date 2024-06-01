package com.AR.courses.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = " DOCUMENTATION OF COURSE MANAGER.", version = "1.0", description = "COURSE => It is an application for the management and optimization of course administration."))
public class OpenApiConfig {

}
