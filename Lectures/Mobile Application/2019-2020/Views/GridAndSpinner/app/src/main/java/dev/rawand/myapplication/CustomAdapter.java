package dev.rawand.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    String[] items;
    Context context;
    LayoutInflater inflater;

    CustomAdapter(Context context, String[] arr){
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.items = arr;
    }
    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.griditem, null);
        TextView textView1, textView2;
        textView1 = view.findViewById(R.id.grid_item_text_view_1);
        textView2 = view.findViewById(R.id.grid_item_text_view_2);

        String item = items[position];

        textView1.setText(item.substring(0,1));
        textView2.setText(item);

        return view;
    }
}
