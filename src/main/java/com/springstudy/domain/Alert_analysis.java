package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 预警分析
 * </p>
 *
 * @author xiewenyan
 * @since 2022-09-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Alert_analysis implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 预警分析id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 预警对象
     */
    private String alert_object;

    /**
     * 内容来源
     */
    private String source;

    /**
     * 具体内容
     */
    private String content;

    /**
     * 预警等级（1高危，2中危，3低危）
     */
    private Integer level;

    /**
     * 预警类型（1生产，2交易，3还款，4违规）
     */
    private Integer type;

    /**
     * 是否发布（1是，0否）
     */
    private Integer is_release;

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
