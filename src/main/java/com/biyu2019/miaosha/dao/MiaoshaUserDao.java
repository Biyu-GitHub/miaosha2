package com.biyu2019.miaosha.dao;

import com.biyu2019.miaosha.entity.MiaoshaUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MiaoshaUserDao {

    // 根据ID查询用户信息
    public MiaoshaUser getById(@Param("id") long id);

    // 更新用户密码
    public void update(MiaoshaUser toBeUpdate);
}
