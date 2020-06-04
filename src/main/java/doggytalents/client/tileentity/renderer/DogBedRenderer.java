package doggytalents.client.tileentity.renderer;

import com.google.common.base.Objects;
import com.mojang.blaze3d.matrix.MatrixStack;

import doggytalents.client.entity.render.RenderUtil;
import doggytalents.common.block.tileentity.DogBedTileEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceResult;

public class DogBedRenderer extends TileEntityRenderer<DogBedTileEntity> {

    public DogBedRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(DogBedTileEntity tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        if (tileEntityIn.getBedName() != null && this.isLookingAtBed(tileEntityIn)) {
            matrixStackIn.push();
            matrixStackIn.translate(0.5D, 0.5D, 0.5D);
            RenderUtil.renderLabelWithScale(true, Minecraft.getInstance().getRenderManager(), tileEntityIn.getBedName(), matrixStackIn, bufferIn, combinedLightIn, 0.025F, 1.2F);
            matrixStackIn.pop();
        }

    }

    public boolean isLookingAtBed(DogBedTileEntity tileEntityIn) {
        Minecraft mc = Minecraft.getInstance();

        if (mc.objectMouseOver != null && mc.objectMouseOver.getType() == RayTraceResult.Type.BLOCK) {
            BlockPos blockpos = ((BlockRayTraceResult) mc.objectMouseOver).getPos();
            return Objects.equal(blockpos, tileEntityIn.getPos());
         }

        return false;
    }
}
