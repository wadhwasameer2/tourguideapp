package com.example.tourapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<word> words= new ArrayList<word>();

        words.add(new word ("By road from Bangalore", "Around 7 hours drive from Bangalore, a major metro"));
        words.add(new word ("By train from Kasargod", "Upto Kasargod which is around 1 hour drive from Bekal"));
        words.add(new word ("By flight to Calicut", "Fly upto Calicut in Kerala, around 3 hours away"));




        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);



        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
