package com.example.testtab.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.testtab.R;

public class MessageFragment extends Fragment implements AdapterView.OnItemClickListener {
    private int position;
   // private ListView listView;
    // private List<Item> itemList;
   private String[] data = {"21","22","32","24","25","26","27","28","29","返回"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this.getContext(), android.R.layout.simple_list_item_1,data);
        ListView listView = view.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        // 单击监听
        listView.setOnItemClickListener(this);

        return view;
      //  listView = view.findViewById(R.id.item_container);
        // 单击监听
       // listView.setOnItemClickListener(this);


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