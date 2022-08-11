package springdemo;

public class BaseballCoach implements Coach{
    private FortuneService fortuneService;
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }



    @Override
    public String getDailyWorkout()  {

        return "Praticar Baseball por 30 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
