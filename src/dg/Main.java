package dg;

import arc.Core;
import arc.Events;
import arc.util.Log;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;

/**
 * @author dg
 */
public class Main extends Mod {

    public Main(){
    }

    @Override
    public void loadContent(){
        Blocks.load();
    }

}
