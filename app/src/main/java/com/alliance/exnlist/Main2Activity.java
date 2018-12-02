package com.alliance.exnlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ListView l1;
    String[] arrayItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        l1=findViewById(R.id.l1);
        Toast.makeText(this, ""+getIntent().getStringExtra("par"), Toast.LENGTH_SHORT).show();
        String recieve=getIntent().getStringExtra("par");
        int n=Integer.parseInt(recieve);
        String generated="";
        for(int i=0;i<n;i++)
        {
            generated+="ITEM "+i+",";
        }
        arrayItems=generated.split(",");
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayItems);
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(),arrayItems[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}
