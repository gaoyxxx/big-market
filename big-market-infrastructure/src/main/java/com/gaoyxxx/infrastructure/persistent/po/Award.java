package com.gaoyxxx.infrastructure.persistent.po;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author: gaoyx
 * @Description: 奖品表：抽到了策略中的奖品，根据ID查询奖品详细信息进行发奖
 * @CreateDateTime: 2025/11/29 0:15
 */

@Data
public class Award {

    /** 自增ID */
    private Long id;

    /** 奖品ID */
    private Long awardId;

    /** 奖品KEY */
    private String awardKey;

    /** 奖品配置 */
    private String awardConfig;

    /** 奖品描述 */
    private String awardDesc;

    /** 创建时间 */
    private LocalDateTime createTime;

    /** 更新时间 */
    private LocalDateTime updateTime;

}
