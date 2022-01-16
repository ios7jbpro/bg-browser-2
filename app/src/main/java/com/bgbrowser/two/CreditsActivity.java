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
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import de.hdodenhof.circleimageview.*;
import android.content.Intent;
import android.net.Uri;
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


public class CreditsActivity extends AppCompatActivity {
	
	private String your_version = "";
	private String package_name = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear32;
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear64;
	private LinearLayout linear68;
	private LinearLayout linear72;
	private LinearLayout linear46;
	private LinearLayout linear48;
	private LinearLayout linear50;
	private LinearLayout linear52;
	private LinearLayout linear80;
	private TextView textview22;
	private TextView textview23;
	private TextView textview24;
	private TextView textview25;
	private ImageView imageview1;
	private TextView textview21;
	private TextView textview20;
	private LinearLayout linear65;
	private TextView textview43;
	private CircleImageView circleimageview18;
	private TextView textview44;
	private LinearLayout linear69;
	private TextView textview45;
	private CircleImageView circleimageview19;
	private TextView textview46;
	private LinearLayout linear73;
	private TextView textview47;
	private CircleImageView circleimageview20;
	private TextView textview48;
	private LinearLayout linear47;
	private TextView textview36;
	private CircleImageView circleimageview14;
	private TextView textview35;
	private LinearLayout linear49;
	private TextView textview37;
	private CircleImageView circleimageview15;
	private TextView textview38;
	private LinearLayout linear51;
	private TextView textview39;
	private CircleImageView circleimageview16;
	private TextView textview40;
	private LinearLayout linear53;
	private TextView textview41;
	private CircleImageView circleimageview17;
	private TextView textview42;
	private LinearLayout linear81;
	private TextView textview49;
	private CircleImageView circleimageview21;
	private TextView textview50;
	
