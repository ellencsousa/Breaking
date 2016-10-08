package com.breaking.breaking.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.breaking.breaking.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * Use the {@link Rota#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Rota extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    //private static final String ARG_SECTION_NUMBER = "section_number";

    //private int pos;


    public Rota() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment Rota.
     */
    public static Rota newInstance() {
        Rota fragment = new Rota();
        Bundle args = new Bundle();
        //args.putInt(ARG_SECTION_NUMBER, pos);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            //pos = getArguments().getInt(ARG_SECTION_NUMBER);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rota, container, false);
        //RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvListaPdvs);
        //DatabaseReference firebase = LibraryClass.getFirebase().child("users");
        Log.d("create view","passou pela rota");
        //PDVRecyclerAdapter adapter = new PDVRecyclerAdapter(PDV.class, android.R.layout.two_line_list_item,PDVViewHolder.class,firebase );
        //UserRecyclerAdapter adapter = new UserRecyclerAdapter(User.class,android.R.layout.two_line_list_item, UserViewHolder.class,firebase);
        //recyclerView.setAdapter(adapter);

        return view;
    }
    /*
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
    */
    @Override
    public void onDetach() {
        super.onDetach();
    }
}
