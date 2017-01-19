package comsorrgrif.github.steakberriesclub;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RawFoodFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RawFoodFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RawFoodFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private SectionPagerAdapter pagerAdapter;
    private ViewPager viewPager;


    private OnFragmentInteractionListener mListener;

    public RawFoodFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RawFoodFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RawFoodFragment newInstance(String param1, String param2) {
        RawFoodFragment fragment = new RawFoodFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_raw_food, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.VenisonPager);
        setAdapter(viewPager, "venison");

        viewPager = (ViewPager) view.findViewById(R.id.BerriesPager);
        setAdapter(viewPager, "berries");

        viewPager = (ViewPager) view.findViewById(R.id.GarbagePager);
        setAdapter(viewPager, "garbage");

        viewPager = (ViewPager) view.findViewById(R.id.NoodlePager);
        setAdapter(viewPager, "noodle");

        viewPager = (ViewPager) view.findViewById(R.id.ApplePager);
        setAdapter(viewPager, "apple");

        viewPager = (ViewPager) view.findViewById(R.id.BeefPager);
        setAdapter(viewPager, "beef");

        viewPager = (ViewPager) view.findViewById(R.id.EggPager);
        setAdapter(viewPager, "egg");

        viewPager = (ViewPager) view.findViewById(R.id.MomsSpaghettiPager);
        setAdapter(viewPager, "momsSpaghetti");

        viewPager = (ViewPager) view.findViewById(R.id.RawBaconPager);
        setAdapter(viewPager, "rawBacon");

        viewPager = (ViewPager) view.findViewById(R.id.FrozenTVDinnerPager);
        setAdapter(viewPager, "frozenTVDinner");

        viewPager = (ViewPager) view.findViewById(R.id.RoadkillPager);
        setAdapter(viewPager, "roadkill");


//        berriesPager = (ViewPager) view.findViewById(R.id.BerriesPager);
//        garbagePager = (ViewPager) view.findViewById(R.id.GarbagePager);
//        noodlesPager = (ViewPager) view.findViewById(R.id.NoodlePager);
//        applePager = (ViewPager) view.findViewById(R.id.ApplePager);
//        beefPager = (ViewPager) view.findViewById(R.id.BeefPager);
//        eggPager = (ViewPager) view.findViewById(R.id.EggPager);
//        momsSpaghettiPager = (ViewPager) view.findViewById(R.id.MomsSpaghettiPager);
//        rawBaconPager = (ViewPager) view.findViewById(R.id.RawBaconPager);
//        frozenTVDinnerPager = (ViewPager) view.findViewById(R.id.FrozenTVDinnerPager);
//        roadkillPager = (ViewPager) view.findViewById(R.id.RoadkillPager);


//        berriesPager.setAdapter(berriesAdapter);
//        garbagePager.setAdapter(garbageAdapter);
//        noodlesPager.setAdapter(noodlesAdapter);
//        noodlesPager.setAdapter(noodlesAdapter);
//        noodlesPager.setAdapter(noodlesAdapter);
//        noodlesPager.setAdapter(noodlesAdapter);
//        noodlesPager.setAdapter(noodlesAdapter);
//        noodlesPager.setAdapter(noodlesAdapter);
//        noodlesPager.setAdapter(noodlesAdapter);
//        noodlesPager.setAdapter(noodlesAdapter);


//        berriesPager.setCurrentItem(1);
//        garbagePager.setCurrentItem(1);
//        noodlesPager.setCurrentItem(1);



        return view;
    }

    private void setAdapter(ViewPager pager, String item)
    {
        pagerAdapter = new SectionPagerAdapter(getActivity().getSupportFragmentManager(), item);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(1);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public class SectionPagerAdapter extends FragmentPagerAdapter {
        public SectionPagerAdapter(FragmentManager fm, String pager){
            super(fm);
            setPager(pager);
        }

        String pager = "";

        public Fragment getItem(int position)
        {
            switch(pager) {
                case "venison":
                    //name weight value description regen val
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Venison", 2, 5, "raw piece of venison", 5, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Steak", 2, 10, "Venison steak, cooked to perfection", 10, "cooked");
                    }

                case "berries":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Berries", 2, 5, "Looks like it might be blueberries", 5, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Jelly", 3, 10, "Blue Jelly, hope its not poisonous", 10, "cooked");
                    }

                case "garbage":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Garbage", 2, -4, "A pile of trash, looks yummy!", -1, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Flaming Garbage", 1, -6, "That yummy trash from before, now with extra flames!", -5, "cooked");
                    }

                case "noodle":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Noodles", 2, 3, "Raw ramen, you feel like a college student", 2, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Cooked Noodles", 1, -2, "Cooked ramen but now with a side of $40,000 in debt!", 5, "cooked");
                    }

                case "apple":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Apple", 2, 3, "An apple a day...", 5, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Apple Crisp", 5, 10, "Delicious apple crisp!", 15, "cooked");
                    }

                case "beef":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Beef", 2, 5, "Looks like it might be some beef", 5, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Beef", 4, 15, "mmm...Looks Delicious", 10, "cooked");
                    }

                case "egg":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Egg", 2, 3, "Raw egg, doesn't look rotten.", 3, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Boiled Egg", 2, 5, "A boiled egg.", 5, "cooked");
                    }

                case "momsSpaghetti":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Mom's Spaghetti", 40, 1, "It's Mom's Spaghetti! Knees weak arms are heavy! Never forgetti!", 10, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Mom's Refried Spaghetti", 5, 10, "It's still Mom's Spaghetti, but refried! Never forgetti!", 11, "cooked");
                    }

                case "rawBacon":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Raw Bacon", 10, 10, "a bunch of Raw Bacon", 8, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Cooked Bacon", 10, 15, "a bunch of Cooked Bacon", 20, "cooked");
                    }

                case "frozenTVDinner":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Frozen Meal", 3, 4, "A TV dinner. Somehow still frozen.", 5, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("TV Dinner - Cooked", 3, 5, "A TV dinner that you have cooked.", 10, "cooked");
                    }

                case "roadkill":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Roadkill", 2, 5, "A piece of roadkill. It is covered in a gross slime.", 5, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Extra dead roadkill", 2, 10, "A less slimy, more dead version of the roadkill you had before.", 10, "cooked");
                    }

                case "chicken":
                    switch (position)
                    {
                        case 1:
                            return ViewPagerContentFragment.newInstance("Raw Chicken", 2, 5, "Uncooked slimey Chicken!", 10, "raw");
                        case 0:
                            return ViewPagerContentFragment.newInstance("Some oily KFC", 2, 10, "KFC, deep fried to perfection!", 10, "cooked");
                    }

                default: return ViewPagerContentFragment.newInstance("Berries", 2, 5, "Looks like it might be blueberries", 5, "raw");
            }
        }

        public void setPager(String pager)
        {
            this.pager = pager;
        }
        public int getCount(){
            return 2;
        }
    }
}
