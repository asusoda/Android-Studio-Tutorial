package edu.asu.androidstudiotutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class GoodbyeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodbye);
    }

    public void goodbyeClicked(View view) {
        finish();
    }
}
