package com.bast.worlofwarcraftboardgameassistanttool.di;

import com.bast.worlofwarcraftboardgameassistanttool.dataBase.CardApiService;
import com.bast.worlofwarcraftboardgameassistanttool.dataBase.DatabaseApiService;

public class Di {
    private static CardApiService service = new DatabaseApiService();

    public static CardApiService getCardApiService() {return service;}


}
