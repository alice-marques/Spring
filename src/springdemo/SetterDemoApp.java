package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {


    public static void main(String[] args){
        //load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        //call bean methods
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        //close
        context.close();
    }
}
