package com.dhsk.tourguide;
import android.content.Context;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
        int city_num;
    public CategoryAdapter(Context context, FragmentManager fm, int i){
        super(fm);
        city_num=i;
        mContext = context;
    }
    public Fragment getItem(int position){
        if (position == 0){
            return new RestaurantsFragment(city_num);
        } else if (position == 1) {
            return new BeachesFragment(city_num);
        } else if (position == 2) {
            return new MuseumsFragment(city_num);
        } else {
            return new EventsFragment(city_num);
        }

    }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.restaurant);
        } else if (position == 1) {
            return mContext.getString(R.string.beaches);
        } else if (position == 2) {
            return mContext.getString(R.string.museums);
        } else {
            return mContext.getString(R.string.events);
        }
    }
}
