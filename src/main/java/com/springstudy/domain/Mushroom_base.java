package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 菇棚租赁场所表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Mushroom_base implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 场所id
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
     * 场所名称
     */
    private String name;

    /**
     * 场所编码
     */
    private String base_code;

    /**
     * 顺序码
     */
    private String num;

    /**
     * 场所地址
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
