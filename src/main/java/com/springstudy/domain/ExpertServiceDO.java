package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 专家服务
 * </p>
 *
 * @author xiewenyan
 * @since 2024-01-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("expert_service")
public class ExpertServiceDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 名称
     */
    private String title;

    /**
     * 专家名称
     */
    private String name;

    /**
     * 相关领域
     */
    private String related;

    /**
     * 简介
     */
    private String description;

    /**
     * 内容详情
     */
    private String content;

    /**
     * 视频链接
     */
    private String videoUrl;

    /**
     * 省id
     */
    private String provinceId;

    /**
     * 省名称
     */
    private String provinceName;

    /**
     * 市id
     */
    private String cityId;

    /**
     * 市名称
     */
    private String cityName;

    /**
     * 县id
     */
    private String areaId;

    /**
     * 县名称
     */
    private String areaName;

    /**
     * 发布状态（是否发布：1是 0否）
     */
    private Boolean isPublish;

    /**
     * 文章类型（1文章专栏 2 专家讲堂）
     */
    private Boolean type;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;


}
