// CODE ADDED BY DEREK

package android.example.weatherupdate;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Console;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        if(i.getExtras() != null) {
            String cityName = i.getStringExtra(MainActivity.CITY_NAME);
            TextView tvCityName = findViewById(R.id.cityNameDisplay);
            tvCityName.setText(cityName);
        }

    }

}
