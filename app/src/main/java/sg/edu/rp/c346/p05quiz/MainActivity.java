package sg.edu.rp.c346.p05quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
CheckBox cbOneWay;
CheckBox cbRoundTrip;
Button btn1;
TextView tvPax;
Button btn2;
Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbOneWay = findViewById(R.id.checkBoxOW);
        cbRoundTrip = findViewById(R.id.checkBoxRT);
        btn1 = findViewById(R.id.button1);
        tvPax = findViewById(R.id.textViewpax);
        btn2 = findViewById(R.id.button2);
        btnSubmit = findViewById(R.id.buttonSubmit);

        int pax = Integer.parseInt(tvPax.toString());
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

           pax --;

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            pax ++;

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mssg = "";
                int num = 0;
                if(cbOneWay.isChecked()){
                    num = 100 * pax;
                }
                else if(cbRoundTrip.isChecked()){
                    num = 100 * pax * 2;
                }

            }
        });

    }
}
