package ua.com.meli5on.finalclock;


public class Quest {
    private String quest;
    private String answer1;
    private String answer2;
    private String answer3;


    public Quest(String quest, String answer1, String answer2, String answer3){
        this.quest = quest;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
    }

    public String getQuest(){
        return quest;
    }
    public String getAnswer1(){
        return answer1;
    }
    public String getAnswer2(){
        return answer2;
    }
    public String getAnswer3(){
        return answer3;
    }


}
