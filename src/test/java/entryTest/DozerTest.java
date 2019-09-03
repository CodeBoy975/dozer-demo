package entryTest;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import com.yao.dozer.User;
import com.yao.dozer.UserBO;
import com.yao.dozer.UserDto;
import com.yao.dozer.UserVO;
import org.junit.Test;

import java.util.Date;

/**
 * 描述： 测试Dozer
 *
 * @author pengjie_yao
 * @date 2019/9/3 16:33
 */

public class DozerTest {


    /**
     * 测试默认的转化
     */
    @Test
    public void voTest() {

        // 1.获取dozer的mapper对象
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        // 2.设置属性
        User user = new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setName("张三");
        // 3.进行属性转化：Dozer 自动完成 User 类到 UserVo 类的映射
        UserVO userVo = mapper.map(user, UserVO.class);
        System.out.println(userVo);
        System.out.println(userVo.getAge());
        System.out.println(userVo.getBirthday());
        System.out.println(userVo.getName());
    }

    /**
     * 测试xml方式的转换
     */
    @Test
    public void dtoTest() {
        // 1.获取dozer的mapper对象
        Mapper mapper = DozerBeanMapperBuilder.create().withMappingFiles("userMapping.xml").build();
        // 2.设置属性
        User user = new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setName("张三");
        UserDto userDto = mapper.map(user, UserDto.class);
        System.out.println(userDto);

    }

    /**
     * 测试注解方式的转化
     */
    @Test
    public void boTest() {
        // 1.获取dozer的mapper对象
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        // 2.设置属性
        User user = new User();
        user.setAge(18);
        user.setBirthday(new Date());
        user.setName("张三");
        UserBO userBo = mapper.map(user, UserBO.class);
        System.out.println(userBo);
    }
}
