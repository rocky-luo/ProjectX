package cn.rocky;

import cn.rocky.Bean.MyBook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * Created by luoqi02 on 15/11/28.
 */
public class App {

    public static void main(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyBook myBook = (MyBook)applicationContext.getBean("book");
        System.out.println(myBook);

    }

}
