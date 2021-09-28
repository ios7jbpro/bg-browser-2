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
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.widget.ScrollView;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.webkit.*;
import com.tuyenmonkey.mkloader.*;
import com.monstertechno.adblocker.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class ForcelaunchActivity extends AppCompatActivity {
	
	private LinearLayout linear6;
	private LinearLayout linear9;
	private TextView textview17;
	private CardView mdialogcard;
	private ScrollView vscroll1;
	private LinearLayout mdialoglinear;
	private CardView cardview1;
	private CardView cardview2;
	private CardView cardview4;
	private CardView cardview3;
	private CardView cardview5;
	private CardView cardview6;
	private CardView cardview8;
	private CardView cardview9;
	private CardView cardview10;
	private CardView cardview11;
	private CardView cardview12;
	private CardView cardview13;
	private CardView cardview14;
	private CardView cardview15;
	private CardView cardview16;
	private LinearLayout linear7;
	private TextView textview1;
	private LinearLayout linear8;
	private TextView textview2;
	private LinearLayout linear11;
	private TextView textview4;
	private LinearLayout linear10;
	private TextView textview3;
	private LinearLayout linear12;
	private TextView textview5;
	private LinearLayout linear13;
	private TextView textview6;
	private LinearLayout linear15;
	private TextView textview8;
	private LinearLayout linear16;
	private TextView textview9;
	private LinearLayout linear17;
	private TextView textview10;
	private LinearLayout linear18;
	private TextView textview11;
	private LinearLayout linear19;
	private TextView textview12;
	private LinearLayout linear20;
	private TextView textview13;
	private LinearLayout linear21;
	private TextView textview14;
	private LinearLayout linear22;
	private TextView textview15;
	private LinearLayout linear23;
	private TextView textview16;
	
	private SharedPreferences settings;
	private Intent a = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.forcelaunch);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview17 = (TextView) findViewById(R.id.textview17);
		mdialogcard = (CardView) findViewById(R.id.mdialogcard);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		mdialoglinear = (LinearLayout) findViewById(R.id.mdialoglinear);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		cardview4 = (CardView) findViewById(R.id.cardview4);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		cardview5 = (CardView) findViewById(R.id.cardview5);
		cardview6 = (CardView) findViewById(R.id.cardview6);
		cardview8 = (CardView) findViewById(R.id.cardview8);
		cardview9 = (CardView) findViewById(R.id.cardview9);
		cardview10 = (CardView) findViewById(R.id.cardview10);
		cardview11 = (CardView) findViewById(R.id.cardview11);
		cardview12 = (CardView) findViewById(R.id.cardview12);
		cardview13 = (CardView) findViewById(R.id.cardview13);
		cardview14 = (CardView) findViewById(R.id.cardview14);
		cardview15 = (CardView) findViewById(R.id.cardview15);
		cardview16 = (CardView) findViewById(R.id.cardview16);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		textview9 = (TextView) findViewById(R.id.textview9);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview11 = (TextView) findViewById(R.id.textview11);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		textview12 = (TextView) findViewById(R.id.textview12);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		textview13 = (TextView) findViewById(R.id.textview13);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		textview14 = (TextView) findViewById(R.id.textview14);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview15 = (TextView) findViewById(R.id.textview15);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		textview16 = (TextView) findViewById(R.id.textview16);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		cardview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), MainActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		cardview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), ExperimentalActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		cardview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), Welcome1Activity.class);
				startActivity(a);
				finish();
			}
		});
		
		cardview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), Welcome2Activity.class);
				startActivity(a);
				finish();
			}
		});
		
		cardview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), LanguageActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		cardview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				startActivity(a);
				finish();
			}
		});
		
		cardview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), HistoryActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		cardview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), DebugActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		cardview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), SettingsGeneralActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		cardview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				startActivity(a);
				finish();
			}
		});
		
		cardview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), SplashActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		cardview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), YtfullscreenActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		cardview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), PipactivityActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), SettingsActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a.setClass(getApplicationContext(), CreditsActivity.class);
				startActivity(a);
				finish();
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				startActivity(a);
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
		SketchwareUtil.showMessage(getApplicationContext(), "This is something for developers. Be careful!");
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
		cardview5.setCardBackgroundColor(0xFFFFFFFF);
		cardview5.setRadius((float)15);
		cardview5.setCardElevation((float)0);
		cardview5.setPreventCornerOverlap(true);
		cardview6.setCardBackgroundColor(0xFFFFFFFF);
		cardview6.setRadius((float)15);
		cardview6.setCardElevation((float)0);
		cardview6.setPreventCornerOverlap(true);
		cardview8.setCardBackgroundColor(0xFFFFFFFF);
		cardview8.setRadius((float)15);
		cardview8.setCardElevation((float)0);
		cardview8.setPreventCornerOverlap(true);
		cardview9.setCardBackgroundColor(0xFFFFFFFF);
		cardview9.setRadius((float)15);
		cardview9.setCardElevation((float)0);
		cardview9.setPreventCornerOverlap(true);
		cardview10.setCardBackgroundColor(0xFFFFFFFF);
		cardview10.setRadius((float)15);
		cardview10.setCardElevation((float)0);
		cardview10.setPreventCornerOverlap(true);
		cardview11.setCardBackgroundColor(0xFFFFFFFF);
		cardview11.setRadius((float)15);
		cardview11.setCardElevation((float)0);
		cardview11.setPreventCornerOverlap(true);
		cardview12.setCardBackgroundColor(0xFFFFFFFF);
		cardview12.setRadius((float)15);
		cardview12.setCardElevation((float)0);
		cardview12.setPreventCornerOverlap(true);
		cardview13.setCardBackgroundColor(0xFFFFFFFF);
		cardview13.setRadius((float)15);
		cardview13.setCardElevation((float)0);
		cardview13.setPreventCornerOverlap(true);
		cardview14.setCardBackgroundColor(0xFFFFFFFF);
		cardview14.setRadius((float)15);
		cardview14.setCardElevation((float)0);
		cardview14.setPreventCornerOverlap(true);
		cardview15.setCardBackgroundColor(0xFFFFFFFF);
		cardview15.setRadius((float)15);
		cardview15.setCardElevation((float)0);
		cardview15.setPreventCornerOverlap(true);
		cardview16.setCardBackgroundColor(0xFFFFFFFF);
		cardview16.setRadius((float)15);
		cardview16.setCardElevation((float)0);
		cardview16.setPreventCornerOverlap(true);
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
			textview1.setTextColor(0xFFFFFFFF);
			cardview2.setCardBackgroundColor(0xFF000000);
			textview2.setTextColor(0xFFFFFFFF);
			cardview4.setCardBackgroundColor(0xFF000000);
			textview4.setTextColor(0xFFFFFFFF);
			cardview3.setCardBackgroundColor(0xFF000000);
			textview3.setTextColor(0xFFFFFFFF);
			cardview5.setCardBackgroundColor(0xFF000000);
			textview5.setTextColor(0xFFFFFFFF);
			cardview6.setCardBackgroundColor(0xFF000000);
			textview6.setTextColor(0xFFFFFFFF);
			cardview8.setCardBackgroundColor(0xFF000000);
			textview8.setTextColor(0xFFFFFFFF);
			cardview9.setCardBackgroundColor(0xFF000000);
			textview9.setTextColor(0xFFFFFFFF);
			cardview10.setCardBackgroundColor(0xFF000000);
			textview10.setTextColor(0xFFFFFFFF);
			cardview11.setCardBackgroundColor(0xFF000000);
			textview11.setTextColor(0xFFFFFFFF);
			cardview12.setCardBackgroundColor(0xFF000000);
			textview12.setTextColor(0xFFFFFFFF);
			cardview13.setCardBackgroundColor(0xFF000000);
			textview13.setTextColor(0xFFFFFFFF);
			cardview14.setCardBackgroundColor(0xFF000000);
			textview14.setTextColor(0xFFFFFFFF);
			cardview15.setCardBackgroundColor(0xFF000000);
			textview15.setTextColor(0xFFFFFFFF);
			cardview16.setCardBackgroundColor(0xFF000000);
			textview16.setTextColor(0xFFFFFFFF);
		}
		else {
			if (settings.getString("miuispinner", "").equals("1")) {
				mdialogcard.setCardBackgroundColor(0xFFFFFFFF);
			}
			else {
				mdialogcard.setCardBackgroundColor(Color.TRANSPARENT);
			}
			cardview1.setCardBackgroundColor(0xFFFFFFFF);
			textview1.setTextColor(0xFF000000);
			cardview2.setCardBackgroundColor(0xFFFFFFFF);
			textview2.setTextColor(0xFF000000);
			cardview4.setCardBackgroundColor(0xFFFFFFFF);
			textview4.setTextColor(0xFF000000);
			cardview3.setCardBackgroundColor(0xFFFFFFFF);
			textview3.setTextColor(0xFF000000);
			cardview5.setCardBackgroundColor(0xFFFFFFFF);
			textview5.setTextColor(0xFF000000);
			cardview6.setCardBackgroundColor(0xFFFFFFFF);
			textview6.setTextColor(0xFF000000);
			cardview8.setCardBackgroundColor(0xFFFFFFFF);
			textview8.setTextColor(0xFF000000);
			cardview9.setCardBackgroundColor(0xFFFFFFFF);
			textview9.setTextColor(0xFF000000);
			cardview10.setCardBackgroundColor(0xFFFFFFFF);
			textview10.setTextColor(0xFF000000);
			cardview11.setCardBackgroundColor(0xFFFFFFFF);
			textview11.setTextColor(0xFF000000);
			cardview12.setCardBackgroundColor(0xFFFFFFFF);
			textview12.setTextColor(0xFF000000);
			cardview13.setCardBackgroundColor(0xFFFFFFFF);
			textview13.setTextColor(0xFF000000);
			cardview14.setCardBackgroundColor(0xFFFFFFFF);
			textview14.setTextColor(0xFF000000);
			cardview15.setCardBackgroundColor(0xFFFFFFFF);
			textview15.setTextColor(0xFF000000);
			cardview16.setCardBackgroundColor(0xFFFFFFFF);
			textview16.setTextColor(0xFF000000);
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