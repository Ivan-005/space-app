package com.space.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.webkit.WebView;

import com.space.spaceapp.databinding.ActivityWebViewBinding;
import com.space.spaceapp.utils.Common;

public class WebViewActivity extends AppCompatActivity {

    WebView webView;
    ActivityWebViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initWebView();

    }

    private void initWebView() {
        webView = binding.webView;
        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString(Common.URL_KEY);
        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);


    }
}