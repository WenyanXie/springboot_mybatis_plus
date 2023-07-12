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
 * 运营推广统计表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-06-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("operation_promotion")
public class Operation_promotionDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 注册用户id
     */
    private Long register_user_id;

    /**
     * 注册用户名称
     */
    private String register_user_name;

    /**
     * 注册用户手机号
     */
    private String register_user_phone;

    /**
     * 推广人员名称
     */
    private String promotion_name;

    /**
     * 推广人员手机号
     */
    private String promotion_phone;

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
