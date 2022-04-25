package com.example.fruits;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FruitsAdapter extends ArrayAdapter<Fruits> {

    private static final String LOG_TAG = FruitsAdapter.class.getSimpleName();

    public FruitsAdapter(Activity context, ArrayList<Fruits> androidFruits) {
        super(context, 0, androidFruits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Fruits currentAndroidFlavor = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.hin_view);

        nameTextView.setText(currentAndroidFlavor.getHindi());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.eng_view);

        numberTextView.setText(currentAndroidFlavor.getEng());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.fruit_icon);

        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());

        return listItemView;
    }

}