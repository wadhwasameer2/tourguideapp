package com.example.tourapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersMainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_main);

        final ArrayList<word> words= new ArrayList<word>();

        words.add(new word ("Hotel Taj", "Expensive, beautiful beachside property.The best. ",R.drawable.tajbekal));
        words.add(new word ("Lalit Bekal", "Another expensive,beautiful beachside property",R.drawable.lalitbekal));
        words.add(new word ("Thalathoor", "A homestay. Experience local hospitality",R.drawable.thalathoor));
        words.add(new word ("Bekal Home Stay", "Budget homestay",R.drawable.bekalhomestay));



        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



        }

    }

