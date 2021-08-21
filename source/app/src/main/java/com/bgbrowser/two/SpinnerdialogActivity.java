package com.bgbrowser.two;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class SpinnerdialogActivity extends AppCompatActivity {
	
	private LinearLayout linear6;
	private LinearLayout linear9;
	private CardView mdialogcard;
	private LinearLayout mdialoglinear;
	private CardView cardview5;
	private CardView cardview1;
	private CardView cardview2;
	private CardView cardview4;
	private CardView cardview3;
	private LinearLayout linear12;
	private ImageView imageview5;
	private TextView textview5;
	private LinearLayout linear7;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear8;
	private ImageView imageview2;
	private TextView textview2;
	private LinearLayout linear11;
	private ImageView imageview4;
	private TextView textview4;
	private LinearLayout linear10;
	private ImageView imageview3;
	private TextView textview3;
	
	private SharedPreferences settings;
	private Intent ld = new Intent();
	private Intent jx = new Intent();
	private SharedPreferences pdf;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.spinnerdialog);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		mdialogcard = (CardView) findViewById(R.id.mdialogcard);
		mdialoglinear = (LinearLayout) findViewById(R.id.mdialoglinear);
		cardview5 = (CardView) findViewById(R.id.cardview5);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		cardview4 = (CardView) findViewById(R.id.cardview4);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview3 = (TextView) findViewById(R.id.textview3);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		pdf = getSharedPreferences("pdf", Activity.MODE_PRIVATE);
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		cardview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cardview5.setVisibility(View.GONE);
				settings.edit().putString("cookies", "1").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Cookies are enabled");
			}
		});
		
		cardview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ld.setClass(getApplicationContext(), DownloadActivity.class);
				startActivity(ld);
				finish();
			}
		});
		
		cardview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				jx.setAction(Intent.ACTION_VIEW);
				jx.setClass(getApplicationContext(), SavepdfActivity.class);
				startActivity(jx);
				finish();
			}
		});
		
		cardview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				jx.setAction(Intent.ACTION_VIEW);
				jx.setClass(getApplicationContext(), ForcelaunchActivity.class);
				startActivity(jx);
				finish();
			}
		});
		
		cardview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ld.setClass(getApplicationContext(), SettingsActivity.class);
				startActivity(ld);
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		if (getIntent().getBooleanExtra("dialogTheme",true)) {
			// To make the dialog corners round
			getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
			
			{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				SketchUi.setColor(0x00000000);SketchUi.setCornerRadius(d*15);
				
				((ViewGroup)getWindow().getDecorView()).getChildAt(0).setBackground(SketchUi);
			}
			
			// Codes Generated by SketchUi 
		}
		// you may face some issues if you use enable ActionBar due to dialog theme
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		_setViewSize(linear6, SketchwareUtil.getDisplayWidthPixels(getApplicationContext()) - 130, SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) - 180);
		cardview1.setCardBackgroundColor(0xFFFFFFFF);
		cardview1.setRadius((float)15);
		cardview1.setCardElevation((float)0);
		cardview1.setPreventCornerOverlap(true);
		cardview2.setCardBackgroundColor(0xFFFFFFFF);
		cardview2.setRadius((float)15);
		cardview2.setCardElevation((float)0);
		cardview2.setPreventCornerOverlap(true);
		cardview4.setCardBackgroundColor(0xFFFFFFFF);
		cardview4.setRadius((float)15);
		cardview4.setCardElevation((float)0);
		cardview4.setPreventCornerOverlap(true);
		cardview3.setCardBackgroundColor(0xFFFFFFFF);
		cardview3.setRadius((float)15);
		cardview3.setCardElevation((float)0);
		cardview3.setPreventCornerOverlap(true);
		cardview5.setCardBackgroundColor(0xFFF44336);
		cardview5.setRadius((float)15);
		cardview5.setCardElevation((float)0);
		cardview5.setPreventCornerOverlap(true);
		if (settings.getString("miuispinner", "").equals("1")) {
			mdialogcard.setCardBackgroundColor(0xFF000000);
			mdialogcard.setRadius((float)35);
			mdialogcard.setCardElevation((float)0);
			mdialogcard.setPreventCornerOverlap(true);
		}
		else {
			mdialogcard.setCardBackgroundColor(Color.TRANSPARENT);
			mdialogcard.setRadius((float)15);
			mdialogcard.setCardElevation((float)0);
			mdialogcard.setPreventCornerOverlap(true);
		}
		if (settings.getString("darkmode", "").equals("1")) {
			if (settings.getString("miuispinner", "").equals("1")) {
				mdialogcard.setCardBackgroundColor(0xFF000000);
			}
			else {
				mdialogcard.setCardBackgroundColor(Color.TRANSPARENT);
			}
			cardview1.setCardBackgroundColor(0xFF000000);
			imageview1.setImageResource(R.drawable.ic_get_app_white);
			textview1.setTextColor(0xFFFFFFFF);
			cardview2.setCardBackgroundColor(0xFF000000);
			imageview2.setImageResource(R.drawable.ic_insert_drive_file_white);
			textview2.setTextColor(0xFFFFFFFF);
			cardview4.setCardBackgroundColor(0xFF000000);
			imageview4.setImageResource(R.drawable.ic_announcement_white);
			textview4.setTextColor(0xFFFFFFFF);
			cardview3.setCardBackgroundColor(0xFF000000);
			imageview3.setImageResource(R.drawable.outline_settings_white_48);
			textview3.setTextColor(0xFFFFFFFF);
		}
		else {
			if (settings.getString("miuispinner", "").equals("1")) {
				mdialogcard.setCardBackgroundColor(0xFFFFFFFF);
			}
			else {
				mdialogcard.setCardBackgroundColor(Color.TRANSPARENT);
			}
			cardview1.setCardBackgroundColor(0xFFFFFFFF);
			imageview1.setImageResource(R.drawable.ic_get_app_black);
			textview1.setTextColor(0xFF000000);
			cardview2.setCardBackgroundColor(0xFFFFFFFF);
			imageview2.setImageResource(R.drawable.ic_insert_drive_file_black);
			textview2.setTextColor(0xFF000000);
			cardview4.setCardBackgroundColor(0xFFFFFFFF);
			imageview4.setImageResource(R.drawable.ic_sms_failed_black);
			textview4.setTextColor(0xFF000000);
			cardview3.setCardBackgroundColor(0xFFFFFFFF);
			imageview3.setImageResource(R.drawable.settings);
			textview3.setTextColor(0xFF000000);
		}
		if (settings.getString("cookies", "").equals("1")) {
			cardview5.setVisibility(View.GONE);
		}
	}
	public void _dialogTheme () {
	}
	// setTheme() should be set before setContentView() so a small hack to do this in sketchware
	 @Override 
	    public void setContentView( int layoutResID) {
		if(getIntent().getBooleanExtra("dialogTheme",true)){
			supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
			setTheme(R.style.Theme_AppCompat_Light_Dialog);
			setFinishOnTouchOutside(false);
			
			//change true to false if you want to make dialog non cancellable when clicked outside
			//if you want to use this without app compat  change supportRequestWindowFeature() and setTheme() to below codes.
			/*
requestWindowFeature(Window.FEATURE_NO_TITLE);
setTheme(android.R.style.Theme_Dialog);
*/
			// Calling this allows the Activity behind this one to be seen again. Once all such Activities have been redrawn
			try {
				 	java.lang.reflect.Method getActivityOptions = Activity.class.getDeclaredMethod("getActivityOptions"); getActivityOptions.setAccessible(true);
				 Object options = getActivityOptions.invoke(this); Class<?>[] classes = Activity.class.getDeclaredClasses(); Class<?> translucentConversionListenerClazz = null; 
				for (Class clazz : classes) { if (clazz.getSimpleName().contains("TranslucentConversionListener")) { translucentConversionListenerClazz = clazz; } } 
				java.lang.reflect.Method convertToTranslucent = Activity.class.getDeclaredMethod("convertToTranslucent", translucentConversionListenerClazz, ActivityOptions.class); convertToTranslucent.setAccessible(true); convertToTranslucent.invoke(this, null, options); } catch (Throwable t) {
			}
		}
		super.setContentView(layoutResID);  
	}
	{
	}
	
	
	public void _setViewSize (final View _view1, final double _width, final double _height) {
		_view1.setLayoutParams(new LinearLayout.LayoutParams((int)_width, (int)_height));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}