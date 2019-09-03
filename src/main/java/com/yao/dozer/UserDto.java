package com.yao.dozer;

/**
 * 描述： 接受前端的数据
 *
 * @author pengjie_yao
 * @date 2019/9/3 16:45
 */
public class UserDto {

    /**
     * 名字
     */
    private String userName;

    /**
     * 年龄
     */
    private String age;

    /**
     * 生日
     */
    private String dateOfBirth;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        return "UserDto{" +
                "userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

}
