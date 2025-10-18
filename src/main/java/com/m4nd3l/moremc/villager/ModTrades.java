package com.m4nd3l.moremc.villager;

import com.m4nd3l.moremc.MoreMC;
import com.m4nd3l.moremc.item.items.FoodItems;
import com.m4nd3l.moremc.item.items.MiscItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers.Factory;
import net.minecraft.village.VillagerProfession;

import java.util.Arrays;
import java.util.List;

public class ModTrades {

    /**TOOLSMITH*/

    public static final Trade[] TOOLSMITH_LVL_2 = new Trade[] {
            new Trade(Items.EMERALD, 5, MiscItems.ANVIL_REPAIR, 1, 2, 3, 0.04f)
    };

    /**ASIAN FARMER*/

    public static final Trade[] ASIAN_FARMER_LVL_1 = new Trade[] {
            new Trade(Items.EMERALD, 1, MiscItems.RICE_SEEDS, 5, 8, 1, 0.02f),
    };

    public static final Trade[] ASIAN_FARMER_LVL_2 = new Trade[] {
            new Trade(Items.EMERALD, 2, FoodItems.BOWL_OF_RICE, 3, 4, 1, 0.02f),
    };

    public static final Trade[] ASIAN_FARMER_LVL_3 = new Trade[] {
            new Trade(FoodItems.BOWL_OF_RICE, 3, FoodItems.COOKED_RICE, 2, 2, 2, 0.04f),
    };

    public static final Trade[] ASIAN_FARMER_LVL_4 = new Trade[] {
            new Trade(Items.EMERALD, 1, MiscItems.RICE_SEEDS, 5, 8, 1, 0.02f),
    };

    public static final Trade[] ASIAN_FARMER_LVL_5 = new Trade[] {
            new Trade(Items.EMERALD, 1, MiscItems.RICE_SEEDS, 5, 8, 1, 0.02f),
    };

    public static void registerTradeFromTradeList(List<Factory> factories, Trade[] trades) {
        Arrays.stream(trades)
                .forEach(trade -> factories.add((entity, random) -> trade.getTrade()));
    }


    public static void registerCustomTrades() {
        MoreMC.LOGGER.info(MoreMC.getThis() + ": Registering mod trades items...");

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2, factories -> {
            ModTrades.registerTradeFromTradeList(factories, TOOLSMITH_LVL_2);
        });

        /**ASIAN FARMER*/

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ASIAN_FARMER, 1, factories -> {
            ModTrades.registerTradeFromTradeList(factories, ASIAN_FARMER_LVL_1);
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ASIAN_FARMER, 2, factories -> {
            ModTrades.registerTradeFromTradeList(factories, ASIAN_FARMER_LVL_2);
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ASIAN_FARMER, 3, factories -> {
            ModTrades.registerTradeFromTradeList(factories, ASIAN_FARMER_LVL_3);
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ASIAN_FARMER, 4, factories -> {
            ModTrades.registerTradeFromTradeList(factories, ASIAN_FARMER_LVL_4);
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ASIAN_FARMER, 5, factories -> {
            ModTrades.registerTradeFromTradeList(factories, ASIAN_FARMER_LVL_5);
        });
    }
}
