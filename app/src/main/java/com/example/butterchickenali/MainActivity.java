package com.example.butterchickenali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView ratingText = findViewById(R.id.rating_text);
        editText = findViewById(R.id.rating_value);
        final RatingBar ratingBar = findViewById(R.id.rating_bar);
        Button ratingButton = findViewById(R.id.rating_button);


        ratingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = editText.getText().toString();
//                Log.d(TAG, "onClick: " + value);

                Float rVlaue = Float.parseFloat(value);
                Log.d(TAG, "onClick: " + rVlaue);

                if ( rVlaue > 5.0 ){
                    Toast.makeText(MainActivity.this, "Enter valid value", Toast.LENGTH_SHORT).show();
                    return;
                }

                ratingText.setText(value.substring(0,3));
                ratingBar.setRating(rVlaue);
            }
        });

    }


}