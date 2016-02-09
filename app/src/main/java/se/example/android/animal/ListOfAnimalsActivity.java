package se.example.android.animal;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Allan on 2/3/2016.
 */
public class ListOfAnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animals);
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout rel = (RelativeLayout) findViewById(R.id.relativeLayout);


        // IMAGEVIEW RED PANDA
        ImageView tempImage = new ImageView(this);
        tempImage.setImageResource(R.drawable.red_panda);

        RelativeLayout.LayoutParams relativeParams = new RelativeLayout.LayoutParams((int)(RelativeLayout.LayoutParams.MATCH_PARENT),(int)(RelativeLayout.LayoutParams.MATCH_PARENT));
        relativeParams.setMargins(100, 0, 0, 0);


        // TEXTVIEW TEMPORARY
        TextView tempText = new TextView(this);
        tempText.setText("Hello!");
        rel.addView(tempText);
        rel.addView(tempImage);




    }


    }






