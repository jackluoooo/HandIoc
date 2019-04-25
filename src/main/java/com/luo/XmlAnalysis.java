package com.luo;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;
import java.util.List;

public class XmlAnalysis {
    /**
     * xml标记语言 数据+配置文件 树状存储结构 dtd(约束文件)
     * dom4J
     * sax
     * pull
     */
    public static void main(String[] args) throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("E:\\workSpace\\HandIoc\\src\\main\\resources\\student.xml");
        Element rootElement = document.getRootElement();
        getNodes(rootElement);

    }

    public static void  getNodes(Element rootElement){
        String name = rootElement.getName();
        String value=rootElement.getTextTrim();
        System.out.println("节点名称："+name+" 值："+value);
        List<Attribute> attributes = rootElement.attributes();
        for (Attribute attribute :attributes
             ) {
            System.out.println("属性名称："+attribute.getName()+"   属性值："+attribute.getValue());

        }
        Iterator<Element> iterator = rootElement.elementIterator();
        while (iterator.hasNext()){
            getNodes(iterator.next());
        }

    }
}
