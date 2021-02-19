package com.gaolei.mvvm.binding;

import android.graphics.Bitmap;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.gaolei.mvvm.R;

public class ImageViewAttrAdapter {

    @BindingAdapter("android:src")
    public static void setSrc(ImageView view, Bitmap bitmap) {
        view.setImageBitmap(bitmap);
    }

    @BindingAdapter("android:src")
    public static void setSrc(ImageView view, int resId) {
        view.setImageResource(resId);
    }

    @BindingAdapter({"app:imageUrl"})
    public static void jloadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url)
                .placeholder(R.drawable.img_default)
                .error(R.drawable.img_default)
                .into(imageView);

    }
}