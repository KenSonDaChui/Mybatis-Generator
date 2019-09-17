package com.jiucheng;

import com.jiucheng.dao.ScoreMapper;
import com.jiucheng.domain.Score;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @功能描述:
 * @Auther: Administrator
 * @Date: 2019/9/15 15:10
 */


@SpringBootTest
@RunWith(SpringRunner.class)
public class test {

    @Autowired
    public ScoreMapper scoreMapper;

    @Test
    public void testFindAll() {
        List<Score> scores = scoreMapper.selectByExample(null);
        System.out.println(scores);
    }


}
