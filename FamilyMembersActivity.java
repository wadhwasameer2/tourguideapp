package com.example.tourapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        final ArrayList<word> words= new ArrayList<word>();

        words.add(new word ("By the bay", "Authentic coastal cuisine served next to Arabian Sea",R.drawable.bythebaybekal));
        words.add(new word ("Backwaters Cafe", "Continental fare served in an relaxed setting",R.drawable.backwaterscafebekal));
        words.add(new word ("Apple Restaurant", "Local cuisine, the spicier version",R.drawable.applerestaurantbekal));
        words.add(new word ("Naif Cafe", "Local joint for hanging out",R.drawable.naiffoodcafe));


        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
