package com.plus.constant;

/**
 * @Description:
 * @author AI
 * @since 2019-11-03
 */
public interface Constant {
    String PATTERN_DATETIME = "yyyy-MM-dd HH:mm:ss";
    String PATTERN_DATE = "yyyy-MM-dd";
    String PATTERN_TIME = "HH:mm:ss";
    /**
     * Token键名
     */
    String TOKEN_KEY_NAME = "Authorization";
    /**
     * Token有效时间, 2小时, 60 * 60 * 2
     */
    Long AGENT_ADMIN_EFFECTIVE_TIME = 7200L;
    /**
     * 测试时间 5分钟, 60 * 5
     */
    Long TEST_TIME = 300L;
    /**
     * redis锁配置时间: 60秒
     */
    Long REDIS_LOCK_TIME = 60L;


    char U_A = 'A';
    char L_A = 'a';
    char U_Z = 'Z';
    char L_Z = 'z';
}
