package com.example.mohitpallaptop.letsshareride;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by ghumman on 2/10/2017.
 */

public class offer_ride_fragment extends Fragment

{


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.offer_ride_layout, container, false);

        Button myButton = (Button) view.findViewById(R.id.offer_butt);
        myButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(getActivity(), offer_activity.class);
                startActivity(myIntent);

            }
        });

            return view;

}
    }