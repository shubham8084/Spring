package com.cb.external;

public class IIplScoreUpdateImpl implements IIplScoreUpdate {

	@Override
	public String getScore(int mid) {

		if (mid == 101)
			return "RR 216/7(20) CSK 200/6(20) Rajasthan Royals won by 16 runs";
		else if (mid == 102)
			return "RCB 163/3(20) SRH 152/10(19.4) Royal challengers Bangalore won by 10 runs";
		else if (mid == 103)
			return "DC 157/8(20) KXIP 157/8(20) Delhi capital won the Super over";
		else
			return "Match Not Found";

	}

}
