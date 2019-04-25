package com.luo;

public class Person {
    private String name;
    private String age;

    public Person() {
        System.out.println("反射创建");
    }

    public Person(String name,String age){
        System.out.println(name+"----"+age);
        this.age=age;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
