package prabesh.com.primopastelone;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by prabesh subedi on 02/02/2017.
 */

public class SurpriseActivity extends AppCompatActivity {
    Button Sorder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_surprise);
        Sorder=(Button)findViewById(R.id.activity_main_order);
        Sorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SurpriseActivity.this,FormActivity.class);
                startActivity(intent);
            }
        });
    }
}
