package com.example.hp.spender;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;

/**
 * Created by HP on 04-04-2016.
 */
public class expense_add extends AppCompatActivity {
    private Toolbar mToolbar;
    // private Button expense_add;
    private TextView tvDisplayDate;
    HorizontalScrollView lv;
    Context context;
    // private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expense_add);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        //expense_add = (Button)findViewById(R.id.exenseadd);
        tvDisplayDate = (TextView) findViewById(R.id.tvdisplaydate);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        long date = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("EEE dd, MMMM, yyyy hh:mm a");
        String dateString = sdf.format(date);
        tvDisplayDate.setText(dateString);
    }
}
       /*  listView = (ListView) findViewById(R.id.listView);
         String[] values = new String[] { "Food",
                 "Bill",
                 "Shopping",
                 "Extra",

         };
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                 android.R.layout.simple_list_item_1, android.R.id.text1, values);
         listView.setAdapter(adapter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

             @Override
             public void onItemClick(AdapterView<?> parent, View view,
                                     int position, long id) {


                 String itemValue = (String) listView.getItemAtPosition(position);


                 Toast.makeText(getApplicationContext(),
                         itemValue + "selected", Toast.LENGTH_LONG).show();

             }

         });*/


         /*expense_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.example.hp.spender.expense_add.this, category_expense.class);
                startActivity(i);
            }
        });
*/



