package com.plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.plus.entity.Actor;
import com.plus.mapper.ActorMapper;
import com.plus.service.IActorService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.*;

@SpringBootTest(classes = PlusApplication.class)
class PlusApplicationTests {
    @Autowired
    private ActorMapper actorMapper;
    @Autowired
    private IActorService actorService;

    @Test
    void textService() {
        welcome();
        QueryWrapper<Actor> queryWrapper = new QueryWrapper<>();
        Map params = new HashMap();
        params.put("type", 1);
        params.put("actor_name", null);
        List<Actor> list = (List<Actor>) actorService.listByMap(params);;
        list.forEach(n -> {
            System.out.println(n.toString());
        });
    }

    /**
     * allEq(=),eq(=),ne(<>),gt(>),ge(>=),lt(<),le(<=)
     */
    @Test
    void contextLoads() {
        welcome();
        QueryWrapper<Actor> queryWrapper = new QueryWrapper<>();
        Map params = new HashMap();
        params.put("type", 1);
        params.put("actor_name", null);
        List<Actor> list = actorMapper.selectList(queryWrapper.allEq(params,false));
        list.forEach(n -> {
            System.out.println(n.toString());
        });
    }

    /**
     * 输出引导语
     */
    public void welcome() {
        System.out.println();
        System.out.println("   .  ._______.______. _____._______.__ _ _   ");
        System.out.println("  /\\\\ |__   __|  ____|/ ____|__   __|\\ \\ \\ \\  ");
        System.out.println(" ( ( )   | |  | |____/ /____   | |    \\ \\ \\ \\ ");
        System.out.println("  \\\\/    | |  |  ____| '___ \\  | |     ) ) ) )");
        System.out.println("   '     | |  | |____._____) | | |    / / / / ");
        System.out.println("  =======|_|==|______.\\_____/==|_|===/_/ /_/  ");
        System.out.println("  :: Spring Test ::            (v2.1.3.RELEASE)");
        System.out.println();
    }
}
