package com.company.aa;

import com.company.bb.UserDao;
import com.sun.tools.attach.AgentInitializationException;

/**
 * Created by edz on 2016/11/23.
 */
public class User1 implements UserDao{
    private int age;
    private String name;




    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void test() {

    }
}
