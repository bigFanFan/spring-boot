package com.hufan.controller;

import com.hufan.mapper.Lynn2Mapper;
import com.hufan.model.Lynn2;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HuFan on 2018/4/7.
 */
@RestController
public class Lynn2Controller {
    @Autowired
    private Lynn2Mapper lynn2Mapper;

    @RequestMapping("/lynn2-detail")
    public Lynn2 selectCodeById(Integer id) {
        return  lynn2Mapper.selectCodeById(id);
    }

    @RequestMapping("/lynn2-insertidcode")
    public String insertIdCode(Integer id,String code) {
        lynn2Mapper.insertIdCode(id,code);
        return "succss" ;
    }

}
