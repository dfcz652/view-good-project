package com.sarancha.viewgoods.dao;

import com.sarancha.viewgoods.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsDao extends JpaRepository<Goods, Long>{

//    @Query(nativeQuery = true, value = "select * from Goods order by goods_name")
//    List<Goods> getAllGoodsSorted();
    List<Goods> getAllByOrderByName();

    List<Goods> getAllByOrderByNameDesc();

    List<Goods> getFirst2ByOrderByNameDesc();
}
