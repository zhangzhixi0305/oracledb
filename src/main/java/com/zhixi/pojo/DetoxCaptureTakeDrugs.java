package com.zhixi.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 吸毒人员案件表
 * @TableName DETOX_CAPTURE_TAKE_DRUGS
 */
@TableName(value ="DETOX_CAPTURE_TAKE_DRUGS")
@Data
public class DetoxCaptureTakeDrugs implements Serializable {
    /**
     * 案件id
     */
    @TableId(value = "CASE_ID")
    private String caseId;

    /**
     * 案件名称
     */
    @TableField(value = "CASE_NAME")
    private String caseName;

    /**
     * 姓名
     */
    @TableField(value = "PERSON")
    private String person;

    /**
     * 性别 0男/1女
     */
    @TableField(value = "SEX")
    private String sex;

    /**
     * 出生日期
     */
    @TableField(value = "BIRTH_TIME")
    private LocalDateTime birthTime;

    /**
     * 身份证号
     */
    @TableField(value = "ID_CARD")
    private String idCard;

    /**
     * 决定结果 0行政拘留  1行政拘留（不予执行）/2罚款
     */
    @TableField(value = "RESOLVE_RESULT")
    private String resolveResult;

    /**
     * 决定时间
     */
    @TableField(value = "RESOLVE_TIME")
    private LocalDateTime resolveTime;

    /**
     * 主办单位
     */
    @TableField(value = "SPONSOR_MAIN")
    private String sponsorMain;

    /**
     * 是否强制隔离 0是/1否
     */
    @TableField(value = "FORCED_QUARANTINE")
    private String forcedQuarantine;

    /**
     * 数据id
     */
    @TableField(value = "DATA_ID")
    private String dataId;

    /**
     * 创建时间
     */
    @TableField(value = "CREATED_TIME")
    private LocalDateTime createdTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DetoxCaptureTakeDrugs other = (DetoxCaptureTakeDrugs) that;
        return (this.getCaseId() == null ? other.getCaseId() == null : this.getCaseId().equals(other.getCaseId()))
            && (this.getCaseName() == null ? other.getCaseName() == null : this.getCaseName().equals(other.getCaseName()))
            && (this.getPerson() == null ? other.getPerson() == null : this.getPerson().equals(other.getPerson()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthTime() == null ? other.getBirthTime() == null : this.getBirthTime().equals(other.getBirthTime()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getResolveResult() == null ? other.getResolveResult() == null : this.getResolveResult().equals(other.getResolveResult()))
            && (this.getResolveTime() == null ? other.getResolveTime() == null : this.getResolveTime().equals(other.getResolveTime()))
            && (this.getSponsorMain() == null ? other.getSponsorMain() == null : this.getSponsorMain().equals(other.getSponsorMain()))
            && (this.getForcedQuarantine() == null ? other.getForcedQuarantine() == null : this.getForcedQuarantine().equals(other.getForcedQuarantine()))
            && (this.getDataId() == null ? other.getDataId() == null : this.getDataId().equals(other.getDataId()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        result = prime * result + ((getCaseName() == null) ? 0 : getCaseName().hashCode());
        result = prime * result + ((getPerson() == null) ? 0 : getPerson().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthTime() == null) ? 0 : getBirthTime().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getResolveResult() == null) ? 0 : getResolveResult().hashCode());
        result = prime * result + ((getResolveTime() == null) ? 0 : getResolveTime().hashCode());
        result = prime * result + ((getSponsorMain() == null) ? 0 : getSponsorMain().hashCode());
        result = prime * result + ((getForcedQuarantine() == null) ? 0 : getForcedQuarantine().hashCode());
        result = prime * result + ((getDataId() == null) ? 0 : getDataId().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caseId=").append(caseId);
        sb.append(", caseName=").append(caseName);
        sb.append(", person=").append(person);
        sb.append(", sex=").append(sex);
        sb.append(", birthTime=").append(birthTime);
        sb.append(", idCard=").append(idCard);
        sb.append(", resolveResult=").append(resolveResult);
        sb.append(", resolveTime=").append(resolveTime);
        sb.append(", sponsorMain=").append(sponsorMain);
        sb.append(", forcedQuarantine=").append(forcedQuarantine);
        sb.append(", dataId=").append(dataId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}