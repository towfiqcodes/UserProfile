package com.example.userprofile.activity;

import android.print.PrinterId;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.userprofile.R;
import com.example.userprofile.adapter.ProfileAdapter;
import com.example.userprofile.models.retrive_data.ProfileData;
import com.example.userprofile.models.userProfileResponse.Data;
import com.example.userprofile.web_api.RegistrationEasyApi;
import com.example.userprofile.web_api.RetrofitClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Profile extends AppCompatActivity {
    private RecyclerView recyclerView;
    public ProfileAdapter profileAdapter;
    private ArrayList<Data> dataArrayList;
    RegistrationEasyApi regisApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        recyclerView = findViewById(R.id.profileRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dataArrayList = new ArrayList<>();
getValue();

    }

    public void getValue() {
        regisApi = RetrofitClient.getRetrofit().create(RegistrationEasyApi.class);
        Call<ProfileData> profileDataCall = regisApi.getData();
        profileDataCall.enqueue(new Callback<ProfileData>() {
            @Override
            public void onResponse(Call<ProfileData> call, Response<ProfileData> response) {
                ProfileData profileData = response.body();
                int data1 = profileData.getData().size();
                for (int i = 0; i < data1; i++) {
                    String name = profileData.getData().get(i).getName().toString();
                    String address = profileData.getData().get(i).getAddress().toString();
                    String phone = profileData.getData().get(i).getPhone().toString();
                    String email = profileData.getData().get(i).getEmail().toString();

                    Data data = new Data(name, address, phone, email);
                    dataArrayList.add(data);

                }
                profileAdapter = new ProfileAdapter(Profile.this, dataArrayList);
                recyclerView.setAdapter(profileAdapter);
            }

            @Override
            public void onFailure(Call<ProfileData> call, Throwable t) {
                Toast.makeText(Profile.this,"msg"+t.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });

    }
}
