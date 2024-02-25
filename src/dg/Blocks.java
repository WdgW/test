/**
 * @author dg
 */
package dg;

import mindustry.type.Category;
import mindustry.world.Block;

public class Blocks {
    public static Block base,top;
    public static void load(){
        base = new Block("base"){{
            this.category = Category.defense;
        }};
        top = new Block("top"){{
            this.category = Category.defense;
        }};
        BaseMultipleBlock.create(base,top);
    }
}
