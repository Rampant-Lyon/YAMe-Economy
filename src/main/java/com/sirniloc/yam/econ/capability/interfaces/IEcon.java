package com.sirniloc.yam.econ.capability.interfaces;

import com.sirniloc.yam.econ.capability.Econ;

public interface IEcon {

	void setMoneyDouble(double double1);

	double getMoney();
	

	void cloneABS(Econ abs);

	Econ getEcon();

}
