package com.example.ad39_nguyenhaiduong_day5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String LV ="listView";
    private ListView lvContact;
//    private EditText phoneNumber;
    Contact contact1,contact2,contact3,contact4,contact5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvContact=findViewById(R.id.lv);
        final ArrayList<Contact> arrayList=new ArrayList<>();

        Date date1= new Date();
        long time= date1.getTime();
        Date date=new Date(time);
        contact1=new Contact("0354718165",date);
        contact2=new Contact("0928168587",date);
        contact1=new Contact("0344718165",date);
        contact2=new Contact("0658168587",date);
        contact1=new Contact("0124718165",date);
        contact2=new Contact("0898168587",date);


        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);




        CustomAdapter customAdapter=new CustomAdapter(this,R.layout.item_contact,arrayList);
        lvContact.setAdapter(customAdapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this,arrayList.get((position)).getPhoneNumber()+"\n"+arrayList.get((position)).getTime(),Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this, Main2Activity.class);
//                String listV=
                intent.putExtra(LV,contact1.getPhoneNumber().toString());
                startActivity(intent);
            }
        });

    }
}
