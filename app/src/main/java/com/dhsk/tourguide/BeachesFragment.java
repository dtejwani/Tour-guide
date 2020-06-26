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
        beaches.add(new Place(R.string.Juhu_beach_name,R.string.Juhu_beach_address,R.drawable.juhu_beach,3.7));
        beaches.add(new Place(R.string.Marve_beach_name,R.string.Marve_beach_address,R.drawable.marve_beach,3.3));
        beaches.add(new Place(R.string.Girgaum_beach_name,R.string.Girgaum_beach_address,R.drawable.giragum_beach,3.9));
        beaches.add(new Place(R.string.Dadar_beach_name,R.string.Dadar_beach_address,R.drawable.dadar_beach,3.8));
        beaches.add(new Place(R.string.Versova_beach_name,R.string.Versova_beach_address,R.drawable.versove_beach,4.2));

        placeAdapter adapter = new placeAdapter(getActivity(), beaches, R.color.forstyle);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
