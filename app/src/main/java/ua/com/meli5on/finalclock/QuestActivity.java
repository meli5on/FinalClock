package ua.com.meli5on.finalclock;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuestActivity extends Activity {
    Button answer1, answer2, answer3;
    TextView question;
    public String checkAnswer(String s){

        int i = s.length();
        char ch = s.charAt(0);
        if(ch == '*'){
            String answer = s.substring(1,i);
            return answer;
        }else{
            String answer = s;
            return answer;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);
        final List<Quest> questions = new ArrayList<>();
        questions.add(new Quest("Где стоит статуя свободы","*Лондон","Париж","Чикаго"));
        Quest test = questions.get(0);
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        question = findViewById(R.id.question);
        String q = test.getQuest();
        question.setText(q);
        answer1.setText("qwest1");
        answer2.setText("qwest2");
        answer3.setText("qwest3");



    }
}
