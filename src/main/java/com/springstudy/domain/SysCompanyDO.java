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
 * 公司表
 * </p>
 *
 * @author xiewenyan
 * @since 2024-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_company")
public class SysCompanyDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 社会统一信用代码
     */
    private String socialCode;

    /**
     * 成立日期
     */
    private Date establishDate;

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
     * 联系人
     */
    private String contactName;

    /**
     * 联系方式
     */
    private String contactTelephone;

    /**
     * 是否删除（1是 0否）
     */
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateBy;


}
