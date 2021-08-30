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
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.Button;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.webkit.*;
import com.monstertechno.adblocker.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class SettingsGeneralActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private boolean isChecked = false;
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private ImageView imageview2;
	private TextView textview1;
	private LinearLayout linear2;
	private TextView resultado;
	private TextView languagetext;
	private TextView textview105;
	private LinearLayout linear85;
	private LinearLayout linear95;
	private LinearLayout linear90;
	private TextView textview106;
	private LinearLayout linear88;
	private LinearLayout linear93;
	private LinearLayout linear100;
	private TextView textview123;
	private LinearLayout linear98;
	private LinearLayout linear74;
	private CardView cardview8;
	private CardView cardview7;
	private LinearLayout linear89;
	private TextView textview107;
	private TextView textview108;
	private TextView textview109;
	private LinearLayout linear87;
	private TextView textview102;
	private TextView textview103;
	private TextView textview104;
	private CardView cardview12;
	private CardView cardview13;
	private LinearLayout linear96;
	private TextView textview117;
	private TextView textview118;
	private TextView textview119;
	private LinearLayout linear97;
	private TextView textview120;
	private TextView textview121;
	private TextView textview122;
	private CardView cardview16;
	private CardView cardview9;
	private LinearLayout linear102;
	private TextView textview129;
	private TextView textview130;
	private TextView textview131;
	private LinearLayout linear91;
	private TextView textview110;
	private TextView textview111;
	private TextView textview112;
	private CardView cardview6;
	private CardView cardview10;
	private LinearLayout linear86;
	private TextView textview99;
	private TextView textview100;
	private TextView textview101;
	private LinearLayout linear92;
	private TextView textview113;
	private TextView textview114;
	private TextView textview115;
	private CardView cardview11;
	private LinearLayout linear94;
	private TextView textview116;
	private EditText edittext1;
	private CardView cardview15;
	private LinearLayout linear101;
	private TextView textview127;
	private TextView textview128;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear20;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private Button button10;
	private Button button11;
	private CardView cardview14;
	private LinearLayout linear99;
	private TextView textview124;
	private TextView textview125;
	private TextView textview126;
	
	private SharedPreferences settings;
	private SharedPreferences logs;
	private TimerTask reloader;
	private Calendar ie = Calendar.getInstance();
	private AlertDialog.Builder warn;
	private Intent aaaaahhhhhhhhhhhhhhhhhhh = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settings_general);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		resultado = (TextView) findViewById(R.id.resultado);
		languagetext = (TextView) findViewById(R.id.languagetext);
		textview105 = (TextView) findViewById(R.id.textview105);
		linear85 = (LinearLayout) findViewById(R.id.linear85);
		linear95 = (LinearLayout) findViewById(R.id.linear95);
		linear90 = (LinearLayout) findViewById(R.id.linear90);
		textview106 = (TextView) findViewById(R.id.textview106);
		linear88 = (LinearLayout) findViewById(R.id.linear88);
		linear93 = (LinearLayout) findViewById(R.id.linear93);
		linear100 = (LinearLayout) findViewById(R.id.linear100);
		textview123 = (TextView) findViewById(R.id.textview123);
		linear98 = (LinearLayout) findViewById(R.id.linear98);
		linear74 = (LinearLayout) findViewById(R.id.linear74);
		cardview8 = (CardView) findViewById(R.id.cardview8);
		cardview7 = (CardView) findViewById(R.id.cardview7);
		linear89 = (LinearLayout) findViewById(R.id.linear89);
		textview107 = (TextView) findViewById(R.id.textview107);
		textview108 = (TextView) findViewById(R.id.textview108);
		textview109 = (TextView) findViewById(R.id.textview109);
		linear87 = (LinearLayout) findViewById(R.id.linear87);
		textview102 = (TextView) findViewById(R.id.textview102);
		textview103 = (TextView) findViewById(R.id.textview103);
		textview104 = (TextView) findViewById(R.id.textview104);
		cardview12 = (CardView) findViewById(R.id.cardview12);
		cardview13 = (CardView) findViewById(R.id.cardview13);
		linear96 = (LinearLayout) findViewById(R.id.linear96);
		textview117 = (TextView) findViewById(R.id.textview117);
		textview118 = (TextView) findViewById(R.id.textview118);
		textview119 = (TextView) findViewById(R.id.textview119);
		linear97 = (LinearLayout) findViewById(R.id.linear97);
		textview120 = (TextView) findViewById(R.id.textview120);
		textview121 = (TextView) findViewById(R.id.textview121);
		textview122 = (TextView) findViewById(R.id.textview122);
		cardview16 = (CardView) findViewById(R.id.cardview16);
		cardview9 = (CardView) findViewById(R.id.cardview9);
		linear102 = (LinearLayout) findViewById(R.id.linear102);
		textview129 = (TextView) findViewById(R.id.textview129);
		textview130 = (TextView) findViewById(R.id.textview130);
		textview131 = (TextView) findViewById(R.id.textview131);
		linear91 = (LinearLayout) findViewById(R.id.linear91);
		textview110 = (TextView) findViewById(R.id.textview110);
		textview111 = (TextView) findViewById(R.id.textview111);
		textview112 = (TextView) findViewById(R.id.textview112);
		cardview6 = (CardView) findViewById(R.id.cardview6);
		cardview10 = (CardView) findViewById(R.id.cardview10);
		linear86 = (LinearLayout) findViewById(R.id.linear86);
		textview99 = (TextView) findViewById(R.id.textview99);
		textview100 = (TextView) findViewById(R.id.textview100);
		textview101 = (TextView) findViewById(R.id.textview101);
		linear92 = (LinearLayout) findViewById(R.id.linear92);
		textview113 = (TextView) findViewById(R.id.textview113);
		textview114 = (TextView) findViewById(R.id.textview114);
		textview115 = (TextView) findViewById(R.id.textview115);
		cardview11 = (CardView) findViewById(R.id.cardview11);
		linear94 = (LinearLayout) findViewById(R.id.linear94);
		textview116 = (TextView) findViewById(R.id.textview116);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		cardview15 = (CardView) findViewById(R.id.cardview15);
		linear101 = (LinearLayout) findViewById(R.id.linear101);
		textview127 = (TextView) findViewById(R.id.textview127);
		textview128 = (TextView) findViewById(R.id.textview128);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		button10 = (Button) findViewById(R.id.button10);
		button11 = (Button) findViewById(R.id.button11);
		cardview14 = (CardView) findViewById(R.id.cardview14);
		linear99 = (LinearLayout) findViewById(R.id.linear99);
		textview124 = (TextView) findViewById(R.id.textview124);
		textview125 = (TextView) findViewById(R.id.textview125);
		textview126 = (TextView) findViewById(R.id.textview126);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		logs = getSharedPreferences("logs", Activity.MODE_PRIVATE);
		warn = new AlertDialog.Builder(this);
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		cardview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("debug", "").equals("1")) {
					settings.edit().putString("debug", "0").commit();
					cardview8.setCardBackgroundColor(0xFF9E9E9E);
					textview107.setTextColor(0xFF000000);
					textview108.setTextColor(0xFF000000);
					textview109.setTextColor(0xFF000000);
					textview109.setText("DISABLED");
				}
				else {
					settings.edit().putString("debug", "1").commit();
					cardview8.setCardBackgroundColor(0xFFE57373);
					textview107.setTextColor(0xFFF44336);
					textview108.setTextColor(0xFFF44336);
					textview109.setTextColor(0xFFF44336);
					textview109.setText("ENABLED");
				}
			}
		});
		
		cardview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("splash", "").equals("1")) {
					settings.edit().putString("splash", "0").commit();
					cardview7.setCardBackgroundColor(0xFF9E9E9E);
					textview102.setTextColor(0xFF000000);
					textview103.setTextColor(0xFF000000);
					textview104.setTextColor(0xFF000000);
					textview104.setText("DISABLED");
				}
				else {
					settings.edit().putString("splash", "1").commit();
					cardview7.setCardBackgroundColor(0xFFA5D6A7);
					textview102.setTextColor(0xFF4CAF50);
					textview103.setTextColor(0xFF4CAF50);
					textview104.setTextColor(0xFF4CAF50);
					textview104.setText("ENABLED");
				}
			}
		});
		
		cardview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("tabletmode", "").equals("1")) {
					settings.edit().putString("tabletmode", "0").commit();
					cardview12.setCardBackgroundColor(0xFF9E9E9E);
					textview117.setTextColor(0xFF000000);
					textview118.setTextColor(0xFF000000);
					textview119.setTextColor(0xFF000000);
					textview119.setText("DISABLED");
				}
				else {
					settings.edit().putString("tabletmode", "1").commit();
					cardview12.setCardBackgroundColor(0xFF80CBC4);
					textview117.setTextColor(0xFF009688);
					textview118.setTextColor(0xFF009688);
					textview119.setTextColor(0xFF009688);
					textview119.setText("ENABLED");
				}
			}
		});
		
		cardview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("miuispinner", "").equals("1")) {
					settings.edit().putString("miuispinner", "0").commit();
					cardview13.setCardBackgroundColor(0xFF9E9E9E);
					textview120.setTextColor(0xFF000000);
					textview121.setTextColor(0xFF000000);
					textview122.setTextColor(0xFF000000);
					textview122.setText("DISABLED");
				}
				else {
					settings.edit().putString("miuispinner", "1").commit();
					cardview13.setCardBackgroundColor(0xFF9FA8DA);
					textview120.setTextColor(0xFF3F51B5);
					textview121.setTextColor(0xFF3F51B5);
					textview122.setTextColor(0xFF3F51B5);
					textview122.setText("ENABLED");
				}
			}
		});
		
		cardview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("pfp", "").equals("1")) {
					settings.edit().putString("pfp", "0").commit();
					cardview16.setCardBackgroundColor(0xFF9E9E9E);
					textview129.setTextColor(0xFF000000);
					textview130.setTextColor(0xFF000000);
					textview131.setTextColor(0xFF000000);
					textview131.setText("DISABLED");
				}
				else {
					settings.edit().putString("pfp", "1").commit();
					cardview16.setCardBackgroundColor(0xFFFFAB91);
					textview129.setTextColor(0xFFFF5722);
					textview130.setTextColor(0xFFFF5722);
					textview131.setTextColor(0xFFFF5722);
					textview131.setText("ENABLED");
				}
			}
		});
		
		cardview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("darkmode", "").equals("1")) {
					settings.edit().putString("darkmode", "0").commit();
					cardview9.setCardBackgroundColor(0xFF9E9E9E);
					textview110.setTextColor(0xFF000000);
					textview111.setTextColor(0xFF000000);
					textview112.setTextColor(0xFF000000);
					textview112.setText("DISABLED");
				}
				else {
					settings.edit().putString("darkmode", "1").commit();
					cardview9.setCardBackgroundColor(0xFF90CAF9);
					textview99.setTextColor(0xFF4CAF50);
					textview110.setTextColor(0xFF4CAF50);
					textview111.setTextColor(0xFF4CAF50);
					textview112.setText("ENABLED");
				}
			}
		});
		
		cardview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("cookies", "").equals("1")) {
					settings.edit().putString("cookies", "0").commit();
					cardview6.setCardBackgroundColor(0xFF9E9E9E);
					textview99.setTextColor(0xFF000000);
					textview100.setTextColor(0xFF000000);
					textview101.setTextColor(0xFF000000);
					textview101.setText("DISABLED");
				}
				else {
					settings.edit().putString("cookies", "1").commit();
					cardview6.setCardBackgroundColor(0xFFA5D6A7);
					textview99.setTextColor(0xFF4CAF50);
					textview100.setTextColor(0xFF4CAF50);
					textview101.setTextColor(0xFF4CAF50);
					textview101.setText("ENABLED");
				}
			}
		});
		
		cardview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("darkwebview", "").equals("1")) {
					settings.edit().putString("darkwebview", "0").commit();
					cardview10.setCardBackgroundColor(0xFF9E9E9E);
					textview113.setTextColor(0xFF000000);
					textview114.setTextColor(0xFF000000);
					textview115.setTextColor(0xFF000000);
					textview115.setText("DISABLED");
				}
				else {
					settings.edit().putString("darkwebview", "1").commit();
					cardview10.setCardBackgroundColor(0xFFCE93D8);
					textview113.setTextColor(0xFF9C27B0);
					textview114.setTextColor(0xFF9C27B0);
					textview115.setTextColor(0xFF9C27B0);
					textview115.setText("ENABLED");
				}
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seen", "google").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Search engine changed to Google");
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seen", "yandex").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Search engine changed to Yandex");
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seej", "webud").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Search engine changed to Webud");
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seen", "duckduckgo").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Search engine changed to DuckDuckGo");
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seen", "yahoo").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Search engine changed to Yahoo");
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("seen", "bing").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Bing");
			}
		});
		
		cardview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("ytplayer", "").equals("1")) {
					settings.edit().putString("ytplayer", "0").commit();
					cardview14.setCardBackgroundColor(0xFF9E9E9E);
					textview124.setTextColor(0xFF000000);
					textview125.setTextColor(0xFF000000);
					textview126.setTextColor(0xFF000000);
					textview126.setText("DISABLED");
				}
				else {
					settings.edit().putString("ytplayer", "1").commit();
					cardview14.setCardBackgroundColor(0xFFFFCC80);
					textview124.setTextColor(0xFFFF9800);
					textview125.setTextColor(0xFFFF9800);
					textview126.setTextColor(0xFFFF9800);
					textview126.setText("ENABLED");
				}
			}
		});
	}
	
	private void initializeLogic() {
		languagetext.setText(Locale.getDefault().getDisplayLanguage());
		_language();
		cardview11.setCardBackgroundColor(0xFFF48FB1);
		cardview11.setPreventCornerOverlap(true);
		cardview15.setCardBackgroundColor(0xFF80DEEA);
		cardview15.setPreventCornerOverlap(true);
		cardview9.setPreventCornerOverlap(true);
		cardview10.setPreventCornerOverlap(true);
		cardview6.setPreventCornerOverlap(true);
		cardview16.setPreventCornerOverlap(true);
		cardview14.setPreventCornerOverlap(true);
		cardview8.setPreventCornerOverlap(true);
		cardview12.setPreventCornerOverlap(true);
		cardview7.setPreventCornerOverlap(true);
		cardview13.setPreventCornerOverlap(true);
		if (settings.getString("homeurl", "").equals("")) {
			edittext1.setText("https://");
			settings.edit().putString("homeurl", "").commit();
		}
		else {
			edittext1.setText(settings.getString("homeurl", ""));
		}
		if (Double.parseDouble(Build.VERSION.SDK) > 27) {
			cardview9.setVisibility(View.INVISIBLE);
		}
		else {
			cardview9.setVisibility(View.VISIBLE);
		}
		if (settings.getString("darkmode", "").equals("1")) {
			cardview9.setCardBackgroundColor(0xFF90CAF9);
		}
		else {
			cardview9.setCardBackgroundColor(0xFF9E9E9E);
			textview110.setTextColor(0xFF000000);
			textview111.setTextColor(0xFF000000);
			textview112.setTextColor(0xFF000000);
			textview112.setText("DISABLED");
		}
		reloader = new TimerTask() {
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
		_timer.scheduleAtFixedRate(reloader, (int)(0), (int)(250));
		if (settings.getString("darkwebview", "").equals("1")) {
			cardview10.setCardBackgroundColor(0xFFCE93D8);
		}
		else {
			cardview10.setCardBackgroundColor(0xFF9E9E9E);
			textview113.setTextColor(0xFF000000);
			textview114.setTextColor(0xFF000000);
			textview115.setTextColor(0xFF000000);
			textview115.setText("DISABLED");
		}
		if (settings.getString("cookies", "").equals("1")) {
			cardview6.setCardBackgroundColor(0xFFA5D6A7);
		}
		else {
			cardview6.setCardBackgroundColor(0xFF9E9E9E);
			textview99.setTextColor(0xFF000000);
			textview100.setTextColor(0xFF000000);
			textview101.setTextColor(0xFF000000);
			textview101.setText("DISABLED");
		}
		if (settings.getString("pfp", "").equals("1")) {
			cardview16.setCardBackgroundColor(0xFFFFAB91);
		}
		else {
			cardview16.setCardBackgroundColor(0xFF9E9E9E);
			textview129.setTextColor(0xFF000000);
			textview130.setTextColor(0xFF000000);
			textview131.setTextColor(0xFF000000);
			textview131.setText("DISABLED");
		}
		if (settings.getString("ytplayer", "").equals("1")) {
			cardview14.setCardBackgroundColor(0xFFFFCC80);
		}
		else {
			cardview14.setCardBackgroundColor(0xFF9E9E9E);
			textview124.setTextColor(0xFF000000);
			textview125.setTextColor(0xFF000000);
			textview126.setTextColor(0xFF000000);
			textview126.setText("DISABLED");
		}
		if (settings.getString("debug", "").equals("1")) {
			cardview8.setCardBackgroundColor(0xFFE57373);
		}
		else {
			cardview8.setCardBackgroundColor(0xFF9E9E9E);
			textview107.setTextColor(0xFF000000);
			textview108.setTextColor(0xFF000000);
			textview109.setTextColor(0xFF000000);
			textview109.setText("DISABLED");
		}
		if (settings.getString("tabletmode", "").equals("1")) {
			cardview12.setCardBackgroundColor(0xFF80CBC4);
		}
		else {
			cardview12.setCardBackgroundColor(0xFF9E9E9E);
			textview117.setTextColor(0xFF000000);
			textview118.setTextColor(0xFF000000);
			textview119.setTextColor(0xFF000000);
			textview119.setText("DISABLED");
		}
		if (settings.getString("splash", "").equals("1")) {
			cardview7.setCardBackgroundColor(0xFFA5D6A7);
		}
		else {
			cardview7.setCardBackgroundColor(0xFF9E9E9E);
			textview102.setTextColor(0xFF000000);
			textview103.setTextColor(0xFF000000);
			textview104.setTextColor(0xFF000000);
			textview104.setText("DISABLED");
		}
		if (settings.getString("miuispinner", "").equals("1")) {
			cardview13.setCardBackgroundColor(0xFF9FA8DA);
		}
		else {
			cardview13.setCardBackgroundColor(0xFF9E9E9E);
			textview120.setTextColor(0xFF000000);
			textview121.setTextColor(0xFF000000);
			textview122.setTextColor(0xFF000000);
			textview122.setText("DISABLED");
		}
		Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor("#9E9E9E"));
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
			linear2.setBackgroundColor(0xFF212121);
			linear1.setBackgroundColor(0xFF212121);
			textview1.setTextColor(0xFFFFFFFF);
			textview105.setTextColor(0xFFFFFFFF);
			textview106.setTextColor(0xFFFFFFFF);
			textview123.setTextColor(0xFFFFFFFF);
			imageview2.setImageResource(R.drawable.ic_chevron_left_white);
			
			Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#212121"));
			View decor = getWindow().getDecorView();
			decor.setSystemUiVisibility(0);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =SettingsGeneralActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF212121);
			}
		}
		else {
			linear1.setBackgroundColor(0xFFF5F5F5);
			linear2.setBackgroundColor(0xFFF5F5F5);
			textview1.setTextColor(0xFF000000);
			textview105.setTextColor(0xFF000000);
			textview106.setTextColor(0xFF000000);
			textview123.setTextColor(0xFF000000);
			imageview2.setImageResource(R.drawable.ic_chevron_left_black);
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
				Window w =SettingsGeneralActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFF5F5F5);
			}
		}
	}
	
	
	public void _language () {
		reloader = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (languagetext.getText().toString().equals("English")) {
							textview1.setText("General");
						}
						else {
							if (languagetext.getText().toString().equals("Türkçe")) {
								textview1.setText("Genel");
							}
							else {
								if (languagetext.getText().toString().equals("Deutsch")) {
									textview1.setText("Generell");
								}
								else {
									if (languagetext.getText().toString().equals("español")) {
										textview1.setText("General");
									}
									else {
										
									}
								}
							}
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(reloader, (int)(0), (int)(1000));
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