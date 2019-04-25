package com.luo;

import java.lang.reflect.Constructor;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //1.new
//        Person person=new Person();
        //java 反射+（“完整路径”）;
        Class<?> forName=Class.forName("com.luo.Person");

        //使用无参构造函数
        Person clssPerson=(Person) forName.newInstance();

        //禁止反射机制 构造函数私有化

        //获取constructor
        Constructor<?> constructor = forName.getConstructor(String.class, String.class);
        Person person=(Person) constructor.newInstance("ljx","12");
        System.out.println(person.toString());

    }

}
