package com.example.myapicalltest3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapicalltest3.Models.ImageResponse;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
    Context context;
    List<ImageResponse> imageList;

    public ImageAdapter(Context context, List<ImageResponse> imageList) {
        this.context = context;
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.image_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        ImageResponse img = imageList.get(position);

        holder.tv_title.setText(img.getTitle());
        Picasso.get().load(img.getUrl()).into(holder.img_image);
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView img_image;
        TextView tv_title;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            img_image = itemView.findViewById(R.id.img_image);
            tv_title = itemView.findViewById(R.id.tv_title);
        }
    }
}
