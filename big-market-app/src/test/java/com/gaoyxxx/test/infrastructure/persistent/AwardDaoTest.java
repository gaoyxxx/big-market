package com.gaoyxxx.test.infrastructure.persistent;

import com.gaoyxxx.infrastructure.persistent.dao.IAwardDao;
import com.gaoyxxx.infrastructure.persistent.po.Award;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: gaoyx
 * @Description:
 * @CreateDateTime: 2025/11/29 16:45
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDao awardDao;

    @Test
    public void test_queryAwardList() {
        List<Award> list = awardDao.queryAwardList();
        log.info("测试结果：{}", list);
    }
}
