package com.gaoyxxx.infrastructure.persistent.dao;

import com.gaoyxxx.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: gaoyx
 * @Description: 奖品表 DAO
 * @CreateDateTime: 2025/11/29 0:18
 */
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
