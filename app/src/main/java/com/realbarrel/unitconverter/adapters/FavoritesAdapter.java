package com.realbarrel.unitconverter.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.database.DataSource;
import com.realbarrel.unitconverter.models.DataItemQuantities;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FavoritesAdapter extends RecyclerView.Adapter<FavoritesAdapter.ViewHolder> {

    private final List<DataItemQuantities> mItems;
    private final Context mContext;
    private final DataSource mDataSource;

    public FavoritesAdapter(Context context, List<DataItemQuantities> items) {
        this.mContext = context;
        this.mItems = items;
        mDataSource = new DataSource(mContext);
        mDataSource.open();
    }

    @NonNull
    @Override
    public FavoritesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                          int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.list_item_favorites, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataItemQuantities item = mItems.get(position);

        holder.textView.setText(item.getTitle());
        holder.checkBox.setChecked(item.isFavorite());
        try {
            String imageFile = item.getImage();
            InputStream inputStream = mContext.getAssets().open(imageFile);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            holder.imageView.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        holder.checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            item.setFavorite(isChecked);
            mDataSource.updateFavorite(item);
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        View mView;
        ImageView imageView;
        TextView textView;
        AppCompatCheckBox checkBox;

        ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_list_favorites);
            textView = itemView.findViewById(R.id.tv_list_favorites);
            checkBox = itemView.findViewById(R.id.cb_list_favorites);

            mView = itemView;
        }
    }
}