package com.naresh.tablayoutandfragments.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.naresh.tablayoutandfragments.R;
import com.naresh.tablayoutandfragments.adapter.ContactsAdapters;

import java.util.ArrayList;
import java.util.List;

import model.Contacts;


public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=root.findViewById(R.id.recyclerView);
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Om","11111111",R.drawable.char1));
        contactsList.add(new Contacts("Krishna","2222222",R.drawable.char2));
        contactsList.add(new Contacts("Sanjeev","33333333",R.drawable.budha));
        contactsList.add(new Contacts("Gauri","4444444",R.drawable.dayahang));
        contactsList.add(new Contacts("Subarna","5555555",R.drawable.gurung));
        contactsList.add(new Contacts("Muskaan","6666666",R.drawable.prithvi));
        contactsList.add(new Contacts("Samyam","7777777",R.drawable.rajesh));
        contactsList.add(new Contacts("Maneesh","8888888",R.drawable.spiderman));
        contactsList.add(new Contacts("Hari","9999999",R.drawable.char2));
        contactsList.add(new Contacts("Ashok","1000000",R.drawable.char1));
        contactsList.add(new Contacts("Raja","100000001",R.drawable.rajesh));
        contactsList.add(new Contacts("Abishek","10000002",R.drawable.prithvi));
        contactsList.add(new Contacts("Sajik","100000003",R.drawable.dayahang));
        ContactsAdapters contactsAdapter = new ContactsAdapters(getActivity(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }
}