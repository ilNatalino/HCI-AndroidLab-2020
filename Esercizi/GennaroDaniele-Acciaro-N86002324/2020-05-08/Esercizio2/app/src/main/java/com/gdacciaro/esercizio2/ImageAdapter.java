package com.gdacciaro.esercizio2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
        private Context context;
        private final Integer[] pizze;

        public ImageAdapter(Context context) {
            this.context = context;
            this.pizze = new Integer[]{R.drawable.pizza1,R.drawable.pizza2,
                                       R.drawable.pizza3,R.drawable.pizza4,
                                       R.drawable.pizza5,R.drawable.pizza6,
                                       R.drawable.pizza7,R.drawable.pizza8,
                                       R.drawable.pizza9
                };
        }

        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View gridView;
            if (convertView == null && inflater != null) {
                gridView = new View(context);
                gridView = inflater.inflate(R.layout.row, null);
                ImageView imageView = gridView.findViewById(R.id.grid_item_image);
                Integer id = pizze[position];
                imageView.setImageResource(id);
                imageView.setTag(id);

            } else {
                gridView = (View) convertView;
            }
            return gridView;
        }

        @Override
        public int getCount() {
            return pizze.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

    }