package springAssignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConf.xml");

        Employee e =(Employee) ac.getBean("empA2");

        e.show();
    }
}