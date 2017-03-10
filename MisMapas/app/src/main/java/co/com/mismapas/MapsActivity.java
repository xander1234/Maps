package co.com.mismapas;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Bundle bundle = getIntent().getExtras();
        LatLng lagInt = new LatLng(0,0);
        String pais = bundle.getString("PAIS");

        if(pais.equals("Alemania")){
            Log.i("INFO","Alemania");
            lagInt = new LatLng(51.32916041719259, 10.454168049999907);
        }

        if(pais.equals("Brasil")){
            Log.i("INFO","Brasil");
            lagInt = new LatLng(-15.12735052519617, -51.41064325000002);
        }

        if(pais.equals("Canada")){
            Log.i("INFO","Canada");
            lagInt = new LatLng(58.695433501291085, -96);
        }

        if(pais.equals("Italia")){
            Log.i("INFO","Italia");
            lagInt = new LatLng(41.55192692530172, 12.573612299999922);
        }

        mMap.addMarker(new MarkerOptions().position(lagInt).title("Ubicacion: " + pais));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lagInt));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lagInt,12.0f));

    }
}
