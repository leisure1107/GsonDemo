package com.example.gsondemo;

import android.util.JsonReader;

import java.io.StringReader;

/**
 * Created by ASUS on 2017/8/20.
 */

public class JsonUtils {
    public void parseJson(String jsonData){
        try{
            JsonReader reader = new JsonReader(new StringReader(jsonData));
            reader.beginArray();
            while (reader.hasNext()){
                reader.beginObject();
                while (reader.hasNext()){
                    String tagName = reader.nextName();
                    if (tagName.equals("name")){
                        System.out.println("name--->"+reader.nextString());
                    }else if (tagName.equals("age")){
                        System.out.println("age--->"+reader.nextInt());
                    }
                }
                reader.endObject();
            }
            reader.endArray();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
