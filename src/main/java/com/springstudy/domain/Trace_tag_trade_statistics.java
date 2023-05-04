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
 * 溯源交易统计表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-04-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Trace_tag_trade_statistics implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 溯源交易统计id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 申请编号
     */
    private String trace_number;

    /**
     * 申请企业
     */
    private String company_name;

    /**
     * 企业id
     */
    private Long company_id;

    /**
     * 产品名称
     */
    private String product_name;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 单价
     */
    private BigDecimal unit_price;

    /**
     * 总价
     */
    private BigDecimal total_price;

    /**
     * 状态（1已同步，2未同步）
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
