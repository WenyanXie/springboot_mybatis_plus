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
 * 交易订单统计表
 * </p>
 *
 * @author xiewenyan
 * @since 2022-10-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Trade_order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 分类id
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
     * 订单数量
     */
    private Integer total;

    /**
     * 交易总额
     */
    private BigDecimal quota;

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
