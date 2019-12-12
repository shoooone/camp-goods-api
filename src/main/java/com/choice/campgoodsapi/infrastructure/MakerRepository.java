package com.choice.campgoodsapi.infrastructure;

import com.choice.campgoodsapi.domain.model.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MakerRepository extends CrudRepository<Maker, String> {
  @Override
  List<Maker> findAll();

}
