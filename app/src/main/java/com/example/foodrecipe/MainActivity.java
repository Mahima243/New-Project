package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//   ListView listView;
//   SearchView searchView;
//   String ItemList[]={"FastFood","Rice Item","Curry Item","Deserts","Appetizer"};

//    private GridView gridView;
//
    int[] pic={R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food4,R.drawable.food5,R.drawable.food6,R.drawable.food7,R.drawable.food8,
    R.drawable.food9,R.drawable.food10,R.drawable.food11,R.drawable.food12,R.drawable.food13,R.drawable.food14,R.drawable.food15,R.drawable.food16};
    String[]foodNames;

    private ListView listView;
    private String[] categoryNames;
    private ArrayList<FoodItem> arrayList = new ArrayList<FoodItem>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list_view_category);
        categoryNames=getResources().getStringArray(R.array.category);

        arrayList.clear();
        for (int i = 0; i < categoryNames.length; i++) {
            FoodItem foodItem = new FoodItem(categoryNames[i], pic[i]);
            arrayList.add(foodItem);
        }
        CustomAdapter adapter=new  CustomAdapter (this,categoryNames,pic, arrayList);
        listView.setAdapter(adapter);

         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                    intent.putExtra("tag","fastFood");
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                    intent.putExtra("tag","rice");
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                    intent.putExtra("tag","curry");
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                    intent.putExtra("tag","deserts");
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                    intent.putExtra("tag","shakes");
                    startActivity(intent);
                }

            }
        });


//        listView=(ListView)findViewById(R.id.listview);
//        searchView=(SearchView)findViewById(R.id.search);
//        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.
//                simple_list_item_1,ItemList);
//        listView.setAdapter((arrayAdapter));
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String select = listView.getItemAtPosition(position).toString();
//                Intent intent=new Intent(MainActivity.this,ItemDetail.class);
//                intent.putExtra("select",select);
//                startActivity(intent);
//
//
//                                            }
//
//        });
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                arrayAdapter .getFilter().filter(newText);
//                return true;
//            }
//        });
//
//
//
//
//
//
//        foodNames=getResources().getStringArray(R.array.food);
//        gridView=(GridView)findViewById(R.id.gridViewId);
//
//        CustomAdapter adapter=new  CustomAdapter (this,foodNames,pic);
//        gridView.setAdapter(adapter);
//
//
//
//
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 0) {
//                    Intent intent = new Intent(MainActivity.this, NewActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 1) {
//                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 2) {
//                    Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 3) {
//                    Intent intent = new Intent(MainActivity.this, FourthActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 4) {
//                    Intent intent = new Intent(MainActivity.this, FifthActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 5) {
//                    Intent intent = new Intent(MainActivity.this, SixActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 6) {
//                    Intent intent = new Intent(MainActivity.this, EightActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 7) {
//                    Intent intent = new Intent(MainActivity.this, NineActivity.class);
//                    startActivity(intent);
//                }
//                if (position== 8) {
//                    Intent intent = new Intent(MainActivity.this, TenActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 9) {
//                    Intent intent = new Intent(MainActivity.this,ElevenActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 10) {
//                    Intent intent = new Intent(MainActivity.this,TwelveActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 11) {
//                    Intent intent = new Intent(MainActivity.this,ThirteenActivity.class);
//                    startActivity(intent);
//                }
//                if (position== 12) {
//                    Intent intent = new Intent(MainActivity.this,FourteenActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 13) {
//                    Intent intent = new Intent(MainActivity.this,FifteenActivity.class);
//                    startActivity(intent);
//                }
//                if (position == 14) {
//                    Intent intent = new Intent(MainActivity.this,SixteenActivity.class);
//                    startActivity(intent);
//                }
//
//
//            }
//        });



    }
}