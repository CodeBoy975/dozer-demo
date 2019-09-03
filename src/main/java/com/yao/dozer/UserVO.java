package com.yao.dozer;

/**
 * 描述： 封装给前端的数据格式
 *
 * @author pengjie_yao
 * @date 2019/9/3 16:30
 */
public class UserVO {

    /**
     *  名字
     */
    private String name;
    /**
     *  年龄
     */
    private String age;
    /**
     *  生日
     */
    private String birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

}
