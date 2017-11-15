package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.util.Locale.*;

public class Main {

    public static void main(String[] args){

//        String filePath = "C:\\Users\\Артём\\epam_hw6_task2\\resources\\some.properties";
        System.out.println(getDataFromProperty());
    }
    private static Map<String, String> getDataFromProperty(){

        Map<String, String> propertyMap = new HashMap<>();
//        Path property = Paths.get(fileName);
        ResourceBundle propertyResourceBundle = ResourceBundle.getBundle("resources.some");
        Enumeration<String> keys = propertyResourceBundle.getKeys();

        while(keys.hasMoreElements()){
            String line = keys.nextElement();
            propertyMap.put(line,propertyResourceBundle.getString(line));
        }

        return propertyMap;
    }
}
