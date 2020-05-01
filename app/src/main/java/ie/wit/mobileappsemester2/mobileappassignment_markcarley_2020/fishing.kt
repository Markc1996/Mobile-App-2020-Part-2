package ie.wit.mobileappsemester2.mobileappassignment_markcarley_2020

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class fishing : Fragment(), GoogleMap.OnMapLoadedCallback, OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    companion object {
        var mapFragment : SupportMapFragment?=null
        val TAG: String = MapFragment::class.java.simpleName
        fun newInstance() = MapFragment()
    }

    override fun onMapLoaded() {

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fr_fishing, container, false)

        var rootView = inflater.inflate(R.layout.fr_fishing, container, false)

        childFragmentManager.findFragmentById(R.id.fallasMap) as SupportMapFragment
        mapFragment?.getMapAsync(this)

        return rootView
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        mMap = googleMap!!
        // Add a marker in Sydney and move the camera
        val lough = LatLng(53.27, -9.16)
        mMap.addMarker(MarkerOptions().position(lough).title("Marker in Lough Corrib"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lough))
    }

}



