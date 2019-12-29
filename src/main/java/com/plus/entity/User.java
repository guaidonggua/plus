package com.plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.plus.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户表实体类
 *
 * @author AI
 * @since 2019-12-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "User对象", description = "用户表")
@TableName("user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

  @TableId(value = "user_id", type = IdType.AUTO)
  private Integer userId;
    /**
     * 用户名
     */
  @ApiModelProperty(value = "用户名")
  private String userName;
    /**
     * 类型，（0-未设置（也就是未开通），1-学生，2-老师，3-管理员）
     */
  @ApiModelProperty(value = "类型，（0-未设置（也就是未开通），1-学生，2-老师，3-管理员）")
  private Integer type;
    /**
     * 性别（1-男，0-女）
     */
  @ApiModelProperty(value = "性别（1-男，0-女）")
  private Integer sex;
    /**
     * 账户（学号 / 工号）
     */
  @ApiModelProperty(value = "账户（学号 / 工号）")
  private String userNo;
    /**
     * 密码
     */
  @ApiModelProperty(value = "密码")
  private String password;
    /**
     * 头像照片
     */
  @ApiModelProperty(value = "头像照片")
  private String photo;
    /**
     * 电话
     */
  @ApiModelProperty(value = "电话")
  private String mobile;
    /**
     * 邮箱
     */
  @ApiModelProperty(value = "邮箱")
  private String email;
    /**
     * 违规次数
     */
  @ApiModelProperty(value = "违规次数")
  private Integer violation;
    /**
     * 上次上机时间（自主上机）
     */
  @ApiModelProperty(value = "上次上机时间（自主上机）")
  private LocalDateTime lastTime;
    /**
     * 预约下次时间
     */
  @ApiModelProperty(value = "预约下次时间")
  private LocalDateTime nextTime;


}
