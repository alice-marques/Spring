package springdemo;

import java.util.Random;

public class NeutralFortuneService implements FortuneService{
        private String[] fortune;

    public NeutralFortuneService(String[] fortune) {
        this.fortune = fortune;
    }

    public NeutralFortuneService(String s) {
    }


    @Override
        public String getFortune(){
        int rand = new Random().nextInt(fortune.length);
            return fortune[rand];
        }

}

