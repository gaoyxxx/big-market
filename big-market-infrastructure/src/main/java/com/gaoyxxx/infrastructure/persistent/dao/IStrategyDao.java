package com.gaoyxxx.infrastructure.persistent.dao;

import com.gaoyxxx.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: gaoyx
 * @Description: 抽奖策略 DAO
 * @CreateDateTime: 2025/11/29 15:54
 */
@Mapper
public interface IStrategyDao {

    List<Strategy> queryStrategyList();

}
