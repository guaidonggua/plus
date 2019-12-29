package com.plus.service;

import com.plus.entity.Actor;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 演员表 服务类
 * </p>
 *
 * @author AI
 * @since 2019-11-03
 */
public interface IActorService extends IService<Actor> {

    Map<String, Object> add(Actor actor) throws Exception;

    /**
     * 测试redis
     */
    void testRedis();

}
