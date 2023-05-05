package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 博物馆预约
 * </p>
 *
 * @author xiewenyan
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Museum_register implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 博物馆预约id
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
     * 用户姓名
     */
    private String user_name;

    /**
     * 用户联系方式
     */
    private String user_telephone;

    /**
     * 单位名称
     */
    private String team_name;

    /**
     * 预约入馆时间
     */
    private LocalDateTime appointment_time;

    /**
     * 实际入馆时间
     */
    private LocalDateTime entrance_time;

    /**
     * 报名类型（1观众预约，2团体预约）
     */
    private Integer type;

    /**
     * 审批拒绝理由
     */
    private String reason;

    /**
     * 报名状态（1待参观，2已完成，3已取消，4已过期，5审核不通过）
     */
    private Integer status;

    /**
     * 是否删除（1是，0否）
     */
    private Integer is_deleted;

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
