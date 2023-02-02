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
 * 菇棚租赁菇棚求租
 * </p>
 *
 * @author xiewenyan
 * @since 2023-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Mushroom_shep_rent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菇棚求租id
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
     * 标题
     */
    private String titele;

    /**
     * 描述
     */
    private String description;

    /**
     * 可种菇种
     */
    private String mushroom_specie;

    /**
     * 材质
     */
    private Integer material;

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
     * 菇棚间数
     */
    private Integer shed_num;

    /**
     * 是否光伏（1是，0否）
     */
    private Integer is_photovoltaic;

    /**
     * 是否有温控设备（1是，0否）
     */
    private Integer is_temperature_control;

    /**
     * 最小占地面积（平方米）
     */
    private BigDecimal min_area;

    /**
     * 最大占地面积（平方米）
     */
    private BigDecimal max_area;

    /**
     * 最小租金（元）
     */
    private BigDecimal min_rent;

    /**
     * 最大租金（元）
     */
    private BigDecimal max_rent;

    /**
     * 最小规模（万筒）
     */
    private BigDecimal min_scale;

    /**
     * 最大规模（万筒）
     */
    private BigDecimal max_scale;

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
