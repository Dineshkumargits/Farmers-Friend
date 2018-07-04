package arunachalam.com.test_project.FSecurity_CProd_Pest_Irrigation.Pest_Protection;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import arunachalam.com.test_project.R;

public class Soybean extends AppCompatActivity {
    GridLayout mainGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soybean);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);
    }
    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI==0){
                        Intent whitefly = new Intent(Soybean.this,Soybean_whitefly.class);
                        startActivity(whitefly);
                    }else {
                        Toast.makeText(Soybean.this, "Stem fly.....Under Construction", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }
}
