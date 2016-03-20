package net.ilexiconn.llibrary.client.model.tabula.container;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

@SideOnly(Side.CLIENT)
public class TabulaModelContainer {
    private String modelName;
    private String authorName;

    private int projVersion;
    private String[] metadata;

    private double[] scale;

    private int textureWidth;
    private int textureHeight;

    private List<TabulaCubeGroupContainer> cubeGroups;
    private List<TabulaCubeContainer> cubes;
    private List<TabulaAnimationContainer> anims;
    private int cubeCount;

    public String getName() {
        return this.modelName;
    }

    public String getAuthor() {
        return this.authorName;
    }

    public int getProjectVersion() {
        return this.projVersion;
    }

    public String[] getMetadata() {
        return metadata;
    }

    public int getTextureWidth() {
        return this.textureWidth;
    }

    public int getTextureHeight() {
        return this.textureHeight;
    }

    public double[] getScale() {
        return this.scale;
    }

    public List<TabulaCubeGroupContainer> getCubeGroups() {
        return this.cubeGroups;
    }

    public List<TabulaCubeContainer> getCubes() {
        return this.cubes;
    }

    public List<TabulaAnimationContainer> getAnimations() {
        return this.anims;
    }

    public int getCubeCount() {
        return this.cubeCount;
    }
}
