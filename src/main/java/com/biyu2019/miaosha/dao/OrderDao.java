package com.biyu2019.miaosha.dao;

import com.biyu2019.miaosha.entity.MiaoshaOrder;
import com.biyu2019.miaosha.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderDao {

    // 查询该用户是否秒杀过
    public MiaoshaOrder getMiaoshaOrderByUserIdGoodsId(@Param("userId") long userId, @Param("goodsId") long goodsId);

    // 插入订单表，返回插入的订单ID
    public long insert(OrderInfo orderInfo);

    // 插入秒杀表
    public int insertMiaoshaOrder(MiaoshaOrder miaoshaOrder);

}
