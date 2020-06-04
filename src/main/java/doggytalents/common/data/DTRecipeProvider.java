package doggytalents.common.data;

import java.nio.file.Path;
import java.util.function.Consumer;

import com.google.gson.JsonObject;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;

public class DTRecipeProvider extends RecipeProvider {

    public DTRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    public String getName() {
        return "DoggyTalents Recipes";
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        //TODO
//        ShapedRecipeBuilder.shapedRecipe(ModItems.THROW_BONE.get()).patternLine(" X ").patternLine("XYX").patternLine(" X ").key('X', Items.BONE).key('Y', Items.SLIME_BALL).addCriterion("has_bone", this.hasItem(Items.BONE)).build(consumer);
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.THROW_BONE.get()).addIngredient(ModItems.THROW_BONE_WET.get(), 1).addCriterion("has_throw_bone", this.hasItem(ModItems.THROW_BONE.get())).build(consumer, new ResourceLocation(Reference.MOD_ID, "throw_bone_wet"));
//        ShapedRecipeBuilder.shapedRecipe(ModItems.THROW_STICK.get(), 1).patternLine(" X ").patternLine("XYX").patternLine(" X ").key('X', Items.STICK).key('Y', Items.SLIME_BALL).addCriterion("has_slime_ball", this.hasItem(Items.SLIME_BALL)).build(consumer);
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.THROW_STICK.get(), 1).addIngredient(ModItems.THROW_STICK_WET.get(), 1).addCriterion("has_throw_stick", this.hasItem(ModItems.THROW_STICK.get())).build(consumer, new ResourceLocation(Reference.MOD_ID, "throw_stick_wet"));
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.SUPER_TREAT.get(), 5).addIngredient(ModItems.TRAINING_TREAT.get(), 5).addIngredient(Items.GOLDEN_APPLE, 1).addCriterion("has_golden_apple", this.hasItem(Items.GOLDEN_APPLE)).build(consumer);
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.DIRE_TREAT.get(), 1).addIngredient(ModItems.MASTER_TREAT.get(), 5).addIngredient(Blocks.END_STONE, 1).addCriterion("has_master_treat", this.hasItem(ModItems.MASTER_TREAT.get())).build(consumer);
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.BREEDING_BONE.get(), 2).addIngredient(ModItems.MASTER_TREAT.get(), 1).addIngredient(Items.COOKED_BEEF, 1).addIngredient(Items.COOKED_PORKCHOP, 1).addIngredient(Items.COOKED_CHICKEN, 1).addIngredient(Items.COOKED_COD, 1).addCriterion("has_cooked_porkchop", this.hasItem(Items.COOKED_PORKCHOP)).build(consumer);
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.MASTER_TREAT.get(), 5).addIngredient(ModItems.SUPER_TREAT.get(), 5).addIngredient(Items.DIAMOND, 1).addCriterion("has_master_treat", this.hasItem(ModItems.SUPER_TREAT.get())).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.TRAINING_TREAT.get(), 1).patternLine("TUV").patternLine("XXX").patternLine("YYY").key('T', Items.STRING).key('U', Items.BONE).key('V', Items.GUNPOWDER).key('X', Items.SUGAR).key('Y', Items.WHEAT).addCriterion("has_wheat", this.hasItem(Items.WHEAT)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.COLLAR_SHEARS.get(), 1).patternLine(" X ").patternLine("XYX").patternLine(" X ").key('X', Items.BONE).key('Y', Items.SHEARS).addCriterion("has_shears", this.hasItem(Items.SHEARS)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.WHISTLE.get(), 1).patternLine("IRI").patternLine("II ").key('I', Items.IRON_INGOT).key('R', Items.REDSTONE).addCriterion("has_iron_ingot", this.hasItem(Items.IRON_INGOT)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModBlocks.FOOD_BOWL.get(), 1).patternLine("XXX").patternLine("XYX").patternLine("XXX").key('X', Items.IRON_INGOT).key('Y', Items.BONE).addCriterion("has_iron_ingot", this.hasItem(Items.IRON_INGOT)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModBlocks.DOG_BATH.get(), 1).patternLine("XXX").patternLine("XYX").patternLine("XXX").key('X', Items.IRON_INGOT).key('Y', Items.WATER_BUCKET).addCriterion("has_iron_ingot", this.hasItem(Items.IRON_INGOT)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.CHEW_STICK.get(), 1).patternLine("SW").patternLine("WS").key('W', Items.WHEAT).key('S', Items.SUGAR).addCriterion("has_sugar", this.hasItem(Items.SUGAR)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.WOOL_COLLAR.get(), 1).patternLine("SSS").patternLine("S S").patternLine("SSS").key('S', Items.STRING).addCriterion("has_stick", this.hasItem(Items.STRING)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.TREAT_BAG.get(), 1).patternLine("LCL").patternLine("LLL").key('L', Items.LEATHER).key('C', ModItems.CHEW_STICK.get()).addCriterion("has_leather", this.hasItem(Items.LEATHER)).build(consumer);
//
//        ShapedRecipeBuilder.shapedRecipe(ModItems.CAPE.get(), 1).patternLine("S S").patternLine("LWL").patternLine("WLW").key('L', Items.LEATHER).key('S', Items.STRING).key('W', ItemTags.WOOL).addCriterion("has_leather", this.hasItem(Items.LEATHER)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.CAPE_COLOURED.get(), 1).patternLine("S S").patternLine("LLL").patternLine("LLL").key('L', Items.LEATHER).key('S', Items.STRING).addCriterion("has_leather", this.hasItem(Items.LEATHER)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.LEATHER_JACKET.get(), 1).patternLine("L L").patternLine("LWL").patternLine("LWL").key('L', Items.LEATHER).key('W', ItemTags.WOOL).addCriterion("has_leather", this.hasItem(Items.LEATHER)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.SPOTTED_COLLAR.get(), 1).patternLine("BWB").patternLine("WCW").patternLine("BSB").key('C', ModItems.WOOL_COLLAR.get()).key('B', Items.BLACK_DYE).key('W', Items.WHITE_DYE).key('S', Items.STRING).addCriterion("has_wool_collar", this.hasItem(ModItems.WOOL_COLLAR.get())).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.SPOTTED_COLLAR.get(), 1).patternLine("WBW").patternLine("BCB").patternLine("WSW").key('C', ModItems.WOOL_COLLAR.get()).key('B', Items.BLACK_DYE).key('W', Items.WHITE_DYE).key('S', Items.STRING).addCriterion("has_wool_collar", this.hasItem(ModItems.WOOL_COLLAR.get())).build(consumer, new ResourceLocation(Reference.MOD_ID, "spotted_collar_alt"));
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.MULTICOLOURED_COLLAR.get(), 1).addIngredient(ModItems.WOOL_COLLAR.get()).addIngredient(Items.STRING).addIngredient(Items.BLUE_DYE).addIngredient(Items.LIME_DYE).addIngredient(Items.YELLOW_DYE).addIngredient(Items.ORANGE_DYE).addIngredient(Items.RED_DYE).addIngredient(Items.PURPLE_DYE).addCriterion("has_wool_collar", this.hasItem(ModItems.WOOL_COLLAR.get())).build(consumer);
//
//        ShapedRecipeBuilder.shapedRecipe(ModItems.SUNGLASSES.get(), 1).patternLine("S S").patternLine("GSG").key('S', Items.STICK).key('G', Blocks.GLASS_PANE).addCriterion("has_stick", this.hasItem(Items.STICK)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.TINY_BONE.get(), 1).patternLine("BI").patternLine("IB").key('B', Items.BONE).key('I', Items.IRON_INGOT).addCriterion("has_iron_ingot", this.hasItem(Items.IRON_INGOT)).build(consumer);
//        ShapedRecipeBuilder.shapedRecipe(ModItems.BIG_BONE.get(), 1).patternLine("BI").patternLine("IB").patternLine("BI").key('B', Items.BONE).key('I', Items.IRON_INGOT).addCriterion("has_iron_ingot", this.hasItem(Items.IRON_INGOT)).build(consumer);
//
//        ShapedRecipeBuilder.shapedRecipe(ModItems.RADIO_COLLAR.get(), 1).patternLine("XX").patternLine("YX").key('X', Items.IRON_INGOT).key('Y', Items.REDSTONE).addCriterion("has_redstone", this.hasItem(Items.REDSTONE)).build(consumer);
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.RADAR.get(), 1).addIngredient(Items.MAP, 1).addIngredient(Items.REDSTONE, 1).addIngredient(ModItems.RADIO_COLLAR.get(), 1).addCriterion("has_redstone", this.hasItem(Items.REDSTONE)).build(consumer);
//
//        CustomRecipeBuilder.customRecipe(ModRecipes.CAPE_COLOURING.get()).build(consumer, Reference.MOD_ID + ":cape_colouring");
//        CustomRecipeBuilder.customRecipe(ModRecipes.COLLAR_COLOURING.get()).build(consumer, Reference.MOD_ID + ":collar_colouring");
//        CustomRecipeBuilder.customRecipe(ModRecipes.DOG_BED.get()).build(consumer, Reference.MOD_ID + ":dog_bed");
    }

    @Override
    protected void saveRecipeAdvancement(DirectoryCache cache, JsonObject advancementJson, Path pathIn) {
        //NOOP - We dont replace any of the advancement things yet...
    }
}