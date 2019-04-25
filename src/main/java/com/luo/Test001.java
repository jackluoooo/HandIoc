package com.luo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * json解析
 */
public class Test001 {
    public static void main(String[] args) {
        String Json="{\"name\":\"luojinxing\",\"age\":\"23\"}";
        //
        JSONObject jsonObject = new JSONObject().parseObject(Json);
        /**
         * 循环遍历
         */
        String name=jsonObject.getString("name");
        System.out.println(name);

        /**
         * json转对象
         */
        Person person = new JSONObject().parseObject(Json, Person.class);
        System.out.println(person.toString());

        /**
         * 组装Json
         */

        JSONObject root=new JSONObject();
        root.put("id",20);
        root.put("name","ljx");
        root.put("age",24);
        JSONArray jsonArray=new JSONArray();
        JSONObject Person=new JSONObject();
        root.put("id",20);
        root.put("name","ljx");
        root.put("age",24);

        /**
         * 将对象转换为Json
         */

        new JSONObject().toJSON(person);

    }
}
