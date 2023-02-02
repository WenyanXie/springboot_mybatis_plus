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
 * 菇棚租赁表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Mushroom_shed_lease implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菇棚租赁id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户id
     */
    private Long user_id;

    /**
     * 企业id
     */
    private Long company_id;

    /**
     * 场所id
     */
    private Long base_id;

    /**
     * 菇棚id
     */
    private String shep_id;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 占地面积（平方米）
     */
    private BigDecimal area;

    /**
     * 最大种植规模（万筒）
     */
    private String max_scale;

    /**
     * 押金
     */
    private BigDecimal deposit;

    /**
     * 租金
     */
    private BigDecimal rent;

    /**
     * 状态（1出租，2求租，3转让）
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
