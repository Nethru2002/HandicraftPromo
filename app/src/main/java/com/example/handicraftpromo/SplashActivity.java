package com.example.handicraftpromo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Find Views
        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieAnimationView);
        TextView loadingText = findViewById(R.id.loadingText);

        // Apply fade-in animation to text
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        loadingText.startAnimation(fadeIn);

        // Delay and navigate to the main screen
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, SPLASH_DURATION);
    }
}
