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
import android.widget.ProgressBar;
import android.widget.TextView;
import android.webkit.WebView;
import android.webkit.WebSettings;
import androidx.cardview.widget.CardView;
import android.widget.ImageView;
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


public class SavepdfActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private ProgressBar progressbar1;
	private TextView textview1;
	private WebView webview1;
	private CardView cardview1;
	private LinearLayout linear2;
	private ImageView imageview1;
	private TextView textview2;
	
	private SharedPreferences pdf;
	private TimerTask e;
	private SharedPreferences settings;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.savepdf);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
		textview1 = (TextView) findViewById(R.id.textview1);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		pdf = getSharedPreferences("pdf", Activity.MODE_PRIVATE);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		
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
		
		cardview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				e.cancel();
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		if (getIntent().getBooleanExtra("dialogTheme",true)) {
			// To make the dialog corners round
			getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
			
			{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				SketchUi.setColor(0x00000000);SketchUi.setCornerRadius(d*15);
				
				((ViewGroup)getWindow().getDecorView()).getChildAt(0).setBackground(SketchUi);
			}
			
			// Codes Generated by SketchUi 
		}
		// you may face some issues if you use enable ActionBar due to dialog theme
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
		webview1.loadUrl(pdf.getString("url", ""));
		textview1.setText("Creating PDF file...\n[Tab: ".concat(pdf.getString("page", "").concat("]")));
		cardview1.setCardBackgroundColor(0xFFFFFFFF);
		cardview1.setRadius((float)360);
		cardview1.setCardElevation((float)0);
		cardview1.setPreventCornerOverlap(true);
		if (settings.getString("darkmode", "").equals("1")) {
			cardview1.setCardBackgroundColor(0xFF000000);
			imageview1.setImageResource(R.drawable.ic_clear_white);
			textview2.setTextColor(0xFFFFFFFF);
		}
		else {
			cardview1.setCardBackgroundColor(0xFFFFFFFF);
			imageview1.setImageResource(R.drawable.ic_clear_black);
			textview2.setTextColor(0xFF000000);
		}
		e = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
							 PrintTheWebPage(webview1); 
						} 
						else { 
							SketchwareUtil.showMessage(getApplicationContext(), "This feature requires Android 5 or above.");
						}
						textview1.setText("Press back to close.");
						progressbar1.setVisibility(View.GONE);
						cardview1.setVisibility(View.GONE);
					}
				});
			}
		};
		_timer.schedule(e, (int)(2000));
	}
	public void _dialogTheme () {
	}
	// setTheme() should be set before setContentView() so a small hack to do this in sketchware
	 @Override 
	    public void setContentView( int layoutResID) {
		if(getIntent().getBooleanExtra("dialogTheme",true)){
			supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
			setTheme(R.style.Theme_AppCompat_Light_Dialog);
			setFinishOnTouchOutside(false);
			
			//change true to false if you want to make dialog non cancellable when clicked outside
			//if you want to use this without app compat  change supportRequestWindowFeature() and setTheme() to below codes.
			/*
requestWindowFeature(Window.FEATURE_NO_TITLE);
setTheme(android.R.style.Theme_Dialog);
*/
			// Calling this allows the Activity behind this one to be seen again. Once all such Activities have been redrawn
			try {
				 	java.lang.reflect.Method getActivityOptions = Activity.class.getDeclaredMethod("getActivityOptions"); getActivityOptions.setAccessible(true);
				 Object options = getActivityOptions.invoke(this); Class<?>[] classes = Activity.class.getDeclaredClasses(); Class<?> translucentConversionListenerClazz = null; 
				for (Class clazz : classes) { if (clazz.getSimpleName().contains("TranslucentConversionListener")) { translucentConversionListenerClazz = clazz; } } 
				java.lang.reflect.Method convertToTranslucent = Activity.class.getDeclaredMethod("convertToTranslucent", translucentConversionListenerClazz, ActivityOptions.class); convertToTranslucent.setAccessible(true); convertToTranslucent.invoke(this, null, options); } catch (Throwable t) {
			}
		}
		super.setContentView(layoutResID);  
	}
	{
	}
	
	
	public void _extra () {
	}
	
	android.print.PrintJob printJob;
	
	
	
	@androidx.annotation.RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
	
	private void PrintTheWebPage(WebView webView) {
		
		android.print.PrintManager printManager = (android.print.PrintManager) this.getSystemService(Context.PRINT_SERVICE);
		
		String jobName = "page:" + webView.getUrl();
		
		android.print.PrintDocumentAdapter printAdapter = webView.createPrintDocumentAdapter(jobName);
		
		assert printManager != null;
		
		printJob = printManager.print(jobName, printAdapter, new android.print.PrintAttributes.Builder().build());
		
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