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

public class MeetingsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE = 1;
    private final Context context;
    private final List<Object> listRecyclerItem;

    public MeetingsAdapter(Context context, List<Object> listRecyclerItem) {
        this.context = context;
        this.listRecyclerItem = listRecyclerItem;
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView meetingTime;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.nameTexID);
            meetingTime = (TextView) itemView.findViewById(R.id.meetingsHourss);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case TYPE:
            default:
                View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                        R.layout.row_items_meetings, viewGroup, false);

                return new ItemViewHolder((layoutView));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        int viewType = getItemViewType(i);

        switch (viewType) {
            case TYPE:
            default:

                ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
                Meetings meetings = (Meetings) listRecyclerItem.get(i);

                itemViewHolder.name.setText(meetings.getNameEmploye());
                itemViewHolder.meetingTime.setText(meetings.getMeetingHours());
        }

    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size();
    }
}