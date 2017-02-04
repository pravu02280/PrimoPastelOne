package prabesh.com.primopastelone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by prabesh subedi on 16/11/2016.
 */
//google map use garna lai console.developer.com ma gayera create project garne ani tespaxi crendential ma jane code dinxa copy garne ra
    //ra hamro android studio ma lagera rakhne tesma meta deta and permisson and map actiivity register vaxa ki nai tyo herne
    //code lai copy garne

public class Map extends AppCompatActivity
{
    static final LatLng HAMBURG = new LatLng(53.558, 9.927);
    static final LatLng KIEL = new LatLng(53.551, 9.993);
    private GoogleMap mMap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activitu);
        mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        final LatLng CIU = new LatLng(27.7172, 85.3240);
        //to keep marker in the google map we use this
        Marker ciu = mMap.addMarker(new MarkerOptions()
                .position(CIU).title("Nepal"));

    }
}
