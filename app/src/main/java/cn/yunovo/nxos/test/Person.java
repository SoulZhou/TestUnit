package cn.yunovo.nxos.test;

/**
 * Created by Administrator on 2018/11/23.
 */

public class Person {
    String name;
    String sex;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String eat(String food){
        return food;
    }
}
