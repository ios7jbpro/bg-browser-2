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
import android.content.ClipData;
import android.view.View;
import androidx.webkit.*;
import com.monstertechno.adblocker.*;
import com.jtv7.rippleswitchlib.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;


public class SettingsGeneralActivity extends AppCompatActivity {
	public final int REQ_CD_PFPCHOOSER = 101;
	private Timer _timer = new Timer();
	
	private boolean isChecked = false;
	private boolean checked = false;
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private ImageView imageview2;
	private TextView textview1;
	private LinearLayout linear2;
	private TextView resultado;
	private TextView languagetext;
	private TextView textview105;
	private CardView cardview17;
	private LinearLayout linear85;
	private LinearLayout linear95;
	private TextView textview106;
	private LinearLayout linear88;
	private LinearLayout linear93;
	private LinearLayout linear100;
	private LinearLayout linear109;
	private TextView textview123;
	private LinearLayout linear98;
	private LinearLayout linear74;
	private LinearLayout linear104;
	private LinearLayout linear105;
	private LinearLayout linear106;
	private TextView textview132;
	private LinearLayout linear107;
	private RippleSwitch switch3;
	private TextView textview133;
	private LinearLayout linear108;
	private RippleSwitch switch4;
	private CardView cardview16;
	private CardView cardview7;
	private LinearLayout linear102;
	private TextView textview129;
	private TextView textview130;
	private TextView textview131;
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
	private CardView cardview18;
	private LinearLayout linear110;
	private TextView textview134;
	private TextView textview135;
	private TextView textview136;
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
	private Intent a11w = new Intent();
	private Intent pfpchooser = new Intent(Intent.ACTION_GET_CONTENT);
	private SharedPreferences pfp;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settings_general);
		initialize(_savedInstanceState);
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
		}
		else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
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
		cardview17 = (CardView) findViewById(R.id.cardview17);
		linear85 = (LinearLayout) findViewById(R.id.linear85);
		linear95 = (LinearLayout) findViewById(R.id.linear95);
		textview106 = (TextView) findViewById(R.id.textview106);
		linear88 = (LinearLayout) findViewById(R.id.linear88);
		linear93 = (LinearLayout) findViewById(R.id.linear93);
		linear100 = (LinearLayout) findViewById(R.id.linear100);
		linear109 = (LinearLayout) findViewById(R.id.linear109);
		textview123 = (TextView) findViewById(R.id.textview123);
		linear98 = (LinearLayout) findViewById(R.id.linear98);
		linear74 = (LinearLayout) findViewById(R.id.linear74);
		linear104 = (LinearLayout) findViewById(R.id.linear104);
		linear105 = (LinearLayout) findViewById(R.id.linear105);
		linear106 = (LinearLayout) findViewById(R.id.linear106);
		textview132 = (TextView) findViewById(R.id.textview132);
		linear107 = (LinearLayout) findViewById(R.id.linear107);
		switch3 = (RippleSwitch) findViewById(R.id.switch3);
		textview133 = (TextView) findViewById(R.id.textview133);
		linear108 = (LinearLayout) findViewById(R.id.linear108);
		switch4 = (RippleSwitch) findViewById(R.id.switch4);
		cardview16 = (CardView) findViewById(R.id.cardview16);
		cardview7 = (CardView) findViewById(R.id.cardview7);
		linear102 = (LinearLayout) findViewById(R.id.linear102);
		textview129 = (TextView) findViewById(R.id.textview129);
		textview130 = (TextView) findViewById(R.id.textview130);
		textview131 = (TextView) findViewById(R.id.textview131);
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
		cardview18 = (CardView) findViewById(R.id.cardview18);
		linear110 = (LinearLayout) findViewById(R.id.linear110);
		textview134 = (TextView) findViewById(R.id.textview134);
		textview135 = (TextView) findViewById(R.id.textview135);
		textview136 = (TextView) findViewById(R.id.textview136);
		cardview14 = (CardView) findViewById(R.id.cardview14);
		linear99 = (LinearLayout) findViewById(R.id.linear99);
		textview124 = (TextView) findViewById(R.id.textview124);
		textview125 = (TextView) findViewById(R.id.textview125);
		textview126 = (TextView) findViewById(R.id.textview126);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		logs = getSharedPreferences("logs", Activity.MODE_PRIVATE);
		warn = new AlertDialog.Builder(this);
		pfpchooser.setType("image/*");
		pfpchooser.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		pfp = getSharedPreferences("loc", Activity.MODE_PRIVATE);
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		switch3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (switch3.isChecked()) {
					settings.edit().putString("darkmode", "1").commit();
					if (Double.parseDouble(Build.VERSION.SDK) > 29) {
						a11w.setAction(Intent.ACTION_VIEW);
						a11w.setClass(getApplicationContext(), A11dmwarnActivity.class);
						startActivity(a11w);
					}
				}
				else {
					settings.edit().putString("darkmode", "0").commit();
					if (Double.parseDouble(Build.VERSION.SDK) > 29) {
						a11w.setAction(Intent.ACTION_VIEW);
						a11w.setClass(getApplicationContext(), A11dmwarnActivity.class);
						startActivity(a11w);
					}
				}
			}
		});
		
		switch4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (switch4.isChecked()) {
					settings.edit().putString("flagfollowsystem", "1").commit();
					linear105.setVisibility(View.GONE);
					if (Double.parseDouble(Build.VERSION.SDK) > 29) {
						a11w.setAction(Intent.ACTION_VIEW);
						a11w.setClass(getApplicationContext(), A11dmwarnActivity.class);
						startActivity(a11w);
					}
				}
				else {
					settings.edit().putString("flagfollowsystem", "0").commit();
					linear105.setVisibility(View.VISIBLE);
					if (Double.parseDouble(Build.VERSION.SDK) > 29) {
						a11w.setAction(Intent.ACTION_VIEW);
						a11w.setClass(getApplicationContext(), A11dmwarnActivity.class);
						startActivity(a11w);
					}
				}
			}
		});
		
		cardview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("pfp", "").equals("1")) {
					settings.edit().putString("pfp", "0").commit();
					if (settings.getString("darkmode", "").equals("1")) {
						cardview16.setCardBackgroundColor(0xFF424242);
					}
					else {
						cardview16.setCardBackgroundColor(0xFFEEEEEE);
					}
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
					startActivityForResult(pfpchooser, REQ_CD_PFPCHOOSER);
				}
				if (Double.parseDouble(Build.VERSION.SDK) > 29) {
					a11w.setAction(Intent.ACTION_VIEW);
					a11w.setClass(getApplicationContext(), A11dmwarnActivity.class);
					startActivity(a11w);
				}
			}
		});
		
		cardview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("splash", "").equals("1")) {
					settings.edit().putString("splash", "0").commit();
					if (settings.getString("darkmode", "").equals("1")) {
						cardview7.setCardBackgroundColor(0xFF424242);
					}
					else {
						cardview7.setCardBackgroundColor(0xFFEEEEEE);
					}
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
					if (settings.getString("darkmode", "").equals("1")) {
						cardview12.setCardBackgroundColor(0xFF424242);
					}
					else {
						cardview12.setCardBackgroundColor(0xFFEEEEEE);
					}
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
					if (settings.getString("darkmode", "").equals("1")) {
						cardview13.setCardBackgroundColor(0xFF424242);
					}
					else {
						cardview13.setCardBackgroundColor(0xFFEEEEEE);
					}
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
		
		cardview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("cookies", "").equals("1")) {
					settings.edit().putString("cookies", "0").commit();
					if (settings.getString("darkmode", "").equals("1")) {
						cardview6.setCardBackgroundColor(0xFF424242);
					}
					else {
						cardview6.setCardBackgroundColor(0xFFEEEEEE);
					}
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
					if (settings.getString("darkmode", "").equals("1")) {
						cardview10.setCardBackgroundColor(0xFF424242);
					}
					else {
						cardview10.setCardBackgroundColor(0xFFEEEEEE);
					}
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
		
		cardview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("killnoconnection", "").equals("1")) {
					settings.edit().putString("killnoconnection", "0").commit();
					if (settings.getString("darkmode", "").equals("1")) {
						cardview18.setCardBackgroundColor(0xFF424242);
					}
					else {
						cardview18.setCardBackgroundColor(0xFFEEEEEE);
					}
					textview134.setTextColor(0xFF000000);
					textview135.setTextColor(0xFF000000);
					textview136.setTextColor(0xFF000000);
					textview136.setText("DISABLED");
				}
				else {
					settings.edit().putString("killnoconnection", "1").commit();
					cardview18.setCardBackgroundColor(0xFF90CAF9);
					textview134.setTextColor(0xFF2196F3);
					textview135.setTextColor(0xFF2196F3);
					textview136.setTextColor(0xFF2196F3);
					textview136.setText("ENABLED");
				}
			}
		});
		
		cardview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("ytplayer", "").equals("1")) {
					settings.edit().putString("ytplayer", "0").commit();
					if (settings.getString("darkmode", "").equals("1")) {
						cardview14.setCardBackgroundColor(0xFF424242);
					}
					else {
						cardview14.setCardBackgroundColor(0xFFEEEEEE);
					}
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
		cardview10.setPreventCornerOverlap(true);
		cardview6.setPreventCornerOverlap(true);
		cardview16.setPreventCornerOverlap(true);
		cardview14.setPreventCornerOverlap(true);
		cardview12.setPreventCornerOverlap(true);
		cardview7.setPreventCornerOverlap(true);
		cardview13.setPreventCornerOverlap(true);
		cardview17.setCardBackgroundColor(0xFF82B1FF);
		cardview17.setPreventCornerOverlap(true);
		switch3.setUncheckedColor(Color.parseColor("#2196F3"));
		switch3.setCheckedColor(Color.parseColor("#BDBDBD"));
		switch4.setUncheckedColor(Color.parseColor("#2196F3"));
		switch4.setCheckedColor(Color.parseColor("#BDBDBD"));
		if (settings.getString("homeurl", "").equals("")) {
			edittext1.setText("https://");
			settings.edit().putString("homeurl", "").commit();
		}
		else {
			edittext1.setText(settings.getString("homeurl", ""));
		}
		if (settings.getString("flagfollowsystem", "").equals("1")) {
			switch4.setChecked(true);
			linear105.setVisibility(View.GONE);
		}
		if (settings.getString("darkmode", "").equals("1")) {
			switch3.setChecked(true);
		}
		else {
			switch3.setChecked(false);
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
			if (settings.getString("darkmode", "").equals("1")) {
				cardview10.setCardBackgroundColor(0xFF424242);
			}
			else {
				cardview10.setCardBackgroundColor(0xFFEEEEEE);
			}
			textview113.setTextColor(0xFF000000);
			textview114.setTextColor(0xFF000000);
			textview115.setTextColor(0xFF000000);
			textview115.setText("DISABLED");
		}
		if (settings.getString("cookies", "").equals("1")) {
			cardview6.setCardBackgroundColor(0xFFA5D6A7);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview6.setCardBackgroundColor(0xFF424242);
			}
			else {
				cardview6.setCardBackgroundColor(0xFFEEEEEE);
			}
			textview99.setTextColor(0xFF000000);
			textview100.setTextColor(0xFF000000);
			textview101.setTextColor(0xFF000000);
			textview101.setText("DISABLED");
		}
		if (settings.getString("pfp", "").equals("1")) {
			cardview16.setCardBackgroundColor(0xFFFFAB91);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview16.setCardBackgroundColor(0xFF424242);
			}
			else {
				cardview16.setCardBackgroundColor(0xFFEEEEEE);
			}
			textview129.setTextColor(0xFF000000);
			textview130.setTextColor(0xFF000000);
			textview131.setTextColor(0xFF000000);
			textview131.setText("DISABLED");
		}
		if (settings.getString("ytplayer", "").equals("1")) {
			cardview14.setCardBackgroundColor(0xFFFFCC80);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview14.setCardBackgroundColor(0xFF424242);
			}
			else {
				cardview14.setCardBackgroundColor(0xFFEEEEEE);
			}
			textview124.setTextColor(0xFF000000);
			textview125.setTextColor(0xFF000000);
			textview126.setTextColor(0xFF000000);
			textview126.setText("DISABLED");
		}
		if (settings.getString("tabletmode", "").equals("1")) {
			cardview12.setCardBackgroundColor(0xFF80CBC4);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview12.setCardBackgroundColor(0xFF424242);
			}
			else {
				cardview12.setCardBackgroundColor(0xFFEEEEEE);
			}
			textview117.setTextColor(0xFF000000);
			textview118.setTextColor(0xFF000000);
			textview119.setTextColor(0xFF000000);
			textview119.setText("DISABLED");
		}
		if (settings.getString("splash", "").equals("1")) {
			cardview7.setCardBackgroundColor(0xFFA5D6A7);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview7.setCardBackgroundColor(0xFF424242);
			}
			else {
				cardview7.setCardBackgroundColor(0xFFEEEEEE);
			}
			textview102.setTextColor(0xFF000000);
			textview103.setTextColor(0xFF000000);
			textview104.setTextColor(0xFF000000);
			textview104.setText("DISABLED");
		}
		if (settings.getString("miuispinner", "").equals("1")) {
			cardview13.setCardBackgroundColor(0xFF9FA8DA);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview13.setCardBackgroundColor(0xFF424242);
			}
			else {
				cardview13.setCardBackgroundColor(0xFFEEEEEE);
			}
			textview120.setTextColor(0xFF000000);
			textview121.setTextColor(0xFF000000);
			textview122.setTextColor(0xFF000000);
			textview122.setText("DISABLED");
		}
		if (settings.getString("killnoconnection", "").equals("1")) {
			cardview18.setCardBackgroundColor(0xFF90CAF9);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview13.setCardBackgroundColor(0xFF424242);
			}
			else {
				cardview13.setCardBackgroundColor(0xFFEEEEEE);
			}
			textview134.setTextColor(0xFF000000);
			textview135.setTextColor(0xFF000000);
			textview136.setTextColor(0xFF000000);
			textview136.setText("DISABLED");
		}
		Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor("#9E9E9E"));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			case REQ_CD_PFPCHOOSER:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				pfp.edit().putString("loc", _filePath.get((int)(0))).commit();
			}
			else {
				
			}
			break;
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
			textview132.setTextColor(0xFFFFFFFF);
			textview133.setTextColor(0xFFFFFFFF);
			imageview2.setImageResource(R.drawable.ic_chevron_left_white);
			
			Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#212121"));
			View decor = getWindow().getDecorView();
			decor.setSystemUiVisibility(0);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =SettingsGeneralActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF212121);
			}
			cardview17.setCardBackgroundColor(0xFF0D47A1);
		}
		else {
			linear1.setBackgroundColor(0xFFF5F5F5);
			linear2.setBackgroundColor(0xFFF5F5F5);
			textview1.setTextColor(0xFF000000);
			textview105.setTextColor(0xFF000000);
			textview106.setTextColor(0xFF000000);
			textview123.setTextColor(0xFF000000);
			textview132.setTextColor(0xFF000000);
			textview133.setTextColor(0xFF000000);
			imageview2.setImageResource(R.drawable.ic_chevron_left_black);
			cardview17.setCardBackgroundColor(0xFF82B1FF);
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