package sg.edu.rp.c346.p05quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FlightDetails extends AppCompatActivity {
TextView tvMssg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_details);
        tvMssg = findViewById(R.id.textViewMssg);

        Toast.makeText(MainActivity.this,tvMssg,Toast.LENGTH_LONG.show());
    }
}
