package com.springstudy.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 首页金融服务统计
 * </p>
 *
 * @author xiewenyan
 * @since 2023-05-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("financial_statistics")
public class Financial_statisticsDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 金融服务统计id
     */
    private Long id;

    /**
     * 银行code
     */
    private String bank_code;

    /**
     * 授信额度（元）
     */
    private BigDecimal credit_amount;

    /**
     * 设置涨幅
     */
    private BigDecimal rate;

    /**
     * 上报金额（元）
     */
    private BigDecimal report_amount;

    /**
     * 审贷用户数
     */
    private Integer user_num;

    /**
     * 通过评估用户数
     */
    private Integer user_pass_num;

    /**
     * 上报日期
     */
    private LocalDateTime report_date;

    /**
     * 是否上报（1是，0否）
     */
    private Integer is_reported;

    /**
     * 是否删除（1是，0否）
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
