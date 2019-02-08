package com.example.userprofile.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.userprofile.R;
import com.example.userprofile.models.userProfileResponse.Data;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder> {
    private Context context;
    private List<Data> dataList;

    public ProfileAdapter(Context context, List<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.profile_item_list, null);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int i) {
               Data data=dataList.get(i);
              holder.name.setText(data.getName());
              holder.phone.setText(data.getPhone());
              holder.address.setText(data.getAddress());
              holder.email.setText(data.getEmail());
    }


    @Override
    public int getItemCount() {
        return dataList.size()  ;
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder {
        TextView name,address,phone,email;
        CardView button;

        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            button=itemView.findViewById(R.id.cardView);
            name=itemView.findViewById(R.id.nameTV);
            address=itemView.findViewById(R.id.addressTV);
            phone=itemView.findViewById(R.id.phoneTV);
            email=itemView.findViewById(R.id.emailTV);
        }
    }
}
