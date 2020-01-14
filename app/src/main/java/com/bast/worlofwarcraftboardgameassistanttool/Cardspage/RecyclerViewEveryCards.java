package com.bast.worlofwarcraftboardgameassistanttool.Cardspage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.bast.worlofwarcraftboardgameassistanttool.Cards.Stuff;
import com.bast.worlofwarcraftboardgameassistanttool.R;
import com.github.chrisbanes.photoview.PhotoViewAttacher;

import java.util.List;

public class RecyclerViewEveryCards extends RecyclerView.Adapter<RecyclerViewEveryCards.MyViewHolder> {

    private final List<Stuff> mCards;
    Context mContext;


    public RecyclerViewEveryCards(List<Stuff> mCards, Context context) {
        this.mCards = mCards;
        this.mContext = context;
    }

    @Override
    public RecyclerViewEveryCards.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewEveryCards.MyViewHolder holder, int position) {
        Stuff stuff = mCards.get(position);
        holder.image.setImageResource(stuff.getCardImage());
    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        ImageView imgExpan;

        public MyViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imgCards);
            imgExpan = itemView.findViewById(R.id.imgExpan);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int itemPos = getLayoutPosition();
                    Context ctx = v.getContext();
                    Intent intent = new Intent(ctx, CardPagesDesc.class);
                    intent.putExtra("POS", itemPos);
                    ctx.startActivity(intent);
                }
            });

            itemView.setOnLongClickListener(new View.OnLongClickListener(){

                @Override
                public boolean onLongClick(View v) {
                    int itemPos = getLayoutPosition();
                    showImage(itemPos);
                    return false;
                }
            });
        }

        public void showImage(int itemPos){
            Dialog builder = new Dialog(mContext);
            builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
            builder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {

                }
            });

            ImageView image = new ImageView(mContext);
            image.setImageResource(mCards.get(itemPos).getCardImage());
            builder.addContentView(image, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            builder.show();
        }

    }


}
