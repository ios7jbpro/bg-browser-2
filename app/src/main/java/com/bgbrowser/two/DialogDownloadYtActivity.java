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
import android.webkit.WebView;
import android.webkit.WebSettings;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.*;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import androidx.webkit.*;
import com.hkm.ezwebview.*;
import com.monstertechno.adblocker.*;
import im.delight.android.webview.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class DialogDownloadYtActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private LinearLayout linear4;
	private LinearLayout linear1;
	private TextView linktext;
	private LinearLayout buttons;
	private WebView dmp4;
	private WebView dmp3;
	private LinearLayout loading;
	private CardView cardview1;
	private CardView cardview2;
	private LinearLayout linear2;
	private TextView textview1;
	private LinearLayout linear3;
	private TextView textview2;
	private LottieAnimationView lottie1;
	private TextView textview3;
	
	private SharedPreferences dialogytlink;
	private SharedPreferences settings;
	private RequestNetwork t;
	private RequestNetwork.RequestListener _t_request_listener;
	private TimerTask id;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.dialog_download_yt);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linktext = (TextView) findViewById(R.id.linktext);
		buttons = (LinearLayout) findViewById(R.id.buttons);
		dmp4 = (WebView) findViewById(R.id.dmp4);
		dmp4.getSettings().setJavaScriptEnabled(true);
		dmp4.getSettings().setSupportZoom(true);
		dmp3 = (WebView) findViewById(R.id.dmp3);
		dmp3.getSettings().setJavaScriptEnabled(true);
		dmp3.getSettings().setSupportZoom(true);
		loading = (LinearLayout) findViewById(R.id.loading);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview2 = (TextView) findViewById(R.id.textview2);
		lottie1 = (LottieAnimationView) findViewById(R.id.lottie1);
		textview3 = (TextView) findViewById(R.id.textview3);
		dialogytlink = getSharedPreferences("dialogytlink", Activity.MODE_PRIVATE);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		t = new RequestNetwork(this);
		
		//webviewOnProgressChanged
		dmp4.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		dmp4.setWebViewClient(new WebViewClient() {
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
		
		//webviewOnProgressChanged
		dmp3.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		dmp3.setWebViewClient(new WebViewClient() {
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
		
		cardview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				buttons.setVisibility(View.GONE);
				loading.setVisibility(View.VISIBLE);
				id = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								dmp3.setVisibility(View.VISIBLE);
								loading.setVisibility(View.GONE);
							}
						});
					}
				};
				_timer.schedule(id, (int)(15000));
			}
		});
		
		cardview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				buttons.setVisibility(View.GONE);
				loading.setVisibility(View.VISIBLE);
				id = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								dmp4.setVisibility(View.VISIBLE);
								loading.setVisibility(View.GONE);
							}
						});
					}
				};
				_timer.schedule(id, (int)(15000));
			}
		});
		
		_t_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		dmp4.loadUrl("https://www.yt-download.org/api/button/videos/".concat(dialogytlink.getString("link", "")));
		dmp3.loadUrl("https://www.yt-download.org/@api/button/mp3/".concat(dialogytlink.getString("link", "")));
		_function();
		dmp4.setDownloadListener(new DownloadListener() {
			public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
				DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
				String cookies = CookieManager.getInstance().getCookie(url);
				request.addRequestHeader("cookie", cookies);
				request.addRequestHeader("User-Agent", userAgent);
				request.setDescription("Downloading file...");
				request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				request.allowScanningByMediaScanner(); request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				java.io.File aatv = new java.io.File(Environment.getExternalStorageDirectory().getPath() + "/Download");
				if(!aatv.exists()){if (!aatv.mkdirs()){ Log.e("TravellerLog ::","Problem creating Image folder");}} request.setDestinationInExternalPublicDir("/Download", URLUtil.guessFileName(url, contentDisposition, mimetype));
				DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				manager.enqueue(request);
				showMessage("Downloading File....");
				//Notif if success
				BroadcastReceiver onComplete = new BroadcastReceiver() {
					public void onReceive(Context ctxt, Intent intent) {
						showMessage("Download Complete!");
						unregisterReceiver(this);
					}};
				registerReceiver(onComplete, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
			}
		});
		dmp3.setDownloadListener(new DownloadListener() {
			public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
				DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
				String cookies = CookieManager.getInstance().getCookie(url);
				request.addRequestHeader("cookie", cookies);
				request.addRequestHeader("User-Agent", userAgent);
				request.setDescription("Downloading file...");
				request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				request.allowScanningByMediaScanner(); request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				java.io.File aatv = new java.io.File(Environment.getExternalStorageDirectory().getPath() + "/Download");
				if(!aatv.exists()){if (!aatv.mkdirs()){ Log.e("TravellerLog ::","Problem creating Image folder");}} request.setDestinationInExternalPublicDir("/Download", URLUtil.guessFileName(url, contentDisposition, mimetype));
				DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				manager.enqueue(request);
				showMessage("Downloading File....");
				//Notif if success
				BroadcastReceiver onComplete = new BroadcastReceiver() {
					public void onReceive(Context ctxt, Intent intent) {
						showMessage("Download Complete!");
						unregisterReceiver(this);
					}};
				registerReceiver(onComplete, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
			}
		});
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
	public void onStart() {
		super.onStart();
		dmp3.setVisibility(View.GONE);
		dmp4.setVisibility(View.GONE);
		loading.setVisibility(View.GONE);
		if (settings.getString("darkmode", "").equals("1")) {
			dmp4.setBackgroundColor(0xFF000000);
			dmp3.setBackgroundColor(0xFF000000);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(dmp4.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(dmp3.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				SketchUi.setColor(0xFF000000);SketchUi.setCornerRadii(new float[]{
					d*10,d*10,d*10 ,d*10,d*0,d*0 ,d*0,d*0});
				linear1.setElevation(d*5);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
				linear1.setBackground(SketchUiRD);
				linear1.setClickable(true);
			}
			textview1.setTextColor(0xFFFFFFFF);
			textview3.setTextColor(0xFFFFFFFF);
			cardview1.setCardBackgroundColor(0xFF212121);
			cardview2.setCardBackgroundColor(0xFF212121);
			if (Double.parseDouble(Build.VERSION.SDK) > 30) {
				cardview1.setCardBackgroundColor(getColor("system_accent1_800"));
				cardview2.setCardBackgroundColor(getColor("system_accent1_800"));
			}
			textview2.setTextColor(0xFFFFFFFF);
			_rippleRoundStroke(linear4, "#000000", "#000000", 360, 0, "#000000");
		}
		else {
			dmp4.setBackgroundColor(0xFFFFFFFF);
			dmp4.setBackgroundColor(0xFFFFFFFF);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(dmp4.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(dmp3.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				SketchUi.setColor(0xFFFFFFFF);SketchUi.setCornerRadii(new float[]{
					d*10,d*10,d*10 ,d*10,d*0,d*0 ,d*0,d*0});
				linear1.setElevation(d*5);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
				linear1.setBackground(SketchUiRD);
				linear1.setClickable(true);
			}
			textview1.setTextColor(0xFF000000);
			textview3.setTextColor(0xFF000000);
			cardview1.setCardBackgroundColor(0xFFE0E0E0);
			cardview2.setCardBackgroundColor(0xFFE0E0E0);
			if (Double.parseDouble(Build.VERSION.SDK) > 30) {
				cardview1.setCardBackgroundColor(getColor("system_accent1_100"));
				cardview2.setCardBackgroundColor(getColor("system_accent1_100"));
			}
			textview2.setTextColor(0xFF000000);
			_rippleRoundStroke(linear4, "#FFFFFF", "#FFFFFF", 360, 0, "#000000");
		}
	}
	public void _convertToBottomSheet () {
	}
	private androidx.coordinatorlayout.widget.CoordinatorLayout mCoordinatorLayout;
	@Override
	public void finish(){
		com.google.android.material.bottomsheet.BottomSheetBehavior.from(mCoordinatorLayout.getChildAt(0)).setState(com.google.android.material.bottomsheet.BottomSheetBehavior.STATE_COLLAPSED);
	}
	private void superFinish(){
		super.finish();
	}
	 @Override
	public void setContentView(int layId){
			if(mCoordinatorLayout == null){
					overridePendingTransition(0,0);
					mCoordinatorLayout = new androidx.coordinatorlayout.widget.CoordinatorLayout(this);
					makeActivityTransparent();
			mCoordinatorLayout.setBackgroundColor(0x80000000);
					mCoordinatorLayout.setOnClickListener(new View.OnClickListener(){
							@Override
							public void onClick (View v){
										finish();
							}
					});
			}
			mCoordinatorLayout.removeAllViews();
			androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams params = new androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
			final com.google.android.material.bottomsheet.BottomSheetBehavior behavior = new com.google.android.material.bottomsheet.BottomSheetBehavior();
			params.setBehavior(behavior);
			behavior.setBottomSheetCallback(new com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback(){
					@Override
					public void onSlide(View bottomSheet, float slideOffset){
							
					}
					@Override
					public void onStateChanged(View bottomSheet, int newState){
							if(newState == com.google.android.material.bottomsheet.BottomSheetBehavior.STATE_COLLAPSED){
									superFinish();
					overridePendingTransition(0,0);
							}
					}
			});
			View inflated = getLayoutInflater().inflate(layId,null);	
			mCoordinatorLayout.addView(inflated,params);
			
			if(mCoordinatorLayout.getParent()!= null)((ViewGroup)mCoordinatorLayout.getParent()).removeView(mCoordinatorLayout);
			setContentView(mCoordinatorLayout);
		inflated.post(new Runnable(){
			@Override
			            public void run() {
				behavior.setState(com.google.android.material.bottomsheet.BottomSheetBehavior.STATE_EXPANDED);
			}});
		
	}
	
	private void makeActivityTransparent(){
		getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
			try {
					java.lang.reflect.Method getActivityOptions = Activity.class.getDeclaredMethod("getActivityOptions"); 
					getActivityOptions.setAccessible(true);
					Object options = getActivityOptions.invoke(this);
					Class<?>[] classes = Activity.class.getDeclaredClasses();
					Class<?> translucentConversionListenerClazz = null;
					for (Class clazz : classes) { 
							if (clazz.getSimpleName().contains("TranslucentConversionListener")) { 
									translucentConversionListenerClazz = clazz;
							} 
					} 
					java.lang.reflect.Method convertToTranslucent = Activity.class.getDeclaredMethod("convertToTranslucent", translucentConversionListenerClazz, ActivityOptions.class); 
					convertToTranslucent.setAccessible(true); 
					convertToTranslucent.invoke(this, null, options); 
			} catch (Throwable t) {
			}
	}
	
	{
	}
	
	
	public void _function () {
	}
	private int getColor(String name){
		return getColor(getResources().getIdentifier(name,"color","android"));
	}
	
	{
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