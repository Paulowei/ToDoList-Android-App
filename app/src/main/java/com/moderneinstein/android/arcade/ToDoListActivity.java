package com.moderneinstein.android.arcade ;

import android.view.View ;
import android.view.ViewGroup ;
import android.app.Service ;
import android.app.Activity ; 
import android.widget.Button  ; 
import android.widget.TextView ; 

import android.R.layout  ; 
import android.R.id ; 
import android.R.string ;
import android.R.color ;
import android.widget.EditText ;

import android.graphics.Color  ;
import android.content.Intent ; 
import android.os.Bundle ;
import android.content.Context ; 
import android.widget.ScrollView ;
import android.widget.Toast ; 

import android.util.Log ;
import android .util.AttributeSet ; 

import java.util.Vector ; 
import java.util.Queue ; 
import java.util.Set  ; 
import java.util.Map ; 
import java.util.TreeMap ;
import java.util.HashMap ; 
import java.util.ArrayList ;
import java.util.LinkedList ; 
import java.util.List  ; 

import  android.util.Xml ; 
import org.xmlpull.v1.XmlPullParser ;
import android.content.res.Resources   ; 
import android.content.SharedPreferences ; 

// "View Array","View Group Array",
public class ToDoListActivity extends Activity {
    
    public static int  contentId = R.layout.to_do_list ; 
    public static int packetId[] =  {R.id.to_do_list_1,R.id.to_do_list_1_1,R.id.to_do_list_1_1_1,R.id.to_do_list_1_1_2,
        R.id.to_do_list_1_1_2_1,R.id.to_do_list_1_1_3,R.id.to_do_list_1_1_4}   ; 
    public static int[] tokenId = { R.id.to_do_list_1_1_1_1, R.id.to_do_list_1_1_3_1,R.id.to_do_list_1_1_4_1,R.id.to_do_list_1_1_4_2 ,R.id.to_do_list_1_1_4_5 } ;
    public ViewGroup[] groups   ;
    public View icons[]    ; 
    public Context context   ; 
    public  View elim  ;
    public Map<View,Integer>  trace   ;
    public int index   ; 
    public ArrayList<String>  stores   ;
    public static int  itemId =  R.layout.list_item    ;
    public static float TEXT_SIZE_4 = 20.0f   ; 
    public static int[] layouts = new int[]{100,45 }   ; 
    public static int[] margins = new int[]{8,8,8,8}   ; 
    public static int[] padding = new int[]{9,9,9,9}  ;   
    public static String[]  helpers = new String[]{"Altered","Selected View","View Index","List Items","String Items","Trace Map","Stored Items","List Span","Prefs.txt"} ; 
    public static float  amend = 1.0f ; 
    public Vector<View> listItems ; 

