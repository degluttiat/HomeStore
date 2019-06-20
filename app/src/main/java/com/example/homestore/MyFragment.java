package com.example.homestore;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyFragment extends Fragment {

    public static final String ARGUMENT_PAGE_NUMBER = "ARGUMENT_PAGE_NUMBER";

    public static MyFragment newInstance(int position) {
        MyFragment fragment = new MyFragment();

        Bundle arguments = new Bundle();
        arguments.putInt(ARGUMENT_PAGE_NUMBER, position);
        fragment.setArguments(arguments);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.content);

        boolean isPortrait = getResources().getConfiguration().orientation
                == Configuration.ORIENTATION_PORTRAIT;

        LinearLayoutManager manager = new
                LinearLayoutManager(getContext(),
                isPortrait ? LinearLayoutManager.VERTICAL :
                        LinearLayoutManager.HORIZONTAL,
                false);

        recyclerView.setLayoutManager(manager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getText());
        recyclerView.setAdapter(adapter);

        /*int position = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
        TextView textView = rootView.findViewById(R.id.text);
        textView.setText("Position: " + position);*/

        return rootView;
    }

    public ArrayList<HomeClass> getText() {
        ArrayList<HomeClass> list = new ArrayList<>();
        list.add(new HomeClass("abs"));
        list.add(new HomeClass("abs"));
        list.add(new HomeClass("abs"));
        list.add(new HomeClass("abs"));
        list.add(new HomeClass("abs"));
        list.add(new HomeClass("abs"));
        list.add(new HomeClass("abs"));
        return list;
    }
}
