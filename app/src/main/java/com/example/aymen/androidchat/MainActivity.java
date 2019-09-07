package com.example.aymen.androidchat;
//Класс используется под чат-онлайн ничего не менять!
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    private Button btn;
    private EditText nickname;
    public static final String NICKNAME = "usernickname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //вызов компонента пользовательского интерфейса по идентификатору
        btn = (Button) findViewById(R.id.enterchat) ;
        nickname = (EditText) findViewById(R.id.nickname);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Если поле никнейм не пустое, то пустит на активи чата
                 if(!nickname.getText().toString().isEmpty()){
                     Intent i  = new Intent(MainActivity.this,ChatBoxActivity.class);
                     // восстанавливаем никнем из textview и вносим его в extra
                     i.putExtra(NICKNAME,nickname.getText().toString());

                     startActivity(i);
                 }
            }
        });

    }
}
