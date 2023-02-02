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
 * 租赁系统菇棚表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Mushroom_shep implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菇棚id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 场所id
     */
    private Long base_id;

    /**
     * 菇棚顺序码
     */
    private String num;

    /**
     * 菇棚材质
     */
    private Integer material;

    /**
     * 可种菇种
     */
    private String mushroom_specie;

    /**
     * 最大种植规模（万筒）
     */
    private BigDecimal max_scale;

    /**
     * 是否光伏（1是，0否）
     */
    private Integer is_photovoltaic;

    /**
     * 是否有温控设备（1是，0否）
     */
    private Integer is_temperature_control;

    /**
     * 占地面积（平方米）
     */
    private BigDecimal area;

    /**
     * 投产时间
     */
    private LocalDateTime production_time;

    /**
     * 属性
     */
    private Integer attribute;

    /**
     * 地址
     */
    private String address;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 是否发布出租（1是，0否）
     */
    private Integer is_rent;

    /**
     * 其他
     */
    private String other;

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
