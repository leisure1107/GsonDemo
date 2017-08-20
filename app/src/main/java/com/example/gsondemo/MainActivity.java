package com.example.gsondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /*Json第一种方式：直接解析数据*/
    private String jsonData = "[{\"name\":\"jack\",\"age\":20},{\"name\":\"rose\",\"age\":10}]";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JsonUtils jsonUtils = new JsonUtils();
                jsonUtils.parseJson(jsonData);
            }
        });
    }


    /*Json第二种方式：使用类对象来解析
    private String jsonData = "{\"name\":\"jack\",\"age\":20}";
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JsonUtils jsonUtils = new JsonUtils();
                jsonUtils.parseJson(jsonData);
            }
        });
    }
    */
}
