package com.example.springnative.springnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@SpringBootApplication
public class SpringnativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringnativeApplication.class, args);
	}

	@Bean
	RouterFunction<ServerResponse> routes() {
		return route()
				.GET("/", request -> ok().body(Mono.just("Hello Worlld com Spring Native"), String.class))
				.build();
	}

}
