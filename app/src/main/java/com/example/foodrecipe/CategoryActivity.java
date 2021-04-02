package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {


    private ListView listView;
    private SearchView searchView;

    private ArrayList<FoodItem> arrayList = new ArrayList<FoodItem>();
    private String[] items;
    private String value;


    int[] fastFoodPic = {R.drawable.food1, R.drawable.food2, R.drawable.food3, R.drawable.food4, R.drawable.food5, R.drawable.food6};
    int[] riceItemPic = {R.drawable.food7, R.drawable.food8, R.drawable.food9};
    int[] curryItemPic = {R.drawable.food10, R.drawable.food11, R.drawable.food12};
    int[] desertItemPic = {R.drawable.food13, R.drawable.food14};
    int[] shakeItemPic = {R.drawable.food15, R.drawable.food16};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        listView = (ListView) findViewById(R.id.list_view_items);
        searchView = (SearchView) findViewById(R.id.search_view_item);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            value = bundle.getString("tag");
        }


        if (value.equals("fastFood")) {
            arrayList.clear();
            items = getResources().getStringArray(R.array.FastFood);
            for (int i = 0; i < fastFoodPic.length; i++) {
                FoodItem foodItem = new FoodItem(items[i], fastFoodPic[i], i);
                arrayList.add(foodItem);
            }
            CustomAdapter adapter = new CustomAdapter(this, items, fastFoodPic, arrayList);
            listView.setAdapter(adapter);

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {

                    if (TextUtils.isEmpty(newText)) {
                        adapter.filter("");
                        listView.clearTextFilter();
                    } else {
                        adapter.filter(newText);
                    }
                    return true;
                }
            });

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    FoodItem foodItem = (FoodItem) listView.getItemAtPosition(position);
                    int foodId = foodItem.getId();
                    if (foodId == 0) {
                        Intent intent = new Intent(CategoryActivity.this, NewActivity.class);
                        listView.getItemAtPosition(position);
                        startActivity(intent);
                    }
                    if (foodId == 1) {
                        Intent intent = new Intent(CategoryActivity.this, SecondActivity.class);
                        startActivity(intent);
                    }
                    if (foodId == 2) {
                        Intent intent = new Intent(CategoryActivity.this, ThirdActivity.class);
                        startActivity(intent);
                    }
                    if (foodId == 3) {
                        Intent intent = new Intent(CategoryActivity.this, FourthActivity.class);
                        startActivity(intent);
                    }
                    if (foodId == 4) {
                        Intent intent = new Intent(CategoryActivity.this, FifthActivity.class);
                        startActivity(intent);
                    }
                    if (foodId == 5) {
                        Intent intent = new Intent(CategoryActivity.this, SixActivity.class);
                        startActivity(intent);
                    }

                }
            });
        } else if (value.equals("rice")) {
            items = getResources().getStringArray(R.array.RiceItem);
            for (int i = 0; i < riceItemPic.length; i++) {
                FoodItem foodItem = new FoodItem(items[i], riceItemPic[i], i);
                arrayList.add(foodItem);
            }
            CustomAdapter adapter = new CustomAdapter(this, items, riceItemPic, arrayList);
            listView.setAdapter(adapter);

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {

                    if (TextUtils.isEmpty(newText)) {
                        adapter.filter("");
                        listView.clearTextFilter();
                    } else {
                        adapter.filter(newText);
                    }
                    return true;
                }
            });

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    FoodItem foodItem = (FoodItem) listView.getItemAtPosition(position);
                    int foodId = foodItem.getId();
                    if (foodId == 0) {
                        Intent intent = new Intent(CategoryActivity.this, SevenActivity.class);
                        startActivity(intent);
                    }
                    if (foodId == 1) {
                        Intent intent = new Intent(CategoryActivity.this, EightActivity.class);
                        startActivity(intent);
                    }
                    if (foodId == 2) {
                        Intent intent = new Intent(CategoryActivity.this, NineActivity.class);
                        startActivity(intent);
                    }
                }
            });
        } else if (value.equals("curry")) {
            items = getResources().getStringArray(R.array.CurryItem);
            for (int i = 0; i < curryItemPic.length; i++) {
                FoodItem foodItem = new FoodItem(items[i], curryItemPic[i], i);
                arrayList.add(foodItem);
            }
            CustomAdapter adapter = new CustomAdapter(this, items, curryItemPic, arrayList);
            listView.setAdapter(adapter);

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {

                    if (TextUtils.isEmpty(newText)) {
                        adapter.filter("");
                        listView.clearTextFilter();
                    } else {
                        adapter.filter(newText);
                    }
                    return true;
                }
            });

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    FoodItem foodItem = (FoodItem) listView.getItemAtPosition(position);
                    int foodId = foodItem.getId();
                    if (foodId == 0) {
                        Intent intent = new Intent(CategoryActivity.this, TenActivity.class);
                        startActivity(intent);
                    }
                    if (foodId == 1) {
                        Intent intent = new Intent(CategoryActivity.this, ElevenActivity.class);
                        startActivity(intent);
                    }
                    if (foodId == 2) {
                        Intent intent = new Intent(CategoryActivity.this, TwelveActivity.class);
                        startActivity(intent);
                    }
                }
            });

        } else if (value.equals("deserts")) {
            items = getResources().getStringArray(R.array.DesertsItem);
            for (int i = 0; i < desertItemPic.length; i++) {
                FoodItem foodItem = new FoodItem(items[i], desertItemPic[i], i);
                arrayList.add(foodItem);
            }
            CustomAdapter adapter = new CustomAdapter(this, items, desertItemPic, arrayList);
            listView.setAdapter(adapter);

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {

                    if (TextUtils.isEmpty(newText)) {
                        adapter.filter("");
                        listView.clearTextFilter();
                    } else {
                        adapter.filter(newText);
                    }
                    return true;
                }
            });

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    FoodItem foodItem = (FoodItem) listView.getItemAtPosition(position);
                    int foodId = foodItem.getId();
                    if (foodId == 0) {
                        Intent intent = new Intent(CategoryActivity.this, ThirteenActivity.class);
                        startActivity(intent);
                    }
                    if (foodId == 1) {
                        Intent intent = new Intent(CategoryActivity.this, FourteenActivity.class);
                        startActivity(intent);
                    }
                }
            });
        } else {
            items = getResources().getStringArray(R.array.Shakes);
            for (int i = 0; i < shakeItemPic.length; i++) {
                FoodItem foodItem = new FoodItem(items[i], shakeItemPic[i], i);
                arrayList.add(foodItem);
            }
            CustomAdapter adapter = new CustomAdapter(this, items, shakeItemPic, arrayList);
            listView.setAdapter(adapter);

            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {

                    if (TextUtils.isEmpty(newText)) {
                        adapter.filter("");
                        listView.clearTextFilter();
                    } else {
                        adapter.filter(newText);
                    }
                    return true;
                }
            });

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    FoodItem foodItem = (FoodItem) listView.getItemAtPosition(position);
                    int foodId = foodItem.getId();
                    if (foodId == 0) {
                        Intent intent = new Intent(CategoryActivity.this, FifteenActivity.class);
                        startActivity(intent);
                    }
                    if (foodId == 1) {
                        Intent intent = new Intent(CategoryActivity.this, SixteenActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}