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
import androidx.webkit.*;
import com.monstertechno.adblocker.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import java.lang.reflect.*;;

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
	private LinearLayout linear75;
	private LinearLayout linear82;
	private LinearLayout linear60;
	private LinearLayout linear84;
	private CardView cardview5;
	private TextView textview14;
	private TextView textview96;
	private LinearLayout linear81;
	private TextView textview10;
	private LinearLayout linear76;
	private ImageView imageview3;
	private TextView textview97;
	private LinearLayout linear83;
	private ImageView imageview7;
	private TextView textview5;
	private LinearLayout linear7;
	private ImageView imageview6;
	private TextView textview98;
	private LinearLayout linear85;
	private ImageView imageview8;
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
		linear75 = (LinearLayout) findViewById(R.id.linear75);
		linear82 = (LinearLayout) findViewById(R.id.linear82);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		linear84 = (LinearLayout) findViewById(R.id.linear84);
		cardview5 = (CardView) findViewById(R.id.cardview5);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview96 = (TextView) findViewById(R.id.textview96);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear76 = (LinearLayout) findViewById(R.id.linear76);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview97 = (TextView) findViewById(R.id.textview97);
		linear83 = (LinearLayout) findViewById(R.id.linear83);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview98 = (TextView) findViewById(R.id.textview98);
		linear85 = (LinearLayout) findViewById(R.id.linear85);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
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
		
		linear75.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kk.setClass(getApplicationContext(), SettingsGeneralActivity.class);
				startActivity(kk);
			}
		});
		
		linear82.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kk.setClass(getApplicationContext(), CreditsActivity.class);
				startActivity(kk);
			}
		});
		
		linear60.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kk.setClass(getApplicationContext(), ExperimentalActivity.class);
				startActivity(kk);
				finish();
			}
		});
		
		linear84.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kk.setClass(getApplicationContext(), UpdatelogActivity.class);
				startActivity(kk);
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
				
			}
		});
	}
	
	private void initializeLogic() {
		_function();
		languagetext.setText(Locale.getDefault().getDisplayLanguage());
		cardview5.setVisibility(View.GONE);
		_language();
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
		linear60.setVisibility(View.GONE);
		_setViewSize(linear81, 15, SketchwareUtil.getDisplayHeightPixels(getApplicationContext()));
		if (settings.getString("flagfollowsystem", "").equals("1")) {
			switch (getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) {
				    case Configuration.UI_MODE_NIGHT_YES:
				settings.edit().putString("darkmode", "1").commit();
				
				        break;
				    case Configuration.UI_MODE_NIGHT_NO:
				settings.edit().putString("darkmode", "0").commit();
				break; 
			}
		}
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
	
	
	public void _darkmode () {
		if (Double.parseDouble(Build.VERSION.SDK) > 30) {
			if (settings.getString("darkmode", "").equals("1")) {
				linear2.setBackgroundColor(getColor("system_accent2_800"));
				topbar.setBackgroundColor(getColor("system_accent2_800"));
				textview1.setTextColor(0xFFFFFFFF);
				cardview5.setCardBackgroundColor(0xFF000000);
				textview10.setTextColor(0xFFFFFFFF);
				textview5.setTextColor(0xFFFFFFFF);
				button1.setTextColor(0xFFFFFFFF);
				button1.setBackgroundColor(0xFF000000);
				imageview3.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
				textview97.setTextColor(0xFFFFFFFF);
				textview98.setTextColor(0xFFFFFFFF);
				imageview7.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
				imageview6.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
				imageview8.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
			}
			else {
				linear2.setBackgroundColor(getColor("system_accent2_50"));
				topbar.setBackgroundColor(getColor("system_accent2_50"));
				cardview5.setCardBackgroundColor(0xFFFFFFFF);
				textview1.setTextColor(0xFF000000);
				textview10.setTextColor(0xFF000000);
				textview5.setTextColor(0xFF000000);
				button1.setTextColor(0xFF000000);
				button1.setBackgroundColor(0xFFFFFFFF);
				imageview3.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
				textview97.setTextColor(0xFF000000);
				textview98.setTextColor(0xFF000000);
				imageview7.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
				imageview6.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
				imageview8.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
				getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
				getWindow().setStatusBarColor(0xFFFFFFFF);
			}
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { Window w = getWindow();  w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				linear2.setBackgroundColor(0xFF000000);
				topbar.setBackgroundColor(0xFF000000);
				textview1.setTextColor(0xFFFFFFFF);
				_rippleRoundStroke(linear75, "#000000", "#212121", 0, 0, "#000000");
				_rippleRoundStroke(linear82, "#000000", "#212121", 0, 0, "#000000");
				_rippleRoundStroke(linear60, "#000000", "#212121", 0, 0, "#000000");
				_rippleRoundStroke(linear84, "#000000", "#212121", 0, 0, "#000000");
				cardview5.setCardBackgroundColor(0xFF000000);
				textview10.setTextColor(0xFFFFFFFF);
				textview5.setTextColor(0xFFFFFFFF);
				button1.setTextColor(0xFFFFFFFF);
				button1.setBackgroundColor(0xFF000000);
				imageview3.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
				textview97.setTextColor(0xFFFFFFFF);
				textview98.setTextColor(0xFFFFFFFF);
				imageview7.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
				imageview6.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
				imageview8.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
				
				Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#000000"));
				View decor = getWindow().getDecorView();
				decor.setSystemUiVisibility(0);
				if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
					Window w =SettingsActivity.this.getWindow();
					w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
				}
			}
			else {
				_rippleRoundStroke(linear75, "#FFFFFF", "#E0E0E0", 0, 0, "#000000");
				_rippleRoundStroke(linear82, "#FFFFFF", "#E0E0E0", 0, 0, "#000000");
				_rippleRoundStroke(linear60, "#FFFFFF", "#E0E0E0", 0, 0, "#000000");
				_rippleRoundStroke(linear84, "#FFFFFF", "#E0E0E0", 0, 0, "#000000");
				cardview5.setCardBackgroundColor(0xFFFFFFFF);
				topbar.setBackgroundColor(0xFFFFFFFF);
				linear2.setBackgroundColor(0xFFFFFFFF);
				textview1.setTextColor(0xFF000000);
				textview10.setTextColor(0xFF000000);
				textview5.setTextColor(0xFF000000);
				button1.setTextColor(0xFF000000);
				button1.setBackgroundColor(0xFFFFFFFF);
				imageview3.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
				textview97.setTextColor(0xFF000000);
				textview98.setTextColor(0xFF000000);
				imageview7.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
				imageview6.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
				imageview8.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
				if (settings.getString("mnb", "").equals("1")) {
					
					Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#FFFFFF"));
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
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
				}
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
	
	
	public void _rippleRoundStroke (final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _function () {
	}
	private int getColor(String name){
		return getColor(getResources().getIdentifier(name,"color","android"));
	}
	
	{
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