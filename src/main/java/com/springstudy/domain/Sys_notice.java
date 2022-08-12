package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 系统公告
 * </p>
 *
 * @author xiewenyan
 * @since 2022-08-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Sys_notice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公告id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 公告标题
     */
    private String title;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 公告时间
     */
    private LocalDateTime start_time;

    /**
     * 是否截止时间（1是，2否）
     */
    private Integer end_status;

    /**
     * 截止时间
     */
    private LocalDateTime end_time;

    /**
     * 公告状态（1正常，2关闭）
     */
    private Integer status;

    /**
     * 创建者
     */
    private String create_by;

    /**
     * 创建时间
     */
    private LocalDateTime create_time;

    /**
     * 更新者
     */
    private String update_by;

    /**
     * 更新时间
     */
    private LocalDateTime update_time;


}
