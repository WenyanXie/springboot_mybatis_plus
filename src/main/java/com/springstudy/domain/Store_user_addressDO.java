package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户收货地址表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("store_user_address")
public class Store_user_addressDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收货地址id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 收货人名称
     */
    private String name;

    /**
     * 用户id
     */
    private Long user_id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 省id
     */
    private String province_id;

    /**
     * 省名称
     */
    private String province_name;

    /**
     * 市id
     */
    private String city_id;

    /**
     * 市名称
     */
    private String city_name;

    /**
     * 县id
     */
    private String area_id;

    /**
     * 县名称
     */
    private String area_name;

    /**
     * 地址
     */
    private String address;

    /**
     * 详细地址信息
     */
    private String more_address;

    /**
     * 地区id数组
     */
    private String region_id;

    /**
     * 地区名称数组
     */
    private String region_name;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 是否默认（1是 0 否）
     */
    private Boolean is_default;

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
