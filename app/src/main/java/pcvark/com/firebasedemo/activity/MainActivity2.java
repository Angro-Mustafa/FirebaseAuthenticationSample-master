package pcvark.com.firebasedemo.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import pcvark.com.firebasedemo.R;

public class MainActivity2 extends AppCompatActivity {
    private ProgressBar progressBar;
    private Context context;
    private TextView tx_date , tx_welcome;
    private Button btn_pills, btn_btn_Cluocose_Value, btn_btn_Heart_Rate_data, btn_btn_Tracking_step;
    //private FirebaseUser currentUser;
    //private Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        Calendar c = Calendar.getInstance();

        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String date = df.format(c.getTime());
        //TextView Date;
        tx_date = (TextView) findViewById(R.id.tx_date);
        tx_welcome = (TextView) findViewById(R.id.tx_welcome);
        tx_date.setText(date);
        //String s = "TEST TYPES";
        tx_welcome.setText("TEST TYPES");
       // some();
    }

    private void init() {
        context = this;
        progressBar = findViewById(R.id.progressBar);
        btn_pills = findViewById(R.id.btn_pills);
        btn_btn_Cluocose_Value = findViewById(R.id.btn_Cluocose_Value);
        btn_btn_Heart_Rate_data = findViewById(R.id.btn_Heart_Rate_data);
        btn_btn_Tracking_step = findViewById(R.id.btn_Tracking_step);
    }

    private void some() {
        final Calendar t = Calendar.getInstance();
        tx_date.setText(DateFormat.getTimeFormat(this/*Context*/).format(t.getTime()));
    }
}