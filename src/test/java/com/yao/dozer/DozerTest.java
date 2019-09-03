package com.yao.dozer;

import com.github.dozermapper.core.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * 描述： springboot测试
 *
 * @author pengjie_yao
 * @date 2019/9/3 17:08
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DozerTest {


    @Autowired
    private Mapper mapper;

    /**
     *  springboot集成dozer测试
     */
    @Test
    public void springbootDozerTest() {

        User user = new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setName("张三");
        UserBO userBO = mapper.map(user, UserBO.class);
        System.out.println(userBO);
    }
}
