package com.luo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class ClassPathXmlApplicationContext {

    private static  String PATH;
    private static  String ID;
    private static  String CLASS;

    private void init(){
        this.ID="id";
        this.CLASS="class";
    }
    public ClassPathXmlApplicationContext(String PATH) {
        this.PATH=PATH;
        this.init();
    }

    public  Object getBean(String beanId)throws DocumentException,ClassNotFoundException ,InstantiationException,IllegalAccessException{
        Object o=new Object();
        if(beanId==null||beanId.equals("")){
            return null;
        }
        SAXReader saxReader=new SAXReader();
        Document read = saxReader.read(this.getClass().getClassLoader().getResource(PATH));
        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements();
        for (Element element:elements
             ) {
            String s = element.attributeValue(ID);
            if(!beanId.equals(s)){
                continue;
            }
            String attClass=element.attributeValue(CLASS);
            Class<?> aClass = Class.forName(attClass);
             o = aClass.newInstance();
        }
        return o;
    }
}
