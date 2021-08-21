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
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.widget.ImageView;
import android.widget.Button;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.view.View;
import android.graphics.Typeface;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class SettingsActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private boolean isChecked = false;
	
	private ArrayList<HashMap<String, Object>> map1 = new ArrayList<>();
	
	private LinearLayout topbar;
	private ScrollView vscroll1;
	private LinearLayout linear22;
	private TextView textview1;
	private LinearLayout linear2;
	private TextView resultado;
	private TextView languagetext;
	private CardView cardview1;
	private CardView cardview19;
	private CardView cardview4;
	private CardView cardview5;
	private TextView textview14;
	private TextView textview96;
	private LinearLayout linear81;
	private LinearLayout linear75;
	private TextView textview10;
	private LinearLayout linear76;
	private ImageView imageview3;
	private LinearLayout linear77;
	private TextView textview95;
	private LinearLayout linear78;
	private ImageView imageview4;
	private LinearLayout linear60;
	private TextView textview5;
	private LinearLayout linear7;
	private ImageView imageview6;
	private LinearLayout linear10;
	private Button button1;
	
	private SharedPreferences adaptive;
	private Intent kk = new Intent();
	private SharedPreferences settings;
	private AlertDialog.Builder updatelog;
	private AlertDialog.Builder credits;
	private SharedPreferences ex;
	private TimerTask lamguage;
	private TimerTask settreloader;
	private TimerTask rounder;
	private TimerTask settingsreloader;
	private Intent tg = new Intent();
	private AlertDialog.Builder nz;
	private SharedPreferences quoter;
	private SharedPreferences logs;
	private Calendar ie = Calendar.getInstance();
	private AlertDialog.Builder rootmode;
	private Intent askhelp = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settings);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		topbar = (LinearLayout) findViewById(R.id.topbar);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		resultado = (TextView) findViewById(R.id.resultado);
		languagetext = (TextView) findViewById(R.id.languagetext);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		cardview19 = (CardView) findViewById(R.id.cardview19);
		cardview4 = (CardView) findViewById(R.id.cardview4);
		cardview5 = (CardView) findViewById(R.id.cardview5);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview96 = (TextView) findViewById(R.id.textview96);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		linear75 = (LinearLayout) findViewById(R.id.linear75);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear76 = (LinearLayout) findViewById(R.id.linear76);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		linear77 = (LinearLayout) findViewById(R.id.linear77);
		textview95 = (TextView) findViewById(R.id.textview95);
		linear78 = (LinearLayout) findViewById(R.id.linear78);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		button1 = (Button) findViewById(R.id.button1);
		adaptive = getSharedPreferences("adaptive", Activity.MODE_PRIVATE);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		updatelog = new AlertDialog.Builder(this);
		credits = new AlertDialog.Builder(this);
		ex = getSharedPreferences("ex", Activity.MODE_PRIVATE);
		nz = new AlertDialog.Builder(this);
		quoter = getSharedPreferences("quoter", Activity.MODE_PRIVATE);
		logs = getSharedPreferences("logs", Activity.MODE_PRIVATE);
		rootmode = new AlertDialog.Builder(this);
		
		cardview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kk.setClass(getApplicationContext(), SettingsGeneralActivity.class);
				startActivity(kk);
			}
		});
		
		cardview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kk.setClass(getApplicationContext(), CreditsActivity.class);
				startActivity(kk);
			}
		});
		
		cardview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kk.setClass(getApplicationContext(), ExperimentalActivity.class);
				startActivity(kk);
				finish();
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				logs.edit().putString("logs", logs.getString("logs", "").concat("\n[".concat(new SimpleDateFormat("hh:mm:ss").format(ie.getTime()).concat("]".concat("Intent:Telegram.me"))))).commit();
				tg.setAction(Intent.ACTION_VIEW);
				tg.setData(Uri.parse("https://t.me/artenos_community"));
				startActivity(tg);
			}
		});
		
		textview96.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				askhelp.setAction(Intent.ACTION_VIEW);
				askhelp.setClass(getApplicationContext(), SendhelpActivity.class);
				startActivity(askhelp);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				updatelog.setTitle("Update Log");
				updatelog.setMessage("-SCROLL AL THE WAY DOWN-\n-FOR THE LASTEST LOG-\n\nJune 9#1:\nApp translated to english\n\nJune 9#2:\nSearch feature\n\nJune 9#3:\nMaterial URL Bar\n\nJune 9#4:\nAdaptive Opening Removed\nLoading circle removed\nChanged position of icons for more space\n\nJune 10#1:\nExperimental features\n\nJune 10#2:\nDownload enabled\n\nJune 10#3:\nHome Page URL Editing\n\nJune 10#4:\nNew outlined material icons\n\nJune 18:\nThird Tab[EX]\nInterface Fixes\n\nJune 26#1:\nWelcome/Setup Screen\n\nJune 26#2:\nUpdate Log Page\nHome page(when there is no URL loaded)\nNew Icon,thanks to Solid Designs from Telegram\n\nJune 26#3:\nFixed bypassing setup screen\n\nJune 26#4:\nChanged IME type to \"done\"\n\nJune 26#5:\nAdded credits page\n\nJune 26#6:\nFixed not added [June 26#5] log\n\nJune 26#7:\nAdded two more persons to Credits\nFixed home button doesnt work on Tab 3(thanks for report,Wind/owz!)\n\nJune 27:\nFixed a tab glitch(thanks Aless!)\n\nJune 28#1:\nEnabled upload(Thanks for testing Solid Designs!)\n\nJune 28#2:\nAdded Google Sans Font(thanks for sending me file/suggestion Aless/Solid Designs!)\n\nJune 28#3:\nAdded language support\n\nJune 28#4:\nVietnam translation(thanks Reggyxt!)\n\nJune 28#5:\nFixed English language does not take effect\n\nJune28#6:\nMade url bar actually material\nChanged loading animation beacuse doesnt wotk with material url bar\n\nJune28#7:\nMade update where it attempts to fix a bug that causes codebase to mess up\n\nJune 28#8:\nAdded spacing option for navigation gestures\nChanged settings interface\n\nJune 28#9:\nAdded Webud search\n\nJune 29#1:\nChanged interface\nChanged link of Webud search\n\nJune 29#2:\nFixed some translations(thanks Wind/owz!)\n\nJune 29#3:\nDark mode added\n\nJune 29#4:\nMade Dark Mode Premium\nSome fixes under the hood\n\nJuly 1#1:\nExpired code:FANOFTESLA2020\nFixed [June 29#4] log did not show up an update\n\nJuly 2#1:\nAdded option to change default search engine\nFixed [June 29#4] and [July 1#1] log did not show up some updates\n\nJuly 2#2:\nRemoved Webud search button\n\nJuly 4#1:\nAdded DuckDuckGo&Yahoo(thanks for recommendation @Stingenstein!)\n\nJuly 4#2:\nAdded Bing(thanks for recommendation Aless!)\nFixed translations that does not take effect\nAdded one more person&edited Credits page\n\nJuly 4#3:\nAdded Telegram button\n\nJuly 4#4:\nAdded an option for material navbar(Q only)\n\nSeptember 6#1:\nAdded white status bar");
				updatelog.setPositiveButton("Close", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				updatelog.create().show();
			}
		});
	}
	
	private void initializeLogic() {
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);SketchUi.setCornerRadii(new float[]{
				d*0,d*0,d*0 ,d*0,d*16,d*16 ,d*16,d*16});
			topbar.setElevation(d*2);
			topbar.setBackground(SketchUi);
		}
		languagetext.setText(Locale.getDefault().getDisplayLanguage());
		cardview5.setVisibility(View.GONE);
		_language();
		_googlesans();
		_rounders();
		_shades();
		settingsreloader = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_darkmode();
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(settingsreloader, (int)(0), (int)(500));
		Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor("#9E9E9E"));
		button1.setVisibility(View.GONE);
		_setViewSize(linear81, 15, SketchwareUtil.getDisplayHeightPixels(getApplicationContext()));
		_LinearRipple(linear75);
		_LinearRipple(linear77);
		_LinearRipple(linear60);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _language () {
		
	}
	
	
	public void _googlesans () {
		if (ex.getString("googlesans", "").equals("1")) {
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
			textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
			button1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
			
			
			
			textview10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
		}
	}
	
	
	public void _darkmode () {
		if (settings.getString("darkmode", "").equals("1")) {
			linear2.setBackgroundColor(0xFF212121);
			topbar.setBackgroundColor(0xFF212121);
			textview1.setTextColor(0xFFFFFFFF);
			cardview1.setCardBackgroundColor(0xFF000000);
			cardview4.setCardBackgroundColor(0xFF000000);
			cardview5.setCardBackgroundColor(0xFF000000);
			cardview19.setCardBackgroundColor(0xFF000000);
			rootmode = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
			nz = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
			textview10.setTextColor(0xFFFFFFFF);
			textview5.setTextColor(0xFFFFFFFF);
			button1.setTextColor(0xFFFFFFFF);
			button1.setBackgroundColor(0xFF000000);
			imageview3.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
			textview95.setTextColor(0xFFFFFFFF);
			imageview4.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
			imageview6.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
			
			Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#212121"));
			View decor = getWindow().getDecorView();
			decor.setSystemUiVisibility(0);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =SettingsActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF212121);
			}
		}
		else {
			cardview1.setCardBackgroundColor(0xFFFFFFFF);
			cardview4.setCardBackgroundColor(0xFFFFFFFF);
			cardview5.setCardBackgroundColor(0xFFFFFFFF);
			cardview19.setCardBackgroundColor(0xFFFFFFFF);
			rootmode = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
			nz = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
			topbar.setBackgroundColor(0xFFF5F5F5);
			linear2.setBackgroundColor(0xFFF5F5F5);
			textview1.setTextColor(0xFF000000);
			textview10.setTextColor(0xFF000000);
			textview5.setTextColor(0xFF000000);
			button1.setTextColor(0xFF000000);
			button1.setBackgroundColor(0xFFFFFFFF);
			imageview3.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
			textview95.setTextColor(0xFF000000);
			imageview4.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
			imageview6.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
			if (settings.getString("mnb", "").equals("1")) {
				
				Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#F5F5F5"));
			}
			else {
				
				Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#000000"));
			}
			View decor = getWindow().getDecorView();
			decor.setSystemUiVisibility(0);
			getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
			getWindow().setStatusBarColor(0xFFFFFFFF);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =SettingsActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFF5F5F5);
			}
		}
	}
	
	
	public void _quoterandomizer () {
		quoter.edit().putString("quoter", String.valueOf((long)(SketchwareUtil.getRandom((int)(1), (int)(6))))).commit();
		if (quoter.getString("quoter", "").equals("1")) {
			
		}
		else {
			if (quoter.getString("quoter", "").equals("2")) {
				
			}
			else {
				if (quoter.getString("quoter", "").equals("3")) {
					
				}
				else {
					if (quoter.getString("quoter", "").equals("4")) {
						
					}
					else {
						if (quoter.getString("quoter", "").equals("5")) {
							
						}
						else {
							if (quoter.getString("quoter", "").equals("6")) {
								
							}
							else {
								
							}
						}
					}
				}
			}
		}
	}
	
	
	public void _shades () {
		
	}
	
	
	public void _rounders () {
		cardview1.setCardBackgroundColor(0xFFFFFFFF);
		cardview1.setRadius((float)15);
		cardview1.setCardElevation((float)8);
		cardview1.setPreventCornerOverlap(true);
		cardview19.setCardBackgroundColor(0xFFFFFFFF);
		cardview19.setRadius((float)15);
		cardview19.setCardElevation((float)8);
		cardview19.setPreventCornerOverlap(true);
		cardview4.setCardBackgroundColor(0xFFFFFFFF);
		cardview4.setRadius((float)15);
		cardview4.setCardElevation((float)8);
		cardview4.setPreventCornerOverlap(true);
		cardview5.setCardBackgroundColor(0xFFFFFFFF);
		cardview5.setRadius((float)15);
		cardview5.setCardElevation((float)8);
		cardview5.setPreventCornerOverlap(true);
	}
	
	
	public void _setViewSize (final View _view1, final double _width, final double _height) {
		_view1.setLayoutParams(new LinearLayout.LayoutParams((int)_width, (int)_height));
	}
	
	
	public void _LinearRipple (final View _view) {
		if (settings.getString("darkmode", "").equals("1")) {
			{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				SketchUi.setColor(0x00000000);android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFC3C3C3}), SketchUi, null);
				_view.setBackground(SketchUi_RD);
			}
		}
		else {
			{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				SketchUi.setColor(0xFFFFFFFF);android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFC3C3C3}), SketchUi, null);
				_view.setBackground(SketchUi_RD);
			}
		}
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