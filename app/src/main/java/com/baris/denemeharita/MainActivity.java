package com.baris.denemeharita;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
		viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));



	}

}