package com.example.fragment_trans;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

public class FragmentB extends Fragment {
    @Override
    public void onAttach(Context context) {
        Log.d("New","Fragment B onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("New","Fragment B onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d("New","Fragment B onCreateView");
        View v=inflater.inflate(R.layout.fragment_a,container,false);
        return v;
    }

    @Override
    public void onPause() {
        Log.d("New","Fragment B onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("New","Fragment B onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("New","Fragment B onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("New","Fragment B onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("New","Fragment B onDetach");
        super.onDetach();
    }
}
