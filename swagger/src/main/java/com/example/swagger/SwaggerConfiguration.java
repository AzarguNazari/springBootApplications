package com.example.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SwaggerConfiguration {

    @Bean
    public OpenAPI configPage(){
        return new OpenAPI().info(new Info().title("My App").version("1.1.1")).components(new Components());
    }

    @Bean
    public GroupedOpenApi testGroup(){
        return GroupedOpenApi.builder().setGroup("Test Group").pathsToMatch("/test/**").packagesToScan("com.example").build();
    }

    @Bean
    public GroupedOpenApi anotherTestGroup(){
        return GroupedOpenApi.builder().setGroup("Another Test Group").pathsToMatch("/anotherOne/**").packagesToScan("com.example").build();
    }

    @Bean
    public GroupedOpenApi studentGroup(){
        return GroupedOpenApi.builder().setGroup("Student Test Group").pathsToMatch("/students/**").packagesToScan("com.example").build();
    }
}
