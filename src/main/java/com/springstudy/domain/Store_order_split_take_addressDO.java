package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 订单拆分单-店铺自提地址
 * </p>
 *
 * @author xiewenyan
 * @since 2023-05-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("store_order_split_take_address")
public class Store_order_split_take_addressDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 拆分单自提地址id
     */
    private Long id;

    /**
     * 订单拆分单id
     */
    private Long split_id;

    /**
     * 自提地址id
     */
    private Long take_address_id;

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
     * 详细地址信息
     */
    private String more_address;

    /**
     * 地名名称数组
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
