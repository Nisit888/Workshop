package com.mycom.coe.listview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by coe on 7/29/2017.
 */
public class CustomAdapter extends BaseAdapter {


    private Context mContext;
    private String[] mValues;
    private int[] mResId;

    public CustomAdapter(Context context, String[] values, int[] resId) {
        mContext = context;
        mValues = values;
        mResId = resId;
    }

    @Override
    public int getCount() {
        return mValues.length;
    }

    @Override
    public Object getItem(int i) {
        return mValues[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null)
            view = layoutInflater.inflate(R.layout.listview_row, parent, false);

        ImageView imageView = view.findViewById(R.id.imageView1);
        imageView.setBackgroundResource(mResId[position]);

        TextView textView1 = view.findViewById(R.id.textView1);
        textView1.setText(mValues[position]);
        return view;
    }
}
