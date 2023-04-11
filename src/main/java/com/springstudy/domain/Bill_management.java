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
 * 票据管理
 * </p>
 *
 * @author xiewenyan
 * @since 2023-04-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Bill_management implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 票据管理id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 类型
     */
    private String type;

    /**
     * 税金比例（%）
     */
    private BigDecimal tax_rate;

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
