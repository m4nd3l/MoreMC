package com.m4nd3l.moremc.villager;


import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

public class Trade {
    private final ItemConvertible money;
    private final int moneyCount;

    private final ItemConvertible traded;
    private final int tradedCount;

    private final int uses;

    private final int experience;

    private final float multiplier;

    public Trade(ItemConvertible money, int moneyCount, ItemConvertible traded,
                 int tradedCount, int uses, int experience, float multiplier) {
        this.money = money;
        this.moneyCount = moneyCount;
        this.traded = traded;
        this.tradedCount = tradedCount;
        this.uses = uses;
        this.experience = experience;
        this.multiplier = multiplier;
    }

    public TradeOffer getTrade() {
        return new TradeOffer(
                new TradedItem(money, moneyCount),
                new ItemStack(traded, tradedCount), uses, experience, multiplier
        );
    }
}
