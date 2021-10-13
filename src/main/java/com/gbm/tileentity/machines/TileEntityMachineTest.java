package com.gbm.tileentity.machines;

import com.hbm.interfaces.IConsumer;

import net.minecraft.tileentity.TileEntity;

public class TileEntityMachineTest extends TileEntity implements IConsumer {
	public long power;
	@Override
	public void setPower(long i) {
		// TODO Auto-generated method stub
		power = i;
	}

	@Override
	public long getPower() {
		// TODO Auto-generated method stub
		return power;
	}

	@Override
	public long getMaxPower() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
