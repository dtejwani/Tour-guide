package com.dhsk.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class BeachesFragment extends Fragment {
    public BeachesFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> beaches = new ArrayList<>();
        beaches.add(new Place(R.string.Aska_beach_name,R.string.Aska_beach_address,R.drawable.aska_beach,3.9));
        beaches.add(new Place(R.string.Gorai_beach_name,R.string.Gorai_beach_address,R.drawable.goria_beach,4.1));
        placeAdapter adapter = new placeAdapter(getActivity(), beaches, R.color.colorAccent);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }
}
