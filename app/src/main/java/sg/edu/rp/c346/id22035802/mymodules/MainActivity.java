package sg.edu.rp.c346.id22035802.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv346;
    TextView tv349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv346 =findViewById(R.id.C346Android);
        tv349= findViewById(R.id.C349Android);

        tv346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivitySecond.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
            }
        });

        tv349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityThird.class);
                intent.putExtra("ModuleCode", "C349");
                intent.putExtra("ModuleName", "iPad Programming");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 5);
                intent.putExtra("Venue", "W64M");
                startActivity(intent);
            }
        });



    }
}
