/**
 * @author dg
 */
package dg;

import mindustry.world.Block;

public class Blocks {
    public static Block base,top;
    public static void load(){
        base = new Block("base"){};
        top = new Block("top"){};
        BaseMultipleBlock.create(base,top);
    }
}
