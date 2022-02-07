package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView CakeViewID = findViewById(R.id.CakeView);
        CakeController CC = new CakeController(CakeViewID);

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void Goodbye(View button){
        Log.i("button", "Goodbye: ");
        finishAffinity();
    }

}
