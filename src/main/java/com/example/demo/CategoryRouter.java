package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class CategoryRouter {

    @Autowired
    public CategoryRepository categoryRepository;

    @Bean
    public RouterFunction<ServerResponse> getAllCategoriesRoute() {
        return route(GET("/category"),
                req ->
                        ok().body(
                                categoryRepository.findAll(), Category.class)
        );
    }
}
