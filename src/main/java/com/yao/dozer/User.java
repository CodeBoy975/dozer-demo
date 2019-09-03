package com.yao.dozer;

import java.util.Date;

/**
 * 描述： 用户
 *
 * @author pengjie_yao
 * @date 2019/9/3 16:27
 */

public class User {

    /**
     *  名字
     */
    private String name;
    /**
     *  年龄
     */
    private Integer age;
    /**
     *  生日
     */
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}
