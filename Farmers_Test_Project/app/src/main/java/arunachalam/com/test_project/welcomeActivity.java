package arunachalam.com.test_project;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class welcomeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RelativeLayout l1,l2;
    Animation uptodown,downtoup;
    public static String state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
//        btnsub = (Button)findViewById(R.id.buttonsub);
        l1 = (RelativeLayout) findViewById(R.id.l1);
        l2 = (RelativeLayout) findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l1.setAnimation(uptodown);
        l2.setAnimation(downtoup);
        Spinner spinner_state = (Spinner) findViewById(R.id.state);

        spinner_state.setOnItemSelectedListener(this);

        //Spinner Drop down elements for State
        List<String> categories_state = new ArrayList<>();
        categories_state.add(getString(R.string.AndraPradesh));
        categories_state.add(getString(R.string.ArunachalPradesh));
        categories_state.add(getString(R.string.Assam));
        categories_state.add(getString(R.string.Bihar));
        categories_state.add(getString(R.string.Chhattisgarh));
        categories_state.add(getString(R.string.Goa));
        categories_state.add(getString(R.string.Gujarat));
        categories_state.add(getString(R.string.Haryana));
        categories_state.add(getString(R.string.HimachalPradesh));
        categories_state.add(getString(R.string.JammuandKashmir));
        categories_state.add(getString(R.string.Jharkhand));
        categories_state.add(getString(R.string.Karnataka));
        categories_state.add(getString(R.string.Kerala));
        categories_state.add(getString(R.string.MadyaPradesh));
        categories_state.add(getString(R.string.Maharashtra));
        categories_state.add(getString(R.string.Manipur));
        categories_state.add(getString(R.string.Meghalaya));
        categories_state.add(getString(R.string.Mizoram));
        categories_state.add(getString(R.string.Nagaland));
        categories_state.add(getString(R.string.Orissa));
        categories_state.add(getString(R.string.Punjab));
        categories_state.add(getString(R.string.Rajasthan));
        categories_state.add(getString(R.string.Sikkim));
        categories_state.add(getString(R.string.TamilNadu));
        categories_state.add(getString(R.string.Tripura));
        categories_state.add(getString(R.string.Uttaranchal));
        categories_state.add(getString(R.string.UttarPradesh));
        categories_state.add(getString(R.string.WestBengal));

        ArrayAdapter<String> dataAdapter_state = new ArrayAdapter<String>(this, R.layout.spinner_item, categories_state);

        dataAdapter_state.setDropDownViewResource(R.layout.spinner_item);

        spinner_state.setAdapter(dataAdapter_state);

        final Button start=(Button)findViewById(R.id.buttonsub);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Home.class);
                intent.putExtra("state",state);
                startActivity(intent);
                finish();
//                Toast.makeText(Front.this, state, Toast.LENGTH_SHORT).show();
            }
        });


    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        state = parent.getItemAtPosition(position).toString();
//        SharedPreferences.Editor editor = sharedpreferences.edit();
//        editor.putString(STATE,state);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {


    }
}
