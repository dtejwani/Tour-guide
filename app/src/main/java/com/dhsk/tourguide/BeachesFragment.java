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
    int city_num;
    public BeachesFragment(int number){
        city_num=number;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> beaches = new ArrayList<>();
        if(city_num==1) {
            beaches.add(new Place(R.string.Aska_beach_name, R.string.Aska_beach_address, R.drawable.aska_beach, 3.9));
            beaches.add(new Place(R.string.Gorai_beach_name, R.string.Gorai_beach_address, R.drawable.goria_beach, 4.1));
            beaches.add(new Place(R.string.Juhu_beach_name, R.string.Juhu_beach_address, R.drawable.juhu_beach, 3.7));
            beaches.add(new Place(R.string.Marve_beach_name, R.string.Marve_beach_address, R.drawable.marve_beach, 3.3));
            beaches.add(new Place(R.string.Girgaum_beach_name, R.string.Girgaum_beach_address, R.drawable.giragum_beach, 3.9));
            beaches.add(new Place(R.string.Dadar_beach_name, R.string.Dadar_beach_address, R.drawable.dadar_beach, 3.8));
            beaches.add(new Place(R.string.Versova_beach_name, R.string.Versova_beach_address, R.drawable.versove_beach, 4.2));
        }
        else if(city_num==2){
            beaches.add(new Place(R.string.del_mar1, R.string.del_mar1_add,R.drawable.del_mar1, 4.0));
            beaches.add(new Place(R.string.del_mar2, R.string.del_mar2_add,R.drawable.del_mar2, 4.2));
            beaches.add(new Place(R.string.del_mar3, R.string.del_mar3_add,R.drawable.del_mar3, 4.1));
            beaches.add(new Place(R.string.del_mar4, R.string.del_mar4_add,R.drawable.del_mar4, 3.7));
            beaches.add(new Place(R.string.del_mar5, R.string.del_mar5_add,R.drawable.del_mar5, 3.8));
            beaches.add(new Place(R.string.del_mar6, R.string.del_mar6_add,R.drawable.del_mar6, 3.5));
            beaches.add(new Place(R.string.del_mar7, R.string.del_mar7_add,R.drawable.del_mar7, 3.8));
            beaches.add(new Place(R.string.del_mar8, R.string.del_mar8_add,R.drawable.del_mar8, 4.2));
        }
        placeAdapter adapter = new placeAdapter(getActivity(), beaches, R.color.forstyle);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
