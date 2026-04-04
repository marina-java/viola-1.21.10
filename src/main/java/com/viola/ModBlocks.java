package com.viola;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import java.util.function.Function;

public class ModBlocks {

    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory,
            BlockBehaviour.Properties settings, boolean shouldRegisterItem) {

        ResourceKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.setId(blockKey));

        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block,
                    new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(VIOLA.MOD_ID, name));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(VIOLA.MOD_ID, name));
    }

    public static final Block ANDESITE_BRICKS = register("andesite_bricks", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block ANDESITE_BRICKS_STAIRS = register("andesite_bricks_stairs",
            (properties) -> new StairBlock(ANDESITE_BRICKS.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block ANDESITE_BRICKS_SLAB = register("andesite_bricks_slab", SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block ANDESITE_BRICKS_WALL = register("andesite_bricks_wall", WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block MOSSY_ANDESITE_BRICKS = register("mossy_andesite_bricks", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block MOSSY_ANDESITE_BRICKS_STAIRS = register("mossy_andesite_bricks_stairs",
            (properties) -> new StairBlock(ANDESITE_BRICKS.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block MOSSY_ANDESITE_BRICKS_SLAB = register("mossy_andesite_bricks_slab", SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block MOSSY_ANDESITE_BRICKS_WALL = register("mossy_andesite_bricks_wall", WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(ANDESITE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block CRACKED_ANDESITE_BRICKS = register("cracked_andesite_bricks", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block CRACKED_ANDESITE_BRICKS_STAIRS = register("cracked_andesite_bricks_stairs",
            (properties) -> new StairBlock(CRACKED_ANDESITE_BRICKS.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(CRACKED_ANDESITE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block CRACKED_ANDESITE_BRICKS_SLAB = register("cracked_andesite_bricks_slab", SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CRACKED_ANDESITE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block CRACKED_ANDESITE_BRICKS_WALL = register("cracked_andesite_bricks_wall", WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CRACKED_ANDESITE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block STONE_TILES = register("stone_tiles", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block STONE_TILES_STAIRS = register("stone_tiles_stairs",
            (properties) -> new StairBlock(STONE_TILES.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block STONE_TILES_SLAB = register("stone_tiles_slab", SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block STONE_TILES_WALL = register("stone_tiles_wall", WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block MOSSY_STONE_TILES = register("mossy_stone_tiles", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block MOSSY_STONE_TILES_STAIRS = register("mossy_stone_tiles_stairs",
            (properties) -> new StairBlock(MOSSY_STONE_TILES.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(MOSSY_STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block MOSSY_STONE_TILES_SLAB = register("mossy_stone_tiles_slab", SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MOSSY_STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block MOSSY_STONE_TILES_WALL = register("mossy_stone_tiles_wall", WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(MOSSY_STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block CRACKED_STONE_TILES = register("cracked_stone_tiles", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block CRACKED_STONE_TILES_STAIRS = register("cracked_stone_tiles_stairs",
            (properties) -> new StairBlock(CRACKED_STONE_TILES.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(CRACKED_STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block CRACKED_STONE_TILES_SLAB = register("cracked_stone_tiles_slab", SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CRACKED_STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block CRACKED_STONE_TILES_WALL = register("cracked_stone_tiles_wall", WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CRACKED_STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block WHITE_STONE = register("white_stone", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block WHITE_STONE_STAIRS = register("white_stone_stairs",
            (properties) -> new StairBlock(WHITE_STONE.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(WHITE_STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block WHITE_STONE_SLAB = register("white_stone_slab", SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(WHITE_STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block WHITE_STONE_WALL = register("white_stone_wall", WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(WHITE_STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block WHITE_STONE_BRICKS = register("white_stone_bricks", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block WHITE_STONE_BRICKS_STAIRS = register("white_stone_bricks_stairs",
            (properties) -> new StairBlock(WHITE_STONE_BRICKS.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(WHITE_STONE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block WHITE_STONE_BRICKS_SLAB = register("white_stone_bricks_slab", SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(WHITE_STONE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block WHITE_STONE_BRICKS_WALL = register("white_stone_bricks_wall", WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(WHITE_STONE_BRICKS).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block MOSSY_WHITE_STONE_BRICKS = register("mossy_white_stone_bricks", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block CRACKED_WHITE_STONE_BRICKS = register("cracked_white_stone_bricks", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block WHITE_STONE_TILES = register("white_stone_tiles", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block WHITE_STONE_TILES_STAIRS = register("white_stone_tiles_stairs",
            (properties) -> new StairBlock(WHITE_STONE_TILES.defaultBlockState(), properties),
            BlockBehaviour.Properties.ofFullCopy(WHITE_STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block WHITE_STONE_TILES_SLAB = register("white_stone_tiles_slab", SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(WHITE_STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);
    public static final Block WHITE_STONE_TILES_WALL = register("white_stone_tiles_wall", WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(WHITE_STONE_TILES).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block MOSSY_WHITE_STONE_TILES = register("mossy_white_stone_tiles", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block CRACKED_WHITE_STONE_TILES = register("cracked_white_stone_tiles", Block::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static final Block SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).sound(SoundType.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F),
            true);

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((creativeTab) -> {

            creativeTab.accept(ModBlocks.ANDESITE_BRICKS.asItem());
            creativeTab.accept(ModBlocks.ANDESITE_BRICKS_STAIRS.asItem());
            creativeTab.accept(ModBlocks.ANDESITE_BRICKS_SLAB.asItem());
            creativeTab.accept(ModBlocks.ANDESITE_BRICKS_WALL.asItem());

            creativeTab.accept(ModBlocks.MOSSY_ANDESITE_BRICKS.asItem());
            creativeTab.accept(ModBlocks.MOSSY_ANDESITE_BRICKS_STAIRS.asItem());
            creativeTab.accept(ModBlocks.MOSSY_ANDESITE_BRICKS_SLAB.asItem());
            creativeTab.accept(ModBlocks.MOSSY_ANDESITE_BRICKS_WALL.asItem());

            creativeTab.accept(ModBlocks.CRACKED_ANDESITE_BRICKS.asItem());
            creativeTab.accept(ModBlocks.CRACKED_ANDESITE_BRICKS_STAIRS.asItem());
            creativeTab.accept(ModBlocks.CRACKED_ANDESITE_BRICKS_SLAB.asItem());
            creativeTab.accept(ModBlocks.CRACKED_ANDESITE_BRICKS_WALL.asItem());

            creativeTab.accept(ModBlocks.STONE_TILES.asItem());
            creativeTab.accept(ModBlocks.STONE_TILES_STAIRS.asItem());
            creativeTab.accept(ModBlocks.STONE_TILES_SLAB.asItem());
            creativeTab.accept(ModBlocks.STONE_TILES_WALL.asItem());

            creativeTab.accept(ModBlocks.MOSSY_STONE_TILES.asItem());
            creativeTab.accept(ModBlocks.MOSSY_STONE_TILES_STAIRS.asItem());
            creativeTab.accept(ModBlocks.MOSSY_STONE_TILES_SLAB.asItem());
            creativeTab.accept(ModBlocks.MOSSY_STONE_TILES_WALL.asItem());

            creativeTab.accept(ModBlocks.CRACKED_STONE_TILES.asItem());
            creativeTab.accept(ModBlocks.CRACKED_STONE_TILES_STAIRS.asItem());
            creativeTab.accept(ModBlocks.CRACKED_STONE_TILES_SLAB.asItem());
            creativeTab.accept(ModBlocks.CRACKED_STONE_TILES_WALL.asItem());

            creativeTab.accept(ModBlocks.WHITE_STONE.asItem());
            creativeTab.accept(ModBlocks.WHITE_STONE_STAIRS.asItem());
            creativeTab.accept(ModBlocks.WHITE_STONE_SLAB.asItem());
            creativeTab.accept(ModBlocks.WHITE_STONE_WALL.asItem());

            creativeTab.accept(ModBlocks.WHITE_STONE_BRICKS.asItem());
            creativeTab.accept(ModBlocks.WHITE_STONE_BRICKS_STAIRS.asItem());
            creativeTab.accept(ModBlocks.WHITE_STONE_BRICKS_SLAB.asItem());
            creativeTab.accept(ModBlocks.WHITE_STONE_BRICKS_WALL.asItem());

            creativeTab.accept(ModBlocks.MOSSY_WHITE_STONE_BRICKS.asItem());

            creativeTab.accept(ModBlocks.CRACKED_WHITE_STONE_BRICKS.asItem());

            creativeTab.accept(ModBlocks.WHITE_STONE_TILES.asItem());
            creativeTab.accept(ModBlocks.WHITE_STONE_TILES_STAIRS.asItem());
            creativeTab.accept(ModBlocks.WHITE_STONE_TILES_SLAB.asItem());
            creativeTab.accept(ModBlocks.WHITE_STONE_TILES_WALL.asItem());

            creativeTab.accept(ModBlocks.MOSSY_WHITE_STONE_TILES.asItem());

            creativeTab.accept(ModBlocks.CRACKED_WHITE_STONE_TILES.asItem());

            creativeTab.accept(ModBlocks.SMOOTH_QUARTZ_WALL.asItem());

        });
    }
}
