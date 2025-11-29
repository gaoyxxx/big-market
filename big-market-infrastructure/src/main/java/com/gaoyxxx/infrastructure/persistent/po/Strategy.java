package com.gaoyxxx.infrastructure.persistent.po;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: gaoyx
 * @Description: 抽奖策略：一个转盘
 * @CreateDateTime: 2025/11/28 23:26
 */

@Data
public class Strategy {

    /** 自增ID */
    private Long id;

    /** 抽奖策略ID */
    private Long strategyId;

    /** 抽奖策略描述 */
    private String strategyDesc;

    /** 创建时间 */
    private LocalDateTime createTime;

    /** 更新时间 */
    private LocalDateTime updateTime;
}
