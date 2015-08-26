package cn.rocky.test;

import cn.rocky.service.IMybookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by luoqi02 on 2015/8/26.
 */
@ContextConfiguration("classpath*:applicationContext.xml")
public class MybatisTest {
    @Autowired
    private IMybookService mybookService;
    @Test
    public void test1(){
        mybookService.insert(2,"hello");
    }
}
