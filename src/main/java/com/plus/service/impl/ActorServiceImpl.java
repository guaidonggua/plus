package com.plus.service.impl;

import com.plus.entity.Actor;
import com.plus.mapper.ActorMapper;
import com.plus.service.IActorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
