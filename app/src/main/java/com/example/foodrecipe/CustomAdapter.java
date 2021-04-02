package com.example.foodrecipe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int[] pic;
    String[] foodNames;

    private LayoutInflater inflater;
    private List<FoodItem> foodItemList;
    private ArrayList<FoodItem> arrayList;



    public CustomAdapter(Context context, String[] foodNames, int[] pic, List<FoodItem> foodItemList) {
        this.context = context;
        this.foodNames = foodNames;
        this.foodItemList = foodItemList;
        this.arrayList = new ArrayList<FoodItem>();
        this.arrayList.addAll(foodItemList);
        this.pic = pic;
    }

    @Override
    public int getCount() {
        return foodNames.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);


            view = inflater.inflate(R.layout.sample_view, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewId);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        imageView.setImageResource(pic[i]);
        textView.setText(foodNames[i]);

        return view;
    }

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        foodItemList.clear();
        if (charText.length()==0){
            foodItemList.addAll(arrayList);
        }
        else {
            for (FoodItem foodItem : arrayList){
                if (foodItem.getFoodName().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    foodItemList.add(foodItem);
                }
            }
        }
        notifyDataSetChanged();
    }
}