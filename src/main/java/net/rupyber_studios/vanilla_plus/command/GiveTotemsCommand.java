package net.rupyber_studios.vanilla_plus.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import org.jetbrains.annotations.NotNull;

public class GiveTotemsCommand {
    public static void register(@NotNull CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess access,
                                CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("all").executes(GiveTotemsCommand::giveAll).requires(it -> it.hasPermissionLevel(4))));
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("skeleton").executes(GiveTotemsCommand::giveSkeleton).requires(it -> it.hasPermissionLevel(4))));
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("zombie").executes(GiveTotemsCommand::giveZombie).requires(it -> it.hasPermissionLevel(4))));
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("creeper").executes(GiveTotemsCommand::giveCreeper).requires(it -> it.hasPermissionLevel(4))));
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("shulker").executes(GiveTotemsCommand::giveShulker).requires(it -> it.hasPermissionLevel(4))));
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("ender_dragon").executes(GiveTotemsCommand::giveEnderDragon).requires(it -> it.hasPermissionLevel(4))));
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("ghast").executes(GiveTotemsCommand::giveGhast).requires(it -> it.hasPermissionLevel(4))));
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("slime").executes(GiveTotemsCommand::giveSlime).requires(it -> it.hasPermissionLevel(4))));
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("enderman").executes(GiveTotemsCommand::giveEnderman).requires(it -> it.hasPermissionLevel(4))));
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("guardian").executes(GiveTotemsCommand::giveGuardian).requires(it -> it.hasPermissionLevel(4))));
        dispatcher.register(CommandManager.literal("givetotem")
                .then(CommandManager.literal("elder_guardian").executes(GiveTotemsCommand::giveElderGuardian).requires(it -> it.hasPermissionLevel(4))));
    }

    private static int giveAll(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        giveSkeleton(context);
        giveZombie(context);
        giveShulker(context);
        giveCreeper(context);
        giveEnderDragon(context);
        giveGhast(context);
        giveSlime(context);
        giveEnderman(context);
        giveGuardian(context);
        giveElderGuardian(context);
        return 1;
    }

    public static int giveSkeleton(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayer();
        NbtCompound nbt = new NbtCompound();
        NbtCompound tooltip = new NbtCompound();
        nbt.putInt("CustomModelData", 1);
        nbt.putByte("skeletonTotem", (byte)1);
        tooltip.putString("Name", "{\"text\":\"Skeleton Totem of Undying\", \"italic\":false}");
        nbt.put("display", tooltip);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        assert player != null;
        player.giveItemStack(totem);
        return 1;
    }

    public static int giveZombie(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayer();
        NbtCompound nbt = new NbtCompound();
        NbtCompound tooltip = new NbtCompound();
        nbt.putInt("CustomModelData", 2);
        nbt.putByte("zombieTotem", (byte)1);
        tooltip.putString("Name", "{\"text\":\"Zombie Totem of Undying\", \"italic\":false}");
        nbt.put("display", tooltip);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        assert player != null;
        player.giveItemStack(totem);
        return 1;
    }

    public static int giveCreeper(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayer();
        NbtCompound nbt = new NbtCompound();
        NbtCompound tooltip = new NbtCompound();
        nbt.putInt("CustomModelData", 3);
        nbt.putByte("creeperTotem", (byte)1);
        tooltip.putString("Name", "{\"text\":\"Creeper Totem of Undying\", \"italic\":false}");
        nbt.put("display", tooltip);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        assert player != null;
        player.giveItemStack(totem);
        return 1;
    }

    public static int giveShulker(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayer();
        NbtCompound nbt = new NbtCompound();
        NbtCompound tooltip = new NbtCompound();
        nbt.putInt("CustomModelData", 4);
        nbt.putByte("shulkerTotem", (byte)1);
        tooltip.putString("Name", "{\"text\":\"Shulker Totem of Undying\", \"italic\":false}");
        nbt.put("display", tooltip);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        assert player != null;
        player.giveItemStack(totem);
        return 1;
    }

    public static int giveEnderDragon(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayer();
        NbtCompound nbt = new NbtCompound();
        NbtCompound tooltip = new NbtCompound();
        nbt.putInt("CustomModelData", 5);
        nbt.putByte("dragonTotem", (byte)1);
        tooltip.putString("Name", "{\"text\":\"Ender Dragon Totem of Undying\", \"italic\":false}");
        nbt.put("display", tooltip);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        assert player != null;
        player.giveItemStack(totem);
        return 1;
    }

    public static int giveGhast(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayer();
        NbtCompound nbt = new NbtCompound();
        NbtCompound tooltip = new NbtCompound();
        nbt.putInt("CustomModelData", 6);
        nbt.putByte("ghastTotem", (byte)1);
        tooltip.putString("Name", "{\"text\":\"Ghast Totem of Undying\", \"italic\":false}");
        nbt.put("display", tooltip);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        assert player != null;
        player.giveItemStack(totem);
        return 1;
    }

    public static int giveSlime(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayer();
        NbtCompound nbt = new NbtCompound();
        NbtCompound tooltip = new NbtCompound();
        nbt.putInt("CustomModelData", 7);
        nbt.putByte("slimeTotem", (byte)1);
        tooltip.putString("Name", "{\"text\":\"Slime Totem of Undying\", \"italic\":false}");
        nbt.put("display", tooltip);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        assert player != null;
        player.giveItemStack(totem);
        return 1;
    }

    public static int giveEnderman(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayer();
        NbtCompound nbt = new NbtCompound();
        NbtCompound tooltip = new NbtCompound();
        nbt.putInt("CustomModelData", 8);
        nbt.putByte("endermanTotem", (byte)1);
        tooltip.putString("Name", "{\"text\":\"Enderman Totem of Undying\", \"italic\":false}");
        nbt.put("display", tooltip);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        assert player != null;
        player.giveItemStack(totem);
        return 1;
    }

    public static int giveGuardian(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayer();
        NbtCompound nbt = new NbtCompound();
        NbtCompound tooltip = new NbtCompound();
        nbt.putInt("CustomModelData", 9);
        nbt.putByte("guardianTotem", (byte)1);
        tooltip.putString("Name", "{\"text\":\"Guardian Totem of Undying\", \"italic\":false}");
        nbt.put("display", tooltip);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        assert player != null;
        player.giveItemStack(totem);
        return 1;
    }

    public static int giveElderGuardian(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = context.getSource().getPlayer();
        NbtCompound nbt = new NbtCompound();
        NbtCompound tooltip = new NbtCompound();
        nbt.putInt("CustomModelData", 10);
        nbt.putByte("elderguardianTotem", (byte)1);
        tooltip.putString("Name", "{\"text\":\"Elder Guardian Totem of Undying\", \"italic\":false}");
        nbt.put("display", tooltip);
        ItemStack totem = Items.TOTEM_OF_UNDYING.getDefaultStack();
        totem.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(nbt));
        assert player != null;
        player.giveItemStack(totem);
        return 1;
    }
}
