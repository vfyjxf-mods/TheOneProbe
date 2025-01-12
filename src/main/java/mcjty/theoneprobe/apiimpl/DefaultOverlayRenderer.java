package mcjty.theoneprobe.apiimpl;

import mcjty.theoneprobe.TheOneProbe;
import mcjty.theoneprobe.api.IOverlayRenderer;
import mcjty.theoneprobe.api.IOverlayStyle;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.apiimpl.styles.DefaultOverlayStyle;
import mcjty.theoneprobe.config.ConfigSetup;
import mcjty.theoneprobe.rendering.OverlayRenderer;

import javax.annotation.Nonnull;

public class DefaultOverlayRenderer implements IOverlayRenderer {

    @Override
    public IOverlayStyle createDefaultStyle() {
        return ((DefaultOverlayStyle) ConfigSetup.getDefaultOverlayStyle()).copy();
    }

    @Override
    public IProbeInfo createProbeInfo() {
        return TheOneProbe.theOneProbeImp.create();
    }

    @Override
    public void render(@Nonnull IOverlayStyle style, @Nonnull IProbeInfo probeInfo) {
        OverlayRenderer.renderOverlay(style, probeInfo);
    }
}
