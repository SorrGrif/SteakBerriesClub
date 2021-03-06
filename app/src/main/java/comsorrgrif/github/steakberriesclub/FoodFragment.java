package comsorrgrif.github.steakberriesclub;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FoodFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FoodFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4 = "param4";
    private static final String ARG_PARAM5 = "param5";
    private static final String ARG_PARAM6 = "param6";

    // TODO: Rename and change types of parameters
    private String foodString;
    private String descriptionString;
    private int valueString;
    private int regenValueString;
    private int weightString;

    TextView food;
    TextView description;
    TextView name;
    TextView value;
    TextView regenValue;
    TextView weight;

    LinearLayout backgroundLayout;

    Boolean isRaw;


    private OnFragmentInteractionListener mListener;

    public FoodFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FoodFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FoodFragment newInstance(String param1,
                                                       int param2,
                                                       int param3,
                                                       String param4,
                                                       int param5,
                                                       String param6) {
        FoodFragment fragment = new FoodFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        args.putInt(ARG_PARAM3, param3);
        args.putString(ARG_PARAM4, param4);
        args.putInt(ARG_PARAM5, param5);
        args.putString(ARG_PARAM6, param6);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            foodString = getArguments().getString(ARG_PARAM1);
            weightString = getArguments().getInt(ARG_PARAM2);
            valueString = getArguments().getInt(ARG_PARAM3);
            descriptionString = getArguments().getString(ARG_PARAM4);
            regenValueString = getArguments().getInt(ARG_PARAM5);
            regenValueString = getArguments().getInt(ARG_PARAM5);
            if(getArguments().getString(ARG_PARAM6).equals("raw"))
            {
                isRaw = true;
            }
            else
            {
                isRaw = false;
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view_pager_content, container, false);

        food = (TextView) view.findViewById(R.id.Food);
        description = (TextView) view.findViewById(R.id.Description);
        name = (TextView) view.findViewById(R.id.NameValue);
        value = (TextView) view.findViewById(R.id.ValueValue);
        regenValue = (TextView) view.findViewById(R.id.RegenValueValue);
        weight = (TextView) view.findViewById(R.id.WeightValue);

        food.setText(foodString);
        description.setText(descriptionString);
        name.setText(foodString);
        value.setText(valueString + "");
        regenValue.setText(regenValueString + "");
        weight.setText(weightString + "");

        backgroundLayout = (LinearLayout) view.findViewById(R.id.BackgroudLayout);

        if(isRaw) backgroundLayout.setBackgroundResource(R.drawable.cookedarrow);
        else backgroundLayout.setBackgroundResource(R.drawable.rawarrow);

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

    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

        ViewPager viewPager;
        ViewPagerAdapter pagerAdapter;
        Context context;
        View view;
        ViewHolder viewHolder;
        String[] foodTypes =
                {
                        "venison",
                        "berries",
                        "garbage",
                        "noodle",
                        "apple",
                        "beef",
                        "egg",
                        "momsSpaghetti",
                        "rawBacon",
                        "frozenTVDinner",
                        "roadkill",
                        "chicken",

                };

        public RecyclerViewAdapter(Context context){

            this.context = context;
        }

        public class ViewHolder extends RecyclerView.ViewHolder{

            //public TextView textView;

            public ViewHolder(View v){

                super(v);

                //viewPager = (ViewPager) view.findViewById(R.id.MainPager);

                pagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), foodTypes[0]);
                viewPager.setAdapter(pagerAdapter);
                viewPager.setCurrentItem(1);

            }
        }

        @Override
        public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

            view = LayoutInflater.from(context).inflate(R.layout.fragment_view_pager,parent,false);

            viewHolder = new ViewHolder(view);

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position){


        }

        @Override
        public int getItemCount(){

            return foodTypes.length - 1;
        }
    }
}
