package com.space.spaceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.space.spaceapp.adapters.NewsAdapter;
import com.space.spaceapp.databinding.ActivityMainBinding;
import com.space.spaceapp.models.Item;
import com.space.spaceapp.models.Rss;
import com.space.spaceapp.retrofit.Service;
import com.space.spaceapp.retrofit.requests.Requests;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Context context;
    ActivityMainBinding binding;
    NewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        getData();

    }

    private void getData() {
        Service service = new Service();

        service.getClient().create(Requests.class).getData().enqueue(new Callback<Rss>() {
            @Override
            public void onResponse(Call<Rss> call, Response<Rss> response) {
                List<Item> items = response.body().getChannel().getItems();
                context = getApplicationContext();
                adapter = new NewsAdapter(context, items);
                RecyclerView.LayoutManager layoutManager = new GridLayoutManager(context,2);
                binding.recyclerView.setLayoutManager(layoutManager);
                binding.recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<Rss> call, Throwable t) {
                Log.d("TAG", t.getMessage());
            }
        });
    }
}


