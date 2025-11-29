package com.gaoyxxx.infrastructure.persistent.dao;

import com.gaoyxxx.infrastructure.persistent.po.StrategyRule;

import java.util.List;

/**
 * @Author: gaoyx
 * @Description: 策略规则 Dao
 * @CreateDateTime: 2025/11/29 15:55
 */
public interface IStrategyRuleDao {

    List<StrategyRule> queryStrategyRuleList();

}
