package com.xander.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xander.platzigram.R;
import com.xander.platzigram.adapter.PictureAdapterRecyclerView;
import com.xander.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        showToolbar("", false, view);

        RecyclerView pictureRecycler = (RecyclerView) view.findViewById(R.id.pictureprofilerecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        pictureRecycler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity());
        pictureRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }
    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new  Picture("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQT5rJXAIkOuLberKBOLdK5HsD_Z7k8ipq9TOjisANMtQOVgK7XUF1sFE4", "Lamborghini Aventador", "4 dias", "2043 Me Gusta"));
        pictures.add(new  Picture("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTX3GfYhOV_IOtuVH-cXRoMX5yqAQ_z97Z5nxrHSyZtaKUeZFE9MA", "Lamborghini Murcielago", "10 dias", "2000 Me  Gusta"));
        pictures.add(new  Picture("http://jmvdesign.ca/wp-content/uploads/2015/01/AUDI-R9_jmvdesign.jpg", "Audi R9", "15 dias", "4000 Me Gusta"));
        pictures.add(new  Picture("http://buyersguide.caranddriver.com/media/assets/submodel/6956.jpg", "McLaren", "20 dias", "10000 Me Gusta"));
        return pictures;
    }


    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar =(Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);


    }

}
