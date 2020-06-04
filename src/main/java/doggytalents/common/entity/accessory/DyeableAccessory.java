package doggytalents.common.entity.accessory;

import java.util.function.Supplier;

import doggytalents.DoggyTalents2;
import doggytalents.api.inferface.Accessory;
import doggytalents.api.inferface.AccessoryInstance;
import doggytalents.api.inferface.AccessoryType;
import doggytalents.api.inferface.IDogAlteration;
import doggytalents.common.entity.DogEntity;
import doggytalents.common.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IItemProvider;
import net.minecraft.world.World;

public class DyeableAccessory extends Accessory {

    public DyeableAccessory(Supplier<? extends AccessoryType> typeIn, Supplier<? extends IItemProvider> itemIn) {
        super(typeIn, itemIn);
    }

    @Override
    public AccessoryInstance createInstance(PacketBuffer buf) {
        return this.create(buf.readInt());
    }

    @Override
    public void write(AccessoryInstance instance, PacketBuffer buf) {
        DyeableAccessoryInstance exact = instance.cast(DyeableAccessoryInstance.class);
        buf.writeInt(exact.getColor());
    }

    @Override
    public void write(AccessoryInstance instance, CompoundNBT compound) {
        DyeableAccessoryInstance exact = instance.cast(DyeableAccessoryInstance.class);
        compound.putInt("color", exact.getColor());
    }

    @Override
    public AccessoryInstance read(CompoundNBT compound) {
        return this.create(compound.getInt("color"));
    }

    @Override
    public AccessoryInstance getDefault() {
        return this.create(0);
    }

    @Override
    public ItemStack getReturnItem(AccessoryInstance instance) {
        DyeableAccessoryInstance exact = instance.cast(DyeableAccessoryInstance.class);

        ItemStack returnStack = super.getReturnItem(instance);
        if (returnStack.getItem() instanceof IDyeableArmorItem) {
            ((IDyeableArmorItem) returnStack.getItem()).setColor(returnStack, exact.getColor());
        } else {
            DoggyTalents2.LOGGER.info("Unable to set set dyable accessory color.");
        }

        return returnStack;
    }

    public AccessoryInstance create(int color) {
        return new DyeableAccessoryInstance(color);
    }

    public class DyeableAccessoryInstance extends AccessoryInstance implements IDogAlteration {

        private int color;

        public DyeableAccessoryInstance(int colorIn) {
            super(null);
            this.color = colorIn;
        }

        public int getColor() {
            return this.color;
        }

        @Override
        public Accessory getAccessory() {
            return DyeableAccessory.this;
        }

        @Override
        public AccessoryInstance copy() {
            return new DyeableAccessoryInstance(this.color);
        }

        @Override
        public ActionResultType processInteract(DogEntity dogIn, World worldIn, PlayerEntity playerIn, Hand handIn) {
            ItemStack stack = playerIn.getHeldItem(handIn);

            DyeColor dyeColor = DyeColor.getColor(stack);
            if(dyeColor != null) {
                int colorNew = Util.colorDye(this.color, dyeColor);

                // No change
                if (colorNew == this.color) {
                    return ActionResultType.FAIL;
                }

                this.color = colorNew;
                dogIn.consumeItemFromStack(playerIn, stack);
                // Make sure to sync change with client
                dogIn.markAccessoriesDirty();
                return ActionResultType.SUCCESS;
            }
            return ActionResultType.PASS;
        }
    }

}
