package co.com.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicMapAlemania(View v){
        Intent i = new Intent(this,MapsActivity.class );
        i.putExtra("PAIS","Alemania");
        startActivity(i);
    }

    public void clicMapBrasil(View v){
        Intent i = new Intent(this,MapsActivity.class );
        i.putExtra("PAIS","Brasil");
        startActivity(i);
    }

    public void clicMapCanada(View v){
        Intent i = new Intent(this,MapsActivity.class );
        i.putExtra("PAIS","Canada");
        startActivity(i);
    }

    public void clicMapItalia(View v){
        Intent i = new Intent(this,MapsActivity.class );
        i.putExtra("PAIS","Italia");
        startActivity(i);
    }

}
