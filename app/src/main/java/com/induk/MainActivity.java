package com.induk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private MyView myView;
    private EditText edtCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myView = (MyView) findViewById(R.id.vCanvas);
        edtCount = (EditText) findViewById(R.id.edtCount);
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                myView.setting(item.getItemId(), Integer.parseInt(edtCount.getText().toString()));
                myView.invalidate(); //매우매우 중요
                return true;
            default:
                return super.onContextItemSelected(item);

        }
    }

    
}