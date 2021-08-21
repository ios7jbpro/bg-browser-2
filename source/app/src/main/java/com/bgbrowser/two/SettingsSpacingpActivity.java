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
import android.widget.Button;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import vn.luongvo.widget.iosswitchview.*;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import vn.luongvo.widget.iosswitchview.SwitchView;

public class SettingsSpacingpActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear2;
	private TextView resultado;
	private TextView languagetext;
	private CardView cardview1;
	private CardView cardview2;
	private CardView cardview3;
	private LinearLayout linear59;
	private LinearLayout linear58;
	private LinearLayout linear12;
	private TextView textview8;
	private SwitchView switch2;
	private LinearLayout linear60;
	private LinearLayout linear13;
	private TextView textview9;
	private Button button4;
	private Button button5;
	private LinearLayout linear61;
	private LinearLayout linear21;
	private TextView textview17;
	private SwitchView switch4;
	
	private SharedPreferences settings;
	private SharedPreferences logs;
	private TimerTask reloader;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settings_spacingp);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		resultado = (TextView) findViewById(R.id.resultado);
		languagetext = (TextView) findViewById(R.id.languagetext);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		linear59 = (LinearLayout) findViewById(R.id.linear59);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview8 = (TextView) findViewById(R.id.textview8);
		switch2 = (SwitchView) findViewById(R.id.switch2);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview9 = (TextView) findViewById(R.id.textview9);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		linear61 = (LinearLayout) findViewById(R.id.linear61);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		textview17 = (TextView) findViewById(R.id.textview17);
		switch4 = (SwitchView) findViewById(R.id.switch4);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		logs = getSharedPreferences("logs", Activity.MODE_PRIVATE);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("spacecolor", "white").commit();
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				settings.edit().putString("spacecolor", "black").commit();
			}
		});
	}
	
	private void initializeLogic() {
		languagetext.setText(Locale.getDefault().getDisplayLanguage());
		_language();
		cardview1.setCardBackgroundColor(0xFFFFFFFF);
		cardview1.setRadius((float)15);
		cardview1.setCardElevation((float)8);
		cardview1.setPreventCornerOverlap(true);
		cardview2.setCardBackgroundColor(0xFFFFFFFF);
		cardview2.setRadius((float)15);
		cardview2.setCardElevation((float)8);
		cardview2.setPreventCornerOverlap(true);
		cardview3.setCardBackgroundColor(0xFFFFFFFF);
		cardview3.setRadius((float)15);
		cardview3.setCardElevation((float)8);
		cardview3.setPreventCornerOverlap(true);
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
		_timer.scheduleAtFixedRate(reloader, (int)(0), (int)(500));
		if (settings.getString("mnb", "").equals("1")) {
			switch4.setChecked(true);
			
			Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#F5F5F5"));
		}
		else {
			switch4.setChecked(false);
		}
		if (settings.getString("space", "").equals("on")) {
			switch2.setChecked(true);
		}
		else {
			switch2.setChecked(false);
		}
		_switchview1();
		_switchview2();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _switchview1 () {
		final SwitchView switchView = (SwitchView) findViewById(R.id.switch2);
		
		switchView.setOnCheckedChangeListener(new SwitchView.OnCheckedChangeListener() {
			
			@Override public void onCheckedChanged(SwitchView switchView, boolean isChecked) {
				if (isChecked) {
					settings.edit().putString("space", "on").commit();
				}
				else {
					settings.edit().putString("space", "off").commit();
				}
			}
		});
	}
	
	
	public void _switchview2 () {
		final SwitchView switchView = (SwitchView) findViewById(R.id.switch4);
		
		switchView.setOnCheckedChangeListener(new SwitchView.OnCheckedChangeListener() {
			
			@Override public void onCheckedChanged(SwitchView switchView, boolean isChecked) {
				if (isChecked) {
					settings.edit().putString("mnb", "1").commit();
				}
				else {
					settings.edit().putString("mnb", "0").commit();
				}
			}
		});
	}
	
	
	public void _darkmode () {
		if (settings.getString("darkmode", "").equals("1")) {
			linear2.setBackgroundColor(0xFF212121);
			linear1.setBackgroundColor(0xFF212121);
			textview1.setTextColor(0xFFFFFFFF);
			textview8.setTextColor(0xFFFFFFFF);
			textview9.setTextColor(0xFFFFFFFF);
			button4.setTextColor(0xFFFFFFFF);
			button4.setBackgroundColor(0xFF000000);
			button5.setTextColor(0xFFFFFFFF);
			button5.setBackgroundColor(0xFF000000);
			textview17.setTextColor(0xFFFFFFFF);
			cardview1.setCardBackgroundColor(0xFF000000);
			cardview2.setCardBackgroundColor(0xFF000000);
			cardview3.setCardBackgroundColor(0xFF000000);
			imageview1.setImageResource(R.drawable.ic_chevron_left_white);
			
			Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#212121"));
			View decor = getWindow().getDecorView();
			decor.setSystemUiVisibility(0);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =SettingsSpacingpActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF212121);
			}
		}
		else {
			linear1.setBackgroundColor(0xFFF5F5F5);
			linear2.setBackgroundColor(0xFFF5F5F5);
			textview1.setTextColor(0xFF000000);
			textview8.setTextColor(0xFF000000);
			textview9.setTextColor(0xFF000000);
			button4.setTextColor(0xFF000000);
			button4.setBackgroundColor(0xFFFFFFFF);
			button5.setTextColor(0xFF000000);
			button5.setBackgroundColor(0xFFFFFFFF);
			textview17.setTextColor(0xFF000000);
			cardview1.setCardBackgroundColor(0xFFFFFFFF);
			cardview2.setCardBackgroundColor(0xFFFFFFFF);
			cardview3.setCardBackgroundColor(0xFFFFFFFF);
			imageview1.setImageResource(R.drawable.ic_chevron_left_black);
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
				Window w =SettingsSpacingpActivity.this.getWindow();
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
							textview1.setText("Spacing Options");
							textview8.setText("Spacing");
							textview9.setText("Color");
							button4.setText("WHITE");
							button5.setText("BLACK");
							textview17.setText("Material Navbar(Q/LG UX only!)");
						}
						else {
							if (languagetext.getText().toString().equals("Türkçe")) {
								textview1.setText("Boşluk Ayarları");
								textview8.setText("Boşluk");
								textview9.setText("Renk");
								button4.setText("BEYAZ");
								button5.setText("SİYAH");
								textview17.setText("Materyal Navbar(sadece Q/LG UX için)");
							}
							else {
								if (languagetext.getText().toString().equals("Deutsch")) {
									textview1.setText("Spacing Options");
									textview8.setText("Platz");
									textview9.setText("Farbe");
									button4.setText("WEIß");
									button5.setText("SCHWARZ");
									textview17.setText("Material Navbar(Nur Q/LG UX!)");
								}
								else {
									if (languagetext.getText().toString().equals("español")) {
										textview1.setText("Opciones de espaciado");
										textview8.setText("Espaciado");
										textview9.setText("Color");
										button4.setText("BLANCO");
										button5.setText("NEGRO");
										textview17.setText("Barra de navegación con Material Design(¡Q/LG UX únicamente!)");
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