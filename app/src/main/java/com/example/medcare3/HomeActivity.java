package com.example.medcare3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medcare3.slotbook.appointmentBooking;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import javax.annotation.Nullable;

public class HomeActivity extends AppCompatActivity {
    TextView fullName,email,phone,verifyMsg;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;
    Button resendCode;
    Button resetPassLocal,changeProfileImage;
    FirebaseUser user;
    ImageView profileImage;
    StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        fullName = findViewById(R.id.profileName);
//
//        fAuth = FirebaseAuth.getInstance();
//        fStore = FirebaseFirestore.getInstance();
//        storageReference = FirebaseStorage.getInstance().getReference();
//
//        userId = fAuth.getCurrentUser().getUid();
//        user = fAuth.getCurrentUser();
//
//        DocumentReference documentReference = fStore.collection("users").document(userId);
//        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
//            @Override
//            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
//                if(documentSnapshot.exists()){
//                    fullName.setText(documentSnapshot.getString("fName"));
//
//                }else {
//                    Log.d("tag", "onEvent: Document do not exists");
//                }
//            }
//        });

    }
    public void profileInfo(View view) {
        Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
        startActivity(intent);
    }

    public void Appointments(View view) {
        Intent intent = new Intent(HomeActivity.this , appointmentBooking.class);
        startActivity(intent);
    }
}