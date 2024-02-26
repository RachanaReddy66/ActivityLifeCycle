package in.visiontech.activitylifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import java.util.logging.LogManager;

public class MainActivity extends AppCompatActivity {
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ALC","onCreate");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ALC","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ALC","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ALC","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ALC","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ALC","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ALC","onRestart");
    }
}
