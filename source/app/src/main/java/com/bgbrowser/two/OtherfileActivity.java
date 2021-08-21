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
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.app.Activity;
import android.content.SharedPreferences;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class OtherfileActivity extends AppCompatActivity {
	
	private WebView webview1;
	
	private SharedPreferences other;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.otherfile);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		other = getSharedPreferences("other", Activity.MODE_PRIVATE);
		
		//webviewOnProgressChanged
		webview1.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
	}
	
	private void initializeLogic() {
		_webzoominzoomout();
		
		if (!other.getString("other", "").equals("")) {
			//Load Other File
			webview1.loadUrl("file://".concat(other.getString("other", "")));
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
	
	public void _webzoominzoomout () {
		webview1.getSettings().setBuiltInZoomControls(true);webview1.getSettings().setDisplayZoomControls(false);
	}
	
	
	public void _full () {
	}
	
	
	public class CustomWebClient extends WebChromeClient {
		
		private View mCustomView;
		
		private WebChromeClient.CustomViewCallback mCustomViewCallback;
		
		protected FrameLayout frame;
		
		
		// Initially mOriginalOrientation is set to Landscape
		
		private int mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
		
		private int mOriginalSystemUiVisibility;
		
		
		// Constructor for CustomWebClient
		
		public CustomWebClient() {}
		
		
		public Bitmap getDefaultVideoPoster() {
			
			if (OtherfileActivity.this == null) {
				
				return null; }
			
			return BitmapFactory.decodeResource(OtherfileActivity.this.getApplicationContext().getResources(), 2130837573); }
		
		
		public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback viewCallback) {
			
			if (this.mCustomView != null) {
				
				onHideCustomView();
				
				return; }
			
			this.mCustomView = paramView;
			
			this.mOriginalSystemUiVisibility = OtherfileActivity.this.getWindow().getDecorView().getSystemUiVisibility();
			
			// When CustomView is shown screen orientation changes to mOriginalOrientation (Landscape).
			OtherfileActivity.this.setRequestedOrientation(this.mOriginalOrientation);
			
			// After that mOriginalOrientation is set to portrait.
			
			this.mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
			
			this.mCustomViewCallback = viewCallback; ((FrameLayout)OtherfileActivity.this.getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1)); OtherfileActivity.this.getWindow().getDecorView().setSystemUiVisibility(3846);
			
		}
		
		
		public void onHideCustomView() {
			
			((FrameLayout)OtherfileActivity.this.getWindow().getDecorView()).removeView(this.mCustomView);
			
			this.mCustomView = null;
			
			OtherfileActivity.this.getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
			
			// When CustomView is hidden, screen orientation is set to mOriginalOrientation (portrait).
			
			
			
			OtherfileActivity.this.setRequestedOrientation(this.mOriginalOrientation);
			
			
			
			// After that mOriginalOrientation is set to landscape.
			
			
			
			this.mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE; this.mCustomViewCallback.onCustomViewHidden();
			
			this.mCustomViewCallback = null;
			
		}
		
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