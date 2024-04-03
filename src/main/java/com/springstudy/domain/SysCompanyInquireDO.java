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
 * 企业qcc查询表
 * </p>
 *
 * @author xiewenyan
 * @since 2024-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_company_inquire")
public class SysCompanyInquireDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 企业id
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司英文名称
     */
    private String englishName;

    /**
     * 社会信用代码
     */
    private String socialCreditCode;

    /**
     * 成立日期
     */
    private Date establishTime;

    /**
     * 单位性质
     */
    private String unitNature;

    /**
     * 注册资本（万元）
     */
    private String registeredCapital;

    /**
     * 公司类型
     */
    private String companyType;

    /**
     * 经济类型
     */
    private String economicsType;

    /**
     * 企业类型
     */
    private String enterpriseType;

    /**
     * 注册地行政区划
     */
    private String registrationPlace;

    /**
     * 经营范围
     */
    private String businessScope;

    /**
     * 通信地址
     */
    private String mailingAddress;

    /**
     * 上年度生产总值(万元)
     */
    private Integer lastYearProductionValue;

    /**
     * 上年度利润(万元)
     */
    private Integer lastYearProfit;

    /**
     * 法定代表人
     */
    private String legalPersonName;

    /**
     * 法人身份证为空
     */
    private String legalPersonCard;

    /**
     * 法人身份证图片
     */
    private String legalPersonPicture;

    /**
     * 注册地址(省id)
     */
    private Long companyProvinceId;

    /**
     * 注册地址(市id)
     */
    private Long companyCityId;

    /**
     * 注册地址(区id)
     */
    private Long companyAreaId;

    /**
     * 注册地址
     */
    private String registeredAddress;

    /**
     * 营业执照
     */
    private String businessLicense;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人电话
     */
    private String contactPhone;

    /**
     * 联系人省份id
     */
    private Long contactProvinceId;

    /**
     * 联系人市id
     */
    private Long contactCityId;

    /**
     * 联系人区或县id
     */
    private Long contactAreaId;

    /**
     * 联系人详细地址
     */
    private String contactAddress;

    /**
     * 法人联系方式
     */
    private String legalPersonPhone;

    /**
     * 员工人数
     */
    private Integer employeeNumber;

    /**
     * 公司传真
     */
    private String fax;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * Email(公司)
     */
    private String companyEmail;

    /**
     * 龙头企业 0-不涉及 1-县级 2-地市级 3-省级 4-国家级
     */
    private Boolean leadingCompany;

    /**
     * 水产养殖相关许可证
     */
    private String aquacultureRelatedPermit;

    /**
     * 食品生产许可证
     */
    private String foodProductionLicence;

    /**
     * 通过状态 -1-已拒绝 1-审核中 2-已通过 3-周期性不再受理
     */
    private Boolean status;

    /**
     * 认证来源:0:法人库自动匹配;1:手动填写
     */
    private Boolean certificationSource;

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

    /**
     * 申报权限  1 正常 0禁止 2强制允许
     */
    private Boolean applyAuth;

    /**
     * 是否设置禁止到期时间 1是 0否
     */
    private Boolean banOverdueFlag;

    /**
     * 禁止到期结束时间
     */
    private Date banOverdueDate;

    /**
     * 是否设置失效时间：1-是 0-否
     */
    private Boolean whetherStaleDated;

    /**
     * 当状态为周期内不允许申请时不允许企业进行申报产品。若设置了失效时间，则当过完该日期晚上12点后状态修正为正常
     */
    private String staleDated;

    /**
     * 证明材料
     */
    private String evidentiaryMaterial;

    /**
     * qcc同步json
     */
    private String companyJson;

    /**
     * 过期时间
     */
    private Date expirationTime;


}
