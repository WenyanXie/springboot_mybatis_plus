package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 绑定用户关系表
 * </p>
 *
 * @author xiewenyan
 * @since 2024-03-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user_bound")
public class SysUserBoundDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 绑定用户名称
     */
    private String boundName;

    /**
     * 绑定号码
     */
    private String boundTelephone;

    /**
     * 绑定账号
     */
    private String boundAccount;

    /**
     * 绑定id
     */
    private String boundId;

    /**
     * 角色类型1：福农云 
     */
    private Boolean boundType;

    /**
     * 是否删除（1是 0否）
     */
    private Boolean isDeleted;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;


}
