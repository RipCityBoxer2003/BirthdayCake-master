package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView CakeViewID = findViewById(R.id.CakeViewID);
        CakeController CC = new CakeController(CakeViewID);
        Button blowOutButton = findViewById(R.id.button);
        blowOutButton.setOnClickListener(CC);
        Switch candles = findViewById(R.id.switch2) ;
        candles.setOnCheckedChangeListener(CC);
        SeekBar seek = findViewById(R.id.seekBar);
        seek.setOnSeekBarChangeListener(CC);

    }

    public void Goodbye(View button){
        Log.i("button", "Goodbye: ");
    }

}
