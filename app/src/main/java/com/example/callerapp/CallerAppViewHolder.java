package com.example.callerapp;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CallerAppViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvName;
    private TextView mTvNumber;
    private RelativeLayout mRelativeLayout;
    public CallerAppViewHolder(@NonNull View itemView) {
        super(itemView);
        initView();
    }

    private void initView(){
        mTvName =itemView.findViewById(R.id.tvName);
        mTvNumber =itemView.findViewById(R.id.tvNumber);
        mRelativeLayout =itemView.findViewById(R.id.relativeLayout);

    }

    public void setData(CallerAppModel callerAppModel){
        mTvName.setText(callerAppModel.getName());
        mTvNumber.setText(callerAppModel.getNumber());
    }
}
