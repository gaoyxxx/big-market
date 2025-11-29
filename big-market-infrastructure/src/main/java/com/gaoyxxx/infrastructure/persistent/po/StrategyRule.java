package com.gaoyxxx.infrastructure.persistent.po;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: gaoyx
 * @Description: 策略规则：规则的具体配置
 * @CreateDateTime: 2025/11/28 23:57
 */

@Data
public class StrategyRule {

    /** 自增ID */
    private Long id;

    /** 策略ID */
    private Long strategyId;

    /** 奖品ID */
    private Long awardId;

    /** 规则类型 */
    private Integer ruleType;

    /** 规则模型 */
    private String ruleModel;

    /** 规则值，规则的配置 */
    private String ruleValue;

    /** 规则描述 */
    private String ruleDesc;

    /** 创建时间 */
    private LocalDateTime createTime;

    /** 更新时间 */
    private LocalDateTime updateTime;
}
