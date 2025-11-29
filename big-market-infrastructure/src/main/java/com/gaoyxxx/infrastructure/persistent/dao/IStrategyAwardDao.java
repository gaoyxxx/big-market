package com.gaoyxxx.infrastructure.persistent.dao;

import com.gaoyxxx.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: gaoyx
 * @Description: 抽奖策略奖品明细配置 - 概率、规则 DAO
 * @CreateDateTime: 2025/11/29 15:53
 */
@Mapper
public interface IStrategyAwardDao {

    List<StrategyAward> queryStrategyAwardList();

}
