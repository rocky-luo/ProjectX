package cn.rocky.test;

import cn.rocky.Bean.Location;
import cn.rocky.Bean.MyBook;
import cn.rocky.Bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by luoqi02 on 15/11/28.
 */
public class App {
    @Test
    public void main(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MyBook myBook = (MyBook)applicationContext.getBean("book");
//        System.out.println(myBook);

//        ClassPathResource classPathResource = new ClassPathResource("applicationContext.xml");
//        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//        reader.loadBeanDefinitions(classPathResource);
//        MyBook book = (MyBook)defaultListableBeanFactory.getBean("book");
//        System.out.println(book);
//        ApplicationContext context = new FileSystemXmlApplicationContext("//Users/rocky/tWorkspace/ProjectX/src/main/resources/applicationContext.xml");
//        User me = (User) context.getBean("user");
//        System.out.println(me);
    }
    @Test
    public void main2(){
//        ClassPathResource classPathResource = new ClassPathResource("applicationContext.xml");
//        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//        reader.loadBeanDefinitions(classPathResource);
//        User me = (User)defaultListableBeanFactory.getBean("user");
//        System.out.println(me);
        ApplicationContext context = new FileSystemXmlApplicationContext("//Users/rocky/tWorkspace/ProjectX/src/main/resources/applicationContext.xml");
        Location location = (Location) context.getBean("location");
        User me = (User) context.getBean("user");
        System.out.println(me.locationOut().getCity());
        System.out.println(me);
    }
}
