package com.example.volleyreg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.volleyreg.databinding.ActivityLoginBinding;

public class Login extends AppCompatActivity {

    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(Login.this,R.layout.activity_login);

        Animation animation= AnimationUtils.loadAnimation(Login.this,R.anim.rotate);

        binding.imageView.startAnimation(animation);

    }
}
