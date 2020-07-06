package com.dhsk.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    int i;
    public RestaurantsFragment(int number){
        // it requires an empty constructor
        i=number;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.place_list, container, false);

            final ArrayList<Place> places = new ArrayList<>();
        if(i==1) {
            places.add(new Place(R.string.res1, R.string.res1_add, R.drawable.res1, 4.4));
            places.add(new Place(R.string.res2, R.string.res2_add, R.drawable.res2, 4.2));
            places.add(new Place(R.string.res3, R.string.res3_add, R.drawable.res3, 4.6));
            places.add(new Place(R.string.res4, R.string.res4_add, R.drawable.res4, 4.1));
            places.add(new Place(R.string.res5, R.string.res5_add, R.drawable.res5, 4.3));}
            placeAdapter adapter = new placeAdapter(getActivity(), places, R.color.forstyle);

            final ListView listView = (ListView) rootView.findViewById(R.id.list);

            listView.setAdapter(adapter);

            return rootView;
        }

    }
