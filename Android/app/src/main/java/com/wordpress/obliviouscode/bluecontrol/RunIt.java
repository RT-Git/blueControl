package com.wordpress.obliviouscode.bluecontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RunIt extends AppCompatActivity implements View.OnClickListener {

    EditText e;
    Button b;
    String msg;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_it);
        e = (EditText) findViewById(R.id.editText);
        b = (Button) findViewById(R.id.button);
        i = new Intent(this,MainActivity.class);
    }

    @Override
    public void onClick(View v){
        msg = e.getText().toString().trim();
        i.putExtra("msg",msg);
        startActivity(i);
    }
}
