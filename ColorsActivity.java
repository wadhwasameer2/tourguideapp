package com.example.tourapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<word> words= new ArrayList<word>();

        words.add(new word ("Bekal Fort", "A historical seaside fort made in 1650AD.Scenic.",R.drawable.bekalfort));
        words.add(new word ("Beach", "Pristine, uncrowded beaches",R.drawable.kapillbekal));
        words.add(new word ("House Boats", "Beautiful houseboats for great sunset views on the Sea",R.drawable.houseboatbekal));
        words.add(new word ("Hotel Lalit", "Creative architecture of Hotel Lalit",R.drawable.lalitbekal2));




        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);




    }
}
