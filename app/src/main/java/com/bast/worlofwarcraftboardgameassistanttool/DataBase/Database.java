package com.bast.worlofwarcraftboardgameassistanttool.DataBase;


import android.content.Context;

import com.bast.worlofwarcraftboardgameassistanttool.Cards.Cards;
import com.bast.worlofwarcraftboardgameassistanttool.Cards.Spell;
import com.bast.worlofwarcraftboardgameassistanttool.Cards.Stuff;
import com.bast.worlofwarcraftboardgameassistanttool.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Database {

    //Stuff(int ID, String Name, int CardImage, boolean stuffBase, String classStuffBase, String description, String levelRequired, String typeStuff, int imageCostStuff, int imageCostEnergyStuff, String stringCostStuff, String stringEnergyStuff)
    //Spell(int ID, String Name, int CardImage, String levelRequiredSpell, String Description, int imageCost, int imageEnergyCost, String stringCost, String stringEnergyCost)

    Context ctx;

    public List<Cards> CARDS = Arrays.asList(
            new Stuff(1, ctx.getResources().getString(R.string.AmuletOfProtection), R.drawable.chalice_amulet_of_protection, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.AmuletOfProtectionDesc), ctx.getResources().getString(R.string.AmuletOfProtectionLvl), ctx.getResources().getString(R.string.AmuletOfProtectionType), ctx.getResources().getString(R.string.AmuletOfProtectionCost), ctx.getResources().getString(R.string.AmuletOfProtectionEnergy)),
            new Stuff(2, ctx.getResources().getString(R.string.AnkhOfLife), R.drawable.chalice_ankh_of_life, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.AnkhOfLifeDesc), ctx.getResources().getString(R.string.AnkhOfLifeLvl), ctx.getResources().getString(R.string.AnkhOfLifeType), ctx.getResources().getString(R.string.AnkhOfLifeCost), ctx.getResources().getString(R.string.AnkhOfLifeEnergy)),
            new Stuff(3, ctx.getResources().getString(R.string.Archeus), R.drawable.chalice_archeus, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.ArcheusDesc), ctx.getResources().getString(R.string.ArcheusLvl), ctx.getResources().getString(R.string.ArcheusType), ctx.getResources().getString(R.string.AnkhOfLifeLvl), ctx.getResources().getString(R.string.AnkhOfLifeEnergy)),
            new Stuff(4, ctx.getResources().getString(R.string.AvengersBreastplate), R.drawable.chalice_avengers_breastplate, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.AvengersBreastplateDesc), ctx.getResources().getString(R.string.AvengersBreastplateLvl), ctx.getResources().getString(R.string.AvengersBreastplateType), ctx.getResources().getString(R.string.AvengersBreastplateCost), ctx.getResources().getString(R.string.AvengersBreastplateEnergy)),
            new Stuff(5, ctx.getResources().getString(R.string.BadMojoMask), R.drawable.chalice_bad_mojo_mask, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.BadMojoMaskDesc), ctx.getResources().getString(R.string.BadMojoMaskLvl), ctx.getResources().getString(R.string.BadMojoMaskType), ctx.getResources().getString(R.string.BadMojoMaskCost), ctx.getResources().getString(R.string.BadMojoMaskEnergy)),
            new Stuff(6, ctx.getResources().getString(R.string.BiznicksAccurascope), R.drawable.chalice_biznicks_accurascope, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.BiznicksAccurascopeDesc), ctx.getResources().getString(R.string.BiznicksAccurascopeLvl), ctx.getResources().getString(R.string.BiznicksAccurascopeType), ctx.getResources().getString(R.string.BiznicksAccurascopeCost), ctx.getResources().getString(R.string.BiznicksAccurascopeEnergy)),
            new Stuff(7, ctx.getResources().getString(R.string.Bloodrazor), R.drawable.chalice_bloodrazor, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.BloodrazorDesc), ctx.getResources().getString(R.string.BloodrazorLvl), ctx.getResources().getString(R.string.BloodrazorType), ctx.getResources().getString(R.string.BloodrazorCost), ctx.getResources().getString(R.string.BloodrazorEnergy)),
            new Stuff(8, ctx.getResources().getString(R.string.CannonballRunner), R.drawable.chalice_cannonball_runner, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.CannonballRunnerDesc), ctx.getResources().getString(R.string.CannonballRunnerLvl), ctx.getResources().getString(R.string.CannonballRunnerType), ctx.getResources().getString(R.string.CannonballRunnerCost), ctx.getResources().getString(R.string.CannonballRunnerEnergy)),
            new Stuff(9, ctx.getResources().getString(R.string.ColossalBagOfLoot), R.drawable.chalice_colossal_bag_of_loot, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.ColossalBagOfLootDesc), ctx.getResources().getString(R.string.ColossalBagOfLootLvl), ctx.getResources().getString(R.string.ColossalBagOfLootType), ctx.getResources().getString(R.string.ColossalBagOfLootCost), ctx.getResources().getString(R.string.ColossalBagOfLootEnergy)),
            new Stuff(10, ctx.getResources().getString(R.string.CowlOfHeroes), R.drawable.chalice_cowl_of_heroes, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.CowlOfHeroesDesc), ctx.getResources().getString(R.string.CowlOfHeroesLvl), ctx.getResources().getString(R.string.CowlOfHeroesType), ctx.getResources().getString(R.string.CowlOfHeroesCost), ctx.getResources().getString(R.string.CowlOfHeroesEnergy)),
            new Stuff(11, ctx.getResources().getString(R.string.CrestOfRetribution), R.drawable.chalice_crest_of_retribution, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.CrestOfRetributionDesc), ctx.getResources().getString(R.string.CrestOfRetributionLvl), ctx.getResources().getString(R.string.CrestOfRetributionType), ctx.getResources().getString(R.string.CrestOfRetributionCost), ctx.getResources().getString(R.string.CrestOfRetributionEnergy)),
            new Stuff(12, ctx.getResources().getString(R.string.CursedOozeJar), R.drawable.chalice_cursed_ooze_jar, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.CursedOozeJarDesc), ctx.getResources().getString(R.string.CursedOozeJarLvl), ctx.getResources().getString(R.string.CursedOozeJarType), ctx.getResources().getString(R.string.CursedOozeJarCost), ctx.getResources().getString(R.string.CursedOozeJarEnergy)),
            new Stuff(13, ctx.getResources().getString(R.string.Doomshot), R.drawable.chalice_doomshot, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.DoomshotDesc), ctx.getResources().getString(R.string.DoomshotLvl), ctx.getResources().getString(R.string.DoomshotType), ctx.getResources().getString(R.string.DoomshotCost), ctx.getResources().getString(R.string.DoomshotEnergy)),
            new Stuff(14, ctx.getResources().getString(R.string.ElectrocutionerLeg), R.drawable.chalice_electrocutioner_leg, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.ElectrocutionerLegDesc), ctx.getResources().getString(R.string.ElectrocutionerLegLvl), ctx.getResources().getString(R.string.ElectrocutionerLegType), ctx.getResources().getString(R.string.ElectrocutionerLegCost), ctx.getResources().getString(R.string.ElectrocutionerLegEnergy)),
            new Stuff(15, ctx.getResources().getString(R.string.FeatheredBreastplate), R.drawable.chalice_feathered_breastplate, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.FeatheredBreastplateDesc), ctx.getResources().getString(R.string.FeatheredBreastplateLvl), ctx.getResources().getString(R.string.FeatheredBreastplateType), ctx.getResources().getString(R.string.FeatheredBreastplateCost), ctx.getResources().getString(R.string.FeatheredBreastplateEnergy)),
            new Stuff(16, ctx.getResources().getString(R.string.FelstoneGoodLuckCharm), R.drawable.chalice_fellstone_good_luck_charm, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.FelstoneGoodLuckCharmDesc), ctx.getResources().getString(R.string.FelstoneGoodLuckCharmLvl), ctx.getResources().getString(R.string.FelstoneGoodLuckCharmType), ctx.getResources().getString(R.string.FelstoneGoodLuckCharmCost), ctx.getResources().getString(R.string.FelstoneGoodLuckCharmEnergy)),
            new Stuff(17, ctx.getResources().getString(R.string.FistOfStone), R.drawable.chalice_fellstone_good_luck_charm, ctx.getResources().getString(R.string.Artifact), false, null, ctx.getResources().getString(R.string.FistOfStoneDesc), ctx.getResources().getString(R.string.FistOfStoneLvl), ctx.getResources().getString(R.string.FistOfStoneType), ctx.getResources().getString(R.string.FistOfStoneCost), ctx.getResources().getString(R.string.FistOfStoneEnergy)),
            new Spell(18, "bloup", R.drawable.chalice_fellstone_good_luck_charm, "blup", "blop", R.drawable.chalice_fellstone_good_luck_charm, R.drawable.chalice_fellstone_good_luck_charm, "blop", "blop")
    );





}
