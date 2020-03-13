package com.maugarciaf.employeemeeting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maugarciaf.employeemeeting.R;
import com.maugarciaf.employeemeeting.model.EmployeeTimeClass;


import java.util.List;

import me.gujun.android.taggroup.TagGroup;

public class FreeTimeRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private static final int TYPE = 2;
    private final List<Object> listRecyclerItem;

    public FreeTimeRecyclerAdapter (Context context, List<Object> listRecyclerItem2) {
        this.listRecyclerItem = listRecyclerItem2;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        private TextView time;
        TagGroup employees;


        ItemViewHolder(@NonNull View itemView) {
            super (itemView);
            time = (TextView) itemView.findViewById (R.id.time);
            employees = (TagGroup) itemView.findViewById (R.id.employees);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case TYPE:
            default:
                View layoutView = LayoutInflater.from (viewGroup.getContext ()).inflate (
                        R.layout.row_items_freetime, viewGroup, false);

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
                EmployeeTimeClass employeeTimeClass = (EmployeeTimeClass) listRecyclerItem.get (i);

                itemViewHolder.time.setText (employeeTimeClass.getTime ());
                itemViewHolder.employees.setTags (new String[]{employeeTimeClass.getEmployee1 (),employeeTimeClass.getEmployee2 (),employeeTimeClass.getEmployee3 (),employeeTimeClass.getEmployee4 (),employeeTimeClass.getEmployee5 (),employeeTimeClass.getEmployee6 ()});
          //holder.tagGroup.setTags(new String[]{"10:20 AM", "01:20 PM", "04:20 PM","07:20 PM","10:20 PM"});

        }
    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size ();
    }
}
