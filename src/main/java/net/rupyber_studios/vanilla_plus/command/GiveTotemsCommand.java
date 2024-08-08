package net.rupyber_studios.vanilla_plus.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.rupyber_studios.vanilla_plus.command.argument.TotemArgumentType;
import net.rupyber_studios.vanilla_plus.util.totem.Totem;
import org.jetbrains.annotations.NotNull;

public class GiveTotemsCommand {
    public static void register(@NotNull CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess access,
                                CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(CommandManager.literal("givetotem")
                .requires(it -> it.hasPermissionLevel(4))
                .then(CommandManager.argument("player", EntityArgumentType.player())
                        .then(CommandManager.literal("all")
                                .executes(GiveTotemsCommand::giveAll))));
        dispatcher.register(CommandManager.literal("givetotem")
                .requires(it -> it.hasPermissionLevel(4))
                .then(CommandManager.argument("player", EntityArgumentType.player())
                        .then(CommandManager.argument("totem", new TotemArgumentType())
                                .executes(GiveTotemsCommand::giveTotem))));
    }

    private static int giveAll(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = EntityArgumentType.getPlayer(context, "player");
        for(Totem totem : Totem.values())
            player.giveItemStack(totem.getItemStack());
        return 1;
    }

    public static int giveTotem(@NotNull CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerPlayerEntity player = EntityArgumentType.getPlayer(context, "player");
        Totem totem = context.getArgument("totem", Totem.class);
        player.giveItemStack(totem.getItemStack());
        return 1;
    }
}