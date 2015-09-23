package com.baris.denemeharita;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

	final int PAGE_COUNT = 3;
	// Tab Titles
	private String tabtitles[] = new String[] { "Bina Geocode - Mahalle Adı", "Cadde-Sokak Adı/Kodu", "Tab3" };
	Context context;

	public ViewPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public int getCount() {
		return PAGE_COUNT;
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {

			// Open BinaGeocodeveMahalleAdi.java
		case 0:
			BinaGeocodeveMahalleAdi fragmenttab1 = new BinaGeocodeveMahalleAdi();
			return fragmenttab1;

			// Open BinaCaddeSokak.java
		case 1:
			BinaCaddeSokak fragmenttab2 = new BinaCaddeSokak();
			return fragmenttab2;

			// Open FragmentTab3.java
		case 2:
			FragmentTab3 fragmenttab3 = new FragmentTab3();
			return fragmenttab3;
		}
		return null;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return tabtitles[position];
	}
}
