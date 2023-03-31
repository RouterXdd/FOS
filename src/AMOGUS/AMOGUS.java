package AMOGUS;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;

import static arc.Core.app;
import static arc.Core.bundle;
import static mindustry.Vars.ui;

public class AMOGUS extends Mod{

    public AMOGUS(){

        Events.on(ClientLoadEvent.class, e -> {
            ui.showOkText("@AMOGUS.errortitle", bundle.format("@AMOGUS.errortext"), () -> app.exit());
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
    }

}
