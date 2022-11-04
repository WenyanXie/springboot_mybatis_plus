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
 * 价格走势表
 * </p>
 *
 * @author xiewenyan
 * @since 2022-11-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Price_trend implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 分类 id
     */
    private Long sort_id;

    /**
     * 分类 code
     */
    private String sort_code;

    /**
     * 分类名称
     */
    private String sort_name;

    /**
     * 分类一级 id
     */
    private Long sort_parent_id;

    /**
     * 分类一级 code
     */
    private String sort_parent_code;

    /**
     * 分类一级名称
     */
    private String sort_parent_name;

    /**
     * 最高价格
     */
    private BigDecimal max_price;

    /**
     * 最低价格
     */
    private BigDecimal min_price;

    /**
     * 成交均价
     */
    private BigDecimal average_price;

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
