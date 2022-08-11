package springdemo;

public class FootballCoach implements Coach{

    @Override
    public String getDailyWorkout() {

        return "Jogar Bola";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
