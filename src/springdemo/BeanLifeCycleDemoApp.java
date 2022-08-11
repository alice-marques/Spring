package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args){
        //load the config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        //retrieve Bean
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //Check if the same

        //print results
        System.out.println("\nMemory location for theCoach: " + theCoach);
        context.close();
    }
}
