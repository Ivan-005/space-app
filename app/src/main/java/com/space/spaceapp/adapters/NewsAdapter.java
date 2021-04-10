package com.space.spaceapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.space.spaceapp.databinding.ItemPostNewsBinding;
import com.space.spaceapp.models.Item;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private Context mContext;
    private List<Item> mList;

    public NewsAdapter(Context mContext, List<Item> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemPostNewsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.title.setText(mList.get(position).getTitle());
        String link = mList.get(position).getEnclosureImgObject().getImageUrl();
        Glide
                .with(mContext)
                .load(link)
                .fitCenter()
                .into(holder.binding.postImage);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemPostNewsBinding binding;

        public ViewHolder(@NonNull ItemPostNewsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
