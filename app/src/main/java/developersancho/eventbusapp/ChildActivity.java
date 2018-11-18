package developersancho.eventbusapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.greenrobot.eventbus.EventBus;

public class ChildActivity extends AppCompatActivity {

    private EditText editTextMessage;
    private Button btnTrigger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        editTextMessage = findViewById(R.id.editTextMessage);
        btnTrigger = findViewById(R.id.btnTrigger);
        btnTrigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageEvent(editTextMessage.getText().toString()));
                finish();
            }
        });
        Log.d("ChildActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ChildActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ChildActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ChildActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ChildActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ChildActivity", "onDestroy");
    }
}
