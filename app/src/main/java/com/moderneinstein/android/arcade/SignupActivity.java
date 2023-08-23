package com.moderneinstein.android.arcade ; 

import android.os.Handler ;
import android.os.Looper ; 
import android.app.Service ;
import android.os.Bundle ;
import android.app.Activity ; 
import android.view.ViewGroup ; 
import android.view.View ; 

import android.widget.EditText ;
import android.content.Context ; 
import android.content.Intent ;
import android.widget.TextView ;
import android.widget.Toast ;

import java.util.ArrayList ; 
import java.util.List ;
import java.util.Vector ;
import  java.util.Arrays ;

import android.widget.Button ;
import android.R.layout ; 
import android.R.string ; 
import android.R.dimen ;
import android.R.color  ;

import com.google.android.gms.tasks.Task ; 
import com.google.android.gms.tasks.OnCompleteListener ; 
import com.google.android.gms.tasks.OnFailureListener ; 
import com.google.android.gms.tasks.OnSuccessListener ; 

import  com.google.firebase.auth.FirebaseAuth ; 
import com.google.firebase.auth.FirebaseUser ; 
import com.google.firebase.auth.AuthResult  ; 


public class SignupActivity extends Activity{

    public  List<ViewGroup> parents ; 
    public  ArrayList<View> children ; 
    public static int  stateId = R.layout.signup ; 
    public static int[] array4  = new int[]{R.id.signup_1,R.id.signup_1_1,R.id.signup_1_1_1,R.id.signup_1_1_1_1,R.id.signup_1_1_1_2}  ; 
    public static int[] array5 = new int[]{R.id.signup_1_1_1_1_1,R.id.signup_1_1_1_1_2,R.id.signup_1_1_1_1_3,R.id.signup_1_1_1_1_4,R.id.signup_1_1_1_2_1,R.id.signup_1_1_1_2_2}  ; 
    private  Context context ;
    private  FirebaseAuth  authentic ; 
           //   if(authentic.getCurrentUser()!=null){ 
          //        Intent  trench = new Intent( ) ; 
         //         trench.setClass(context,RootActivity.class );
         //         startActivity(trench) ;
           // }
    public void  compute(){
      children.get(5).setOnClickListener( 
        new View.OnClickListener(){
          @Override 
          public void onClick(View states){
              Intent capable = new Intent() ;
              capable.setClass(context,LoginActivity.class) ;
              capable.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); 
              startActivity(capable) ; 
          }
        }
      )  ;
        children.get(4).setOnClickListener(
            new View.OnClickListener(){
              @Override
              public void onClick(View verse){
                   // TODO : Implement Signup Service 
                 involve() ;
              }
            }
        )  ;
    }
    //   trench.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) ;
    // (String)  //(String)
          //  Thread alloc = new Thread(){
        //  @Override 
      //    public void run(){
    public void  involve(){
        String  nouns =  (((EditText)children.get(1)).getText() ).toString()  ; 
        String verbs = (((EditText)children.get(3)).getText()).toString() ;  
      Toast toast = new Toast( context) ;
       toast.setDuration(900) ;
        try{
            create(nouns,verbs)  ;
        // create("newpaulowei@gmail.com","Threads")  ; 
        }catch(Exception except){ 
            toast.setText (except.getMessage()) ; 
            toast.show()  ;   }   }
           // FirebaseUser  braces =authentic.getCurrentUser() ; 
         //   CentralSource.setState(true) ;
            //TODO: Include user in local preferences ; 
     //     }
       // }  ;
      //  alloc.start() ; 
    public void create(String Email , String Password) throws Exception {
      if(authentic==null){return ;}
         Task<AuthResult> results = 
          authentic.createUserWithEmailAndPassword(Email,Password) ;
          if(results==null){return ;  }    
        results.addOnSuccessListener(this, new OnSuccessListener<AuthResult>(){
         @Override 
          public void onSuccess(AuthResult auths ){
            FirebaseUser users = auths.getUser() ; 
          //  authentic.updateCurrentUser(users) ; 
            Utility.showText(context,"The Attempt was successful !",850) ;
          }    }    ) ; 
          results.addOnFailureListener(this,new OnFailureListener(){
            @Override
            public void onFailure(Exception thrown){
                String message = thrown.getMessage() ; 
                Utility.showText(context,message,800)  ;
            }
          } ) ;  
    }
    public void  resolve(){
      parents = new Vector<ViewGroup>() ; 
      int verse= array4.length ; 
      for(int ds=0;ds<verse;ds++){
          ViewGroup arrive = (ViewGroup)findViewById(array4[ds]) ;
          ((Vector<ViewGroup>)parents).addElement(arrive) ; 
      }
      int screen =array5.length ;
      children =new ArrayList<View>() ; 
      children.ensureCapacity(screen) ;
      for(int fr=0;fr<screen;fr++){
         View current = (View)requireViewById(array5[fr ]) ; 
        ((ArrayList<View>)children).add(current) ; 
      }
    }

    @Override 
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState) ; 
        setContentView(stateId) ; 
        context =  this.getApplicationContext() ; 
       // CentralSource source =  (CentralSource)(this.getApplication()) ;
        authentic =  FirebaseAuth.getInstance() ; 
          authentic = CentralSource.getAuth() ;
        resolve() ; 
        compute() ;
    }

      /**
       *    results.addOnCompleteListener(this,new OnCompleteListener<AuthResult>(){
            @Override 
            public void onComplete(Task<AuthResult> tasks){
                 if(tasks.isSuccessful()){
                 // AuthResult auths = tasks.getResult ()  ;
                  //   FirebaseUser users = auths.getUser() ; 
                 //   Toast.makeText (context,"This was successful",650) ;   
               //  ((Button)children.get(5)).setText("The Attempt was successful !")  ;
                 Toast board = new Toast(context) ; 
                  board.setDuration (600)  ; 
                  board.setText ("The Action was successful") ;
                  board.show( ) ; 
                 }
                else{
                  // TODO :Implement Error mechanism ;
                //  AuthResult  nested = tasks.getResult( ) ; 
                //  Toast.makeText(context,"This was not successful",625) ;
              //  String notes = tasks.getException().toString()  ;
               //  ((Button)children.get(4)).setText(notes)  ;
              //  Utility.show
                } 
            }
          }) ;
       */
}