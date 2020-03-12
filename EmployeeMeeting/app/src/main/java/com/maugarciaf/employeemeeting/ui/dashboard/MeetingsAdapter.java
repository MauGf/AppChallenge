package com.maugarciaf.employeemeeting.ui.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maugarciaf.employeemeeting.R;

import java.util.List;

public class MeetingsAdapter extends RecyclerView.Adapter<MeetingsAdapter.MeetingViewHolder> {

    Context context;
    List<Meetings> meetingsList;

    public MeetingsAdapter(Context context, List<Meetings> meetingsList) {
        this.context = context;
        this.meetingsList = meetingsList;
    }

    @NonNull
    @Override
    public MeetingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_items_meetings,parent, false);
        return new MeetingViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MeetingViewHolder holder, int position) {

        holder.nameTex.setText(meetingsList.get(position).getNameEmploye());
       // holder.hoursText.setText(meetingsList.get(position).getMeetingHours());
    }

    @Override
    public int getItemCount() {
        return meetingsList.size();
    }

    public class MeetingViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTex, hoursText;
        public MeetingViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTex = itemView.findViewById(R.id.nameTexID);
            hoursText = itemView.findViewById(R.id.meetingsHourss);

        }
    }
}
