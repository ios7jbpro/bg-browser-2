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
import android.widget.Switch;
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
import com.hkm.ezwebview.*;
import com.monstertechno.adblocker.*;
import im.delight.android.webview.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import java.lang.reflect.*;;

public class SettingsGeneralActivity extends AppCompatActivity {
	public final int REQ_CD_PFPCHOOSER = 101;
	private Timer _timer = new Timer();
	
	private boolean isChecked = false;
	private boolean checked = false;
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linearstatusbar12;
	private LinearLayout linear111;
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
	private LinearLayout linear106;
	private LinearLayout linear105;
	private TextView textview133;
	private LinearLayout linear108;
	private Switch switch4;
	private TextView textview132;
	private LinearLayout linear107;
	private Switch switch3;
	private CardView cardview16;
	private CardView cardview12;
	private LinearLayout linear102;
	private TextView textview129;
	private TextView textview130;
	private LinearLayout linear96;
	private TextView textview117;
	private TextView textview118;
	private CardView cardview7;
	private LinearLayout linear87;
	private TextView textview102;
	private TextView textview103;
	private CardView cardview6;
	private CardView cardview10;
	private LinearLayout linear86;
	private TextView textview99;
	private TextView textview100;
	private LinearLayout linear92;
	private TextView textview113;
	private TextView textview114;
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
	private CardView cardview14;
	private CardView cardview19;
	private LinearLayout linear99;
	private TextView textview124;
	private TextView textview125;
	private LinearLayout linear114;
	private TextView textview137;
	private TextView textview138;
	
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
		linearstatusbar12 = (LinearLayout) findViewById(R.id.linearstatusbar12);
		linear111 = (LinearLayout) findViewById(R.id.linear111);
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
		linear106 = (LinearLayout) findViewById(R.id.linear106);
		linear105 = (LinearLayout) findViewById(R.id.linear105);
		textview133 = (TextView) findViewById(R.id.textview133);
		linear108 = (LinearLayout) findViewById(R.id.linear108);
		switch4 = (Switch) findViewById(R.id.switch4);
		textview132 = (TextView) findViewById(R.id.textview132);
		linear107 = (LinearLayout) findViewById(R.id.linear107);
		switch3 = (Switch) findViewById(R.id.switch3);
		cardview16 = (CardView) findViewById(R.id.cardview16);
		cardview12 = (CardView) findViewById(R.id.cardview12);
		linear102 = (LinearLayout) findViewById(R.id.linear102);
		textview129 = (TextView) findViewById(R.id.textview129);
		textview130 = (TextView) findViewById(R.id.textview130);
		linear96 = (LinearLayout) findViewById(R.id.linear96);
		textview117 = (TextView) findViewById(R.id.textview117);
		textview118 = (TextView) findViewById(R.id.textview118);
		cardview7 = (CardView) findViewById(R.id.cardview7);
		linear87 = (LinearLayout) findViewById(R.id.linear87);
		textview102 = (TextView) findViewById(R.id.textview102);
		textview103 = (TextView) findViewById(R.id.textview103);
		cardview6 = (CardView) findViewById(R.id.cardview6);
		cardview10 = (CardView) findViewById(R.id.cardview10);
		linear86 = (LinearLayout) findViewById(R.id.linear86);
		textview99 = (TextView) findViewById(R.id.textview99);
		textview100 = (TextView) findViewById(R.id.textview100);
		linear92 = (LinearLayout) findViewById(R.id.linear92);
		textview113 = (TextView) findViewById(R.id.textview113);
		textview114 = (TextView) findViewById(R.id.textview114);
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
		cardview14 = (CardView) findViewById(R.id.cardview14);
		cardview19 = (CardView) findViewById(R.id.cardview19);
		linear99 = (LinearLayout) findViewById(R.id.linear99);
		textview124 = (TextView) findViewById(R.id.textview124);
		textview125 = (TextView) findViewById(R.id.textview125);
		linear114 = (LinearLayout) findViewById(R.id.linear114);
		textview137 = (TextView) findViewById(R.id.textview137);
		textview138 = (TextView) findViewById(R.id.textview138);
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
		
