package com.example.map

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.map.databinding.ActivityMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

        val moscow = LatLng(55.7, 37.6)
        mMap.addMarker(MarkerOptions().position(moscow).title("Marker in Moscow"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(moscow))

        val dubai = LatLng(25.2, 55.2)
        mMap.addMarker(MarkerOptions().position(dubai).title("Marker in Dubai"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dubai))

        val london = LatLng(51.5, -0.1)
        mMap.addMarker(MarkerOptions().position(london).title("Marker in London"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(london))

        val dmitrov = LatLng(56.3, 56.3)
        mMap.addMarker(MarkerOptions().position(dmitrov).title("Marker in Dmitrov"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dmitrov))

        val la = LatLng(34.0, -118.2)
        mMap.addMarker(MarkerOptions().position(la).title("Marker in LA"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(la))

        val cologne = LatLng(50.9, 6.9)
        mMap.addMarker(MarkerOptions().position(cologne).title("Marker in Cologne"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cologne))

        val miami = LatLng(25.7, -80.1)
        mMap.addMarker(MarkerOptions().position(miami).title("Marker in Miami"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(miami))

    }

}