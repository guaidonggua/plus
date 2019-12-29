package com.plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.plus.constant.Constant;
import com.plus.constant.RedisKey;
import com.plus.entity.Actor;
import com.plus.mapper.ActorMapper;
import com.plus.service.IActorService;
import com.plus.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.integration.redis.util.RedisLockRegistry;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = PlusApplication.class)
class RedisTests {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private IActorService actorService;

    /**
     * 查询操作
     */
    @Test
    void textRedis() {
        welcome();
        actorService.testRedis();
//        redisUtil.set(RedisKey.TEXT_KEY + 2, "No.1", Constant.TEST_TIME);
        System.out.println(redisUtil.get(RedisKey.TEXT_KEY + 2).toString());
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
