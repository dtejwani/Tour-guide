package com.dhsk.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {
    int citynum;
    public MuseumsFragment(int number){
        citynum=number;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> museums = new ArrayList<>();
        if(citynum==1){
        museums.add(new Place(R.string.mus1,R.string.mus1_add,R.drawable.mus1,4.2));
        museums.add(new Place(R.string.mus2,R.string.mus2_add,R.drawable.mus2,4.3));
        museums.add(new Place(R.string.mus3,R.string.mus3_add,R.drawable.mus3,4.6));
        museums.add(new Place(R.string.mus4,R.string.mus4_add,R.drawable.mus4,4.4));}

        placeAdapter adapter = new placeAdapter(getActivity(), museums, R.color.forstyle);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
