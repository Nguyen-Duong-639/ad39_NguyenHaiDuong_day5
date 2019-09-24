package com.example.ad39_nguyenhaiduong_day5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {
    private Context context;
    private int resource;
    private ArrayList<Contact> arrContact;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrContact= (ArrayList<Contact>) objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false);

            viewHolder= new ViewHolder();
            viewHolder.phoneNumber=convertView.findViewById(R.id.phoneNumber);
            viewHolder.time=convertView.findViewById(R.id.time);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Contact contact=arrContact.get(position);

        viewHolder.time.setText(contact.getTime().toString());
        viewHolder.phoneNumber.setText(contact.getPhoneNumber());

        return convertView;
    }
    public class ViewHolder{
        TextView phoneNumber;
        TextView time;

    }
}
