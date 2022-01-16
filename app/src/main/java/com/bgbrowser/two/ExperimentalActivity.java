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
import android.widget.TextView;
import android.widget.Button;
import androidx.cardview.widget.CardView;
import android.widget.EditText;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.net.Uri;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.webkit.*;
import com.hkm.ezwebview.*;
import com.monstertechno.adblocker.*;
import im.delight.android.webview.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class ExperimentalActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private Button button4;
	private LinearLayout linear3;
	private CardView cardview3;
	private CardView cardview2;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private TextView textview17;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private TextView textview6;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear28;
	private TextView textview7;
	private EditText edittext1;
	private TextView textview8;
	private EditText edittext2;
	private TextView textview9;
	private EditText edittext3;
	private TextView textview10;
	private EditText edittext4;
	private TextView textview11;
	private EditText edittext5;
	private TextView textview12;
	private EditText edittext6;
	private TextView textview13;
	private EditText edittext7;
	private TextView textview14;
	private EditText edittext8;
	private TextView textview15;
	private EditText edittext9;
	private TextView textview16;
	private EditText edittext10;
	private TextView textview18;
	private EditText edittext11;
	
	private SharedPreferences ex;
	private SharedPreferences settings;
	private TimerTask lamguage;
	private Intent nd = new Intent();
	private SharedPreferences logs;
	private Calendar ei = Calendar.getInstance();
	private AlertDialog.Builder e;
	private TimerTask rtimer;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.experimental);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		button4 = (Button) findViewById(R.id.button4);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		textview17 = (TextView) findViewById(R.id.textview17);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		textview7 = (TextView) findViewById(R.id.textview7);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		textview8 = (TextView) findViewById(R.id.textview8);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		textview9 = (TextView) findViewById(R.id.textview9);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		textview10 = (TextView) findViewById(R.id.textview10);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		textview11 = (TextView) findViewById(R.id.textview11);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		textview12 = (TextView) findViewById(R.id.textview12);
		edittext6 = (EditText) findViewById(R.id.edittext6);
		textview13 = (TextView) findViewById(R.id.textview13);
		edittext7 = (EditText) findViewById(R.id.edittext7);
		textview14 = (TextView) findViewById(R.id.textview14);
		edittext8 = (EditText) findViewById(R.id.edittext8);
		textview15 = (TextView) findViewById(R.id.textview15);
		edittext9 = (EditText) findViewById(R.id.edittext9);
		textview16 = (TextView) findViewById(R.id.textview16);
		edittext10 = (EditText) findViewById(R.id.edittext10);
		textview18 = (TextView) findViewById(R.id.textview18);
		edittext11 = (EditText) findViewById(R.id.edittext11);
		ex = getSharedPreferences("ex", Activity.MODE_PRIVATE);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		logs = getSharedPreferences("logs", Activity.MODE_PRIVATE);
		e = new AlertDialog.Builder(this);
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				nd.setClass(getApplicationContext(), MainActivity.class);
				startActivity(nd);
				finish();
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("darkmode", edittext1.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString(edittext2.getText().toString(), "cookies").commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("pfp", edittext3.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("darkwebview", edittext4.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("space", edittext5.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("debug", edittext6.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext7.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("rootmode", edittext7.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext8.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("flagfollowsystem", edittext8.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext9.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("homeurl", edittext9.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("mnb", edittext10.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		edittext11.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				settings.edit().putString("usenewtabs", edittext11.getText().toString()).commit();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor("#F44336"));
		cardview2.setCardBackgroundColor(0xFFFFFFFF);
		cardview2.setRadius((float)12);
		cardview2.setCardElevation((float)8);
		cardview2.setPreventCornerOverlap(true);
		cardview3.setCardBackgroundColor(0xFFFFEB3B);
		cardview3.setRadius((float)12);
		cardview3.setCardElevation((float)8);
		cardview3.setPreventCornerOverlap(true);
		edittext1.setText(settings.getString("darkmode", ""));
		edittext2.setText(settings.getString("cookies", ""));
		edittext3.setText(settings.getString("pfp", ""));
		edittext4.setText(settings.getString("darkwebview", ""));
		edittext5.setText(settings.getString("space", ""));
		edittext6.setText(settings.getString("debug", ""));
		edittext7.setText(settings.getString("rootmode", ""));
		edittext8.setText(settings.getString("flagfollowsystem", ""));
		edittext9.setText(settings.getString("homeurl", ""));
		edittext10.setText(settings.getString("mnb", ""));
		edittext11.setText(settings.getString("usenewtabs", ""));
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
	public void onBackPressed() {
		nd.setClass(getApplicationContext(), SettingsActivity.class);
		startActivity(nd);
		finish();
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