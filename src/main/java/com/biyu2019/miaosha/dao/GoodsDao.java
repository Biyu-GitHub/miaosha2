package com.biyu2019.miaosha.dao;

import com.biyu2019.miaosha.entity.MiaoshaGoods;
import com.biyu2019.miaosha.vo.GoodsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsDao {

    // 查询商品列表
    public List<GoodsVo> listGoodsVo();

    // 根据ID查询商品列表
    public GoodsVo getGoodsVoByGoodsId(@Param("goodsId") long goodsId);

    // 库存减少一个
    public int reduceStock(MiaoshaGoods g);

}