	private Intent tg = new Intent();
	private Intent github = new Intent();
	private Intent youtube = new Intent();
	private Intent instagram = new Intent();
	private SharedPreferences settings;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.credits);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear64 = (LinearLayout) findViewById(R.id.linear64);
		linear68 = (LinearLayout) findViewById(R.id.linear68);
		linear72 = (LinearLayout) findViewById(R.id.linear72);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		linear80 = (LinearLayout) findViewById(R.id.linear80);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview24 = (TextView) findViewById(R.id.textview24);
		textview25 = (TextView) findViewById(R.id.textview25);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview20 = (TextView) findViewById(R.id.textview20);
		linear65 = (LinearLayout) findViewById(R.id.linear65);
		textview43 = (TextView) findViewById(R.id.textview43);
		circleimageview18 = (CircleImageView) findViewById(R.id.circleimageview18);
		textview44 = (TextView) findViewById(R.id.textview44);
		linear69 = (LinearLayout) findViewById(R.id.linear69);
		textview45 = (TextView) findViewById(R.id.textview45);
		circleimageview19 = (CircleImageView) findViewById(R.id.circleimageview19);
		textview46 = (TextView) findViewById(R.id.textview46);
		linear73 = (LinearLayout) findViewById(R.id.linear73);
		textview47 = (TextView) findViewById(R.id.textview47);
		circleimageview20 = (CircleImageView) findViewById(R.id.circleimageview20);
		textview48 = (TextView) findViewById(R.id.textview48);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		textview36 = (TextView) findViewById(R.id.textview36);
		circleimageview14 = (CircleImageView) findViewById(R.id.circleimageview14);
		textview35 = (TextView) findViewById(R.id.textview35);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		textview37 = (TextView) findViewById(R.id.textview37);
		circleimageview15 = (CircleImageView) findViewById(R.id.circleimageview15);
		textview38 = (TextView) findViewById(R.id.textview38);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		textview39 = (TextView) findViewById(R.id.textview39);
		circleimageview16 = (CircleImageView) findViewById(R.id.circleimageview16);
		textview40 = (TextView) findViewById(R.id.textview40);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		textview41 = (TextView) findViewById(R.id.textview41);
		circleimageview17 = (CircleImageView) findViewById(R.id.circleimageview17);
		textview42 = (TextView) findViewById(R.id.textview42);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		textview49 = (TextView) findViewById(R.id.textview49);
		circleimageview21 = (CircleImageView) findViewById(R.id.circleimageview21);
		textview50 = (TextView) findViewById(R.id.textview50);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		
		linear64.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				github.setAction(Intent.ACTION_VIEW);
				github.setData(Uri.parse("https://github.com/ios7jbpro"));
				startActivity(github);
			}
		});
		
		linear46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				github.setAction(Intent.ACTION_VIEW);
				github.setData(Uri.parse("https://github.com/Artx-II"));
				startActivity(github);
			}
		});
		
		linear52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				github.setAction(Intent.ACTION_VIEW);
				github.setData(Uri.parse("https://github.com/windowzytch"));
				startActivity(github);
			}
		});
	}
	
	private void initializeLogic() {
		package_name = "com.bgbrowser.two";
		try {
			android.content.pm.PackageInfo pinfo = getPackageManager().getPackageInfo( package_name, android.content.pm.PackageManager.GET_ACTIVITIES);
			your_version = pinfo.versionName; }
		catch (Exception e){ showMessage(e.toString()); }
		textview20.setText("v".concat(your_version));
		_rippleRoundStroke(linear64, "#FFFFFF", "#E0E0E0", 25, 2, "#E0E0E0");
		_rippleRoundStroke(linear68, "#FFFFFF", "#E0E0E0", 25, 2, "#E0E0E0");
		_rippleRoundStroke(linear72, "#FFFFFF", "#E0E0E0", 25, 2, "#E0E0E0");
		_rippleRoundStroke(linear46, "#FFFFFF", "#E0E0E0", 25, 2, "#E0E0E0");
		_rippleRoundStroke(linear48, "#FFFFFF", "#E0E0E0", 25, 2, "#E0E0E0");
		_rippleRoundStroke(linear50, "#FFFFFF", "#E0E0E0", 25, 2, "#E0E0E0");
		_rippleRoundStroke(linear52, "#FFFFFF", "#E0E0E0", 25, 2, "#E0E0E0");
		_rippleRoundStroke(linear80, "#FFFFFF", "#E0E0E0", 25, 2, "#E0E0E0");
		if (settings.getString("darkmode", "").equals("1")) {
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =CreditsActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
			}
			textview1.setTextColor(0xFFFFFFFF);
			textview22.setTextColor(0xFFFFFFFF);
			textview23.setTextColor(0xFFFFFFFF);
			textview24.setTextColor(0xFFFFFFFF);
			textview25.setTextColor(0xFFFFFFFF);
			textview21.setTextColor(0xFFFFFFFF);
			textview43.setTextColor(0xFFFFFFFF);
			textview44.setTextColor(0xFFFFFFFF);
			textview45.setTextColor(0xFFFFFFFF);
			textview46.setTextColor(0xFFFFFFFF);
			textview47.setTextColor(0xFFFFFFFF);
			textview48.setTextColor(0xFFFFFFFF);
			textview36.setTextColor(0xFFFFFFFF);
			textview35.setTextColor(0xFFFFFFFF);
			textview37.setTextColor(0xFFFFFFFF);
			textview38.setTextColor(0xFFFFFFFF);
			textview39.setTextColor(0xFFFFFFFF);
			textview40.setTextColor(0xFFFFFFFF);
			textview41.setTextColor(0xFFFFFFFF);
			textview42.setTextColor(0xFFFFFFFF);
			textview49.setTextColor(0xFFFFFFFF);
			textview50.setTextColor(0xFFFFFFFF);
		}
		else {
			getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
			getWindow().setStatusBarColor(0xFFFFFFFF);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =CreditsActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
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