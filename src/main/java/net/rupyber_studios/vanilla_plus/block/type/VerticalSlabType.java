package net.rupyber_studios.vanilla_plus.block.type;

import net.minecraft.block.Block;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public enum VerticalSlabType implements StringIdentifiable {
    NORTH(Direction.NORTH), SOUTH(Direction.SOUTH), WEST(Direction.WEST), EAST(Direction.EAST), DOUBLE(null);

    private final String name;
    public final Direction direction;
    public final VoxelShape shape;

    VerticalSlabType(Direction direction) {
        this.name = direction == null ? "double" : direction.asString();
        this.direction = direction;
        if(direction == null) shape = VoxelShapes.fullCube();
        else {
            double min = 0;
            double max = 8;
            if(direction.getDirection() == Direction.AxisDirection.NEGATIVE) {
                min = 8;
                max = 16;
            }
            if(direction.getAxis() == Direction.Axis.X) shape = Block.createCuboidShape(min, 0, 0, max, 16, 16);
            else shape = Block.createCuboidShape(0, 0, min, 16, 16, max);
        }

    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String asString() {
        return name;
    }

    @Contract(pure = true)
    public static @Nullable VerticalSlabType fromDirection(Direction direction) {
        for(VerticalSlabType type: VerticalSlabType.values())
            if(type.direction != null && direction == type.direction) return type;

        return null;
    }
}