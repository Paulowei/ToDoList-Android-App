package com.moderneinstein.android.arcade ; 

//import android.graphics.Color ;

import java.util.Random ; 
import java.util.Set ;
import java.util.Queue ;
import java.util.Arrays  ;
import java.util.LinkedList ;
//import javafx.util.Pair ;
import java.lang.StringBuilder ;

import android.util.Xml ;
import android.util.AttributeSet ;
import org.xmlpull.v1.XmlPullParser ;
import android.content.Context ; 
import android.content.res.Resources ; 

import android.widget.Toast ; 
import android.view.LayoutInflater ; 
import android.content.Intent ; 
import android.os.Bundle  ; 
import android.graphics.Color ; 

import android.view.View ;
import android.view.ViewGroup ; 


public class Utility {
    public static Random  spawner ; 
    public static int  flags = 0 ; 
    public static int nulls= 0 ; 
    public static int unity = 1 ; 

    public static int[] margins =  new int[]{10,10,10,10} ; 
    public static  void configure(){
       // if(flags!=nulls){return  ;}
        flags = unity  ;
        long  notes = System.currentTimeMillis() ;
        spawner = new  Random(notes)  ;
        return ; 
    }
    public static void exchange(int below,int above,char[] crest){
            char check = crest[above] ;
            crest[above] = crest[below] ;
            crest[below] = check ;
    }
    public  static String orient(String initial) {
        char[]  frames =initial.toCharArray() ; 
        int length = initial.length() ;
        for(int fs=1;fs<length ;fs++ ){
            for(int gs=0;gs<fs;gs++){
                if(frames[fs]>frames[gs]){
                    exchange(gs,fs,frames) ; 
                } }  }
        String  alias = String.valueOf(frames) ;
        return alias ; 
    }
    public static boolean  anagrams(String south ,String north ){
        String  theta = orient(north) ;
        String sigma = orient(south) ;
        if(sigma.equals(theta)){ return true ;}
         else{return false ;}
    }
    
   // public static Color createColor(int[] textures){
            // Implement Color Scheme ; 
            // Using the Color.argb() method ;
            // or the Color.rgb() method ; 
  //  }
    public static int[] streamSingle(int below,int above,int range){
        configure() ; 
        int[] created = new int[range] ; 
        int change = above-below  ; 
        for( int fd=0;fd<range;fd++){
            int temp = spawner.nextInt(below)+change ;
            created[fd] = temp ;
        }
        return   created ; 
    }
    public static int[][] streamNested(int south,int north,int spans,int spread){
        configure() ;
        int[] buffer = new int[spans] ; 
        int[][] nested  = new int[spread][spans] ;
        int diff = north-south ;
        for( int rc=0;rc<spread;rc++){
            buffer = new int[spans] ; 
            for(int  fc=spans;fc>=1;fc--){
                buffer[fc-1]=spawner.nextInt(south)+diff ; 
            }
            nested[rc] = buffer ;
        }
        return nested ; 
    }
    public static AttributeSet createSet(Context context, int layoutId){
        Resources resources = context.getResources() ; 
        XmlPullParser parser = resources.getXml(layoutId) ;
        AttributeSet attrs = Xml.asAttributeSet(parser) ; 
        return  attrs ;
    }
    public static void showText(Context source,String sample,int duration){
        Toast voltage= new Toast(source)  ;
        voltage.setDuration(duration) ;
        voltage.setText( sample) ; 
        voltage.setMargin((float)margins[2],(float)margins[3]) ;  
        //  voltage.setBackgroundColor(Color.argb(70,100,120,140)) ;  
       // voltage.setView(new View(source)) ; 
        voltage.show() ;
    }
}
