package com.example.dongson.onews.view;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.dongson.onews.R;

public class MainFragment extends Fragment {


    public MainFragment() {
    }

<<<<<<< HEAD
    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

=======
>>>>>>> add some fragment for all tab and some models
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
<<<<<<< HEAD
//        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
//        textView.setText("Kteam");
=======
        FrameLayout relativeLayout = (FrameLayout) rootView.findViewById(R.id.rl_fragment);
        relativeLayout.setBackgroundColor(Color.RED);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("Kteam");
>>>>>>> add some fragment for all tab and some models
        return rootView;
    }
}
