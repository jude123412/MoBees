package com.noodlepfp.mobees.core.data;

import com.noodlepfp.mobees.feature.MoreBeesApicultureBlocks;
import forestry.api.ForestryTags;
import forestry.apiculture.features.ApicultureBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import thedarkcolour.modkit.data.MKTagsProvider;

public class MoreBeesBlockTagsProvider {

    public static void addTags(MKTagsProvider<Block> tags, HolderLookup.Provider lookup) {
        tags.tag(ForestryTags.Blocks.MINEABLE_SCOOP).add(MoreBeesApicultureBlocks.BEEHIVE.blockArray());

        tags.tag(MoreBeesTags.Blocks.ROCKY_BEE_WALL).add(Blocks.STONE).add(Blocks.GRANITE).add(Blocks.ANDESITE).add(Blocks.DIORITE);
        tags.tag(MoreBeesTags.Blocks.ALPINE_HIVE_GROUNDS).add(Blocks.SNOW_BLOCK).add(Blocks.POWDER_SNOW).add(Blocks.PACKED_ICE);
        tags.tag(MoreBeesTags.Blocks.ROCKY_CAVE_REPLACEABLE).add(Blocks.STONE).add(Blocks.GRANITE).add(Blocks.ANDESITE).add(Blocks.DIORITE).add(Blocks.DIRT);

        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_STONE).addTag(Tags.Blocks.STONE);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_COAL).addTag(Tags.Blocks.ORES_COAL);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_COPPER).addTag(Tags.Blocks.ORES_COPPER);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_TIN).addOptionalTag(MoreBeesTags.Blocks.F_ORE_TIN);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_ZINC).addOptionalTag(MoreBeesTags.Blocks.F_ORE_ZINC);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_LEAD).addOptionalTag(MoreBeesTags.Blocks.F_ORE_LEAD);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_NICKEL).addOptionalTag(MoreBeesTags.Blocks.F_ORE_NICKEL);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_OSMIUM).addOptionalTag(MoreBeesTags.Blocks.F_ORE_OSMIUM);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_PLATINUM).addOptionalTag(MoreBeesTags.Blocks.F_ORE_PLATINUM);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_SILVER).addOptionalTag(MoreBeesTags.Blocks.F_ORE_SILVER);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_YELLORIUM).addOptionalTag(MoreBeesTags.Blocks.F_ORE_YELLORIUM);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_CERTUS_QUARTZ).addOptionalTag(MoreBeesTags.Blocks.F_ORE_CERTUS_QUARTZ);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_IRON).addTag(Tags.Blocks.ORES_IRON);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_GOLD).addTag(Tags.Blocks.ORES_GOLD);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_LAPIS).addTag(Tags.Blocks.ORES_LAPIS);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_REDSTONE).addTag(Tags.Blocks.ORES_REDSTONE);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_AMETHYST).add(Blocks.SMALL_AMETHYST_BUD, Blocks.MEDIUM_AMETHYST_BUD, Blocks.LARGE_AMETHYST_BUD, Blocks.AMETHYST_CLUSTER);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_DIAMOND).addTag(Tags.Blocks.ORES_DIAMOND);
        tags.tag(MoreBeesTags.Blocks.ROCK_FLOWERS_EMERALD).addTag(Tags.Blocks.ORES_EMERALD);
    }

}
