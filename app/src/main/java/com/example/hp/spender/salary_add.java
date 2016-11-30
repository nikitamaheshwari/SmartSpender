package com.example.hp.spender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;

/**
 * Created by HP on 04-04-2016.
 */
public class salary_add extends AppCompatActivity {
    private Toolbar mToolbar;
    private Button expense_add;
    private TextView displaydatetv;
    Button updatesalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salary_add);
        updatesalary = (Button)findViewById(R.id.updatesalarybutton);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
      //  expense_add = (Button)findViewById(R.id.exenseadd);
        displaydatetv = (TextView)findViewById(R.id.textViewdisplaydate);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        long date = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("EEE dd, MMMM, yyyy hh:mm a");
        String dateString = sdf.format(date);
        displaydatetv.setText(dateString);


        updatesalary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(salary_add.this,salary_update.class);
                startActivity(i);

            }
        });

    }
}
