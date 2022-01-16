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
import android.widget.ImageView;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import androidx.webkit.*;
import com.hkm.ezwebview.*;
import com.monstertechno.adblocker.*;
import im.delight.android.webview.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class OpentabsActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private TextView textview1;
	private LinearLayout tab1;
	private LinearLayout tab2;
	private LinearLayout tab3;
	private LinearLayout tab4;
	private LinearLayout linear3;
	private TextView tab1title;
	private TextView tab1link;
	private TextView tab2title;
	private TextView tab2link;
	private TextView tab3title;
	private TextView tab3link;
	private TextView tab4title;
	private TextView tab4link;
	private LinearLayout tabclose;
	private LinearLayout tabadd;
	private ImageView imageview2;
	private ImageView imageview1;
	
	private SharedPreferences tabcount;
	private SharedPreferences tabtitles;
	private SharedPreferences selectedtab;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.opentabs);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview1 = (TextView) findViewById(R.id.textview1);
		tab1 = (LinearLayout) findViewById(R.id.tab1);
		tab2 = (LinearLayout) findViewById(R.id.tab2);
		tab3 = (LinearLayout) findViewById(R.id.tab3);
		tab4 = (LinearLayout) findViewById(R.id.tab4);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		tab1title = (TextView) findViewById(R.id.tab1title);
		tab1link = (TextView) findViewById(R.id.tab1link);
		tab2title = (TextView) findViewById(R.id.tab2title);
		tab2link = (TextView) findViewById(R.id.tab2link);
		tab3title = (TextView) findViewById(R.id.tab3title);
		tab3link = (TextView) findViewById(R.id.tab3link);
		tab4title = (TextView) findViewById(R.id.tab4title);
		tab4link = (TextView) findViewById(R.id.tab4link);
		tabclose = (LinearLayout) findViewById(R.id.tabclose);
		tabadd = (LinearLayout) findViewById(R.id.tabadd);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		tabcount = getSharedPreferences("tabcount", Activity.MODE_PRIVATE);
		tabtitles = getSharedPreferences("tabtitles", Activity.MODE_PRIVATE);
		selectedtab = getSharedPreferences("selectedtab", Activity.MODE_PRIVATE);
		
		tab1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				selectedtab.edit().putString("selectedtab", "1").commit();
				selectedtab.edit().putString("choose", "1").commit();
				finish();
			}
		});
		
		tab2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				selectedtab.edit().putString("selectedtab", "2").commit();
				finish();
			}
		});
		
		tab3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				selectedtab.edit().putString("selectedtab", "3").commit();
				finish();
			}
		});
		
		tab4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				selectedtab.edit().putString("selectedtab", "4").commit();
				finish();
			}
		});
		
		tabclose.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (tabcount.getString("tabcount", "").equals("4")) {
					tab1.setVisibility(View.VISIBLE);
					tab2.setVisibility(View.VISIBLE);
					tab3.setVisibility(View.VISIBLE);
					tab4.setVisibility(View.GONE);
					tabadd.setVisibility(View.VISIBLE);
					tabclose.setVisibility(View.VISIBLE);
					tabcount.edit().putString("tabcount", "3").commit();
				}
				else {
					if (tabcount.getString("tabcount", "").equals("3")) {
						tab1.setVisibility(View.VISIBLE);
						tab2.setVisibility(View.VISIBLE);
						tab3.setVisibility(View.GONE);
						tab4.setVisibility(View.GONE);
						tabadd.setVisibility(View.VISIBLE);
						tabclose.setVisibility(View.VISIBLE);
						tabcount.edit().putString("tabcount", "2").commit();
					}
					else {
						if (tabcount.getString("tabcount", "").equals("2")) {
							tab1.setVisibility(View.VISIBLE);
							tab2.setVisibility(View.GONE);
							tab3.setVisibility(View.GONE);
							tab4.setVisibility(View.GONE);
							tabadd.setVisibility(View.VISIBLE);
							tabclose.setVisibility(View.GONE);
							tabcount.edit().putString("tabcount", "1").commit();
						}
						else {
							
						}
					}
				}
			}
		});
		
		tabadd.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (tabcount.getString("tabcount", "").equals("1")) {
					tab1.setVisibility(View.VISIBLE);
					tab2.setVisibility(View.VISIBLE);
					tab3.setVisibility(View.GONE);
					tab4.setVisibility(View.GONE);
					tabadd.setVisibility(View.VISIBLE);
					tabclose.setVisibility(View.VISIBLE);
					tabcount.edit().putString("tabcount", "2").commit();
				}
				else {
					if (tabcount.getString("tabcount", "").equals("2")) {
						tab1.setVisibility(View.VISIBLE);
						tab2.setVisibility(View.VISIBLE);
						tab3.setVisibility(View.VISIBLE);
						tab4.setVisibility(View.GONE);
						tabadd.setVisibility(View.VISIBLE);
						tabclose.setVisibility(View.VISIBLE);
						tabcount.edit().putString("tabcount", "3").commit();
					}
					else {
						if (tabcount.getString("tabcount", "").equals("3")) {
							tab1.setVisibility(View.VISIBLE);
							tab2.setVisibility(View.VISIBLE);
							tab3.setVisibility(View.VISIBLE);
							tab4.setVisibility(View.VISIBLE);
							tabadd.setVisibility(View.GONE);
							tabclose.setVisibility(View.VISIBLE);
							tabcount.edit().putString("tabcount", "4").commit();
						}
						else {
							
						}
					}
				}
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
		_setViewSize(linear1, SketchwareUtil.getDisplayWidthPixels(getApplicationContext()) - 130, SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) - 180);
		if (tabcount.getString("tabcount", "").equals("1")) {
			tab2.setVisibility(View.GONE);
			tab3.setVisibility(View.GONE);
			tab4.setVisibility(View.GONE);
			tabclose.setVisibility(View.GONE);
		}
		if (tabcount.getString("tabcount", "").equals("2")) {
			tab3.setVisibility(View.GONE);
			tab4.setVisibility(View.GONE);
		}
		if (tabcount.getString("tabcount", "").equals("3")) {
			tab4.setVisibility(View.GONE);
		}
		if (tabcount.getString("tabcount", "").equals("3")) {
			tabadd.setVisibility(View.GONE);
		}
		tab1title.setText(tabtitles.getString("1title", ""));
		tab1link.setText(tabtitles.getString("1link", ""));
		tab2title.setText(tabtitles.getString("2title", ""));
		tab2link.setText(tabtitles.getString("2link", ""));
		tab3title.setText(tabtitles.getString("3title", ""));
		tab3link.setText(tabtitles.getString("3link", ""));
		tab4title.setText(tabtitles.getString("4title", ""));
		tab4link.setText(tabtitles.getString("4link", ""));
		_rippleRoundStroke(linear2, "#FFFFFF", "#000000", 15, 0, "#000000");
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
	
	
	public void _rippleRoundStroke (final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
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