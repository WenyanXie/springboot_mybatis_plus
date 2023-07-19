package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 系统广告页表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-07-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_ad_page")
public class Sys_ad_pageDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 广告页id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 广告页名称
     */
    private String name;

    /**
     * 广告类型 字典
     */
    private String type;

    /**
     * 文件路径id
     */
    private Long file_id;

    /**
     * 跳转路径
     */
    private String rounte_url;

    /**
     * 开始时间
     */
    private LocalDate begin_date;

    /**
     * 结束时间
     */
    private LocalDate end_date;

    /**
     * 是否置顶(1是，0否)
     */
    private Boolean top_flag;

    /**
     * 点击次数
     */
    private Long click_num;

    /**
     * 顺序码
     */
    private Integer sort_num;

    /**
     * 创建人
     */
    private String create_by;

    /**
     * 创建时间
     */
    private LocalDateTime create_time;

    /**
     * 更新人
     */
    private String update_by;

    /**
     * 更新时间
     */
    private LocalDateTime update_time;


}
