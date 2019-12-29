package com.plus.service.impl;

import com.plus.constant.Constant;
import com.plus.constant.RedisKey;
import com.plus.entity.Actor;
import com.plus.mapper.ActorMapper;
import com.plus.service.IActorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.plus.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 演员表 服务实现类
 * </p>
 *
 * @author AI
 * @since 2019-11-03
 */
@Service
public class ActorServiceImpl extends ServiceImpl<ActorMapper, Actor> implements IActorService {

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public Map<String, Object> add(Actor actor) throws Exception {
        Map<String, Object> map = new HashMap<>();
        LocalDateTime now = LocalDateTime.now();
        actor.setCreated(now);
        actor.setUpdated(now);
        boolean b = save(actor);
        if (b) {
            map.put("message", "添加成功");
        } else {
            map.put("message", "添加失败");
        }
        return map;
    }

    @Override
    public void testRedis() {
        redisUtil.set(RedisKey.TEXT_KEY + 2, "No.2", Constant.TEST_TIME);
    }
}
