package com.example.templesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private ArrayList<Temple>templeArrayList;
    public CustomAdapter(ArrayList<Temple>templeArrayList){
        this.templeArrayList=templeArrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.temple_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(templeArrayList.get(position).getTempleName());
        holder.imageView.setImageResource(templeArrayList.get(position).getImgRes());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"This is "+holder.textView.getText().toString()+" Temple.",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return templeArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
         ImageView imageView;
         TextView textView;
       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           this.imageView=(ImageView) itemView.findViewById(R.id.templeImage);
           this.textView=(TextView) itemView.findViewById(R.id.templeName);
       }
   }
}
