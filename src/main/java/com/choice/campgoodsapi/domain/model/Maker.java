package com.choice.campgoodsapi.domain.model;

import lombok.Value;
import org.springframework.data.relational.core.mapping.Table;

@Value
@Table("maker_mst")
public class Maker {
  private String id;
  private String name;
  private String officialUrl;
  private String imageUrl;
}

