package net.rupyber_studios.vanilla_plus.command.argument;

import com.mojang.serialization.Codec;
import net.minecraft.command.argument.EnumArgumentType;
import net.minecraft.util.StringIdentifiable;
import net.rupyber_studios.vanilla_plus.util.totem.Totem;

public class TotemArgumentType extends EnumArgumentType<Totem> {
    private static final Codec<Totem> CODEC = StringIdentifiable.createCodec(Totem::values);

    public TotemArgumentType() {
        super(CODEC, Totem::values);
    }
}