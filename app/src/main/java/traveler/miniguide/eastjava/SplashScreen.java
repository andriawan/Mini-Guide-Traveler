package traveler.miniguide.eastjava;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        /* Handle Splashscreen logic
        * Intent
        * Delayed: 3000 equals to 3 seconds
        * */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this,Home.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}
