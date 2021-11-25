package com.sarancha.viewgoods.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Goods.class)
public abstract class Goods_ {

	public static volatile SingularAttribute<Goods, BigDecimal> remnant;
	public static volatile SingularAttribute<Goods, Long> goodsId;
	public static volatile SingularAttribute<Goods, String> name;
	public static volatile SingularAttribute<Goods, String> description;

}

