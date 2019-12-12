package com.choice.campgoodsapi.handler;

import com.choice.campgoodsapi.domain.model.Maker;
import com.choice.campgoodsapi.infrastructure.MakerRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class MakerHandler {

  private MakerRepository repository;

  public Mono<ServerResponse> makerList(ServerRequest req) {
    Flux<Maker> makers = Flux.fromIterable(repository.findAll());
    return ServerResponse
        .ok()

        .contentType(MediaType.APPLICATION_JSON)
        .body(makers, Maker.class);
  }

  public Mono<ServerResponse> save(ServerRequest req) {
    Mono<Maker> maker = req.bodyToMono(Maker.class);
    maker.subscribe(m -> repository.save(m));
    return ServerResponse
        .ok()
        .build();
  }

}
