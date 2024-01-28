package com.example.kantor;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnMyBalance;
    private Button btnAddFunds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMyBalance = findViewById(R.id.btnMyBalance);
        btnMyBalance.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, BalanceActivity.class);
            startActivity(intent);
        });
    }
}
