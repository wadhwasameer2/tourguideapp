package com.example.tourapplication;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {
    private int mColorResourceID;
public WordAdapter(Context context, ArrayList<word> Words, int colorResourceId) {
        super(context,0, Words);
        mColorResourceID = colorResourceId;
    }

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        word currentword = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        nameTextView.setText(currentword.getDefaultTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        numberTextView.setText(currentword.getmMiwokTranslation());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        // Get the image resource ID from the current object and
        // set the image to iconView
        iconView.setImageResource(currentword.getmImageRef());

        View textContainer = listItemView.findViewById(R.id.text_view);

        int color = ContextCompat.getColor((getContext()),mColorResourceID);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}


