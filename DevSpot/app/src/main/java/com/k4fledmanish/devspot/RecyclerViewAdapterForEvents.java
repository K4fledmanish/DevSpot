package com.k4fledmanish.devspot;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapterForEvents extends RecyclerView.Adapter<RecyclerViewAdapterForEvents.MyEventViewHolder> {


    private Context evContext;

    private List<Event> evData;


    public RecyclerViewAdapterForEvents(Context evContext, List<Event> evData) {
        this.evContext = evContext;
        this.evData = evData;
    }



    @NonNull
    @Override
    public MyEventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view;
        LayoutInflater mInflater = LayoutInflater.from(evContext);
        view = mInflater.inflate(R.layout.cardview_item_event,parent,false);

        return new MyEventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyEventViewHolder holder, final int position) {


        holder.tv_event_title.setText(evData.get(position).getTitle());
        holder.img_event_thumbnail.setImageResource(evData.get(position).getThumbnail());

        // Setting click listener

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(evContext,EventActivity.class);
                intent.putExtra("EventTitle",evData.get(position).getTitle());
                intent.putExtra("Description",evData.get(position).getDescription());
                intent.putExtra("Thumbnail",evData.get(position).getThumbnail());

                // start the activity

                evContext.startActivity(intent);


            }
        });



    }

    @Override
    public int getItemCount() {
        return evData.size();
    }

    public static class MyEventViewHolder extends RecyclerView.ViewHolder{


        TextView tv_event_title;
        ImageView img_event_thumbnail;
        CardView cardView;


        public MyEventViewHolder(View itemView){
            super(itemView);


            tv_event_title = (TextView) itemView.findViewById(R.id.event_title_id);
            img_event_thumbnail = (ImageView) itemView.findViewById(R.id.event_img_id);
            cardView = (CardView) itemView.findViewById(R.id.eventviewcard_id);

        }
    }


}
