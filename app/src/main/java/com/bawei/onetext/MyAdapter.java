package com.bawei.onetext;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Beans> list;
    private Context context;
    private LayoutInflater inflater;

    public MyAdapter(List<Beans> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view1 = View.inflate(context, R.layout.item, null);
        //View view = inflater.inflate(R.layout.item, parent, false);
            ViewHolder holder = new ViewHolder(view1);
            return holder;

    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

            ViewHolder viewHolder = (ViewHolder) holder;
            viewHolder.title.setText(list.get(position).getTitle());
            viewHolder.date.setText(list.get(position).getCon());

        }


    @Override
    public int getItemCount() {
        return list != null ? list.size(): 0;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView date;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            date = (TextView) itemView.findViewById(R.id.date);
        }
    }


}
