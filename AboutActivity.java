package com.example.spendflow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    private ImageView companyLogo;
    private TextView companyName;
    private TextView companyDescription;
    private TextView companyMission;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Initialize the views
        companyLogo = findViewById(R.id.company_logo);
        companyName = findViewById(R.id.company_name);
        companyDescription = findViewById(R.id.company_description);
        companyMission = findViewById(R.id.company_mission);

        // Set content for the views if needed
        // companyLogo.setImageResource(R.drawable.logo);
        companyName.setText(getString(R.string.company_name));
        companyDescription.setText(getString(R.string.company_description));
        companyMission.setText(getString(R.string.company_mission));

           // Correct placement for onClick listener
        Button nextButton = findViewById(R.id.next_button); //
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
