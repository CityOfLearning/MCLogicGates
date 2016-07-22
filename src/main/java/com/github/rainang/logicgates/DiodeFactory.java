package com.github.rainang.logicgates;

import com.github.rainang.logicgates.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class DiodeFactory {

	public static BlockDiode[] create1InputDiode(String name, Gate gate) {
		final BlockDiode[] diodes = new BlockDiode[3];
		for(int i = 0; i < 3; i++) {
			final int j = (i + 1)%3;
			diodes[i] = new BlockDiode1In(gate, i) {
				@Override
				public BlockDiode getBaseBlock() {
					return diodes[0];
				}

				@Override
				public IBlockState rotate(IBlockState state) {
					return diodes[j].getDefaultState()
							.withProperty(OUT, state.getValue(OUT))
							.withProperty(INPUT, state.getValue(INPUT));
				}
			};
			diodes[i].setUnlocalizedName(name + "_" + i);
			if(i == 0)
				diodes[i].setCreativeTab(CreativeTabs.tabRedstone);
		}
		return diodes;
	}

	public static BlockDiode[] create2InputDiode(String name, Gate gate) {
		final BlockDiode[] diodes = new BlockDiode[3];
			for(int i = 0; i < 3; i++) {
				final int k = (i + 1)%3;
				diodes[i] = new BlockDiode2In(gate, i) {
					@Override
					public BlockDiode getBaseBlock() {
						return diodes[0];
					}

					@Override
					public IBlockState rotate(IBlockState state) {
						return diodes[k].getDefaultState()
								.withProperty(OUT, state.getValue(OUT))
								.withProperty(INPUT, state.getValue(INPUT));
					}
				};
				diodes[i].setUnlocalizedName("diode2in_" +
						name + "_" + i);
				if(i == 0)
					diodes[i].setCreativeTab(CreativeTabs.tabRedstone);
			}
		return diodes;
	}

	public static BlockDiode[] create3InputDiode(String name, Gate gate) {
		final BlockDiode[] diodes = new BlockDiode[2];
			for(int i = 0; i < 2; i++) {
				final int j = i;
				if(i == 0)
					diodes[j] = new BlockDiode3In(gate, i) {
						@Override
						public BlockDiode getBaseBlock() {
							return diodes[0];
						}

						@Override
						public IBlockState setInputState(IBlockState state, int input) {
							if(input < 4)
								return state.withProperty(getInputProperty(), input);
							return diodes[j + 1].getDefaultState()
									.withProperty(BlockDiode.OUT, state.getValue(OUT))
									.withProperty(getInputProperty(), input%4);
						}
					};
				else
					diodes[j] = new BlockDiode3In(gate, i) {
						@Override
						public BlockDiode getBaseBlock() {
							return diodes[0];
						}

						@Override
						public IBlockState setInputState(IBlockState state, int input) {
							if(input >= 4)
								return state.withProperty(getInputProperty(), input%4);
							return diodes[j - 1].getDefaultState()
									.withProperty(BlockDiode.OUT, state.getValue(OUT))
									.withProperty(getInputProperty(), input);
						}
					};
				diodes[j].setUnlocalizedName("diode3in_" +
						name + "_" + i);
				if(i == 0)
					diodes[j].setCreativeTab(CreativeTabs.tabRedstone);
			}
		return diodes;
	}

	public static BlockDiode[] createVerticalTransmitters() {
		final BlockDiode[] diodes = new BlockDiode[2];
			for(int i = 0; i < 2; i++) {
				final int j = i;
				if(i == 0)
					diodes[j] = new BlockDiode5In(false) {
						@Override
						public BlockDiode getBaseBlock() {
							return diodes[0];
						}

						@Override
						public IBlockState rotate(IBlockState state) {
							return diodes[j + 1].getDefaultState().withProperty(INPUT, state.getValue(INPUT));
						}
					};
				else
					diodes[j] = new BlockDiode5In(true) {
						@Override
						public BlockDiode getBaseBlock() {
							return diodes[0];
						}

						@Override
						public IBlockState rotate(IBlockState state) {
							return diodes[j - 1].getDefaultState().withProperty(INPUT, state.getValue(INPUT));
						}
					};
				diodes[j].setUnlocalizedName("diode5in_" + i);
				if(i == 0)
					diodes[j].setCreativeTab(CreativeTabs.tabRedstone);
			}
		return diodes;
	}

	public static BlockDiode[] createVerticalReceivers() {

		final BlockDiode[] diodes = new BlockDiode[1];
			diodes[0] = new BlockDiode2In(Gate.OR, 0) {
				@Override
				public BlockDiode getBaseBlock() {
					return diodes[0];
				}

				@Override
				public EnumFacing getInput(IBlockState state, int index) {
					return EnumFacing.values()[index];
				}

				@Override
				public IBlockState rotate(IBlockState state) {
					return diodes[0].getDefaultState()
							.withProperty(OUT, state.getValue(OUT))
							.withProperty(INPUT, state.getValue(INPUT));
				}

				@Override
				public boolean onBlockActivated(
						World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side,
						float hitX, float hitY, float hitZ) {
					return false;
				}
			};
			diodes[0].setUnlocalizedName("vertical_receiver");
			diodes[0].setCreativeTab(CreativeTabs.tabRedstone);
		return diodes;
	}
}
