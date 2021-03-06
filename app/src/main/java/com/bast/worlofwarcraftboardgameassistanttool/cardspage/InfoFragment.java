package com.bast.worlofwarcraftboardgameassistanttool.cardspage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bast.worlofwarcraftboardgameassistanttool.cards.Stuff;
import com.bast.worlofwarcraftboardgameassistanttool.dataBase.CardApiService;
import com.bast.worlofwarcraftboardgameassistanttool.databinding.FragmentInfoBinding;
import com.bast.worlofwarcraftboardgameassistanttool.di.Di;

import java.util.List;

public class InfoFragment extends Fragment{

    List<Stuff> mCards;
    CardApiService apiService;
    Stuff stuff;
    FragmentInfoBinding binding;

    public static Fragment newInstance() {
        InfoFragment fragment = new InfoFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getActivity().getIntent();
        int itemPos = intent.getIntExtra("POS", 0);
        apiService = Di.getCardApiService();
        mCards = apiService.getCards();
        stuff = mCards.get(itemPos);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentInfoBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.title.setText(stuff.getName());
        binding.textLvl.setText(stuff.getLevelRequired());
        binding.textPrice.setText(stuff.getintCostStuff());
        binding.textEnergy.setText(stuff.getintEnergyStuff());
        binding.textType.setText(stuff.getTypeStuff());
        binding.textDesc.setText(stuff.getDescription());
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
