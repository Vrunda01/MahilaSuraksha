package com.rku.mahilasuraksha;

import android.location.LocationProvider;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.internal.ILocationSourceDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapKey extends AppCompatActivity {

    SupportMapFragment smf;
    LocationProvider client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_key);

        smf=(SupportMapFragmentmapFragment)getSupportFragmentManager().findFragmentById(R.id.mapkey);
        client=ILocationSourceDelegate.getLocationProvider( this );

        mapFragment.getMapAsync(this);
    }
}