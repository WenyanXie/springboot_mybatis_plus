package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 博物馆取消统计表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Museum_cancel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 博物馆取消id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户id
     */
    private Long user_id;

    /**
     * 登入版本角色
     */
    private String version_role;

    /**
     * 企业id
     */
    private Long company_id;

    /**
     * 取消时间
     */
    private LocalDate cancel_time;

    /**
     * 取消次数
     */
    private Integer cancel_num;

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
