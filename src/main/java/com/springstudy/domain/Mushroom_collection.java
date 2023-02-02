package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 菇棚租赁收藏表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-01-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Mushroom_collection implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菇棚收藏id
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
     * 菇棚租赁id
     */
    private Long shed_lease_id;

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
