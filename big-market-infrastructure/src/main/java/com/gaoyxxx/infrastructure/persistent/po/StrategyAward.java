package com.gaoyxxx.infrastructure.persistent.po;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: gaoyx
 * @Description: 策略奖品明细配置：策略中有哪些奖品，关联表
 * @CreateDateTime: 2025/11/28 23:40
 */
@Data
public class StrategyAward {

    /** 自增ID */
    private Long id;

    /** 策略ID */
    private Long strategyId;

    /** 奖品ID */
    private Long awardId;

    /** 奖品标题 */
    private String awardTitle;

    /** 奖品副标题 */
    private String awardSubtitle;

    /** 奖品数量 */
    private Integer awardCount;

    /** 奖品剩余数量 */
    private Integer awardCountSurplus;

    /** 奖品概率 */
    private BigDecimal awardRate;

    /** 奖品规则模型 */
    private String ruleModels;

    /** 排序 */
    private Integer sort;

    /** 创建时间 */
    private LocalDateTime createTime;

    /** 更新时间 */
    private LocalDateTime updateTime;
}
