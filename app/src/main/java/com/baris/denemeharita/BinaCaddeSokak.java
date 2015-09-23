package com.baris.denemeharita;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BinaCaddeSokak extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Get the view from bina_cadde_sokak.xml.xml
		View view = inflater.inflate(R.layout.bina_cadde_sokak, container, false);
		return view;
	}

}
