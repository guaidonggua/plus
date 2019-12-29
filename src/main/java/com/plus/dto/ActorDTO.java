package com.plus.dto;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 演员表
 * </p>
 *
 * @author AI
 * @since 2019-11-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ActorDTO extends Model<ActorDTO> {

    private static final long serialVersionUID = 1L;

    /**
     * 演员姓名
     */
    private String actorName;

    /**
     * 主演电影
     */
    private String mover;

    /**
     * 类型，0默认未指定，1动作，2仙侠，3偶像
     */
    private Integer type;

    private LocalDateTime created;

    private LocalDateTime updated;

    private List<Integer> intList;
}
