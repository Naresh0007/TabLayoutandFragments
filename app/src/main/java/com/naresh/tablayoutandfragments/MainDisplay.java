package com.naresh.tablayoutandfragments;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainDisplay extends AppCompatActivity {
    CircleImageView circleImageView;
    TextView name,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        Bundle bundle = getIntent().getExtras();
        circleImageView=findViewById(R.id.circleimg);
        name=findViewById(R.id.txtname);
        number=findViewById(R.id.txtnumber);
        if (bundle!=null){
            circleImageView.setImageResource(bundle.getInt("image"));
            name.setText(bundle.getString("name"));
            number.setText(bundle.getString("number"));
        }
    }
}
