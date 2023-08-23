package com.moderneinstein.android.arcade;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup ;
import android.content.Context ; 
import  android.content.Intent ; 
import android.app.Service ; 
import android.widget.Toast ; 


import android.R.anim  ; 
import android.R.id  ;
import android.R.layout  ;
import android.widget.TextView ;
import android.widget.Button ; 
import android.view.View ;

import java.util.Set ;
import java.util.TreeSet ;
import java.util.Spliterator ;
import java.util.Iterator ; 
import  java.util.ListIterator ; 
import java.util.LinkedList ; 
import java.util.List ; 



public class RootActivity extends Activity
{
    /** Called when the activity is first created. */


  //  public static int[] orderId =  new int[]{  R.id.root_1 }  ;
   // public static int[] itemId = new int[]{  R.id.root_1_3_1   }  ;
    public static int[] itemId = new int[]{  R.id.root_1_1_2_1,R.id.root_1_1_2_2,R.id.root_1_1_3_1,R.id.root_1_1_3_2,R.id.root_1_1_3_3,R.id.root_1_1_3_4  } ;
    public static int[] orderId =  new int[]{  R.id.root_1,R.id.root_1_1,R.id.root_1_1_1,R.id.root_1_1_2,R.id.root_1_1_3  } ;  
    public  View[] linear ; 
    public ViewGroup[] serial ; 
    public static int rootId = R.layout.main ; 
    public static int point=  0 ; 
    public static String[] TestString =  {"Initial String","Altered String","Select Any Activity"} ;
    public static long DEFAULT_LAPSE  = 800  ; 
    public static Context  context  ; 
    public static List<String> items ; 

    public  void  associateViews(){
        int spans = orderId.length ;
        serial =  new ViewGroup[spans] ; 
        for(int fc=0;fc<spans;fc++){ 
            int data =   orderId[fc] ; 
            ViewGroup parts = (ViewGroup)findViewById(data) ;
            serial[fc] = (ViewGroup)parts ; }
        int alloc  =  itemId.length ; 
        linear = new View[alloc] ;
        for(int rc=0;rc<alloc;rc++){
             int temp =itemId[rc] ; 
            View crest = (View)requireViewById(temp) ;
             Integer measured = crest.getMeasuredWidth ()  ; 
           // ((TextView)crest).setText(String.valueOf(measured)) ;
            linear[rc] = crest ;   }
    }

    public static void setText(View valid){
        point = point+1 ;
        int  space = TestString.length ;
        int force = (point%space) ;  
        CharSequence chairs = (CharSequence)(TestString[force]) ; 
        ((TextView)valid).setText(chairs)  ;
    }
    //     String check = TestString[force] ;
 //   CharSequence chairs = (CharSequence)check ; 
    public static void alterText(View alias,long defer){
        long  stream =  System.currentTimeMillis() ;
        String  great = new String("Duration Check") ; 
        TextView reach=  (TextView)alias ;
        new Thread(){
            @Override 
            public void run (){
            CharSequence stored = reach.getText() ; 
             reach.setText(great )  ;
            while(System.currentTimeMillis()- stream<defer){  }
            reach.setText(stored)  ;}
        }.start( ) ;

    }
    public void appendListeners(){
        linear[3].setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View aligned){
                    setText(linear[0]) ; 
                   // alterText(linear[1],DEFAULT_LAPSE) ;
                   Intent toward = new Intent(context,ToDoListActivity.class) ;
                    startActivity(toward ) ; 
                }
            }
        ) ;
        linear[2].setOnClickListener(
            new View.OnClickListener(){
                 @Override 
                public void onClick(View recieve){
                    setText(linear[1]) ;
                //   alterText(linear[0],DEFAULT_LAPSE) ; 
                    Intent nested = new Intent()  ;
                    nested.setClass(context,AnagramsActivity.class) ;
                    startActivity(nested) ; 
                }
            }
        ) ;
    }
    public void otherListeners(){
        linear[4].setOnClickListener(
            new View.OnClickListener(){
               @Override 
               public void onClick(View greet){
                   Intent braces = new Intent() ; 
                   braces.setClass(context,SignupActivity.class) ;
                   startActivity(braces) ; 
               }
            }
       ) ;
        linear[5].setOnClickListener(
             new View.OnClickListener(){
                @Override
                public void onClick(View arrive) {
                    Intent suffice =new Intent() ;
                    suffice.setClass(context,LoginActivity.class) ;
                    startActivity(suffice)  ;
                } 
             }
        )  ;
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        context = this.getApplicationContext() ;
        TreeSet<View>  trees = new TreeSet<View >()  ;
        /*  if(items==null){
        items = new LinkedList<String>() ; 
       // Toast.makeText(context,"Items are clear",575) ;
       Toast  display  = new Toast(context)  ; 
        display.setDuration(575) ; 
        display.setText("Items are Clear") ;
        display.show () ;   }  */
        associateViews() ; 
        appendListeners()  ;
        otherListeners() ; 
     //   if(savedInstanceState==null){Toast.makeText (context, "Bundle restored ! ",500) ;}
    }
    

}
