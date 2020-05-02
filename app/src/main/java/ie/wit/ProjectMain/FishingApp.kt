package ie.wit.ProjectMain

import android.app.Application
import android.location.Location
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class FishingApp : Application(), AnkoLogger {

    lateinit var auth: FirebaseAuth
    lateinit var database: DatabaseReference
    lateinit var mMap : GoogleMap
    lateinit var googleSignInClient: GoogleSignInClient
    lateinit var marker : Marker
    lateinit var currentLocation : Location
    lateinit var locationClient : FusedLocationProviderClient


    override fun onCreate() {
        super.onCreate()
        info("Fish App started")
    }
}

