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
import androidx.cardview.widget.CardView;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.*;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.graphics.Typeface;
import androidx.webkit.*;
import com.hkm.ezwebview.*;
import com.monstertechno.adblocker.*;
import im.delight.android.webview.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class YtplrbsheetActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private String share = "";
	
	private LinearLayout handle;
	private LinearLayout linear6;
	private CardView cardview1;
	private HorizontalScrollView hscroll1;
	private TextView textview11;
	private LinearLayout linear2;
	private CardView cardview2;
	private TextView linktext;
	private CardView cardview3;
	private LinearLayout linear3;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear4;
	private YouTubePlayerView youtube1;
	private LinearLayout linear23;
	private CardView cardview6;
	private CardView cardview11;
	private CardView cardview10;
	private CardView cardview12;
	private LinearLayout linear12;
	private ImageView imageview2;
	private TextView textview5;
	private LinearLayout linear18;
	private ImageView imageview5;
	private TextView textview9;
	private LinearLayout linear16;
	private ImageView imageview4;
	private TextView textview7;
	private LinearLayout linear24;
	private ImageView imageview6;
	private TextView textview10;
	
	private Intent intent = new Intent();
	private TimerTask rl;
	private SharedPreferences settings;
	private SharedPreferences dialogytlink;
	private Intent w = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.ytplrbsheet);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		handle = (LinearLayout) findViewById(R.id.handle);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		textview11 = (TextView) findViewById(R.id.textview11);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		linktext = (TextView) findViewById(R.id.linktext);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		youtube1 = (YouTubePlayerView) findViewById(R.id.youtube1);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		cardview6 = (CardView) findViewById(R.id.cardview6);
		cardview11 = (CardView) findViewById(R.id.cardview11);
		cardview10 = (CardView) findViewById(R.id.cardview10);
		cardview12 = (CardView) findViewById(R.id.cardview12);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview9 = (TextView) findViewById(R.id.textview9);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview7 = (TextView) findViewById(R.id.textview7);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview10 = (TextView) findViewById(R.id.textview10);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		dialogytlink = getSharedPreferences("dialogytlink", Activity.MODE_PRIVATE);
		
		textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		cardview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				w.setClass(getApplicationContext(), DialogDownloadYtActivity.class);
				startActivity(w);
			}
		});
		
		cardview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				share = "https://m.youtube.com/watch?v=".concat(dialogytlink.getString("link", ""));
				Intent i = new Intent(android.content.Intent.ACTION_SEND);i.setType("text/plain"); i.putExtra(android.content.Intent.EXTRA_TEXT, share); startActivity(Intent.createChooser(i,"Share using"));
			}
		});
		
		cardview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				w.setClass(getApplicationContext(), YtplrbsheetActivity.class);
				startActivity(w);
				finish();
			}
		});
		
		cardview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				enterPictureInPictureMode();
				handle.setVisibility(View.GONE);
				cardview2.setVisibility(View.GONE);
				hscroll1.setVisibility(View.GONE);
				textview11.setVisibility(View.GONE);
				cardview3.setCardBackgroundColor(0xFF000000);
			}
		});
	}
	
	private void initializeLogic() {
		linktext.setText(dialogytlink.getString("link", ""));
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =YtplrbsheetActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.TRANSPARENT);
		}
		_removeScrollBar(hscroll1);
		_function();
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
		getLifecycle().addObserver(youtube1);
		if (linktext.getText().toString().contains("https://youtu.be/")) {
			linktext.setText(linktext.getText().toString().replace("https://youtu.be/", ""));
			dialogytlink.edit().putString("link", linktext.getText().toString()).commit();
		}
		if (linktext.getText().toString().contains("https://m.youtube.com/watch?v=")) {
			linktext.setText(linktext.getText().toString().replace("https://m.youtube.com/watch?v=", ""));
			dialogytlink.edit().putString("link", linktext.getText().toString()).commit();
		}
		youtube1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
			  @Override
			  public void onReady(@NonNull YouTubePlayer youTubePlayer) {
				    String videoId = linktext.getText().toString();
				    youTubePlayer.cueVideo(videoId, 0);
				     
				  }
		});
		rl = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (youtube1.isFullScreen()) {
							youtube1.exitFullScreen();
							intent.setClass(getApplicationContext(), YtfullscreenActivity.class);
							startActivity(intent);
							finish();
						}
						else {
							 
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(rl, (int)(0), (int)(75));
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 1);
		cardview1.setCardBackgroundColor(0xFFFFFFFF);
		cardview1.setRadius((float)15);
		cardview1.setCardElevation((float)3);
		cardview1.setPreventCornerOverlap(true);
		cardview2.setCardBackgroundColor(0xFFEEEEEE);
		cardview2.setPreventCornerOverlap(true);
		cardview3.setCardBackgroundColor(0xFFFFFFFF);
		cardview3.setRadius((float)15);
		cardview3.setCardElevation((float)3);
		cardview3.setPreventCornerOverlap(true);
		if (settings.getString("darkmode", "").equals("1")) {
			if (Double.parseDouble(Build.VERSION.SDK) > 30) {
				cardview2.setCardBackgroundColor(getColor("system_accent1_800"));
				cardview6.setCardBackgroundColor(getColor("system_accent1_800"));
				cardview10.setCardBackgroundColor(getColor("system_accent1_800"));
				cardview11.setCardBackgroundColor(getColor("system_accent1_800"));
				cardview12.setCardBackgroundColor(getColor("system_accent1_800"));
			}
			else {
				cardview2.setCardBackgroundColor(0xFF212121);
				cardview10.setCardBackgroundColor(0xFF212121);
				cardview6.setCardBackgroundColor(0xFF212121);
				cardview11.setCardBackgroundColor(0xFF212121);
				cardview12.setCardBackgroundColor(0xFF212121);
			}
			cardview1.setCardBackgroundColor(0xFF000000);
			cardview3.setCardBackgroundColor(0xFF000000);
			textview1.setTextColor(0xFFFFFFFF);
			textview7.setTextColor(0xFFFFFFFF);
			textview9.setTextColor(0xFFFFFFFF);
			textview10.setTextColor(0xFFFFFFFF);
			imageview2.setImageResource(R.drawable.ic_get_app_white);
			imageview4.setImageResource(R.drawable.ic_loop_white);
			imageview5.setImageResource(R.drawable.ic_send_white);
			imageview6.setImageResource(R.drawable.ic_tab_unselected_white);
			textview5.setTextColor(0xFFFFFFFF);
			{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				SketchUi.setColor(0xFF000000);SketchUi.setCornerRadii(new float[]{
					d*10,d*10,d*10 ,d*10,d*0,d*0 ,d*0,d*0});
				linear6.setElevation(d*5);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
				linear6.setBackground(SketchUiRD);
				linear6.setClickable(true);
			}
			_rippleRoundStroke(handle, "#000000", "#000000", 360, 0, "#000000");
			_rippleRoundStroke(textview11, "#000000", "#2196F3", 30, 2, "#2196F3");
		}
		else {
			if (Double.parseDouble(Build.VERSION.SDK) > 30) {
				cardview2.setCardBackgroundColor(getColor("system_accent1_100"));
				cardview6.setCardBackgroundColor(getColor("system_accent1_100"));
				cardview10.setCardBackgroundColor(getColor("system_accent1_100"));
				cardview11.setCardBackgroundColor(getColor("system_accent1_100"));
				cardview12.setCardBackgroundColor(getColor("system_accent1_100"));
			}
			else {
				cardview2.setCardBackgroundColor(0xFFEEEEEE);
				cardview6.setCardBackgroundColor(0xFFF5F5F5);
				cardview10.setCardBackgroundColor(0xFFF5F5F5);
				cardview11.setCardBackgroundColor(0xFFF5F5F5);
				cardview12.setCardBackgroundColor(0xFFF5F5F5);
			}
			cardview1.setCardBackgroundColor(0xFFFFFFFF);
			cardview3.setCardBackgroundColor(0xFFFFFFFF);
			textview1.setTextColor(0xFF000000);
			textview7.setTextColor(0xFF000000);
			textview9.setTextColor(0xFF000000);
			textview10.setTextColor(0xFF000000);
			imageview2.setImageResource(R.drawable.ic_get_app_black);
			imageview4.setImageResource(R.drawable.ic_loop_black);
			imageview6.setImageResource(R.drawable.ic_tab_unselected_black);
			textview5.setTextColor(0xFF000000);
			imageview5.setImageResource(R.drawable.ic_send_black);
			{
				android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				SketchUi.setColor(0xFFFFFFFF);SketchUi.setCornerRadii(new float[]{
					d*10,d*10,d*10 ,d*10,d*0,d*0 ,d*0,d*0});
				linear6.setElevation(d*5);
				android.graphics.drawable.RippleDrawable SketchUiRD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE0E0E0}), SketchUi, null);
				linear6.setBackground(SketchUiRD);
				linear6.setClickable(true);
			}
			_rippleRoundStroke(handle, "#FFFFFF", "#FFFFFF", 360, 0, "#000000");
			_rippleRoundStroke(textview11, "#FFFFFF", "#2196F3", 30, 2, "#2196F3");
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
	
	
	public void _rippleRoundStroke (final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _setViewSize (final View _view1, final double _width, final double _height) {
		_view1.setLayoutParams(new LinearLayout.LayoutParams((int)_width, (int)_height));
	}
	
	
	public void _removeScrollBar (final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _function () {
	}
	private int getColor(String name){
		return getColor(getResources().getIdentifier(name,"color","android"));
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