package com.hufan.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import com.hufan.model.Lynn2;
import org.apache.ibatis.annotations.Select;

/**
 * Created by HuFan on 2018/4/7.
        */
public interface Lynn2Mapper {
    @Insert("insert into lynn2(id,code) values(#{id},#{code})")
    void insertIdCode(@Param("id") Integer id,@Param("code") String code);

    @Select("select * from lynn2 where id = #{id}")
    Lynn2 selectCodeById(@Param("id") Integer id);
}
