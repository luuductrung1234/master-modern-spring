package com.learning.springindepth;

import com.learning.springindepth.basic.BinarySearch;
import com.learning.springindepth.xml.XmlPersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlContextDemoApplication {
    private static Logger logger = LoggerFactory.getLogger(XmlContextDemoApplication.class);

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {
            logger.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

            // bean from current package
            XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
            logger.info("{}", personDAO);

            // scan beans from basic package
            BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
            logger.info("{}", binarySearch);
        }
    }
}