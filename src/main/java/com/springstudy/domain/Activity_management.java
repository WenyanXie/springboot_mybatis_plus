package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 活动管理
 * </p>
 *
 * @author xiewenyan
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Activity_management implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 活动管理id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * banner 图 url
     */
    private String banner_url;

    /**
     * 活动名称
     */
    private String activity_name;

    /**
     * 创建人名称
     */
    private String activity_user;

    /**
     * 活动详情
     */
    private String activity_detail;

    /**
     * 报名开始时间
     */
    private LocalDateTime start_time;

    /**
     * 报名截止时间
     */
    private LocalDateTime end_time;

    /**
     * 是否删除（1是 0否）
     */
    private Integer is_deleted;

    /**
     * 创建时间
     */
    private LocalDateTime create_time;

    /**
     * 创建人
     */
    private String create_by;

    /**
     * 更新时间
     */
    private LocalDateTime update_time;

    /**
     * 更新人
     */
    private String update_by;


}
