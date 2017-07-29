package com.mycom.coe.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    String[] values = new String[] {
            "Item 1: Android",
            "Item 2: iPhone ",
            "Item 3: Windows Phone",
            "Item 4: Custom Phone",
            "Item 5: Nokia"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1 ,
//                android.R.id.text1 ,
//                values);
        CustomAdapter customAdapter = new CustomAdapter( getApplicationContext(), values  );

        list.setAdapter(customAdapter);

//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView,
//                                    View view,
//                                    int position, long l) {
//                String itemValue = (String) list.getItemAtPosition(position);
//                Toast.makeText(MainActivity.this,
//                        "Position :"+ position+"  ListItem : " +itemValue,
//                        Toast.LENGTH_SHORT)
//                        .show();
//            }
//        });



    }
}