    public ViewGroup.MarginLayoutParams parameters(){
        ViewGroup.MarginLayoutParams params 
        =  new ViewGroup.MarginLayoutParams
          ( ViewGroup.LayoutParams.MATCH_PARENT ,ViewGroup.LayoutParams.WRAP_CONTENT) ;
        params.resolveLayoutDirection(View.LAYOUT_DIRECTION_LTR) ; 
        params.setMargins(margins[0],margins[1],margins[2],margins[3]) ;
         return params ; 

    }
    public TextView configureView(String alias,int color){
            TextView view = new TextView(this) ;
            view.setText(alias) ;
            ViewGroup.LayoutParams spare = parameters() ;
            view.setLayoutParams(spare) ; 
            view.setBackgroundColor(color) ;
            return view ;
    }
    //     if(view==null){return view ; }
       // view.setBackgroundColor(color) ;
    public TextView configureView(String alias){
        AttributeSet portion = Utility.createSet(context,itemId) ;
        if(portion ==null){((Button)icons[3]).setText(Integer.toString(44)) ;}
        TextView view = new TextView(context,portion)   ;
        view.setText(alias) ;
        ViewGroup.LayoutParams spare = parameters() ;
        view.setLayoutParams(spare) ; 
        view.setTextSize (TEXT_SIZE_4 ) ; 
        view.setBackgroundColor(Color.argb(25,60,80,120))  ; 
        view.setPadding(padding[0],padding[1],padding[2],padding[3])  ;
        return   view ;
}
//         int colors = createColor(new int[]{25,40,60,120}) ;
    /*public AttributeSet createSet(int layoutId){
        Resources resources = context.getResources() ; 
        XmlPullParser parser = resources.getXml(layoutId) ;
        AttributeSet attrs = Xml.asAttributeSet(parser) ; 
        return  attrs ;
    } */
    public void notify(View comrade){
        int spans = groups[4].getChildCount() ;
        comrade.setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View crease){
                elim = comrade ;
            index =  comrade.getId() ; }
            }
        )  ;
    }
    public static int  createColor(int[] textures){
            // Implement Color Scheme ; 
            // Using the Color.argb() method ;
            // or the Color.rgb() method ; 
            int source = Color.argb(textures[0],textures[1],textures[2],textures[3]) ;
            Color created = Color.valueOf(source) ; 
            return  source  ; 
    }
     public void insertView(ViewGroup parent,String source){
        try{
      //  int[] names =  Utility.streamSingle(0,255,4) ;
          // int colors = createColor(new int[]{}) ;
       TextView alias =  configureView(source)  ;
        Integer valid =  parent.getHeight( ) ; 
         Integer correct = parent.getWidth(  ) ;
      //   if(portion ==null){((Button)icons[2]).setText(Integer.toString(valid)) ;}
         if(alias==null){((Button)icons[2]).setText(Integer.toString(valid) );}
        parent.addView(alias) ; 
        parent.requestLayout() ; 
      //  trace.put(alias,parent.getChildCount()) ; 
         notify(alias) ; 
         stores.add(source) ; 
        }catch(NullPointerException exp){
            exp.printStackTrace() ; 
            Log.d("Error log",exp.toString()) ; 
        }
     }
               //    int range = stores.size() ;
                   // stores.clear() ; 
                 //   for(int rs=0;rs<range;rs++){
                 //       String temp =  stores.get( rs  ) ; 
                  //       RootActivity.items.add(temp) ;     }

    public  void assertion(){
        icons[4].setOnLongClickListener(
            new View.OnLongClickListener(){
                @Override 
                public boolean onLongClick(View select){
                   placeItems  ()  ; 
                    return true ;   }  }   )   ;  
        icons[4].setOnClickListener(
            new  View.OnClickListener(){
                @Override
                public void onClick(View implicit) {
                    placeItems() ;    }  } ) ; 
                 }
    public void interaction(){
        icons[2].setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View wears){
                    View notice =   groups[4].findViewById(index) ;
                    if(notice==null){return ;}
                    groups[4].removeView(notice) ; 
                    stores.remove(index) ; 
                    Log.d("Debug Log","Testing")  ;     }    }   )   ;
        icons[3].setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View lint){
                   CharSequence chance = ((EditText)icons[1]).getText() ; 
                    String notes = (String)chance.toString()  ; 
                    insertView(groups[4],notes) ; 
                    String other = new String(notes) ;        }   }  )   ;
        assertion( )  ;   
    }   
        // stores.clear() ; 
       // if(RootActivity.items==null){
      //      RootActivity.items = new ArrayList<String>() ; 
       //     ((TextView)icons[0]).setText (Integer.toString (55)) ;
     //   }
     //C:\\Users\\Access\\Music\\Updates\\Nests\\Verse\\app\\src\\ 
    public void placeItems(){
        int range = stores.size() ;
     int begin = 0 ; 
     SharedPreferences preferences = getSharedPreferences(helpers[8],MODE_PRIVATE) ; 
     SharedPreferences.Editor editor = preferences.edit() ;   
    // int check = preferences.getInt()
   //  if(preferences.getInt(helpers[7],-1)!=-1){ begin =preferences.getInt()}
         for(int rs=range-1;rs>=0;rs--){
        //     String temp =  stores.get( rs  ) ; 
          //    RootActivity.items.add(temp) ; 
            String current =Integer.toString(rs) ;
            editor.putString(current,stores.get(rs)) ;    
             }
            editor.putInt (helpers[7],range) ;  
             editor.apply() ;  
             Utility.showText(context,"Storing Items",600) ; 
    }
    @Override
    public void onSaveInstanceState(Bundle outer){
        float  check = (float)(index) ;
        outer.putFloat(helpers[2],check ) ; 
        outer.putStringArrayList(helpers[4],stores) ;
      //  outer.putSerializable(helpers[2],groups) ;
     //   outer.putSerializable(helpers[1],icons) ;
     outer.putSerializable(helpers[3],listItems) ;
        outer.putSerializable(helpers[5],(HashMap<View,Integer>)trace) ;
        outer.putFloat(helpers[0],amend) ; 
        LinkedList<View> temp = new LinkedList() ; 
        temp.add(elim) ;
        outer.putSerializable(helpers[1],temp) ;
    }
