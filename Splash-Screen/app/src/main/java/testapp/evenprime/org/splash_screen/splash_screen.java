package testapp.evenprime.org.splash_screen;

import android.app.Activity;
import android.os.Handler;
import android.os.Bundle;
import android.content.Intent;

/**
 * Created by dravit on 9/25/2016.
 */
public class splash_screen extends Activity {

    public static int time_splash=2000;         //this is to set the time limit for the splash screen
    @Override
    public void onCreate(Bundle SaveInstanceState)
    {
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run()
            {
                Intent i= new Intent(splash_screen.this,MainActivity.class);
                startActivity(i);

                finish();
            }
        },time_splash);
    }

}
