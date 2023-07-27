package com.springstudy.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("store_product")
public class Store_productDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商铺ID
     */
    private Long store_id;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品副标题
     */
    private String subtitle;

    /**
     * 分类一级CODE
     */
    private String sort_parent_code;

    /**
     * 分类一级名称
     */
    private String sort_parent_name;

    /**
     * 分类CODE
     */
    private String sort_code;

    /**
     * 分类名称
     */
    private String sort_name;

    /**
     * 商品详情
     */
    private String product_info;

    /**
     * 是否推荐商品 0不是 1是
     */
    private Boolean is_recommend;

    /**
     * 状态 1已上架
     */
    private Boolean status;

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
