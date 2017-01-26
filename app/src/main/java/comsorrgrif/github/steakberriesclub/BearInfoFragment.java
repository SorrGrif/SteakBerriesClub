package comsorrgrif.github.steakberriesclub;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BearInfoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BearInfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BearInfoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ListView bearInfoListView;
    ArrayList<BearInfo> infoList;

    private OnFragmentInteractionListener mListener;

    public BearInfoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BearInfoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BearInfoFragment newInstance(String param1, String param2) {
        BearInfoFragment fragment = new BearInfoFragment();
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
        View view = inflater.inflate(R.layout.fragment_bear_info, container, false);

        infoList = new ArrayList<>();
        addItems();

        bearInfoListView = (ListView) view.findViewById(R.id.InfoListView);
        CustomAdapter c = new CustomAdapter(getContext(), infoList);
        bearInfoListView.setAdapter(c);
        return view;
    }

    private void addItems()
    {
        String[] titles = {"Bear Damage",
                "Bear Size",
                "Bear Scaryness",
                "Bear Mortality Rate",
                "Bear Family"};
        String[] descritpion = {"Too much for you to handle",
                "Bigger than a bear that was exposed to radiation",
                "You will literally soil your pants when you see this bear",
                "The bear doesnt die... but you do",
                "Some say the bear has family... lets hope it doesnt"};

        for(int i = 0; i < titles.length; i++)
        {
            infoList.add(i,new BearInfo(titles[i], descritpion[i]));
        }

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

    public class CustomAdapter extends ArrayAdapter<BearInfo> {


        public CustomAdapter(Context context, ArrayList<BearInfo> infoArrayList) {
            super(context, 0 , infoArrayList);
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            BearInfo info = getItem(position);

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.bear_info_content, parent, false);

            TextView title = (TextView) convertView.findViewById(R.id.TitleLabel);
            title.setText(info.getTitle());

            TextView description = (TextView) convertView.findViewById(R.id.DescriptionLabel);
            description.setText(info.getDescription());

            return convertView;
        }
    }

}
