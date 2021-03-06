package com.example.finals_mp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    RecyclerAdapter recyclerAdapter;
    public ListFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.list_fragment, container, false);

          recyclerView=view.findViewById(R.id.recyclerView);
          layoutManager=new LinearLayoutManager(getActivity());
          recyclerView.setLayoutManager(layoutManager);
          List<Person> list=MainActivity.roomDatabaseClass.personDao().getPerson();
          recyclerAdapter= new RecyclerAdapter(list);
          recyclerView.setAdapter(recyclerAdapter);
          return view;
    }
}