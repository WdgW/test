/**
 * @author dg
 */
package dg;

import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;

public class Blocks {
    public static Block base,top;
    public static void load(){
        base = new Wall("base"){{
            this.localizedName = "base";
            this.category = Category.defense;
            this.size = 5;
        }};
        top = new Block("top"){{

        }};
        BaseMultipleBlock.create(base,top);
    }
}
