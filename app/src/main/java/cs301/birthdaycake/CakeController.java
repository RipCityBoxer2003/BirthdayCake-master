package cs301.birthdaycake;

import android.view.View;

public class CakeController {
    CakeView CV;
    public CakeController(CakeView CakeV){
        this.CV = CakeV;
        CV.getCM();
    }
    
}
