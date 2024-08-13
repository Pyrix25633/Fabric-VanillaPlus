package net.rupyber_studios.vanilla_plus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rupyber_studios.vanilla_plus.VanillaPlus;
import net.rupyber_studios.vanilla_plus.block.ModBlocks;
import net.rupyber_studios.vanilla_plus.item.ModItems;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry decoration = generateRoot(consumer, "decoration", ModBlocks.DECORATED_OAK_PLANKS,
                List.of(ModBlocks.DECORATED_OAK_PLANKS), new Identifier(VanillaPlus.MOD_ID, "textures/block/oak/decorated_oak_planks.png"));
        AdvancementEntry allOfThem = generateGoal(consumer, "all_of_them", ModBlocks.DECORATED_WARPED_PLANKS,
                ModBlocks.DECORATED_PLANKS, decoration);
        AdvancementEntry theTable = generateTask(consumer, "the_table", ModBlocks.OAK_TABLE,
                List.of(ModBlocks.OAK_TABLE), decoration);
        AdvancementEntry allOfThemTheReturn = generateGoal(consumer, "all_of_them_the_return", ModBlocks.CRIMSON_TABLE,
                ModBlocks.TABLES, theTable);
        AdvancementEntry whyVertical = generateTask(consumer, "why_vertical", ModBlocks.OAK_VERTICAL_SLAB,
                List.of(ModBlocks.OAK_VERTICAL_SLAB), decoration);
        AdvancementEntry allOfThemMissionImpossible = generateGoal(consumer, "all_of_them_mission_impossible",
                ModBlocks.SMOOTH_STONE_VERTICAL_SLAB, ModBlocks.VERTICAL_SLABS, whyVertical);
        AdvancementEntry trueColor = generateTask(consumer, "true_color", ModBlocks.GREEN_LANTERN,
                List.of(ModBlocks.GREEN_LANTERN), decoration);
        AdvancementEntry allOfThemLiveAndLetDie = generateGoal(consumer, "all_of_them_live_and_let_die", ModBlocks.RED_LANTERN,
                ModBlocks.LANTERNS, trueColor);
        AdvancementEntry deepDownIntoTheOcean = generateTask(consumer, "deep_down_into_the_ocean", ModBlocks.DEEP_OCEAN_BRICKS,
                List.of(ModBlocks.DEEP_OCEAN_BRICKS), decoration);

        AdvancementEntry dungeons = generateRoot(consumer, "dungeons", ModItems.AXE,
                List.of(ModItems.AXE), new Identifier("minecraft", "textures/block/deepslate.png"));
        AdvancementEntry allOfThemIndestructible = generateGoal(consumer, "all_of_them_indestructible", ModItems.RAPID_CROSSBOW,
                ModItems.DUNGEONS_ITEMS, dungeons);

        AdvancementEntry noMusic = generateRoot(consumer, "no_music", ModItems.BLANK_MUSIC_DISC,
                List.of(ModItems.BLANK_MUSIC_DISC), new Identifier("minecraft", "textures/block/note_block.png"));
        AdvancementEntry allOfThemTheRevenge = generateGoal(consumer, "all_of_them_the_revenge", ModItems.BLANK_LOFI_MUSIC_DISC,
                ModItems.BLANK_MUSIC_DISCS, noMusic);
        AdvancementEntry allOfThemTheReborn = generateGoal(consumer, "all_of_them_the_reborn", ModItems.MUSIC_DISC_ALIEN_SKY,
                ModItems.MUSIC_DISCS, noMusic);
    }

    public AdvancementEntry generateRoot(@NotNull Consumer<AdvancementEntry> consumer, String id, ItemConvertible icon,
                                     @NotNull List<ItemConvertible> items, Identifier background) {
        return generate(consumer, id, icon, items, background, AdvancementFrame.TASK, null);
    }

    public AdvancementEntry generateTask(@NotNull Consumer<AdvancementEntry> consumer, String id, ItemConvertible icon,
                                     @NotNull List<ItemConvertible> items, AdvancementEntry parent) {
        return generate(consumer, id, icon, items, null, AdvancementFrame.TASK, parent);
    }

    public AdvancementEntry generateGoal(@NotNull Consumer<AdvancementEntry> consumer, String id, ItemConvertible icon,
                                         @NotNull List<ItemConvertible> items, AdvancementEntry parent) {
        return generate(consumer, id, icon, items, null, AdvancementFrame.GOAL, parent);
    }

    public AdvancementEntry generate(@NotNull Consumer<AdvancementEntry> consumer, String id, ItemConvertible icon,
                                     @NotNull List<ItemConvertible> items, @Nullable Identifier background,
                                     AdvancementFrame frame, @Nullable AdvancementEntry parent) {
        Advancement.Builder builder = Advancement.Builder.create()
                .display(
                        icon,
                        Text.translatable("advancements.vanilla_plus." + id + ".title"),
                        Text.translatable("advancements.vanilla_plus." + id + ".description"),
                        background,
                        frame,
                        true,
                        frame != AdvancementFrame.TASK,
                        false
                );
        for(ItemConvertible item : items)
            builder.criterion(Registries.ITEM.getId(item.asItem()).getPath(),
                    InventoryChangedCriterion.Conditions.items(item));
        if(parent != null)
            builder.parent(parent);
        AdvancementEntry advancement = builder.build(new Identifier(VanillaPlus.MOD_ID, id));
        consumer.accept(advancement);
        return advancement;
    }
}