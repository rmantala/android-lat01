package id.ac.poliban.mi.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//Using method onClick

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSatu = findViewById(R.id.btSatu);
        Button btDua = findViewById(R.id.btDua);
        Button btTiga = findViewById(R.id.btTiga);
        Button btEmpat = findViewById(R.id.btEmpat);

        btSatu.setOnClickListener(this);
        btDua.setOnClickListener(this);
        btTiga.setOnClickListener(this);
        btEmpat.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btSatu :
                Toast.makeText(this, "Hello Satu", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btDua :
                Toast.makeText(this, "Hello Dua", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btTiga :
                Toast.makeText(this, "Hello Tiga", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btEmpat :
                Toast.makeText(this, "Hello Empat", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
