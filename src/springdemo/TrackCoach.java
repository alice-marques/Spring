package springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    public TrackCoach(){}
    public TrackCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {

        return "Run 5 Km";
    }

    @Override
    public String getDailyFortune() {
        return "Feeling "+fortuneService.getFortune();
    }

}