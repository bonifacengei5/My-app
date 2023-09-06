package com.example.myecommercecompany.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.myecommercecompany.models.User
import com.example.myecommercecompany.navigations.ROUTE_HOME
import com.example.myecommercecompany.navigations.ROUTE_LOGIN
import com.example.myecommercecompany.navigations.ROUTE_SIGNUP
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthRepository {
    class AuthRepository(var navController: NavHostController, var context: Context) {
        var mAuth: FirebaseAuth
        val progress: ProgressDialog
        init {
            mAuth = FirebaseAuth.getInstance()
            progress = ProgressDialog(context)
            progress.setTitle("Loading")
            progress.setTitle("Please wait...")
        }


        fun signup(name:String, email:String, password:String){
            progress.show()
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful){
                    var userData = User(name,email,password,mAuth.currentUser!!.uid)
                    var regRef = FirebaseDatabase.getInstance() .getReference()
                        .child("Users/"+mAuth.currentUser!!.uid)
                    regRef.setValue(userData).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(context,"Signup successful", Toast.LENGTH_SHORT).show()
                            navController.navigate(ROUTE_HOME)
                        }
                        else{
                            navController.navigate(ROUTE_LOGIN)
                        }
                    }
                }else{
                    navController.navigate(ROUTE_SIGNUP)
                }
            }

        }


        fun login(email: String, password: String) {
            progress.show()
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                progress.dismiss()
                if(it.isSuccessful){
                    Toast.makeText(context,"Login successful", Toast.LENGTH_SHORT).show()
                    navController.navigate(ROUTE_HOME)
                }
                else{
                    navController.navigate(ROUTE_LOGIN)
                }
            }
        }



        fun isloggedIn():Boolean = mAuth.currentUser != null


    }
}