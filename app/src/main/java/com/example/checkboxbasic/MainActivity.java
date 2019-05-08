package com.example.checkboxbasic;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
CheckBox c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.checkBox);
        c1.setOnClickListener(this);
        c2=findViewById(R.id.checkBox2);
        c2.setOnClickListener(this);
        c3=findViewById(R.id.checkBox3);
        c3.setOnClickListener(this);
        c4=findViewById(R.id.checkBox4);
        c4.setOnClickListener(this);
        c5=findViewById(R.id.checkBox5);
        c5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.checkBox:
                if (c1.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Androoi",Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.checkBox2:
                if (c1.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Androoi",Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.checkBox3:
                if (c1.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Androoi",Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.checkBox4:
                if (c1.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Androoi",Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.checkBox5:
                if (c1.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Androoi",Toast.LENGTH_SHORT).show();
                    break;
                }
        }
    }
}
