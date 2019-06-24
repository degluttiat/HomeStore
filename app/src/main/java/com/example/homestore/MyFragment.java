package com.example.homestore;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getText());
        recyclerView.setAdapter(adapter);

        /*int position = getArguments().getInt(ARGUMENT_PAGE_NUMBER);
        TextView textView = rootView.findViewById(R.id.text);
        textView.setText("Position: " + position);*/

        return rootView;
    }

    public ArrayList<HomeClass> getText() {
        ArrayList<HomeClass> list = new ArrayList<>();
        list.add(new HomeClass(getString(R.string.breakfast1), getString(R.string.lunch1), getString(R.string.supper1)));
        list.add(new HomeClass(getString(R.string.breakfast2), getString(R.string.lunch2), getString(R.string.supper2)));
        list.add(new HomeClass(getString(R.string.breakfast3), getString(R.string.lunch3), getString(R.string.supper3)));
        list.add(new HomeClass(getString(R.string.breakfast4), getString(R.string.lunch4), getString(R.string.supper4)));
        list.add(new HomeClass(getString(R.string.breakfast5), getString(R.string.lunch5), getString(R.string.supper5)));
        list.add(new HomeClass(getString(R.string.breakfast6), getString(R.string.lunch6), getString(R.string.supper6)));
        list.add(new HomeClass(getString(R.string.breakfast7), getString(R.string.lunch7), getString(R.string.supper7)));
        list.add(new HomeClass(getString(R.string.breakfast8), getString(R.string.lunch8), getString(R.string.supper8)));
        list.add(new HomeClass(getString(R.string.breakfast9), getString(R.string.lunch9), getString(R.string.supper9)));
        list.add(new HomeClass(getString(R.string.breakfast10), getString(R.string.lunch10), getString(R.string.supper10)));
        list.add(new HomeClass(getString(R.string.breakfast11), getString(R.string.lunch11), getString(R.string.supper11)));
        list.add(new HomeClass(getString(R.string.breakfast12), getString(R.string.lunch12), getString(R.string.supper12)));
        list.add(new HomeClass(getString(R.string.breakfast13), getString(R.string.lunch13), getString(R.string.supper13)));
        list.add(new HomeClass(getString(R.string.breakfast14), getString(R.string.lunch14), getString(R.string.supper14)));

        return list;
    }
}
