package com.example.himmanshoojha.puertorico;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Himmanshoo Jha on 11/04/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.DataViewHolder> {

    ArrayList<Model>models;

    Context context;

    public MyAdapter(Context context,ArrayList<Model>models){
        this.context = context;
        this.models =models;

    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        DataViewHolder dataViewHolder= new DataViewHolder(view,context,models);

        return dataViewHolder;
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {

        holder.imageView.setImageResource(models.get(position).getImage_id());

        holder.textView.setText(models.get(position).getTxt());

    }

    @Override
    public int getItemCount()
    {

        return models.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView ;

        TextView textView;

        CardView cardView;

        ArrayList<Model> models;

        Context context;

        public DataViewHolder(View itemView,Context context, ArrayList<Model>models) {

            super(itemView);

            this.context = context;

            this.models = models;

            imageView = (ImageView)itemView.findViewById(R.id.img_v1);

            textView =(TextView)itemView.findViewById(R.id.txt1);

            cardView = (CardView)itemView.findViewById(R.id.Card_View);

            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(this.context,PopularProducts.class);

            this.context.startActivity(intent);

        }
    }
}
