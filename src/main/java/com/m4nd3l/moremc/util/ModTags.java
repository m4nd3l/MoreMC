package com.m4nd3l.moremc.util;

import com.m4nd3l.moremc.MoreMC;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_SCUTE_TOOL = createTag("needs_scute_tool");
        public static final TagKey<Block> INCORRECT_FOR_SCUTE_TOOL = createTag("incorrect_for_scute_tool");

        public static final TagKey<Block> NEEDS_REINFORCED_SCUTE_TOOL = createTag("needs_reinforced_scute_tool");
        public static final TagKey<Block> INCORRECT_FOR_REINFORCED_SCUTE_TOOL = createTag("incorrect_for_reinforced_scute_tool");

        public static final TagKey<Block> NEEDS_HARDENED_SCUTE_TOOL = createTag("needs_hardened_scute_tool");
        public static final TagKey<Block> INCORRECT_FOR_HARDENED_SCUTE_TOOL = createTag("incorrect_for_hardened_scute_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreMC.MOD_ID, name));
        }
    }

    public static class Items {

        //public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        //data/moremc/tags/item/transformable_items.json O vai in ModBlockTagProvider e segui le istruzioni lì.
        // ModBlockTagProvider -> BETTER
        /*{
            "values": [
                "moremc:nomeItem",
                "moremc:nomeItem2",
                "minecraft:nomeItem3"
            ]
        }*/
        //USO: es. stack.isIn(ModTags.Items.TRANSFORMABLE_ITEMS);

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreMC.MOD_ID, name));
        }
    }
}
