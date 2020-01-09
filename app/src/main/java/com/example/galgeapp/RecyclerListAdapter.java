package com.example.galgeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerListAdapter extends RecyclerView.Adapter<RecyclerListAdapter.ViewHolder> {

    private ArrayList<String> mWord = new ArrayList<>();
    private ArrayList<String> mMistakes = new ArrayList<>();
    private Context mContext;

    public RecyclerListAdapter(ArrayList<String> mWord, ArrayList<String> mMistakes, Context mContext) {
        this.mWord = mWord;
        this.mMistakes = mMistakes;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.word.setText(mWord.get(position));
        holder.mistakes.setText(mMistakes.get(position));

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Clicked on: " + mWord.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mWord.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView word;
        TextView mistakes;
        LinearLayout layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            word = itemView.findViewById(R.id.word);
            mistakes = itemView.findViewById(R.id.mistakes);
            layout = itemView.findViewById(R.id.listItemLayout);
        }
    }
}
