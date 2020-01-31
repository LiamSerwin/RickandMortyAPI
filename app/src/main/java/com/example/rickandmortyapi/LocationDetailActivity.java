package com.example.rickandmortyapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LocationDetailActivity extends AppCompatActivity {
    private TextView name, dimension, created, type;
    private Location location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_detail);
        Intent lastIntent = getIntent();
        location = lastIntent.getParcelableExtra(MainActivity.EXTRA_POSITION);
        wireWidgets();
        name.setText(location.getName());
        type.setText(location.getType());
        dimension.setText(location.getDimension());
        created.setText(location.getCreated());


    }

    private void wireWidgets() {
        name = findViewById(R.id.textView_characterDetail_name);
        type = findViewById(R.id.textView_locationDetail_type);
        dimension = findViewById(R.id.textView_characterDetail_dimension);
        created = findViewById(R.id.textView_characterDetail_created);
    }
}
