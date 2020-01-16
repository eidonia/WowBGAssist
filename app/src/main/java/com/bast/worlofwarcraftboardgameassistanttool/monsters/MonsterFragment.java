package com.bast.worlofwarcraftboardgameassistanttool.monsters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.bast.worlofwarcraftboardgameassistanttool.cards.Monsters;
import com.bast.worlofwarcraftboardgameassistanttool.dataBase.CardApiService;
import com.bast.worlofwarcraftboardgameassistanttool.databinding.FragmentMonsterBinding;
import com.bast.worlofwarcraftboardgameassistanttool.di.Di;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MonsterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MonsterFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private String mParam1;

    FragmentMonsterBinding binding;
    CardApiService apiService;
    List<Monsters> mMonsters;
    Monsters monster;

    public static MonsterFragment newInstance(String param1) {
        MonsterFragment fragment = new MonsterFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        apiService = Di.getCardApiService();
        mMonsters = apiService.getMonsters();
        monster = mMonsters.get(getActivity().getIntent().getIntExtra("POSMON", 0));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMonsterBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        mParam1 = getArguments().getString(ARG_PARAM1);
        makeView(mParam1);
        binding.textDescMon.setText(monster.getDescription());
        return view;
    }

    public void makeView(String param) {
        if (param == "Green") {
            createView(monster.getGreenMonsters(), monster.getGreenThreat(), monster.getGreenAttack(), monster.getGreenHealth());
        } else if (param == "Red") {
            createView(monster.getRedMonsters(), monster.getRedThreat(), monster.getRedAttack(), monster.getRedHealth());
        } else {
            createView(monster.getBlueMonsters(), monster.getBlueThreat(), monster.getBlueAttack(), monster.getBlueHealth());
        }

    }

    public void createView(int imgMonster, int textThreat, int textAttack, int textHealth) {
        binding.imgMonster.setImageResource(imgMonster);
        binding.Threat.setText(textThreat);
        binding.Attack.setText(textAttack);
        binding.Health.setText(textHealth);
    }
}
