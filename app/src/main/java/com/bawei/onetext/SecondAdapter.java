package com.bawei.onetext;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

/**
 * Created by Bonnenu1t丶 on 2017/6/11.
 */

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder>{
    private List<Beans> list;
    private Context context;
    public SecondAdapter(List<Beans> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public SecondAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context,R.layout.item2, null);

        ViewHolder holder = new ViewHolder(view);
        ViewGroup.LayoutParams layoutParams = holder.image2.getLayoutParams();
        Random random=new Random();
        int i = random.nextInt(400)+100;
        layoutParams.height=i;
        holder.image2.setLayoutParams(layoutParams);
        return holder;
    }

    @Override
    public void onBindViewHolder(SecondAdapter.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.title.setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size(): 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView image2;
        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.b_title);
            image2 = (ImageView) itemView.findViewById(R.id.image2);
        }
    }
}
