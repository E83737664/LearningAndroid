package com.example.testtab.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.testtab.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IssuesFragment extends Fragment implements AdapterView.OnItemClickListener {
    private int position;

   private String[] data = {"1","2","3","4","5","6","7","8","9","返回"};


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_issues, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this.getContext(), android.R.layout.simple_list_item_1,data);
        ListView listView = view.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        // 单击监听
        listView.setOnItemClickListener(this);

        return view;
    }


    //单击事件，进入addItem
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Intent intent = new Intent(getContext(), AddItemActivity.class);
//        intent.putExtra("isNew", false);
//        intent.putExtra("id", itemList.get(position).getId());
//        startActivity(intent);
        Log.d("单击：", String.valueOf(position));
    }




}


