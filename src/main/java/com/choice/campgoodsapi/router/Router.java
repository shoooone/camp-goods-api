package com.choice.campgoodsapi.router;

import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

public interface Router {
  RouterFunction<ServerResponse> routes();
}
