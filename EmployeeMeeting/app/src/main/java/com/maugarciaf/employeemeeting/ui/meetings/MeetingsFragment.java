package com.maugarciaf.employeemeeting.ui.meetings;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.maugarciaf.employeemeeting.R;
import com.maugarciaf.employeemeeting.adapter.MeetingsRecyclerAdapter;
import com.maugarciaf.employeemeeting.model.MeetingsClass;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class MeetingsFragment extends Fragment {

    private List<Object> meetingsList = new ArrayList<> ();
    private static final String TAG = "MainActivity";

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate (R.layout.fragment_meetings, container, false);

        RecyclerView recyclerView = root.findViewById (R.id.showtime_recycleview);
        recyclerView.setHasFixedSize (true);
        recyclerView.setLayoutManager (new LinearLayoutManager (getActivity ()));

        MeetingsRecyclerAdapter mAdapter = new MeetingsRecyclerAdapter (getActivity (), meetingsList);
        recyclerView.setAdapter (mAdapter);
        addItemsFromJSON ();

        return root;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void addItemsFromJSON() {
        try {

            String jsonDataString = readJSONDataFromFile ();
            JSONArray jsonArray = new JSONArray (jsonDataString);

            for (int i = 0; i < jsonArray.length (); ++i) {

                JSONObject itemObj = jsonArray.getJSONObject (i);

                String name = itemObj.getString ("name");
                String meetingTime1 = itemObj.getString ("meeting1");
                String meetingTime2 = itemObj.getString ("meeting2");
                String meetingTime3 = itemObj.getString ("meeting3");
                String meetingTime4 = itemObj.getString ("meeting4");
                String meetingTime5 = itemObj.getString ("meeting5");

                MeetingsClass meetingsClass = new MeetingsClass (name, meetingTime1, meetingTime2, meetingTime3, meetingTime4, meetingTime5);
                meetingsList.add (meetingsClass);
            }

        } catch (JSONException | IOException e) {
            Log.d (TAG, "addItemsFromJSON: ", e);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private String readJSONDataFromFile() throws IOException {

        InputStream inputStream = null;
        StringBuilder builder = new StringBuilder ();
        try {
            String jsonString = null;
            inputStream = Objects.requireNonNull (getContext ()).getAssets ().open ("input.json");
            BufferedReader bufferedReader = new BufferedReader (
                    new InputStreamReader (inputStream, StandardCharsets.UTF_8));

            while ((jsonString = bufferedReader.readLine ()) != null) {
                builder.append (jsonString);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close ();
            }
        }
        return new String (builder);
    }
}
