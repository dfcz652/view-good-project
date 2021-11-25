package com.sarancha.viewgoods.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "goods")
public class Goods implements Comparable<Goods>{
    @Id
    @Column(name = "goods_id")
    @SequenceGenerator(name = "goods_seq", sequenceName = "goods_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "goods_seq")
    Long goodsId;

    @Column(name = "goods_name")
    String name;

    @Column(name = "goods_description")
    String description;

    @Column(name = "goods_remnant")
    BigDecimal remnant;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long id) {
        this.goodsId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getRemnant() {
        return remnant;
    }

    public void setRemnant(BigDecimal remnant) {
        this.remnant = remnant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(goodsId, goods.goodsId) &&
                Objects.equals(name, goods.name) &&
                Objects.equals(description, goods.description) &&
                Objects.equals(remnant, goods.remnant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsId, name, description, remnant);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", remnant=" + remnant +
                '}';
    }

    @Override
    public int compareTo(Goods o) {
        return this.getGoodsId().compareTo(o.getGoodsId());
    }
}
