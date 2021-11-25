package com.sarancha.viewgoods.controller;

import com.sarancha.viewgoods.dao.GoodsDao;
import com.sarancha.viewgoods.entity.Goods;
import com.sarancha.viewgoods.service.GoodService;
import com.sarancha.viewgoods.service.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class GoodsController {
    @Autowired
    private GoodService goodsService;

    @GetMapping("/goods")
    public String getGoods(Model model) {
        model.addAttribute("goodsList", goodsService.getAllGoods());
        return "goods";
    }

    @GetMapping("/createGood")
    public String newGood(Model model) {
        model.addAttribute("good" , new Goods());
        return "newGood";
    }

    @PostMapping("/create product")
    public String create(@ModelAttribute("goods") Goods goods){
        goodsService.save(goods);
        System.out.println(goods.getRemnant());
        return "redirect:/goods";
    }

    @GetMapping("/updateGood/{id}")
    public String updateGood(@PathVariable("id") Long id, Model model){
        System.out.println(id);
        model.addAttribute("good", goodsService.getGoodsById(id));
        return "updateGood";
    }

    @PostMapping("/update product")
    public String update(@ModelAttribute("good") Goods goods) {
        System.out.println(goods.getGoodsId());
        goodsService.update(goods);
        return "redirect:/goods";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id, Goods goods) {
        System.out.println("id = " + id);
        goodsService.deleteGoodsById(id);
//        goodsService.delete(goods);
        System.out.println("gg");
        return "redirect:/goods";
    }

}
