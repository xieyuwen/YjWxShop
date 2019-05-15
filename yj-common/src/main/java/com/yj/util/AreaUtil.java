package com.yj.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AreaUtil {
    // 各地区xml文件路径
    private static final String LOCAL_LIST_PATH = "classpath:/Area.xml";
    // 所有国家名称List
    private static final List<String> COUNTRY_REGION = new ArrayList<String>();
    private static AreaUtil localutil;
    private SAXReader reader;
    private Document document;
    private Element rootElement; // 根元素

    // 初始化
    private AreaUtil() {
        // 1.读取
        reader = new SAXReader();
        try {
            document = reader.read(LOCAL_LIST_PATH);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        // 2.获得根元素
        rootElement = document.getRootElement();
        // 3.初始化所有国家名称列表
        Iterator it = rootElement.elementIterator();
        Element ele = null;
        while (it.hasNext()) {
            ele = (Element) it.next();
            COUNTRY_REGION.add(ele.attributeValue("Name"));
        }
    }
    /**
     * 获取所有国家名称
     */
    public List<String> getCountry() {
        return COUNTRY_REGION;
    }

    /**
     * 根据国家名获取该国所有省份——util
     */
    private List<Element> provinces(String countryName) {
        Iterator it = rootElement.elementIterator();
        List<Element> provinces = new ArrayList<Element>();
        Element ele = null;
        while (it.hasNext()) {
            ele = (Element) it.next();
            COUNTRY_REGION.add(ele.attributeValue("Name"));
            if (ele.attributeValue("Name").equals(countryName)) {
                provinces = ele.elements();
                break;
            }
        }
        return provinces;
    }

    /**
     * 根据国家名获取该国所有省份
     * @param countryName
     * @return
     */
    public List<String> getProvinces(String countryName) {
        List<Element> tmp = this.provinces(countryName);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < tmp.size(); i++) {
            list.add(tmp.get(i).attributeValue("Name"));
        }
        return list;
    }

    /**
     * 描 述：根据国家名和省份名，获取该省城市名列表——util
     */
    private List<Element> cities(String countryName, String provinceName) {
        List<Element> provinces = this.provinces(countryName);
        List<Element> cities = new ArrayList<Element>();
        if (provinces == null || provinces.size() == 0) { // 没有这个城市
            return cities;
        }
        for (int i = 0; i < provinces.size(); i++) {
            if (provinces.get(i).attributeValue("Name").equals(provinceName)) {
                cities = provinces.get(i).elements();
                break;
            }
        }
        return cities;
    }

    /**
     * 描 述：根据国家名和省份名获取城市列表
     */
    public List<String> getCities(String countryName, String provinceName) {
        List<Element> tmp = this.cities(countryName, provinceName);
        List<String> cities = new ArrayList<String>();
        for (int i = 0; i < tmp.size(); i++) {
            cities.add(tmp.get(i).attributeValue("Name"));
        }
        return cities;
    }

    /**
     * 描 述：根据国省市获取区县——util
     */
    private List<Element> areaes(String countryName, String provinceName,
                                 String city) {
        List<Element> provinces = this.cities(countryName, provinceName);
        List<Element> cities = new ArrayList<Element>();
        if (provinces == null || provinces.size() == 0) { // 没有这个城市
            return cities;
        }
        for (int i = 0; i < provinces.size(); i++) {
            if (provinces.get(i).attributeValue("Name").equals(city)) {
                cities = provinces.get(i).elements();
                break;
            }
        }
        return cities;
    }

    /**
     * 描 述：根据国省市获取区县
     */
    public List<String> getAreaes(String countryName, String provinceName,
                                  String city) {
        List<String> lists = new ArrayList<String>();
        List<Element> e = this.areaes(countryName, provinceName, city);
        for (Element element : e) {
            lists.add(element.attributeValue("Name"));
        }
        return lists;
    }

    public static AreaUtil getInstance() {
        if (localutil == null) {
            localutil = new AreaUtil();
        }
        return localutil;
    }

}
