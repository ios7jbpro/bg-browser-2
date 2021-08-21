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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class HistoryActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private ArrayList<String> maphistory = new ArrayList<>();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private TextView textview1;
	private Button button1;
	private LinearLayout linear2;
	private TextView textview2;
	private ListView listview1;
	
	private TimerTask reloader;
	private SharedPreferences history;
	private SharedPreferences settings;
	private TimerTask timer;
	private SharedPreferences webhistory;
	private SharedPreferences historycounter;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.history);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview1 = (TextView) findViewById(R.id.textview1);
		button1 = (Button) findViewById(R.id.button1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview2 = (TextView) findViewById(R.id.textview2);
		listview1 = (ListView) findViewById(R.id.listview1);
		history = getSharedPreferences("history", Activity.MODE_PRIVATE);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		webhistory = getSharedPreferences("webhistory", Activity.MODE_PRIVATE);
		historycounter = getSharedPreferences("historycounter", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				history.edit().putString("history", "").commit();
			}
		});
	}
	
	private void initializeLogic() {
		linear1.setElevation(2);
		historycounter.edit().putString("historycounter", "0").commit();
		listview1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, maphistory));
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (settings.getString("darkmode", "").equals("1")) {
							linear1.setBackgroundColor(0xFF000000);
							vscroll1.setBackgroundColor(0xFF000000);
							textview1.setTextColor(0xFFFFFFFF);
							button1.setTextColor(0xFFFFFFFF);
							if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
								Window w =HistoryActivity.this.getWindow();
								w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
								w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
							}
						}
						else {
							linear1.setBackgroundColor(0xFFFFFFFF);
							vscroll1.setBackgroundColor(0xFFFFFFFF);
							textview1.setTextColor(0xFF000000);
							button1.setTextColor(0xFF000000);
							if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
								Window w =HistoryActivity.this.getWindow();
								w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
								w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
							}
							getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
							getWindow().setStatusBarColor(0xFFFFFFFF);
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(timer, (int)(0), (int)(50));
		_reload();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _reload () {
		if (historycounter.getString("historycounter", "").equals(webhistory.getString("webhistory", ""))) {
			
		}
		else {
			maphistory.add(history.getString(String.valueOf((long)(Double.parseDouble(historycounter.getString("historycounter", "")))), ""));
			historycounter.edit().putString("historycounter", String.valueOf((long)(Double.parseDouble(historycounter.getString("historycounter", "")) + 1))).commit();
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
			_reload();
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