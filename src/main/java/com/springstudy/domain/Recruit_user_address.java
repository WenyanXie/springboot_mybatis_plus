package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 招工工作地址表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-02-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Recruit_user_address implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 招工工作地址id
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
     * 省
     */
    private String province_id;

    /**
     * 省名称
     */
    private String province_name;

    /**
     * 市
     */
    private String city_id;

    /**
     * 市名称
     */
    private String city_name;

    /**
     * 县
     */
    private String area_id;

    /**
     * 县名称
     */
    private String area_name;

    /**
     * 详细地址信息
     */
    private String more_addres;

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
     * 是否默认（1是，0否）
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
