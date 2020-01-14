package com.bast.worlofwarcraftboardgameassistanttool.Di;

import com.bast.worlofwarcraftboardgameassistanttool.DataBase.CardApiService;
import com.bast.worlofwarcraftboardgameassistanttool.DataBase.DatabaseApiService;

public class Di {
    private static CardApiService service = new DatabaseApiService();

    public static CardApiService getCardApiService() {return service;}


}