/**
 Intent restart = new Intent() ; 
                    restart.setClass(context,RootActivity.class) ;
                    restart.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) ;   
                    startActivity(restart) ; 
 */
    public void  attendance(){
        int data =  tokenId.length ; 
        icons = new View[data] ; 
        for(int fd=0;fd<data;fd++){
            int value =  tokenId[fd] ; 
            View viewed =  (View)requireViewById(value)  ;
            icons[fd] = viewed ;
        }
         int noted = packetId.length ;
        groups = new ViewGroup[noted] ;
        for(int er=0;er<noted;er++){
            int verse = packetId[er] ;
            ViewGroup soils = (ViewGroup)findViewById(verse) ;
            groups[er] = soils ; 
        }
    }
    public void retrieveItems(Bundle parse){
        if (parse==null){return ; }
        else{Toast.makeText(context,"Bundle is present",600)  ;  }
        float  tests  =  parse.getFloat(helpers[0],amend +amend)  ; 
        if(tests == amend){
    //    groups =  (ViewGroup[])parse.getSerializable(helpers[2]) ;
     //   stores =  parse.getStringArrayList(helpers[4]) ; 
       // trace =  (HashMap<View,Integer>)parse.getSerializable(helpers[5]) ;
      //  icons = (View[])parse.getSerializable(helpers[0]) ;
       //  index = (int)parse.getFloat(helpers[2]) ; 
       //  elim =  ((LinkedList<View>)parse.getSerializable(helpers[1])).get(0) ;  
        //listItems =  (Vector<View>)parse.getSerializable ( helpers[3])  ;
        } 
     }
    public void restoreItems(){
     //   if(RootActivity.items==null ){return ;}
     //  List<String> serial = new Vector<String>(RootActivity.items) ; 
      //  int height = RootActivity.items.size () ; 
       //  Toast.makeText(context,height,625) ; 
     //  ((TextView)icons[0]).setText (Integer.toString (height)) ; 
        SharedPreferences preferences =  context.getSharedPreferences( helpers[8],Context.MODE_PRIVATE) ; 
        SharedPreferences.Editor editor  =  preferences.edit() ; 
        int check = preferences.getInt(helpers[7],-1) ; 
        if(check==-1){editor.putInt(helpers[7],0) ; 
         editor.commit( ) ; }  
        int height = preferences.getInt (helpers[7],0) ;
         for( int gs =0;gs<height;gs++){
        //    String  verse = serial.get(gs)  ; 
        //  insertView(groups[4], verse) ;  
        String current =  Integer.toString(gs) ;
        String  equiv = preferences.getString(current,null ) ;
        if(equiv == null){ continue ; }
         insertView(groups[4],equiv) ; 
         }
         Utility.showText(context,"Retrieving Items",600) ; 
    }
    @Override 
    public void onDestroy () {
       super.onDestroy() ; 
      //placeItems () ; 
    }
    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(contentId ); 
        if(savedInstanceState==null){}
        retrieveItems(savedInstanceState) ;
        context = this.getApplicationContext() ; 
        trace = new  HashMap<View,Integer >() ;
        listItems = new Vector<View>() ;
        stores = new ArrayList<String>() ;
        attendance() ; 
        interaction( ) ; 
        restoreItems() ; 
     //   placeItems () ; 
    }   
}
