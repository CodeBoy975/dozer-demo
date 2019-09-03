package com.yao.dozer;

import com.github.dozermapper.core.Mapping;

/**
 * 描述： 测试注解方式
 *
 * @author pengjie_yao
 * @date 2019/9/3 16:56
 */
public class UserBO {

    /**
     *  名字
     */
    @Mapping("name")
    public String username;
    /**
     *  年龄
     */
    private String age;
    /**
     *  生日
     */
    @Mapping("birthday")
    private String dateOfBirth;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "UserBO{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
