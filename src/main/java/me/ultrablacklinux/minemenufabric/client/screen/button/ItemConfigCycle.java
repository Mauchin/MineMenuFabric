package me.ultrablacklinux.minemenufabric.client.screen.button;

import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Nameable;

public enum ItemConfigCycle implements Nameable {
    ICON,
    ENCHANTED,
    CUSTOMMODELDATA,
    SKULLOWNER;

    public ItemConfigCycle next() {
        ItemConfigCycle[] v = values();
        if (v.length == this.ordinal() + 1) {
            return v[0]; }
        return v[this.ordinal() + 1];
    }

    @Override
    public Text getName() {
        return new TranslatableText("minemenu.setting.itemconfigcycle." + this.name().substring(0,1) + this.name().substring(1).toLowerCase());
    }
}
