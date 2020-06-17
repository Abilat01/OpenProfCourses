package com.abilat.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Human human2 = new Human();
        human2.setName("Коля");
        human2.setOrientation("gay");
        human2.setAge(23);
        human2.setBooks(null);
        ArrayList books = new ArrayList<Human>();
        books.add(human2);
        Human human = new Human();
        human.setName("Коля");
        human.setOrientation("gay");
        human.setAge(23);
        human.setBooks(books);

        String json = new Gson().toJson(human);

        Log.d("HHH", json);

        Human humanGsong = new Gson().fromJson(json, Human.class);

        Log.d("HHH", humanGsong.getOrientation());


    }
}
