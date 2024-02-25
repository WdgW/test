/**
 * @author dg
 */
package dg;

import mindustry.game.Team;
import mindustry.gen.Building;
import mindustry.world.Block;
import mindustry.world.blocks.payloads.BuildPayload;

public class BaseMultipleBlock {
    public static void create(Block base, Block top){
        BuildPayload bp = new BuildPayload(top, Team.derelict);
        class MBuild extends Building{
            @Override
            public void updateTile() {
                super.updateTile();
                if(bp.build.team != this.team) bp.build.team = this.team;
                bp.update(null,this);
                bp.set(this.x,this.y,bp.build.payloadRotation);
            }

            @Override
            public void draw() {
                super.draw();
                bp.draw();
            }
        }
        base.buildType = MBuild::new;
        //return base;
    }
}
