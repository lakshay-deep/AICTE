package com.knock.ashu.aicteandroid.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.knock.ashu.aicteandroid.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;

/**
 * Created by Ashu on 1/3/2017.
 */

public class BulletinFragment extends AicteFragment {

    @BindView(R.id.iv_photo_about_us)
    ImageView ivPic;
    @BindView(R.id.tv_full_info_about_us)
    TextView tvInfo;

    public BulletinFragment() {
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_bulletin;
    }

    public static AicteFragment newInstance() {
        return new AboutUsFragment();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Picasso.with(getContext()).load(R.drawable.bulletin).into(ivPic);
        tvInfo.setText(getResources().getString(R.string.full_info_bulletin));
    }
}
