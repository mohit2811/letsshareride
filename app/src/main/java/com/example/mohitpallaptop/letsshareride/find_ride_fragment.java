package com.example.mohitpallaptop.letsshareride;

import android.content.Intent;
import android.media.MediaPlayer;
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

public class find_ride_fragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View rootview = inflater.inflate(R.layout.find_ride_layout,container ,false);

        Button myButton = (Button) rootview.findViewById(R.id.offer_butt);
        myButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(getContext(), Main4Activity.class);
                startActivity(myIntent);

            }
        });
            return rootview;
    }
}
