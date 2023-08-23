package com.moderneinstein.android.arcade ;

import android.app.Activity ; 
import android.os.Bundle ;
import android.os.Looper ;
import android.os.Handler ;
import android.view.ViewGroup ;
import android.view.View ; 
import android.view.LayoutInflater ;

import android.widget.EditText ; 
import android.widget.TextView ;
import android.widget.ImageView ;

import android.widget.Toast ; 
import android.content.Context ; 
import android.content.Intent  ; 

import android.R.color ;
import android.R.string ; 
import android.R.layout ;
import android.R.id ;

import com.google.firebase.auth.AuthResult ; 
import com.google.firebase.auth.FirebaseUser ; 
import com.google.firebase.auth.FirebaseAuth ; 
import com.google.android.gms.tasks.Task ; 
import com.google.android.gms.tasks.OnCompleteListener ; 
import com.google.android.gms.tasks.OnSuccessListener ; 
import com.google.android.gms.tasks.OnFailureListener ; 

public class LoginActivity extends Activity {
        
    public static int  sourceId   = R.layout.login ; 
    public static int[] viewId =  new int[]{R.id.login_1_1_1_1_1,R.id.login_1_1_1_1_2,R.id.login_1_1_1_1_3,R.id.login_1_1_1_1_4,R.id.login_1_1_1_2_1,R.id.login_1_1_1_2_2 }  ; 
    public static int[] groupId = new int[]{R.id.login_1,R.id.login_1_1,R.id.login_1_1_1,R.id.login_1_1_1_1,R.id.login_1_1_1_2} ; 
    public  View[] views   ; 
    public  ViewGroup[] groups  ; 
    public Context  status ;
    private FirebaseAuth firebase ; 
    public boolean  correct  ; 
    public void noticeEvents(){
        views[5].setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View achieve){
                    assign( ) ;
              //      if(correct==true){
             ///       Intent persist = new Intent( ) ; 
              //      persist.setClass(status,RootActivity.class) ;
              //      Bundle serial  = new Bundle() ;  
            //        startActivity(persist,serial) ;    }
             //   correct = false ; 
            }
            }
        ) ;
        views[4].setOnClickListener(
            new View.OnClickListener(){
            @Override 
            public void onClick(View asserts ){
                    Intent aside = new Intent() ; 
                    aside.setClass(status ,SignupActivity.class)  ;
                    Bundle arguments = new Bundle() ;
                    startActivity(aside,arguments) ;
            }
        }
        ) ;
    }
    public void  assign( ){
        String theta =   ((EditText)views[1]).getText ().toString( ) ; 
        String  delta  =  ((EditText)views[3]).getText().toString() ;   
        Utility.showText (status,delta.concat (" ").concat(theta),700) ;
        if( delta ==null ||theta==null||delta.length( )==0||theta.length()==0){return ; }
        boolean[] pauses = new boolean[2] ; 
        Thread council = new Thread(){
           @Override
            public void run( ){
                    requests(theta,delta)  ; 
            }
        }  ; 
        council.start( ) ; 
      //  return  pauses[0] ;
    }
    public boolean  alternate(Task<AuthResult> verses){
        if(verses==null){return  false ; }
         if(verses.isSuccessful()){
            AuthResult result = verses.getResult() ; 
            FirebaseUser users = result.getUser() ;
            firebase.updateCurrentUser(users)  ; 
            CentralSource.setState(true) ; 
            CentralSource.setUser(users ) ;
          Utility.showText( status,"Login Was Successful",800) ; 
          return true ; 
         }else{
            Exception exception =  verses.getException () ; 
            if(exception==null){Utility.showText(status,"Operation Unsuccessful",700) ; return false  ; }
            String  deduced = exception.toString( ) ; 
            Utility.showText(status,deduced,800) ;  
        //  Utility.showText(status,"Operation Unsuccessful",700) ; 
            return false ;
         }
       //  return true ;
    }
    // String  deduced = exception.getMessage () ; 
    public void  requests(String Email,String Password){
        Task<AuthResult> tasks =  firebase.signInWithEmailAndPassword(Email,Password) ; 
      //  if(tasks==null){return false ; }
        boolean  align  = false ; 
        tasks.addOnCompleteListener(this,new OnCompleteListener<AuthResult>(){
            @Override 
            public void onComplete(Task<AuthResult> traces){
              alternate(traces) ;
           // return value  ;
            }
        }) ;
        tasks.addOnFailureListener(
            this,new OnFailureListener(){
                @Override 
                public void onFailure(Exception except){
                    String collect = except.getMessage() ; 
                    Utility.showText ( status,collect,800) ; 
                }
            }
        ) ;
      //  return  true  ;
    }
    public void  bindLayout() {
         int spread = viewId.length ; 
        views = new View[spread]; 
        for(int fs=0;fs<spread;fs++){
            int parts = viewId[fs] ; 
            View grails =  (View)requireViewById(parts) ;
            views[fs] = grails ;
        }
        int amount = groupId.length ; 
        groups =  new ViewGroup[amount] ;
        for(int rs=0;rs<amount;rs++){
         int yearn = groupId[rs] ; 
        ViewGroup tether =  (ViewGroup)findViewById(yearn) ;
         groups[rs]  = tether ; 
        }
    } 

    @Override  
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState) ; 
        setContentView(sourceId) ; 
        correct = false ;
        status =  this.getApplicationContext() ;
       // firebase = FirebaseAuth.getInstance() ;
      //  CentralSource source =  (CentralSource)(this.getApplication()) ;
       firebase = CentralSource.getAuth() ; 
        bindLayout() ; 
        noticeEvents() ; 
        TextView first = (TextView)(views[4]) ;
}
}
/**
 *    if(firebase!=null)
        {first.setText("Not Error")  ;  }
        Toast  toast =new Toast(status) ; 
        toast.setDuration(1000); 
        toast.setText("android.widget.Toast") ; 
        toast .show() ; 
 */