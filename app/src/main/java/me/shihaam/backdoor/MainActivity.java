package me.shihaam.backdoor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText time;
    Button caculate;

    double password;
    int timevalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);
        time = (EditText)findViewById(R.id.time);
        caculate = (Button) findViewById(R.id.caculate);

        caculate.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(time.isEmpty)
                {
                    //let user know that the value is empty
                    Toast.makeText(this, "Please Enter The Time", Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                  {
                    //get the input from user and phase it to timevalue
                    timevalue = Integer.parseInt(time.getText().toString());
                    
                    //do math
                    password = Math.pow(9999 - timevalue, 2);
                    
                    //output
                    result.setText(String.format("%.0f", password));
                  }
            }});{
        }
    }

}
