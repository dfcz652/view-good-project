package com.sarancha.viewgoods.service;

import com.sarancha.viewgoods.dao.GoodsDao;
import com.sarancha.viewgoods.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

@Service
//@Component
public class GoodsServiceImpl implements GoodService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods save(Goods goods) {
        return goodsDao.save(goods);
    }

    @Override
    public List<Goods> saveAll(List<Goods> goodsList) {
        return goodsDao.saveAll(goodsList);
    }

    @Override
    public void delete(Goods goods) {
        if (goodsDao.existsById(goods.getGoodsId())) {
            goodsDao.delete(goods);
        }
    }

    @Override
    public void deleteGoodsById(Long goodsId) {
        if (goodsDao.existsById(goodsId)) {
            goodsDao.deleteById(goodsId);
        }
    }

    @Override
    public Goods update(Goods goods) {
        Goods goodsSaved = null;
        if(goodsDao.existsById(goods.getGoodsId())) {
            goodsSaved = goodsDao.saveAndFlush(goods);
        }
        return goodsSaved;
    }

    @Override
    public Goods getGoodsById(Long goodsId) {
        return goodsDao.getById(goodsId);
    }

    @Override
    public List<Goods> getAllGoods() {
         //return goodsDao.getAllByOrderByName();
        return goodsDao.getAllByOrderByName();

    }

//    @PostConstruct
//    private void setNewGoods() {
//        if (goodsDao.findAll().size() == 0) {
//            List<Goods> goodsList = new ArrayList<>();
//
//            Goods goods1 = new Goods();
////            goods1.setGoodsId(1L);
//            goods1.setName("Вода");
//            goods1.setDescription("Вода артезіанська");
//            goods1.setRemnant(BigDecimal.valueOf(3));
//
//            Goods goods2 = new Goods();
////            goods2.setGoodsId(2L);
//            goods2.setName("Кружка");
//            goods2.setDescription("Кружка скляна");
//            goods2.setRemnant(BigDecimal.valueOf(2));
//
//            Goods goods3 = new Goods();
////            goods3.setGoodsId(3L);
//            goods3.setName("Журнал");
//            goods3.setDescription("Журнал Новини про спорт");
//            goods3.setRemnant(BigDecimal.valueOf(4));
//
//            goodsList.add(goods1);
//            goodsList.add(goods2);
//            goodsList.add(goods3);
//
//            saveAll(goodsList);
//        }
//    }
}
