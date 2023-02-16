package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 便农服务-招工人表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-02-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Recruit_worker implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 招工id
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
     * 联系人
     */
    private String user_name;

    /**
     * 联系方式
     */
    private String user_telephone;

    /**
     * 招工工种
     */
    private Integer work_type;

    /**
     * 招工人数
     */
    private Integer worker_num;

    /**
     * 招工标题
     */
    private String title;

    /**
     * 薪资待遇
     */
    private String salary;

    /**
     * 工作地点
     */
    private String work_address;

    /**
     * 工作开始时间
     */
    private LocalDateTime work_start_time;

    /**
     * 工作结束时间
     */
    private LocalDateTime work_end_time;

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
