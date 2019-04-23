package firstproject.muhzanard.id.co.belajarmaps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

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


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng idn = new LatLng(-6.4858422, 106.9937384);
        mMap.addMarker(new MarkerOptions().position(idn).title("SMK IDN BOARDING SCHOOL").snippet("Anak Soleh Pinter Ngaji Takut Allah"));

        addMarker(-6.3957704,-106.9571392, "SMK IDN BOARDING SCHOOL","Masjid Al-barkah");
        addMarker(-6.5244495,107.0383489, "Warung Bi Asih","warung" );
        addMarker(-6.5244495,107.0383489, "Warung Bagus","Jajan Yok");
        addMarker(-6.4858422, 106.9937384, "SMK IDN BOARDING SCHOOL", "Anak Soleh Pinter Ngaji Takut Allah");
        mMap.moveCamera(CameraUpdateFactory.newLatLng(idn));


    }

    private void addMarker(double latitude, double longitude, String title, String snippet) {

        mMap.addMarker(new MarkerOptions().position(new LatLng(latitude,longitude)).title(title).snippet(snippet));


    }
}
