//package com.example.medcare3;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.Button;
//
//import androidx.appcompat.app.ActionBarDrawerToggle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//import androidx.core.view.GravityCompat;
//import androidx.drawerlayout.widget.DrawerLayout;
//
//import com.example.medcare3.database.AvailableSlotsActivity;
//import com.example.medcare3.slotbook.appointmentBooking;
//import com.google.android.material.navigation.NavigationView;
//import com.google.firebase.auth.FirebaseAuth;
//
////import android.support.design.widget.NavigationView;
////import android.support.v4.view.GravityCompat;
////import android.support.v4.widget.DrawerLayout;
////import android.support.v7.app.ActionBarDrawerToggle;
////import android.support.v7.app.AppCompatActivity;
////import android.support.v7.widget.Toolbar;
//
//public class Home_NavigationActivity extends AppCompatActivity
//        implements NavigationView.OnNavigationItemSelectedListener {
//    private Button doc_im_btn;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home__navigation);
//        doc_im_btn = (Button) findViewById(R.id.doc_image_button);
//
//        doc_im_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(com.example.medcare3.Home_NavigationActivity.this , appointmentBooking.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//
//        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_INHERIT);
//
//
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();
//
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
//    }
//
//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.home__navigation, menu);
//        return true;
//
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//      /*  if (id == R.id.action_settings) {
//            return true;
//        }*/
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//
//        if (id == R.id.nav_time_full) {
//            Intent intent = new Intent(com.example.medcare3.Home_NavigationActivity.this , AvailableSlotsActivity.class);
//            startActivity(intent);
//
//        } //else if (id == R.id.change_password) {
//           // Toast.makeText(this, "This functionality has not been added yet. ", Toast.LENGTH_SHORT).show();
//
//
//        //} else if (id == R.id.nav_myappointment) {
//            //Toast.makeText(this, "This functionality has not been added yet. ", Toast.LENGTH_SHORT).show();
//        //}
//        else if (id == R.id.nav_medicine) {
//            Intent intent = new Intent(com.example.medcare3.Home_NavigationActivity.this , MedicineActivity.class);
//            startActivity(intent);
//        }
//     //   else if (id == R.id.nav_refer) {
//        //Toast.makeText(this, "This functionality has not been added yet. ", Toast.LENGTH_SHORT).show();
//
//        //}
//        else if (id == R.id.nav_contact) {
//           // Toast.makeText(this, "This functionality has not been added yet. ", Toast.LENGTH_SHORT).show();
//          //  Intent intent = new Intent(com.example.medcare3.Home_NavigationActivity.this , ContactUsActivity.class);
//            //startActivity(intent);
//
//        }
//        else if (id == R.id.nav_sign_out) {
//            signout();
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }
//
//    private boolean signout() {
//        FirebaseAuth.getInstance().signOut();
//        //finish();
//        startActivity(new Intent(this, MainActivity.class));
//        finish();
//        return true;
//    }
//
//}