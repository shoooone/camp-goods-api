package com.choice.campgoodsapi.router;

import com.choice.campgoodsapi.handler.MakerHandler;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@AllArgsConstructor
public class MakerRouter implements Router {

  private MakerHandler handler;

  @Override
  @Bean
  public RouterFunction<ServerResponse> routes() {
    return route()
        .GET("/makers", handler::makerList)
        .POST("/makers", handler::save)
        .build();
  }
}
