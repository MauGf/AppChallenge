package com.maugarciaf.employeemeeting.ui.timefree;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.maugarciaf.employeemeeting.R;
import com.maugarciaf.employeemeeting.adapter.FreeTimeRecyclerAdapter;
import com.maugarciaf.employeemeeting.model.ShowTimeModalClass;

import java.util.ArrayList;

public class FreeTimeFragment extends Fragment {

    RecyclerView showtime_recycleview;
    FreeTimeRecyclerAdapter freeTime_recycleviewAdapter;
    private ArrayList<ShowTimeModalClass> classArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_meetings, container, false);

        showtime_recycleview = (RecyclerView) root.findViewById(R.id.showtime_recycleview);


        classArrayList = new ArrayList<>();
        classArrayList.add(new ShowTimeModalClass("Cinepolis: Inorbit Vadodara Mall copy"));
        classArrayList.add(new ShowTimeModalClass("INOX : 7 Seas Mall | Fatehgunj"));
        classArrayList.add(new ShowTimeModalClass("Cinepolis: Inorbit Vadodara Mall copy"));
        classArrayList.add(new ShowTimeModalClass("INOX : 7 Seas Mall | Fatehgunj"));
        classArrayList.add(new ShowTimeModalClass("Cinepolis: Inorbit Vadodara Mall copy"));
        classArrayList.add(new ShowTimeModalClass("INOX : 7 Seas Mall | Fatehgunj"));


        freeTime_recycleviewAdapter = new FreeTimeRecyclerAdapter (getActivity (),classArrayList);

        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager (getActivity ());
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getContext (), LinearLayoutManager.VERTICAL, false);
        showtime_recycleview.setLayoutManager(layoutManager2);
        showtime_recycleview.setAdapter(freeTime_recycleviewAdapter);
        return root;
    }
}
