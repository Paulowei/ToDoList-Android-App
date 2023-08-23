package com.moderneinstein.android.arcade ;

import android.widget.Button ;
import android.app.Service  ;
import android.app.Activity ; 
import android.widget.TextView  ;
import android.view.View ;
import android.view.ViewGroup ;

import android.os.Bundle ;
import android.R.layout ;
import android.R.dimen;
import android.R.id ;
import android.content.Context ;

import android.content.Intent ; 
import android.widget.EditText ; 


import java.util.Set ;
import java.util.List ; 
import java.util.Vector ;
import java.util.ArrayList ; 


public class AnagramsActivity extends Activity{

    public static int sourceId =  R.layout.anagrams ; 
    public static int[] viewId  = new int[]{R.id.anagrams_1_1_1_1,R.id.anagrams_1_1_2_1,R.id.anagrams_1_1_2_2,R.id.anagrams_1_1_3_1}  ; 
    public static int[] groupId =new int[]{R.id.anagrams_1,R.id.anagrams_1_1,R.id.anagrams_1_1_1,R.id.anagrams_1_1_2,R.id.anagrams_1_1_3} ; 
    public  Vector<View> vected  ; 
    public  List<ViewGroup> listed ; 
    public static Context realms ; 
    public static String[] decision = {"This is A String","The words are anagrams","The words are not anagrams"}  ;
 //   public static Utility Utils ;
    public static long TIME_LAPSE_4 = 600 ; 
    public void  warning(long millis,String mixed){
        TextView notes =  (TextView)vected.get(1)   ;
         long  before =  System.currentTimeMillis() ; 
         String alias =  notes.getText().toString() ;
        new Thread(){
            @Override 
            public void run(){
                notes.setText(mixed) ; 
                notes.setVisibility(View.VISIBLE) ;
             //   while(System.currentTimeMillis()-before<millis){}
                ((TextView)notes).setText(alias) ; 
                notes.setVisibility(View.INVISIBLE) ;
            }
        }.start() ;
    }
    public void indicate(View crest,long detain,String traits){
        CharSequence chairs = ((TextView)crest).getText() ;
        String verse = chairs.toString() ;
        ((TextView)crest).setText(traits)  ; 
        long current = System.currentTimeMillis() ; 
      //  while(System.currentTimeMillis()-current<detain){ } 
     //   ((TextView)crest).setText(chairs) ;
    }
    //   long after  = System.currentTimeMillis() ;
    public void  decide(){
        CharSequence sequence4 = ((EditText)vected.get(1)).getText() ; 
        CharSequence sequence5 = ((EditText)vected.get(2)).getText()  ;
        String south =  sequence4.toString() ;
        String north = sequence5.toString() ;
        if(north.length()==0&&south.length()==0){indicate(vected.get(0),TIME_LAPSE_4,decision[0]);  }
        if(Utility.anagrams(south,north)){indicate(vected.get(0),TIME_LAPSE_4,decision[1]) ; }
        else{indicate(vected.get(0),TIME_LAPSE_4,decision[2] ) ; }  
    }
    public void appendListeners(){
        vected.get(3).setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View arrive){
                    decide() ;   
                }
            }
        )  ;
      /*  vected.get(3).setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void  onClick(View agree){
                    Intent action = new Intent(realms,RootActivity.class) ;
                    action.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) ;
                    startActivity(action) ;
                }
            }
        ) ; */
    }
    public void associateViews(){
        listed = new ArrayList<ViewGroup>( ); 
        int spans = groupId.length ; 
        for(int fd=0;fd<spans;fd++){
            int notes = groupId[fd] ; 
            ViewGroup  current = (ViewGroup)findViewById(notes) ;
            listed.add(current) ;
        }
        vected = new Vector<View>() ; 
        int grains =  viewId.length ; 
        for(int gc=0;gc<grains;gc++){
             int dears =  viewId[gc] ; 
            View views =  (View)requireViewById(dears ) ;
            vected.add(views) ;
        }
    }
    @Override  
    public void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState) ;
        setContentView(sourceId) ;
        realms = getApplicationContext() ;
        associateViews() ; 
        appendListeners( ); 

    }
}