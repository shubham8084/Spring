package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.EcomExp;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static {
		//
		try {
			// locate property file
			InputStream is = new FileInputStream("src/com/nt/common/info.properties");
			// create obj for properties file
			props = new Properties();
			// load property file
			props.load(is);
		} // try
		catch (Exception e) {
			e.printStackTrace();
		} // catch
	}// static

	@SuppressWarnings("deprecation")
	public static Flipkart getInstant() {
		// declaried variable
		Courier courier = null;
		Flipkart fpkt = null;
		Class c1 = null;
		try {
			// load dependet class
			c1 = Class.forName(props.getProperty("sdp.dependent"));
			// cretr obj for depend class
			courier = (Courier) c1.newInstance();
			// create target class
			fpkt = new Flipkart();
			// asssign dependent class
			fpkt.setCourier(courier);

		} // try
		catch (Exception ex) {
			ex.printStackTrace();
		} // catch

		return fpkt;
	}

}
