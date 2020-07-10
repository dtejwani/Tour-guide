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
    int city_num;
    public EventsFragment(int number){
        city_num=number;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> events = new ArrayList<>();
        if(city_num==1) {
            events.add(new Place(R.string.cylin, R.string.cyclin_address, R.drawable.cyclin, 4.5));
            events.add(new Place(R.string.ahinsa, R.string.ahinsa_address, R.drawable.marathon, 4.3));
            events.add(new Place(R.string.tour, R.string.tour_address, R.drawable.tour, 4.1));
        }
        else if(city_num==2){
            events.add(new Place(R.string.site1, R.string.site1_add, R.drawable.delhi_site1, 4.7));
            events.add(new Place(R.string.site2, R.string.site2_add, R.drawable.delhi_site2, 4.5));
            events.add(new Place(R.string.site3, R.string.site3_add, R.drawable.delhi_site3, 4.4));
            events.add(new Place(R.string.site4, R.string.site4_add, R.drawable.delhi_site4, 4.8));
            events.add(new Place(R.string.site5, R.string.site5_add, R.drawable.delhi_site5, 4.8));
            events.add(new Place(R.string.site6, R.string.site6_add, R.drawable.delhi_site6, 4.9));
            events.add(new Place(R.string.site7, R.string.site7_add, R.drawable.delhi_site7, 4.4));
            events.add(new Place(R.string.site8, R.string.site8_add, R.drawable.delhi_site8, 4.0));
        }
        else if (city_num==3){
            events.add(new Place(R.string.ben_site1,R.string.ben_site1_add,R.drawable.ben_site1,4.6));
            events.add(new Place(R.string.ben_site2,R.string.ben_site2_add,R.drawable.ben_site2,4.7));
            events.add(new Place(R.string.ben_site3,R.string.ben_site3_add,R.drawable.ben_site3,4.3));
            events.add(new Place(R.string.ben_site4,R.string.ben_site4_add,R.drawable.ben_site4,4.2));
            events.add(new Place(R.string.ben_site5,R.string.ben_site5_add,R.drawable.ben_site5,4.5));
            events.add(new Place(R.string.ben_site6,R.string.ben_site6_add,R.drawable.ben_site6,4.7));

        }
        placeAdapter adapter = new placeAdapter(getActivity(), events, R.color.forstyle);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
