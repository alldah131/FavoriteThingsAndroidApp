package se.example.android.animal;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DetailedInformationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_information);

        ImageView animalPortrait = (ImageView) findViewById(R.id.animal_portrait);
        TextView animalHeadline = (TextView) findViewById(R.id.animal_readline);
        TextView animalDescription = (TextView) findViewById(R.id.animal_description);

        Intent intent = getIntent();
        String animalToDisplay = intent.getStringExtra("animals");
        Toast.makeText(this, animalToDisplay, Toast.LENGTH_SHORT).show();

        // Skapa ett Zoo (som i sin tur skapar djur)
        Zoo theZoo = new Zoo();

        //Hämta ut ett djur
        Animal animal = theZoo.getAnimal(animalToDisplay);

        if(animal != null) {
            animalHeadline.setText(animal.getName());
            animalDescription.setText(animal.getDescription());
            animalPortrait.setImageResource(animal.getImageId());
        }

    }
}