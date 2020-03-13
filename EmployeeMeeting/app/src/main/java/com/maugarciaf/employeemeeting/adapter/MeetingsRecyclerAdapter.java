package com.maugarciaf.employeemeeting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.maugarciaf.employeemeeting.R;
import com.maugarciaf.employeemeeting.model.MeetingsPojo;

import java.util.List;

import me.gujun.android.taggroup.TagGroup;

public class MeetingsRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE = 1;
    private final Context context;
    private final List<Object> listRecyclerItem;

    public MeetingsRecyclerAdapter(Context context, List<Object> listRecyclerItem) {
        this.context = context;
        this.listRecyclerItem = listRecyclerItem;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        TagGroup meetingTime1;

        public ItemViewHolder(@NonNull View itemView) {
            super (itemView);
            name = (TextView) itemView.findViewById (R.id.nameTexID);
            meetingTime1 = (TagGroup) itemView.findViewById (R.id.meetings);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case TYPE:
            default:
                View layoutView = LayoutInflater.from (viewGroup.getContext ()).inflate (
                        R.layout.row_items_meetings, viewGroup, false);

                return new ItemViewHolder ((layoutView));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        int viewType = getItemViewType (i);

        switch (viewType) {
            case TYPE:
            default:

                ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
                MeetingsPojo meetingsPojo = (MeetingsPojo) listRecyclerItem.get (i);

                itemViewHolder.name.setText (meetingsPojo.getName ());
                itemViewHolder.meetingTime1.setTags (new String[]{meetingsPojo.getMeeting1 (), meetingsPojo.getMeeting2 (), meetingsPojo.getMeeting3 (), meetingsPojo.getMeeting4 (), meetingsPojo.getMeeting5 ()});
                //holder.tagGroup.setTags(new String[]{"10:20 AM", "01:20 PM", "04:20 PM","07:20 PM","10:20 PM"});

        }
    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size ();
    }
}