		cardview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("pfp", "").equals("1")) {
					settings.edit().putString("pfp", "0").commit();
					if (settings.getString("darkmode", "").equals("1")) {
						cardview16.setCardBackgroundColor(0xFF424242);
						textview129.setTextColor(0xFFFFFFFF);
						textview130.setTextColor(0xFFFFFFFF);
					}
					else {
						cardview16.setCardBackgroundColor(0xFFFFFFFF);
						textview129.setTextColor(0xFF000000);
						textview130.setTextColor(0xFF000000);
					}
				}
				else {
					settings.edit().putString("pfp", "1").commit();
					cardview16.setCardBackgroundColor(0xFFFFAB91);
					textview129.setTextColor(0xFFFF5722);
					textview130.setTextColor(0xFFFF5722);
					startActivityForResult(pfpchooser, REQ_CD_PFPCHOOSER);
				}
				if (Double.parseDouble(Build.VERSION.SDK) > 29) {
					a11w.setAction(Intent.ACTION_VIEW);
					a11w.setClass(getApplicationContext(), A11dmwarnActivity.class);
					startActivity(a11w);
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
						textview117.setTextColor(0xFFFFFFFF);
						textview118.setTextColor(0xFFFFFFFF);
					}
					else {
						cardview12.setCardBackgroundColor(0xFFFFFFFF);
						textview117.setTextColor(0xFF000000);
						textview118.setTextColor(0xFF000000);
					}
				}
				else {
					settings.edit().putString("tabletmode", "1").commit();
					cardview12.setCardBackgroundColor(0xFF80CBC4);
					textview117.setTextColor(0xFF009688);
					textview118.setTextColor(0xFF009688);
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
						textview102.setTextColor(0xFFFFFFFF);
						textview103.setTextColor(0xFFFFFFFF);
					}
					else {
						cardview7.setCardBackgroundColor(0xFFFFFFFF);
						textview102.setTextColor(0xFF000000);
						textview103.setTextColor(0xFF000000);
					}
				}
				else {
					settings.edit().putString("splash", "1").commit();
					cardview7.setCardBackgroundColor(0xFFA5D6A7);
					textview102.setTextColor(0xFF4CAF50);
					textview103.setTextColor(0xFF4CAF50);
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
						textview99.setTextColor(0xFFFFFFFF);
						textview100.setTextColor(0xFFFFFFFF);
					}
					else {
						cardview6.setCardBackgroundColor(0xFFFFFFFF);
						textview99.setTextColor(0xFF000000);
						textview100.setTextColor(0xFF000000);
					}
				}
				else {
					settings.edit().putString("cookies", "1").commit();
					cardview6.setCardBackgroundColor(0xFFA5D6A7);
					textview99.setTextColor(0xFF4CAF50);
					textview100.setTextColor(0xFF4CAF50);
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
						textview113.setTextColor(0xFFFFFFFF);
						textview114.setTextColor(0xFFFFFFFF);
					}
					else {
						cardview10.setCardBackgroundColor(0xFFFFFFFF);
						textview113.setTextColor(0xFF000000);
						textview114.setTextColor(0xFF000000);
					}
				}
				else {
					settings.edit().putString("darkwebview", "1").commit();
					cardview10.setCardBackgroundColor(0xFFCE93D8);
					textview113.setTextColor(0xFF9C27B0);
					textview114.setTextColor(0xFF9C27B0);
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
						textview134.setTextColor(0xFFFFFFFF);
						textview135.setTextColor(0xFFFFFFFF);
					}
					else {
						cardview18.setCardBackgroundColor(0xFFFFFFFF);
						textview134.setTextColor(0xFF000000);
						textview135.setTextColor(0xFF000000);
					}
				}
				else {
					settings.edit().putString("killnoconnection", "1").commit();
					cardview18.setCardBackgroundColor(0xFF90CAF9);
					textview134.setTextColor(0xFF2196F3);
					textview135.setTextColor(0xFF2196F3);
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
						textview124.setTextColor(0xFFFFFFFF);
						textview125.setTextColor(0xFFFFFFFF);
					}
					else {
						cardview14.setCardBackgroundColor(0xFFFFFFFF);
						textview124.setTextColor(0xFF000000);
						textview125.setTextColor(0xFF000000);
					}
				}
				else {
					settings.edit().putString("ytplayer", "1").commit();
					cardview14.setCardBackgroundColor(0xFFFFCC80);
					textview124.setTextColor(0xFFFF9800);
					textview125.setTextColor(0xFFFF9800);
				}
			}
		});
		
		cardview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("ytplayerbottom", "").equals("1")) {
					settings.edit().putString("ytplayerbottom", "0").commit();
					if (settings.getString("darkmode", "").equals("1")) {
						cardview19.setCardBackgroundColor(0xFF424242);
						textview137.setTextColor(0xFFFFFFFF);
						textview138.setTextColor(0xFFFFFFFF);
					}
					else {
						cardview19.setCardBackgroundColor(0xFFFFFFFF);
						textview137.setTextColor(0xFF000000);
						textview138.setTextColor(0xFF000000);
					}
				}
				else {
					settings.edit().putString("ytplayerbottom", "1").commit();
					cardview19.setCardBackgroundColor(0xFFB39DDB);
					textview137.setTextColor(0xFF673AB7);
					textview138.setTextColor(0xFF673AB7);
				}
			}
		});
	}
	
	private void initializeLogic() {
		languagetext.setText(Locale.getDefault().getDisplayLanguage());
		_language();
		_function();
		_setViewSize(linearstatusbar12, SketchwareUtil.getDisplayWidthPixels(getApplicationContext()), Double.parseDouble(settings.getString("sbheight", "")));
		cardview19.setVisibility(View.INVISIBLE);
		if (Double.parseDouble(Build.VERSION.SDK) < 31) {
			linearstatusbar12.setVisibility(View.GONE);
		}
		if (Double.parseDouble(Build.VERSION.SDK) < 28) {
			cardview17.setVisibility(View.GONE);
		}
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
		cardview17.setCardBackgroundColor(0xFF82B1FF);
		cardview17.setPreventCornerOverlap(true);
		cardview19.setPreventCornerOverlap(true);
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
		if (settings.getString("darkwebview", "").equals("1")) {
			cardview10.setCardBackgroundColor(0xFFCE93D8);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview10.setCardBackgroundColor(0xFF424242);
				textview113.setTextColor(0xFFFFFFFF);
				textview114.setTextColor(0xFFFFFFFF);
			}
			else {
				cardview10.setCardBackgroundColor(0xFFFFFFFF);
				textview113.setTextColor(0xFF000000);
				textview114.setTextColor(0xFF000000);
			}
		}
		if (settings.getString("cookies", "").equals("1")) {
			cardview6.setCardBackgroundColor(0xFFA5D6A7);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview6.setCardBackgroundColor(0xFF424242);
				textview99.setTextColor(0xFFFFFFFF);
				textview100.setTextColor(0xFFFFFFFF);
			}
			else {
				cardview6.setCardBackgroundColor(0xFFFFFFFF);
				textview99.setTextColor(0xFF000000);
				textview100.setTextColor(0xFF000000);
			}
		}
		if (settings.getString("pfp", "").equals("1")) {
			cardview16.setCardBackgroundColor(0xFFFFAB91);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview16.setCardBackgroundColor(0xFF424242);
				textview129.setTextColor(0xFFFFFFFF);
				textview130.setTextColor(0xFFFFFFFF);
			}
			else {
				cardview16.setCardBackgroundColor(0xFFFFFFFF);
				textview129.setTextColor(0xFF000000);
				textview130.setTextColor(0xFF000000);
			}
		}
		if (settings.getString("ytplayer", "").equals("1")) {
			cardview14.setCardBackgroundColor(0xFFFFCC80);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview14.setCardBackgroundColor(0xFF424242);
				textview124.setTextColor(0xFFFFFFFF);
				textview125.setTextColor(0xFFFFFFFF);
			}
			else {
				cardview14.setCardBackgroundColor(0xFFFFFFFF);
				textview124.setTextColor(0xFF000000);
				textview125.setTextColor(0xFF000000);
			}
		}
		if (settings.getString("ytplayerbottom", "").equals("1")) {
			cardview19.setCardBackgroundColor(0xFFB39DDB);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview19.setCardBackgroundColor(0xFF424242);
				textview137.setTextColor(0xFFFFFFFF);
				textview138.setTextColor(0xFFFFFFFF);
			}
			else {
				cardview19.setCardBackgroundColor(0xFFFFFFFF);
				textview137.setTextColor(0xFF000000);
				textview138.setTextColor(0xFF000000);
			}
		}
		if (settings.getString("tabletmode", "").equals("1")) {
			cardview12.setCardBackgroundColor(0xFF80CBC4);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview12.setCardBackgroundColor(0xFF424242);
				textview117.setTextColor(0xFFFFFFFF);
				textview118.setTextColor(0xFFFFFFFF);
			}
			else {
				cardview12.setCardBackgroundColor(0xFFFFFFFF);
				textview117.setTextColor(0xFF000000);
				textview118.setTextColor(0xFF000000);
			}
		}
		if (settings.getString("splash", "").equals("1")) {
			cardview7.setCardBackgroundColor(0xFFA5D6A7);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview7.setCardBackgroundColor(0xFF424242);
				textview102.setTextColor(0xFFFFFFFF);
				textview103.setTextColor(0xFFFFFFFF);
			}
			else {
				cardview7.setCardBackgroundColor(0xFFFFFFFF);
				textview102.setTextColor(0xFF000000);
				textview103.setTextColor(0xFF000000);
			}
		}
		if (settings.getString("killnoconnection", "").equals("1")) {
			cardview18.setCardBackgroundColor(0xFF90CAF9);
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				cardview18.setCardBackgroundColor(0xFF424242);
				textview134.setTextColor(0xFFFFFFFF);
				textview135.setTextColor(0xFFFFFFFF);
			}
			else {
				cardview18.setCardBackgroundColor(0xFFFFFFFF);
				textview134.setTextColor(0xFF000000);
				textview135.setTextColor(0xFF000000);
			}
		}
		Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor("#9E9E9E"));
		_darkmode();
		_ripples();
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
		if (Double.parseDouble(Build.VERSION.SDK) > 30) {
			if (settings.getString("darkmode", "").equals("1")) {
				linear2.setBackgroundColor(getColor("system_accent2_800"));
				linear1.setBackgroundColor(getColor("system_accent2_800"));
				textview1.setTextColor(0xFFFFFFFF);
				textview105.setTextColor(0xFFFFFFFF);
				textview106.setTextColor(0xFFFFFFFF);
				textview123.setTextColor(0xFFFFFFFF);
				textview132.setTextColor(0xFFFFFFFF);
				textview133.setTextColor(0xFFFFFFFF);
				imageview2.setImageResource(R.drawable.ic_chevron_left_white);
				cardview17.setCardBackgroundColor(0xFF0D47A1);
			}
			else {
				linear1.setBackgroundColor(getColor("system_accent2_50"));
				linear2.setBackgroundColor(getColor("system_accent2_50"));
				textview1.setTextColor(0xFF000000);
				textview105.setTextColor(0xFF000000);
				textview106.setTextColor(0xFF000000);
				textview123.setTextColor(0xFF000000);
				textview132.setTextColor(0xFF000000);
				textview133.setTextColor(0xFF000000);
				imageview2.setImageResource(R.drawable.ic_chevron_left_black);
				cardview17.setCardBackgroundColor(0xFF82B1FF);
				getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
				getWindow().setStatusBarColor(0xFFFFFFFF);
			}
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { Window w = getWindow();  w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); };
		}
		else {
			if (settings.getString("darkmode", "").equals("1")) {
				linear2.setBackgroundColor(0xFF000000);
				linear1.setBackgroundColor(0xFF000000);
				textview1.setTextColor(0xFFFFFFFF);
				textview105.setTextColor(0xFFFFFFFF);
				textview106.setTextColor(0xFFFFFFFF);
				textview123.setTextColor(0xFFFFFFFF);
				textview132.setTextColor(0xFFFFFFFF);
				textview133.setTextColor(0xFFFFFFFF);
				imageview2.setImageResource(R.drawable.ic_chevron_left_white);
				
				Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#000000"));
				View decor = getWindow().getDecorView();
				decor.setSystemUiVisibility(0);
				if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
					Window w =SettingsGeneralActivity.this.getWindow();
					w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
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
	
	
	public void _ripples () {
		if (Double.parseDouble(Build.VERSION.SDK) > 30) {
			linear95.setVisibility(View.GONE);
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