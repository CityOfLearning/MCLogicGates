package com.github.rainang.logicgates.block;

import com.github.rainang.logicgates.Gate;
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public abstract class BlockDiode5In extends BlockDiode {

	public static final PropertyInteger INPUT = PropertyInteger.create("input", 0, 15);

	private final EnumFacing out;

	public BlockDiode5In(boolean down) {
		super(Gate.OR);
		this.out = down ? EnumFacing.DOWN : EnumFacing.UP;
		setDefaultState(blockState.getBaseState().withProperty(getInputProperty(), 0));
	}

	@Override
	public PropertyInteger getInputProperty() {
		return INPUT;
	}

	@Override
	public EnumFacing getInput(IBlockState state, int index) {
		switch(index) {
		default:
			return out.getOpposite();
		case 0:
			return EnumFacing.WEST;
		case 1:
			return EnumFacing.EAST;
		case 2:
			return EnumFacing.SOUTH;
		case 3:
			return EnumFacing.NORTH;
		}
	}

	@Override
	public List<EnumFacing> getInputs(IBlockState state) {
		return Arrays.asList(getInput(state, 0), getInput(state, 1), getInput(state, 2), getInput(state, 3),
				getInput(state, 4));
	}

	@Override
	public int getInputState(IBlockState state) {
		return state.getValue(INPUT);
	}

	@Override
	public int getInputCount() {
		return 5;
	}

	@Override
	public IBlockState setInputState(IBlockState state, int input) {
		return state.withProperty(getInputProperty(), input);
	}

	@Override
	public EnumFacing getOutput(IBlockState state) {
		return out;
	}

	@Override
	public boolean isActive(IBlockState state) {
		return gate.validate(getInputCount(), getInputState(state));
	}

	/* BLOCK OVERRIDE */

	@Override
	public IBlockState onBlockPlaced(
			World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
			EntityLivingBase placer) {
		return getStateFromMeta(meta);
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, getInputProperty());
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(getInputProperty(), meta);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(INPUT);
	}
}
