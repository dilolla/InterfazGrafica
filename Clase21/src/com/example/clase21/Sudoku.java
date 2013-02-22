package com.example.clase21;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Sudoku extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_sudoku, menu);
        return true;
    }
}
