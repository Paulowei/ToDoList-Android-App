package com.moderneinstein.android.arcade ; 

import java.util.Arrays ; 
import android.app.Application ; 
import android.app.Activity ; 
import android.os.Looper  ;
import android.os.Handler ; 
import android.os.Bundle  ;

import com.google.firebase.auth.FirebaseAuth ; 
import com.google.firebase.auth.FirebaseUser ; 
import com.google.firebase.auth.AuthResult ; 

import com.google.android.gms.tasks.Task ; 
import com.google.android.gms.tasks.OnCompleteListener ; 
import com.google.android.gms.tasks.OnSuccessListener ; 
import com.google.android.gms.tasks.OnFailureListener ; 

public  class  CentralSource extends Application{

    private static FirebaseAuth access = FirebaseAuth.getInstance( )  ; 
    public static boolean   stated =  false ;
    public static FirebaseUser currentUser  = null ; 
   // public CentralSource(){
            // Nothing Much to Implement  ;
  //  }
    public static  FirebaseAuth getAuth(){
         FirebaseAuth   frames = access ; 
         return  frames ;
    }
    public static void  setAuth(FirebaseAuth verse){
       access = verse ; 
        return   ; 
    }
    public static boolean getState(){
        boolean enacted = stated ; 
        return enacted ; 
    }
    public static  void setState(boolean arrive){
        stated = arrive ;
    }
    public  static void setUser(FirebaseUser queries){
        currentUser =  queries ; 
    }
    public static FirebaseUser getUser(){
      FirebaseUser versions = currentUser ;   
       return  versions ;
    }
    // Bundle savedInstanceState
 //   @Override 
  //  public void onCreate(){
    //    super.onCreate() ;

  //  }
    // savedInstanceState
}