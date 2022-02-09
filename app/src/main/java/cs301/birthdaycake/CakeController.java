package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    CakeView CV;
    CakeModel CM;
    public CakeController(CakeView CakeV){
        this.CV = CakeV;
        CM = CV.getCM();
    }

    private static final String TAG = "Yessir";

    @Override
    public void onClick(View view) {
        if (CM.litCandles == true){
            CM.litCandles = false;
        }
        else{
            CM.litCandles = true;
        }
        CV.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b == false){
            CM.hasCandles = false;
        }
        else{
            CM.hasCandles = true;
        }
        CV.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        CM.numCandles = progress;
        CV.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
