package com.moderneinstein.android.arcade ; 


import android.os.Bundle ; 
import android.app.Application ; 
import android.app.Activity ; 

import android.content.SharedPreferences ; 
import android.content.SharedPreferences.Editor ; 
import android.content.Context ; 
//import android.content.Intent ; 

import android.widget.ImageView  ; 
import android.widget.Switch  ; 
import android.widget.Button  ; 
import android.widget.ScrollView ; 

import android.view.LayoutInflater  ; 
import android.view.ViewGroup ; 
import android.view.View ; 

import java.util.LinkedList ; 
import  java.util.List ; 
//import androidx.preference.PreferenceManager ; 
import android.preference.PreferenceManager ; 
import java.util.ArrayList ;


public class  SettingsActivity extends Activity{

    public static int  sourceId =  R.layout.settings ;
    public static int[] array3 = new int[]{}  ; 
    public static int[] array4 = new int[]{R.id.settings_1_1,R.id.settings_1_1_1} ; 
    public List<View> linear  ; 
    public ViewGroup[] serial ; 
    public SharedPreferences reference ; 
    public static Context source ;
    public static String fileString = "Settings.txt" ; 
    public void listeners (){

    }
    public void storage(){
        int width = array3.length ; 
        serial = new ViewGroup[ width] ; 
        for(int vs = 0;vs<width;vs++){
            ViewGroup align = (ViewGroup)findViewById(array3[vs]) ;
            serial[vs] = align ; 
        }

        int height =  array4.length ; 
        linear = new ArrayList<View>() ;
        for(int ds=0;ds<height;ds ++){
            View  notes =   requireViewById(array4[ds]) ;
            linear.add(notes) ; 
        }
    }
    @Override 
    public void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState) ; 
        setContentView(sourceId) ;
        source =  this.getApplicationContext () ; 
        reference = source.getSharedPreferences(fileString,Context.MODE_PRIVATE) ;
    }

} 