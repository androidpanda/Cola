package coding.bear.cola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView cola_s = (ImageView)findViewById(R.id.cola_s);
        ImageView cola_m = (ImageView)findViewById(R.id.cola_m);
        ImageView cola_l = (ImageView)findViewById(R.id.cola_l);

        cola_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cola_s = new Intent(MainActivity.this, cola_s_Activity.class);
                startActivity(cola_s);
            }
        });

        cola_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cola_m= new Intent(MainActivity.this, cola_m_Activity.class);
                startActivity(cola_m);
            }
        });

        cola_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cola_l = new Intent(MainActivity.this, cola_l_Activity.class);
                startActivity(cola_l);
            }
        });
    }
}
