package com.bast.worlofwarcraftboardgameassistanttool.monsters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bast.worlofwarcraftboardgameassistanttool.R;
import com.bast.worlofwarcraftboardgameassistanttool.cards.Monsters;

import java.util.List;

public class MonsterRViewAdapter extends RecyclerView.Adapter<MonsterRViewAdapter.ViewHolder> {

    List<Monsters> mMonsters;

    public MonsterRViewAdapter(List<Monsters> mMonsters) {
        this.mMonsters = mMonsters;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.monsters_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Monsters monster = mMonsters.get(position);
        holder.imgMonsters.setImageResource(monster.getBlueMonsters());
        holder.textMonsters.setText(monster.getName());

    }

    @Override
    public int getItemCount() {
        return mMonsters.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMonsters;
        TextView textMonsters;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMonsters = itemView.findViewById(R.id.imgMonsters);
            textMonsters = itemView.findViewById(R.id.textMonsters);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int itemPos = getLayoutPosition();
                    Context ctx = v.getContext();
                    Intent intent = new Intent(ctx, MonstersPage.class);
                    intent.putExtra("POSMON", itemPos);
                    ctx.startActivity(intent);
                }
            });
        }
    }
}
