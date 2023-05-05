package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 博物馆场次
 * </p>
 *
 * @author xiewenyan
 * @since 2023-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Museum_session implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 博物馆场次
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 星期
     */
    private String week;

    /**
     * 参观人数
     */
    private Integer people_num;

    /**
     * 参观时间
     */
    private LocalTime time;

    /**
     * 是否闭馆（1是，0否）
     */
    private Integer is_closed;

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
