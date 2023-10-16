package com.example.fragment_trans;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
    }
    public void addA(View v){
        FragmentA f1=new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.group,f1,"A");
        transaction.addToBackStack("Himanshu");
        transaction.commit();
    }
    public void removeA(View v){
        FragmentA f1= (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction=manager.beginTransaction();
        if(f1!=null){
            transaction.remove(f1);
            transaction.commit();
        }else {
            Toast.makeText(this,"This fragment A not added",Toast.LENGTH_SHORT).show();
        }
    }
    public void addB(View v) {
        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, f2, "B");
        transaction.addToBackStack("Mishawaka");
        transaction.commit();
    }
    public void removeB(View v){
        FragmentB f2= (FragmentB) manager.findFragmentByTag("B");
        FragmentTransaction transaction=manager.beginTransaction();
        if(f2!=null){
            transaction.remove(f2);
            transaction.addToBackStack("Mishawaka");
            transaction.commit();
        }else {
            Toast.makeText(this,"This fragment b not added",Toast.LENGTH_SHORT).show();
        }
    }
    public void replaceAwithB(View v){

    }
    public void BreplcewithA(View v){

    }
    public void attach(View v) {
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if (f1 != null) {
            transaction.attach(f1);
            transaction.commit();
        }
    }
    public void detach(View v){
        FragmentA f1 = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if (f1 != null) {
            transaction.detach(f1);
            transaction.commit();
        }

    }

}