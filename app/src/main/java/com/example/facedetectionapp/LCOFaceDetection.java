package com.example.facedetectionapp;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class LCOFaceDetection extends Application {

    public static final  String Result_Text="Result_Text";
    public static final  String Result_Dialouge="Result_Dialouge";

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseApp.initializeApp(this);
    }
}
