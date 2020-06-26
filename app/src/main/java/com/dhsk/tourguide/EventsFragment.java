package com.dhsk.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class EventsFragment  extends Fragment {
    public EventsFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> events = new ArrayList<>();
        events.add(new Place(R.string.cylin,R.string.cyclin_address,R.drawable.cyclin,4.5));
        events.add(new Place(R.string.ahinsa,R.string.ahinsa_address,R.drawable.marathon,4.3));
        events.add(new Place(R.string.tour,R.string.tour_address,R.drawable.tour,4.1));

        placeAdapter adapter = new placeAdapter(getActivity(), events, R.color.forstyle);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
