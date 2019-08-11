package com.biyu2019.miaosha.dao;

import com.biyu2019.miaosha.Miaosha2Application;
import com.biyu2019.miaosha.entity.MiaoshaGoods;
import com.biyu2019.miaosha.vo.GoodsVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Miaosha2Application.class)
public class GoodsDaoTest {

    @Autowired
    GoodsDao goodsDao;

    @Test
    public void listGoodsVo() {
        List<GoodsVo> goodsVoList = goodsDao.listGoodsVo();
        for (GoodsVo goodsVo : goodsVoList) {
            System.out.println(goodsVo);
        }
    }

    @Test
    public void getGoodsVoByGoodsId() {
        GoodsVo goodsVo = goodsDao.getGoodsVoByGoodsId(1);
        System.out.println(goodsVo);
    }

    @Test
    public void reduceStock() {
        MiaoshaGoods g = new MiaoshaGoods();
        g.setGoodsId(1L);
        int i = goodsDao.reduceStock(g);
        System.out.println(i);
    }
}
