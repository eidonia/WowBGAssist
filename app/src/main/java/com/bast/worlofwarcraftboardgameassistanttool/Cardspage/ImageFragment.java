package com.bast.worlofwarcraftboardgameassistanttool.Cardspage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bast.worlofwarcraftboardgameassistanttool.Cards.Stuff;
import com.bast.worlofwarcraftboardgameassistanttool.DataBase.CardApiService;
import com.bast.worlofwarcraftboardgameassistanttool.Di.Di;
import com.bast.worlofwarcraftboardgameassistanttool.databinding.FragmentImageBinding;

import java.util.List;

public class ImageFragment extends Fragment {

    List<Stuff> mCards;
    CardApiService apiService;
    Stuff stuff;
    FragmentImageBinding binding;


    public static Fragment newInstance() {
        ImageFragment fragment = new ImageFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getActivity().getIntent();
        int itemPos = intent.getIntExtra("POS",0);
        apiService = Di.getCardApiService();
        mCards = apiService.getCards();
        stuff = mCards.get(itemPos);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentImageBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        Context context = view.getContext();
        binding.imgCard.setImageResource(stuff.getCardImage());

        return view;




    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
