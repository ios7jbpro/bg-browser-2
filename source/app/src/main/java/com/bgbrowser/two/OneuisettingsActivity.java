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
import android.widget.ScrollView;
import android.widget.Button;
import android.widget.Switch;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.view.View;
import android.widget.CompoundButton;
import android.text.Editable;
import android.text.TextWatcher;
import vn.luongvo.widget.iosswitchview.*;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class OneuisettingsActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private double width = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear2;
	private LinearLayout linear5;
	private LinearLayout linear4;
	private TextView textview1;
	private TextView textview14;
	private TextView languagetext;
	private ImageView imageview1;
	private ScrollView vscroll1;
	private LinearLayout linear18;
	private LinearLayout linear6;
	private LinearLayout linear16;
	private LinearLayout linear25;
	private TextView textview2;
	private TextView textview27;
	private LinearLayout linear9;
	private LinearLayout linear26;
	private LinearLayout linear10;
	private LinearLayout linear17;
	private LinearLayout linear24;
	private TextView textview8;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private TextView textview13;
	private LinearLayout linear14;
	private TextView textview15;
	private TextView textview3;
	private LinearLayout linear8;
	private TextView textview16;
	private Button button10;
	private Button button8;
	private Button button9;
	private TextView textview24;
	private TextView textview25;
	private TextView textview5;
	private Switch switch1;
	private TextView textview26;
	private Switch switch6;
	private TextView textview7;
	private EditText edittext1;
	private TextView textview17;
	private Switch switch4;
	private TextView textview23;
	private Switch switch5;
	private TextView textview9;
	private Switch switch2;
	private TextView textview10;
	private Button button1;
	private Button button2;
	private TextView textview11;
	private Switch switch3;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear15;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private ImageView imageview2;
	private TextView textview4;
	
	private Intent nd = new Intent();
	private SharedPreferences settings;
	private TimerTask darkmodereloader;
	private TimerTask rounder;
	private Intent tg = new Intent();
	private SharedPreferences tgj;
	private SharedPreferences logs;
	private Calendar ie = Calendar.getInstance();
	private TimerTask rtimer;
	private TimerTask langreloader;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.oneuisettings);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview14 = (TextView) findViewById(R.id.textview14);
		languagetext = (TextView) findViewById(R.id.languagetext);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview27 = (TextView) findViewById(R.id.textview27);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview13 = (TextView) findViewById(R.id.textview13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview16 = (TextView) findViewById(R.id.textview16);
		button10 = (Button) findViewById(R.id.button10);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		textview24 = (TextView) findViewById(R.id.textview24);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview5 = (TextView) findViewById(R.id.textview5);
		switch1 = (Switch) findViewById(R.id.switch1);
		textview26 = (TextView) findViewById(R.id.textview26);
		switch6 = (Switch) findViewById(R.id.switch6);
		textview7 = (TextView) findViewById(R.id.textview7);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		textview17 = (TextView) findViewById(R.id.textview17);
		switch4 = (Switch) findViewById(R.id.switch4);
		textview23 = (TextView) findViewById(R.id.textview23);
		switch5 = (Switch) findViewById(R.id.switch5);
		textview9 = (TextView) findViewById(R.id.textview9);
		switch2 = (Switch) findViewById(R.id.switch2);
		textview10 = (TextView) findViewById(R.id.textview10);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		textview11 = (TextView) findViewById(R.id.textview11);
		switch3 = (Switch) findViewById(R.id.switch3);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview4 = (TextView) findViewById(R.id.textview4);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		tgj = getSharedPreferences("tgj", Activity.MODE_PRIVATE);
		logs = getSharedPreferences("logs", Activity.MODE_PRIVATE);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				nd.setClass(getApplicationContext(), ExperimentalActivity.class);
				startActivity(nd);
				finish();
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				nd.setClass(getApplicationContext(), LogsActivity.class);
				startActivity(nd);
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tg.setAction(Intent.ACTION_VIEW);
				tg.setData(Uri.parse("https://t.me/artenos_community"));
				startActivity(tg);
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear16.setVisibility(View.GONE);
				tgj.edit().putString("tgj", "1").commit();
			}
		});
		
		switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (switch1.isChecked()) {
					settings.edit().putString("darkmode", "1").commit();
				}
				else {
					settings.edit().putString("darkmode", "0").commit();
				}
			}
		});
		
		switch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (switch6.isChecked()) {
					settings.edit().putString("darkwebview", "1").commit();
				}
				else {
					settings.edit().putString("darkwebview", "0").commit();
				}
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("homeurl", edittext1.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (switch4.isChecked()) {
					settings.edit().putString("cookies", "1").commit();
				}
				else {
					settings.edit().putString("cookies", "0").commit();
				}
			}
		});
		
		switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (switch5.isChecked()) {
					settings.edit().putString("pfp", "1").commit();
					logs.edit().putString("logs", logs.getString("logs", "").concat("\n[".concat(new SimpleDateFormat("hh:mm:ss").format(ie.getTime()).concat("]".concat("SHOW_PFP:True"))))).commit();
				}
				else {
					settings.edit().putString("pfp", "0").commit();
					logs.edit().putString("logs", logs.getString("logs", "").concat("\n[".concat(new SimpleDateFormat("hh:mm:ss").format(ie.getTime()).concat("]".concat("SHOW_PFP:False"))))).commit();
				}
			}
		});
		
		switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (switch2.isChecked()) {
					settings.edit().putString("space", "on").commit();
				}
				else {
					settings.edit().putString("space", "off").commit();
				}
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("spacecolor", "white").commit();
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("spacecolor", "black").commit();
			}
		});
		
		switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				if (switch3.isChecked()) {
					settings.edit().putString("mnb", "1").commit();
				}
				else {
					settings.edit().putString("mnb", "0").commit();
				}
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seen", "google").commit();
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seen", "yandex").commit();
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seen", "webud").commit();
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seen", "duckduckgo").commit();
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seen", "yahoo").commit();
			}
		});
	}
	
	private void initializeLogic() {
		languagetext.setText(Locale.getDefault().getDisplayLanguage());
		_language();
		edittext1.setText(settings.getString("homeurl", ""));
		if (settings.getString("darkmode", "").equals("1")) {
			switch1.setChecked(true);
		}
		else {
			switch1.setChecked(false);
		}
		if (settings.getString("space", "").equals("on")) {
			switch2.setChecked(true);
		}
		else {
			switch2.setChecked(false);
		}
		if (settings.getString("mnb", "").equals("1")) {
			switch3.setChecked(true);
		}
		else {
			switch3.setChecked(false);
		}
		if (settings.getString("cookies", "").equals("1")) {
			switch4.setChecked(true);
		}
		else {
			switch4.setChecked(false);
		}
		if (settings.getString("pfp", "").equals("1")) {
			switch5.setChecked(true);
		}
		else {
			switch5.setChecked(false);
		}
		if (settings.getString("darkwebview", "").equals("1")) {
			switch6.setChecked(true);
		}
		else {
			switch6.setChecked(false);
		}
		if (tgj.getString("tgj", "").equals("1")) {
			linear16.setVisibility(View.GONE);
		}
		else {
			
		}
		width = Math.round(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()));
		if (String.valueOf((long)(width)).equals("1440")) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor("#FFFFFF"));
			gd.setCornerRadius(70);
			linear2.setBackground(gd);
			rtimer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
							gd.setColor(Color.parseColor("#2196F3"));
							gd.setCornerRadius(70);
							linear25.setBackground(gd);
						}
					});
				}
			};
			_timer.schedule(rtimer, (int)(1));
		}
		else {
			if (String.valueOf((long)(width)).equals("1080")) {
				android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
				gd.setColor(Color.parseColor("#FFFFFF"));
				gd.setCornerRadius(50);
				linear2.setBackground(gd);
				rtimer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
								gd.setColor(Color.parseColor("#2196F3"));
								gd.setCornerRadius(50);
								linear25.setBackground(gd);
							}
						});
					}
				};
				_timer.schedule(rtimer, (int)(1));
			}
			else {
				if (String.valueOf((long)(width)).equals("720")) {
					android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
					gd.setColor(Color.parseColor("#FFFFFF"));
					gd.setCornerRadius(30);
					linear2.setBackground(gd);
					rtimer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
									gd.setColor(Color.parseColor("#2196F3"));
									gd.setCornerRadius(30);
									linear25.setBackground(gd);
								}
							});
						}
					};
					_timer.schedule(rtimer, (int)(1));
				}
				else {
					android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
					gd.setColor(Color.parseColor("#2196F3"));
					gd.setCornerRadius(30);
					linear25.setBackground(gd);
					rtimer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
									gd.setColor(Color.parseColor("#FFFFFF"));
									gd.setCornerRadius(30);
									linear2.setBackground(gd);
								}
							});
						}
					};
					_timer.schedule(rtimer, (int)(1));
				}
			}
		}
		rounder = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
						gd.setColor(Color.parseColor("#2196F3"));
						gd.setCornerRadius(360);
						button8.setBackground(gd);
						rounder = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
										gd.setColor(Color.parseColor("#FF0000"));
										gd.setCornerRadius(360);
										button9.setBackground(gd);
									}
								});
							}
						};
						_timer.schedule(rounder, (int)(1));
					}
				});
			}
		};
		_timer.schedule(rounder, (int)(1));
		darkmodereloader = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_darkmode();
						if (settings.getString("space", "").equals("on")) {
							linear18.setVisibility(View.VISIBLE);
						}
						else {
							linear18.setVisibility(View.GONE);
						}
						if (settings.getString("debug", "").equals("1")) {
							button10.setVisibility(View.VISIBLE);
						}
						else {
							button10.setVisibility(View.GONE);
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(darkmodereloader, (int)(0), (int)(500));
		if (Double.parseDouble(Build.VERSION.SDK) > 27) {
			linear9.setVisibility(View.GONE);
			textview27.setVisibility(View.VISIBLE);
		}
		else {
			linear9.setVisibility(View.VISIBLE);
			textview27.setVisibility(View.GONE);
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
	
	public void _darkmode () {
		if (settings.getString("darkmode", "").equals("1")) {
			textview1.setTextColor(0xFFFFFFFF);
			linear1.setBackgroundColor(0xFF000000);
			button1.setBackgroundColor(0xFF212121);
			button2.setBackgroundColor(0xFF212121);
			button3.setBackgroundColor(0xFF212121);
			button4.setBackgroundColor(0xFF212121);
			button5.setBackgroundColor(0xFF212121);
			button6.setBackgroundColor(0xFF212121);
			button7.setBackgroundColor(0xFF212121);
			textview2.setTextColor(0xFFFFFFFF);
			textview3.setTextColor(0xFFFFFFFF);
			textview4.setTextColor(0xFFFFFFFF);
			textview5.setTextColor(0xFFFFFFFF);
			textview7.setTextColor(0xFFFFFFFF);
			textview8.setTextColor(0xFFFFFFFF);
			textview9.setTextColor(0xFFFFFFFF);
			textview10.setTextColor(0xFFFFFFFF);
			textview11.setTextColor(0xFFFFFFFF);
			textview13.setTextColor(0xFFFFFFFF);
			textview14.setTextColor(0xFFFFFFFF);
			textview17.setTextColor(0xFFFFFFFF);
			textview23.setTextColor(0xFFFFFFFF);
			button1.setTextColor(0xFFFFFFFF);
			button2.setTextColor(0xFFFFFFFF);
			button3.setTextColor(0xFFFFFFFF);
			button4.setTextColor(0xFFFFFFFF);
			button5.setTextColor(0xFFFFFFFF);
			button6.setTextColor(0xFFFFFFFF);
			button7.setTextColor(0xFFFFFFFF);
			edittext1.setTextColor(0xFFFFFFFF);
			textview26.setTextColor(0xFFFFFFFF);
			imageview1.setImageResource(R.drawable.ic_chevron_left_white);
			imageview2.setImageResource(R.drawable.exwhite);
			linear18.setBackgroundColor(0xFF000000);
			if (String.valueOf((long)(width)).equals("1440")) {
				android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
				gd.setColor(Color.parseColor("#212121"));
				gd.setCornerRadius(70);
				linear2.setBackground(gd);
			}
			else {
				if (String.valueOf((long)(width)).equals("1080")) {
					android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
					gd.setColor(Color.parseColor("#212121"));
					gd.setCornerRadius(50);
					linear2.setBackground(gd);
				}
				else {
					if (String.valueOf((long)(width)).equals("720")) {
						android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
						gd.setColor(Color.parseColor("#212121"));
						gd.setCornerRadius(30);
						linear2.setBackground(gd);
					}
					else {
						android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
						gd.setColor(Color.parseColor("#212121"));
						gd.setCornerRadius(30);
						linear2.setBackground(gd);
					}
				}
			}
			
			Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#000000"));
			View decor = getWindow().getDecorView();
			decor.setSystemUiVisibility(0);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =OneuisettingsActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
			}
		}
		else {
			textview1.setTextColor(0xFF000000);
			linear1.setBackgroundColor(0xFFE0E0E0);
			button1.setBackgroundColor(0xFFFFFFFF);
			button2.setBackgroundColor(0xFFFFFFFF);
			button3.setBackgroundColor(0xFFFFFFFF);
			button4.setBackgroundColor(0xFFFFFFFF);
			button5.setBackgroundColor(0xFFFFFFFF);
			button6.setBackgroundColor(0xFFFFFFFF);
			button7.setBackgroundColor(0xFFFFFFFF);
			textview2.setTextColor(0xFF000000);
			textview3.setTextColor(0xFF000000);
			textview4.setTextColor(0xFF000000);
			textview5.setTextColor(0xFF000000);
			textview7.setTextColor(0xFF000000);
			textview8.setTextColor(0xFF000000);
			textview9.setTextColor(0xFF000000);
			textview10.setTextColor(0xFF000000);
			textview11.setTextColor(0xFF000000);
			textview13.setTextColor(0xFF000000);
			textview14.setTextColor(0xFF000000);
			textview17.setTextColor(0xFF000000);
			textview23.setTextColor(0xFF000000);
			button1.setTextColor(0xFF000000);
			button2.setTextColor(0xFF000000);
			button3.setTextColor(0xFF000000);
			button4.setTextColor(0xFF000000);
			button5.setTextColor(0xFF000000);
			button6.setTextColor(0xFF000000);
			button7.setTextColor(0xFF000000);
			edittext1.setTextColor(0xFF000000);
			textview26.setTextColor(0xFF000000);
			imageview1.setImageResource(R.drawable.ic_chevron_left_black);
			imageview2.setImageResource(R.drawable.ic_explicit_black);
			linear18.setBackgroundColor(0xFFE0E0E0);
			if (String.valueOf((long)(width)).equals("1440")) {
				android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
				gd.setColor(Color.parseColor("#FFFFFF"));
				gd.setCornerRadius(70);
				linear2.setBackground(gd);
			}
			else {
				if (String.valueOf((long)(width)).equals("1080")) {
					android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
					gd.setColor(Color.parseColor("#FFFFFF"));
					gd.setCornerRadius(50);
					linear2.setBackground(gd);
				}
				else {
					if (String.valueOf((long)(width)).equals("720")) {
						android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
						gd.setColor(Color.parseColor("#FFFFFF"));
						gd.setCornerRadius(30);
						linear2.setBackground(gd);
					}
					else {
						android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
						gd.setColor(Color.parseColor("#FFFFFF"));
						gd.setCornerRadius(30);
						linear2.setBackground(gd);
					}
				}
			}
			if (settings.getString("mnb", "").equals("1")) {
				
				Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#E0E0E0"));
			}
			else {
				
				Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#000000"));
			}
			View decor = getWindow().getDecorView();
			decor.setSystemUiVisibility(0);
			getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
			getWindow().setStatusBarColor(0xFFFFFFFF);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =OneuisettingsActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFE0E0E0);
			}
		}
	}
	
	
	public void _language () {
		langreloader = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (languagetext.getText().toString().equals("English")) {
							textview1.setText("Settings");
							textview14.setText("-One Ui Style-");
							button8.setText("Tap here to join our Telegram!");
							button9.setText("HIDE");
							textview2.setText("General");
							textview27.setText("You are using Android 9(or above). App will follow system theme instead. Just change system theme.");
							textview5.setText("Dark Mode");
							textview26.setText("Darken webviews");
							textview7.setText("Home URL");
							textview17.setText("Cookies");
							textview23.setText("Show Profile Picture");
							textview8.setText("Spacing Options");
							textview9.setText("Spacing");
							textview10.setText("Color");
							button1.setText("WHITE");
							button2.setText("BLACK");
							textview11.setText("Material Navbar(Q/LG UX Only!)");
							textview13.setText("Search Engine");
							textview15.setText("Changes the search engine that loads when you press search button.");
							textview3.setText("DANGER ZONE");
							textview4.setText("Experimental Settings");
							textview16.setText("Those features still on test, and buggy. Do not bother reporting bugs meanwhile using them.");
						}
						else {
							if (languagetext.getText().toString().equals("Deutsch")) {
								textview1.setText("Einstellungen");
								textview14.setText("-One Ui Style-");
								button8.setText("Tippe hier, um unserem Telegram beizutreten!");
								button9.setText("Verstecken");
								textview2.setText("Generell");
								textview27.setText("Du benutzt Android 9 (oder höher). Die App wird dem System Theme folgen. Ändere den Darkmode dort.");
								textview5.setText("Dunkelmodus");
								textview26.setText("Darken webviews");
								textview7.setText("Home URL");
								textview17.setText("Cookies");
								textview23.setText("Zeige Profilfoto");
								textview8.setText("Spacing Options");
								textview9.setText("Platz");
								textview10.setText("Farbe");
								button1.setText("WEIß");
								button2.setText("SCHWARZ");
								textview11.setText("Material Navbar(NUR Q/LG UX!)");
								textview13.setText("Suchmaschine");
								textview15.setText("Verändert die Suchmaschine, die lädt, wenn du den Suchknopf drückst.");
								textview3.setText("GEFAHRENZONE");
								textview4.setText("EXPEROMENTELLE EINSTELLUNGEN");
								textview16.setText("Diese features werden noch gestestet und sind Fehlerhaft. Also, wenn du sie benutzt, erwarte Fehler. Du wurdest gewarnt.");
							}
							else {
								if (languagetext.getText().toString().equals("español")) {
									textview1.setText("Configuración");
									textview14.setText("-Estilo de One Ui-");
									button8.setText("¡Pulsa aquí para entrar a nuestro Telegram!");
									button9.setText("ESCONDER");
									textview2.setText("General");
									textview27.setText("Estás usando Android 9(o una versión superior). El navegador, entonces, utilizará el tema del sistema. Solo modifica el tema del sistema.");
									textview5.setText("Modo Oscuro");
									textview26.setText("Vista oscurecida de páginas");
									textview7.setText("URL de Inicio");
									textview17.setText("Cookies");
									textview23.setText("Mostrar imagen de perfil");
									textview8.setText("Opciones de espaciado");
									textview9.setText("Espaciado");
									textview10.setText("Color");
									button1.setText("BLANCO");
									button2.setText("NEGRO");
									textview11.setText("Barra de navegación con Material Design (¡Q/LG UX únicamente!");
									textview13.setText("Motor de búsqueda");
									textview15.setText("Modifica el motor de búsqueda utilizado cuando se presiona el botón de búsqueda.");
									textview3.setText("ZONA DE PELIGRO");
									textview4.setText("Opciones Experimentales");
									textview16.setText("Estas opciones siguen en desarrollo, y presentan fallos. No te molestes en reportar errores mientras las utilices.");
								}
								else {
									
								}
							}
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(langreloader, (int)(0), (int)(1000));
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