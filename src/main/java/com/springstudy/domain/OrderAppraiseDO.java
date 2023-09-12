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
 * 订单评价表
 * </p>
 *
 * @author xiewenyan
 * @since 2023-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("order_appraise")
public class OrderAppraiseDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 拆分订单详情ID
     */
    private Long orderItemId;

    /**
     * 拆分订单ID
     */
    private Long orderSplitId;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 规格ID
     */
    private Long specId;

    /**
     * 规格
     */
    private String specification;

    /**
     * 企业ID
     */
    private Long companyId;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 买家ID
     */
    private Long userId;

    /**
     * 买家企业id
     */
    private Long userCompanyId;

    /**
     * 买家名称
     */
    private String userName;

    /**
     * 买家角色 (personal_buy 个人买家 company_buy 企业买家 company_buy_all 企业买家(管理员) company_business 企业商家 )
     */
    private String userRole;

    /**
     * 照片
     */
    private String appraisePicture;

    /**
     * 视频
     */
    private String appraiseVideo;

    /**
     * 评价内容
     */
    private String appraiseContent;

    /**
     * 评分
     */
    private Integer appraiseScore;

    /**
     * 评价状态：-1：删除 0：正常  1：屏蔽
     */
    private Boolean appraiseStatus;

    /**
     * 评价生效日期
     */
    private Date effectiveTime;

    /**
     * 不可编辑日期
     */
    private Date editTime;

    /**
     * 是否可以编辑（1是 0否）
     */
    private Boolean isEdit;

    /**
     * 是否匿名评价（1是 0否）
     */
    private Boolean isAnonymous;

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
