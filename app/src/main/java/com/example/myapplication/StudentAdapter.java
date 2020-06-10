package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Student> arr;

    public StudentAdapter(Context context, int layout, List<Student> arr) {
        this.context = context;
        this.layout = layout;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        TextView textViewTen = convertView.findViewById(R.id.textviewTen);
        TextView textViewTuoi = convertView.findViewById(R.id.textviewTuoi);
        ImageView img = convertView.findViewById(R.id.imageviewHinhAnh);

        Student student = arr.get(position);
        textViewTen.setText(student.getName().toString());
        textViewTuoi.setText(String.valueOf(student.getAge()));
        img.setImageResource(student.getPicture());
        return convertView;
    }
}