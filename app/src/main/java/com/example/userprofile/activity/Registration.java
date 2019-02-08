package com.example.userprofile.activity;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.userprofile.MainActivity;
import com.example.userprofile.R;
import com.example.userprofile.models.userProfileResponse.Data;
import com.example.userprofile.models.userProfileResponse.UserResponse;
import com.example.userprofile.web_api.RegistrationEasyApi;
import com.example.userprofile.web_api.RetrofitClient;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Registration extends AppCompatActivity {
TextInputEditText nameTv,phoneTv,emailTv,addressTv;
Spinner gender;
Button saveBtn;
ImageView imageView;

RegistrationEasyApi regisApi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initialization();

        regisApi= RetrofitClient.getRetrofit().create(RegistrationEasyApi.class);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                String name=nameTv.getText().toString();
                String phone=phoneTv.getText().toString();
                String email=emailTv.getText().toString();
                String address=addressTv.getText().toString();
                String genderT=gender.getSelectedItem().toString();

               Data data=new Data(name,phone,email,address,genderT);
                  HashMap<String, Data> params=new HashMap<String, Data>();
                  params.put("name",data);
                 Call<UserResponse>userResponseCall=regisApi.getResponse(params);

                Intent intent=new Intent(Registration.this,Profile.class);
                startActivity(intent);
                userResponseCall.enqueue(new Callback<UserResponse>() {
                    @Override
                    public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {

                    //    Log.e("testing", "respuesta: "+response.message()+" *** "+response.code()+" *** "+response.isSuccessful() +
                               // " *** " + response.raw().toString());
                        if (response.isSuccessful()) {



                      //      Toast.makeText(Registration.this,"Successfully Posted",Toast.LENGTH_SHORT).show();

                            finish();


                        } else {


                        }

                    }

                    @Override
                    public void onFailure(Call<UserResponse> call, Throwable t) {
                        Toast.makeText(Registration.this,""+t.getMessage(),Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }

    private void initialization() {
        nameTv=findViewById(R.id.nameEt);
        phoneTv=findViewById(R.id.phoneET);
        emailTv=findViewById(R.id.emailEt);
        addressTv=findViewById(R.id.addressEt);
        gender=findViewById(R.id.genderSpinnerID);
        imageView=findViewById(R.id.camera);
        saveBtn=findViewById(R.id.saveBTN);
    }

}
