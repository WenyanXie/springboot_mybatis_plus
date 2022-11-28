package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 认证查找
 * </p>
 *
 * @author xiewenyan
 * @since 2022-11-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Certificate_search implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 认证类型
     */
    private String type;

    /**
     * 认证介绍
     */
    private String introduction;

    /**
     * 认证流程
     */
    private String detail;

    /**
     * 状态（0未发布，1已发布）
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
