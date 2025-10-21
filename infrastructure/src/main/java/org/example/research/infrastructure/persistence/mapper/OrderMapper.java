package org.example.research.infrastructure.persistence.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.core.annotation.Order;

@Mapper
public interface OrderMapper {

    @Insert("insert into order() values ()")
    Void insert(Order order);


    void update(Order order);


}