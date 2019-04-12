package com.e.converter_anupanta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etnumb;
    TextView tvresult;
    Button btnconvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etnumb =findViewById(R.id.etnum);
        tvresult= findViewById(R.id.tvresult);
        btnconvert= findViewById(R. id.btncovert);

        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num;

                num =Integer.parseInt(etnumb.getText().toString());

                Converter_AnuPanta numtowords=new Converter_AnuPanta(num);
                tvresult.setText(numtowords.Words());


            }
        });
    }
}
