package comsorrgrif.github.steakberriesclub;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BeveragesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BeveragesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BeveragesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    FragmentManager fm;
    FragmentTransaction ft;

    private OnFragmentInteractionListener mListener;

    public BeveragesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BeveragesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BeveragesFragment newInstance(String param1, String param2) {
        BeveragesFragment fragment = new BeveragesFragment();
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

    /**
     * this initializes a fragment manager and fragment transaction
     * each time you commit a transaction you must overwrite the old transaction with a new
     * fragment manager begin transaction
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beverages, container, false);

        //initializing the fragment manager and fragment transaction
        fm = getActivity().getSupportFragmentManager();
        ft = fm.beginTransaction();

        //replace the frame layout with each drink item
        ft.replace(R.id.AppleJuiceLayout, ViewPagerContentFragment.newInstance("Juice", 2, 10, "a juice box ", 10, "beverage"));
        ft.commit();
        //make a new transaction after you commit a previous one
        ft = fm.beginTransaction();

        ft.replace(R.id.DeerUrineLayout, ViewPagerContentFragment.newInstance("Deer Urine", 2, 5, "A bottle of Deer urine you harvested from a dead deer's bladder. It is slightly fermented.", 5, "beverage"));
        ft.commit();
        ft = fm.beginTransaction();

        ft.replace(R.id.MoonshineLayout, ViewPagerContentFragment.newInstance("Moonshine", 2, 10, "It looks like moonshine", 10, "beverage"));
        ft.commit();
        ft = fm.beginTransaction();

        ft.replace(R.id.MountainDewLayout, ViewPagerContentFragment.newInstance("Mountain Dew", 4, 10, "Mountain Dew baby!", 3, "beverage"));
        ft.commit();
        ft = fm.beginTransaction();

        ft.replace(R.id.RiverWaterLayout, ViewPagerContentFragment.newInstance("River Water", 2, 5, "Some water you found in a river.", 10, "beverage"));
        ft.commit();

        return view;
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
}
