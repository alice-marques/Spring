package springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    private String emailAddress;
    private String team;
    //Getter
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
    public CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    //Setter
    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside set email");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside set team");
        this.team = team;
    }



    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("CricketCoach: inside setter");
    }

    public CricketCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {

        return "Practice throwing 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}