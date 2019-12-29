package com.plus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plus.entity.Actor;
import com.plus.service.IActorService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.plus.controller.BaseController;

import java.sql.Wrapper;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 演员表 前端控制器
 * </p>
 *
 * @author AI
 * @since 2019-11-03
 */
@RestController
@RequestMapping("/plus/actor")
public class ActorController extends BaseController {
    @Autowired
    private IActorService actorService;

    /**
     * 单条件查询
     *
     * @param type
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity<Object> list(@RequestParam(value = "type") Integer type) {
        QueryWrapper<Actor> wrapper = new QueryWrapper<>();
        wrapper.eq("type", type);
        return ResponseEntity.ok(actorService.list(wrapper));
    }

    /**
     * 多条件查询
     *
     * @param type
     * @param actor_name
     * @return
     */
    @GetMapping("/listByName")
    public ResponseEntity<Object> listByName(@RequestParam("type") Integer type,
                                             @RequestParam("name") String actor_name) {
        Map<String, Object> params = new HashMap();
        params.put("type", type);
        params.put("actor_name", actor_name);
        return ResponseEntity.ok(actorService.listByMap(params));
    }

    @GetMapping("/page")
    public ResponseEntity<Object> page(@RequestParam("page_num") Integer page_num,
                                       @RequestParam("page_size") Integer page_size) {
        IPage<Actor> actorIPage = actorService.page(new Page<Actor>(page_num, page_size));
        return ResponseEntity.ok(actorIPage);
    }

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody Actor actor) throws Exception {
        Map<String, Object> map = actorService.add(actor);
        return ResponseEntity.ok(map);
    }
}
