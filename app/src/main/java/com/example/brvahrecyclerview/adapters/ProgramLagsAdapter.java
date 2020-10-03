package com.example.brvahrecyclerview.adapters;

import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.brvahrecyclerview.R;
import com.example.brvahrecyclerview.models.ProgramLags;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ProgramLagsAdapter extends BaseQuickAdapter<ProgramLags, BaseViewHolder> {
    public ProgramLagsAdapter(int layoutResId, @Nullable List<ProgramLags> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, ProgramLags programLags) {
        //set name from programLags to layout item
        baseViewHolder.setText(R.id.nameProgram,programLags.getName());
        //set pictures from programLags to layout item
        Picasso.get().load(programLags.getImageUrl()).resize(200,200)
                .placeholder(R.drawable.ic_launcher_background)
                .into((ImageView) baseViewHolder.getView(R.id.imgIconProgram));
    }
}
