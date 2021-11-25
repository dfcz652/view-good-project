package com.sarancha.viewgoods.service;

import com.sarancha.viewgoods.entity.Goods;

import java.util.List;

public interface GoodService {

    Goods save(Goods goods);

    Goods update(Goods goods);

    List<Goods> saveAll(List<Goods> goodsList);

    void delete(Goods goods);

    void deleteGoodsById(Long goodsId);

    Goods getGoodsById(Long goodsId);

    List<Goods> getAllGoods();
}
