package springAssignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConf3.xml");

        SBU sbu = (SBU) ac.getBean("sbu3");

        sbu.displayDetails();
    }
}