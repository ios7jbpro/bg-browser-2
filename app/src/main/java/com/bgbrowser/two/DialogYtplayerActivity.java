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
import android.widget.ImageView;
import android.widget.TextView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.*;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;
import androidx.webkit.*;
import com.monstertechno.adblocker.*;
import com.jtv7.rippleswitchlib.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class DialogYtplayerActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private String share = "";
	
	private LinearLayout linear6;
	private LinearLayout linear21;
	private CardView cardview9;
	private CardView cardview1;
	private CardView cardview14;
	private LinearLayout linear22;
	private LinearLayout linear15;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear7;
	private CardView cardview4;
	private CardView cardview6;
	private CardView cardview11;
	private CardView cardview13;
	private CardView cardview10;
	private CardView cardview12;
	private LinearLayout linear8;
	private ImageView imageview3;
	private LinearLayout linear12;
	private ImageView imageview2;
	private TextView textview5;
	private LinearLayout linear18;
	private ImageView imageview5;
	private TextView textview9;
	private LinearLayout linear20;
	private ImageView imageview7;
	private TextView textview11;
	private LinearLayout linear16;
	private ImageView imageview4;
	private TextView textview7;
	private LinearLayout linear19;
	private ImageView imageview6;
	private TextView textview10;
	private LinearLayout linear2;
	private CardView cardview2;
	private TextView linktext;
	private CardView cardview3;
	private LinearLayout linear3;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear4;
	private YouTubePlayerView youtube1;
	
	private SharedPreferences dialogytlink;
	private RequestNetwork t;
	private RequestNetwork.RequestListener _t_request_listener;
	private SharedPreferences settings;
	private Intent w = new Intent();
	private Intent b = new Intent();
	private AlertDialog.Builder h;
	private Intent intent = new Intent();
	private TimerTask rl;
	private Intent ytintent = new Intent();
	private Intent pip = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.dialog_ytplayer);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		cardview9 = (CardView) findViewById(R.id.cardview9);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		cardview14 = (CardView) findViewById(R.id.cardview14);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		cardview4 = (CardView) findViewById(R.id.cardview4);
		cardview6 = (CardView) findViewById(R.id.cardview6);
		cardview11 = (CardView) findViewById(R.id.cardview11);
		cardview13 = (CardView) findViewById(R.id.cardview13);
		cardview10 = (CardView) findViewById(R.id.cardview10);
		cardview12 = (CardView) findViewById(R.id.cardview12);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview9 = (TextView) findViewById(R.id.textview9);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview11 = (TextView) findViewById(R.id.textview11);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview7 = (TextView) findViewById(R.id.textview7);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		linktext = (TextView) findViewById(R.id.linktext);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		youtube1 = (YouTubePlayerView) findViewById(R.id.youtube1);
		dialogytlink = getSharedPreferences("dialogytlink", Activity.MODE_PRIVATE);
		t = new RequestNetwork(this);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		h = new AlertDialog.Builder(this);
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (settings.getString("ytplrtapoutside", "").equals("")) {
					finish();
				}
			}
		});
		
		cardview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		cardview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				w.setAction(Intent.ACTION_VIEW);
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
		
		cardview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				pip.setClass(getApplicationContext(), PipactivityActivity.class);
				startActivity(pip);
				finish();
			}
		});
		
		cardview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				w.setAction(Intent.ACTION_VIEW);
				w.setClass(getApplicationContext(), DialogYtplayerActivity.class);
				startActivity(w);
				finish();
			}
		});
		
		cardview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ytintent.setAction(Intent.ACTION_VIEW);
				ytintent.setData(Uri.parse("https://m.youtube.com/watch?v=".concat(dialogytlink.getString("link", ""))));
				startActivity(ytintent);
				finish();
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
		linktext.setText(dialogytlink.getString("link", ""));
		if (Double.parseDouble(Build.VERSION.SDK) < 26) {
			cardview13.setVisibility(View.GONE);
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
	
	@Override
	public void onStart() {
		super.onStart();
		_setViewSize(linear6, SketchwareUtil.getDisplayWidthPixels(getApplicationContext()) - 130, SketchwareUtil.getDisplayHeightPixels(getApplicationContext()) - 180);
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
		cardview2.setRadius((float)15);
		cardview2.setCardElevation((float)3);
		cardview2.setPreventCornerOverlap(true);
		cardview3.setCardBackgroundColor(0xFFFFFFFF);
		cardview3.setRadius((float)15);
		cardview3.setCardElevation((float)3);
		cardview3.setPreventCornerOverlap(true);
		cardview4.setCardBackgroundColor(0xFFFFFFFF);
		cardview4.setRadius((float)360);
		cardview4.setCardElevation((float)0);
		cardview4.setPreventCornerOverlap(true);
		cardview6.setCardBackgroundColor(0xFFFFFFFF);
		cardview6.setRadius((float)360);
		cardview6.setCardElevation((float)0);
		cardview6.setPreventCornerOverlap(true);
		cardview9.setCardBackgroundColor(Color.TRANSPARENT);
		cardview9.setRadius((float)360);
		cardview9.setCardElevation((float)0);
		cardview9.setPreventCornerOverlap(true);
		cardview10.setCardBackgroundColor(0xFFFFFFFF);
		cardview10.setRadius((float)360);
		cardview10.setCardElevation((float)0);
		cardview10.setPreventCornerOverlap(true);
		cardview11.setCardBackgroundColor(0xFFFFFFFF);
		cardview11.setRadius((float)360);
		cardview11.setCardElevation((float)0);
		cardview11.setPreventCornerOverlap(true);
		cardview12.setCardBackgroundColor(0xFFFFFFFF);
		cardview12.setRadius((float)360);
		cardview12.setCardElevation((float)0);
		cardview12.setPreventCornerOverlap(true);
		cardview13.setCardBackgroundColor(0xFFFFFFFF);
		cardview13.setRadius((float)360);
		cardview13.setCardElevation((float)0);
		cardview13.setPreventCornerOverlap(true);
		cardview14.setCardBackgroundColor(0xFFFFFFFF);
		cardview14.setRadius((float)360);
		cardview14.setCardElevation((float)0);
		cardview14.setPreventCornerOverlap(true);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
		textview10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
		textview11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
		if (settings.getString("darkmode", "").equals("1")) {
			cardview1.setCardBackgroundColor(0xFF000000);
			cardview2.setCardBackgroundColor(0xFF212121);
			cardview3.setCardBackgroundColor(0xFF000000);
			cardview4.setCardBackgroundColor(0xFF000000);
			cardview6.setCardBackgroundColor(0xFF000000);
			cardview10.setCardBackgroundColor(0xFF000000);
			cardview11.setCardBackgroundColor(0xFF000000);
			cardview12.setCardBackgroundColor(0xFF000000);
			cardview13.setCardBackgroundColor(0xFF000000);
			textview1.setTextColor(0xFFFFFFFF);
			textview7.setTextColor(0xFFFFFFFF);
			textview9.setTextColor(0xFFFFFFFF);
			textview10.setTextColor(0xFFFFFFFF);
			textview11.setTextColor(0xFFFFFFFF);
			imageview2.setImageResource(R.drawable.ic_get_app_white);
			imageview3.setImageResource(R.drawable.ic_close_white);
			imageview4.setImageResource(R.drawable.ic_loop_white);
			imageview5.setImageResource(R.drawable.ic_send_white);
			imageview7.setImageResource(R.drawable.ic_tab_unselected_white);
			textview5.setTextColor(0xFFFFFFFF);
		}
		else {
			cardview1.setCardBackgroundColor(0xFFFFFFFF);
			cardview2.setCardBackgroundColor(0xFFEEEEEE);
			cardview3.setCardBackgroundColor(0xFFFFFFFF);
			cardview4.setCardBackgroundColor(0xFFFFFFFF);
			cardview6.setCardBackgroundColor(0xFFFFFFFF);
			cardview10.setCardBackgroundColor(0xFFFFFFFF);
			cardview11.setCardBackgroundColor(0xFFFFFFFF);
			cardview12.setCardBackgroundColor(0xFFFFFFFF);
			cardview13.setCardBackgroundColor(0xFFFFFFFF);
			textview1.setTextColor(0xFF000000);
			textview7.setTextColor(0xFF000000);
			textview9.setTextColor(0xFF000000);
			textview10.setTextColor(0xFF000000);
			textview11.setTextColor(0xFF000000);
			imageview2.setImageResource(R.drawable.ic_get_app_black);
			imageview3.setImageResource(R.drawable.ic_clear_black);
			imageview4.setImageResource(R.drawable.ic_loop_black);
			imageview5.setImageResource(R.drawable.ic_send_black);
			imageview7.setImageResource(R.drawable.ic_tab_unselected_black);
			textview5.setTextColor(0xFF000000);
		}
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
	
	
	public void _invisible () {
		cardview9.setVisibility(View.GONE);
		cardview2.setVisibility(View.GONE);
		
	}
	
	
	public void _visible () {
		cardview9.setVisibility(View.VISIBLE);
		cardview2.setVisibility(View.VISIBLE);
		if (true) {
			
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