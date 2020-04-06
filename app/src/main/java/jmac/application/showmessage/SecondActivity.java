package jmac.application.showmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView showMessage;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();

        showMessage = (TextView) findViewById(R.id.messageTextView);
        backButton = (Button) findViewById(R.id.goBackButtonID);

        //check
        if (extras != null) {
            String message = extras.getString("My name is James and I'm learning to be a Full Stack Developer.");

            showMessage.setText("My name is James and I'm learning to be a Full Stack Developer.");
        }


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code goes here
                Intent returnIntent = getIntent();
                returnIntent.putExtra("returnData", "Hello Again");
                setResult(RESULT_OK, returnIntent);
                finish();

            }
        });
    }
}
