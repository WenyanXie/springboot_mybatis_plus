package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 活动报名
 * </p>
 *
 * @author xiewenyan
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Activity_register implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 活动报名id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户id
     */
    private Long user_id;

    /**
     * 用户登入角色
     */
    private String version_role;

    /**
     * 企业id
     */
    private Long company_id;

    /**
     * 活动id
     */
    private Long activity_id;

    /**
     * 用户名称
     */
    private String user_name;

    /**
     * 联系方式
     */
    private String user_telephone;

    /**
     * 地区编号
     */
    private String region_code;

    /**
     * 所在地区
     */
    private String region_name;

    /**
     * 当季出菇时间
     */
    private LocalDateTime mushroom_time;

    /**
     * 报名状态（1已报名，2取消报名）
     */
    private Integer status;

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
