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
import com.plus.dto.ActorDTO;
import com.plus.entity.Actor;
import com.plus.mapper.ActorMapper;
import com.plus.service.IActorService;
import com.plus.vo.ActorVO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.sql.Wrapper;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

@SpringBootTest(classes = PlusApplication.class)
class PlusApplicationTests {
    @Autowired
    private ActorMapper actorMapper;
    @Autowired
    private IActorService actorService;

    /**
     * 查询操作
     */
    @Test
    void textService() {
        welcome();
        QueryWrapper<Actor> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("actor_name", "李连杰")
                .or().eq("actor_name","成龙");
        List<Actor> actorList = actorMapper.selectList(queryWrapper);
        actorList.forEach(n -> {
            System.out.println(n.toString());
        });
    }

    @Test
    void textAdd() {
        welcome();
        Actor actor = new Actor();
        actor.setActorName("谷智鑫");
        actor.setType(1);
        actor.setMover("我是特种兵");
        LocalDateTime now = LocalDateTime.now();
        actor.setCreated(now);
        actor.setUpdated(now);
        boolean b = actorService.save(actor);
        System.out.println(b);
    }

    /**
     * QueryWrapper : allEq(=),eq(=),ne(<>),gt(>),ge(>=),lt(<),le(<=)
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

    @Test
    void testCopy() {
        welcome();
        List<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(200);

        ActorDTO actorDTO = new ActorDTO();
        actorDTO.setActorName("哇哈哈");
        actorDTO.setMover("优乐美");
        actorDTO.setIntList(intList);

        List<String> strList = new ArrayList<>();
        strList.add("str01");
        strList.add("str02");

        ActorVO actorVO = new ActorVO();
        actorVO.setStrList(strList);

        BeanUtils.copyProperties(actorDTO, actorVO);
        System.out.println(actorVO.toString());
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
