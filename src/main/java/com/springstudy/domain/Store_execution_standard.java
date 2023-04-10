package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 执行标准
 * </p>
 *
 * @author xiewenyan
 * @since 2023-04-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Store_execution_standard implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 执行标准id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 商品id
     */
    private Long product_id;

    /**
     * 执行标准（配字典表）
     */
    private String standar_code;

    /**
     * 分类（配字典表）
     */
    private String sort_code;

    /**
     * 等级（1特级 ，2一级，3二级，4三级）（配字典表）
     */
    private String level_code;

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
