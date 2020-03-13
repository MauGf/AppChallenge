package com.maugarciaf.employeemeeting.ui.timefree;

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
import com.maugarciaf.employeemeeting.adapter.FreeTimeRecyclerAdapter;
import com.maugarciaf.employeemeeting.model.EmployeeTimeClass;

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

public class FreeTimeFragment extends Fragment {

    private List<Object> employeeList = new ArrayList<> ();
    private static final String TAG = "MainActivity";

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_timefree, container, false);

        RecyclerView recyclerView = root.findViewById (R.id.showtimes_recycleview);
        recyclerView.setHasFixedSize (true);
        recyclerView.setLayoutManager (new LinearLayoutManager (getActivity ()));

        FreeTimeRecyclerAdapter mAdapter2 = new FreeTimeRecyclerAdapter (getActivity (), employeeList);
        recyclerView.setAdapter (mAdapter2);

        addItemsFromJSON2 ();
        return root;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void addItemsFromJSON2() {
        try {

            String jsonDataString = readJSONDataFromFile2 ();
            JSONArray jsonArray = new JSONArray (jsonDataString);

            for (int i = 0; i < jsonArray.length (); ++i) {

                JSONObject itemObj2 = jsonArray.getJSONObject (i);

                String time = itemObj2.getString ("time");
                String employee1 = itemObj2.getString ("employee1");
                String employee2 = itemObj2.getString ("employee2");
                String employee3 = itemObj2.getString ("employee3");
                String employee4 = itemObj2.getString ("employee4");
                String employee5 = itemObj2.getString ("employee5");
                String employee6 = itemObj2.getString ("employee6");

              EmployeeTimeClass employeeTimeClass = new EmployeeTimeClass (time, employee1, employee2, employee3, employee4, employee5,employee6);
                employeeList.add (employeeTimeClass );
            }

        } catch (JSONException | IOException e) {
            Log.d (TAG, "addItemsFromJSON: ", e);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private String readJSONDataFromFile2() throws IOException {

        InputStream inputStream = null;
        StringBuilder builder = new StringBuilder ();
        try {
            String jsonString = null;
            inputStream = Objects.requireNonNull (getContext ()).getAssets ().open ("ouput.json");
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
