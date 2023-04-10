package com.springstudy.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 招工订单表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Recruit_order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 招工订单id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 招工工作id
     */
    private Long work_id;

    /**
     * 用户id
     */
    private Long user_id;

    /**
     * 企业id
     */
    private Long company_id;

    /**
     * 用户登入角色
     */
    private String version_role;

    /**
     * 联系人（实名制）
     */
    private String name;

    /**
     * 联系方式
     */
    private String telephone;

    /**
     * 订单编号
     */
    private String order_code;

    /**
     * 工作内容
     */
    private String work_type;

    /**
     * 薪资
     */
    private BigDecimal salary;

    /**
     * 支付薪资时间
     */
    private LocalDateTime paid_time;

    /**
     * 是否支付薪资（1是，0否）
     */
    private Integer is_paid;

    /**
     * 订单状态（1工作中，2已验收付费，3交易完成）
     */
    private Integer status;

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
