package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 店铺自提地址
 * </p>
 *
 * @author xiewenyan
 * @since 2023-03-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Store_take_address implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自提地址id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 联系人
     */
    private String name;

    /**
     * 联系人id
     */
    private Long user_id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 店铺id
     */
    private Long store_id;

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
     * 详细地址信息
     */
    private String more_address;

    /**
     * 地区数组
     */
    private String region_array;

    /**
     * 地名
     */
    private String region_name;

    /**
     * 地名后面的地址
     */
    private String place_name;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 地址
     */
    private String address;

    /**
     * 1是 0 否
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
