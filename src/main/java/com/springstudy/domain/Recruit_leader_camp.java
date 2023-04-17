package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 便农服务-帮主营表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Recruit_leader_camp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 帮主营id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 帮主id
     */
    private Long leader_id;

    /**
     * 帮主企业id
     */
    private Long leader_company_id;

    /**
     * 用户角色
     */
    private String version_role;

    /**
     * 帮主名称
     */
    private String leader_name;

    /**
     * 帮主头像
     */
    private String photo_url;

    /**
     * 联系方式
     */
    private String telephone;

    /**
     * 团队人数
     */
    private String worker_num;

    /**
     * 承接工种
     */
    private String work_type;

    /**
     * 地区code
     */
    private String region_code;

    /**
     * 地区名称
     */
    private String region_name;

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
