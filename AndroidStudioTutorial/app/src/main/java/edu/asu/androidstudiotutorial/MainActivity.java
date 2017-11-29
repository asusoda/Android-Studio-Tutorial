package edu.asu.androidstudiotutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonClicked(View view) {
//        Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();
        Intent newIntent = new Intent(this, GoodbyeActivity.class);
        startActivity(newIntent);
    }
}
