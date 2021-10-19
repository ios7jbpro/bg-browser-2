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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
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
import com.tuyenmonkey.mkloader.*;
import com.monstertechno.adblocker.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class DialogYtplayerActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private String share = "";
	
	private LinearLayout linear6;
	private CardView cardview1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private CardView cardview2;
	private TextView linktext;
	private CardView cardview3;
	private LinearLayout linear3;
	private ImageView imageview3;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear4;
	private YouTubePlayerView youtube1;
	private LinearLayout linear23;
	private CardView cardview6;
	private CardView cardview11;
	private CardView cardview10;
	private CardView cardview13;
	private LinearLayout linear12;
	private ImageView imageview2;
	private TextView textview5;
	private LinearLayout linear18;
	private ImageView imageview5;
	private TextView textview9;
	private LinearLayout linear16;
	private ImageView imageview4;
	private TextView textview7;
	private LinearLayout linear20;
	private ImageView imageview7;
	private TextView textview11;
	
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
		cardview1 = (CardView) findViewById(R.id.cardview1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		linktext = (TextView) findViewById(R.id.linktext);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		youtube1 = (YouTubePlayerView) findViewById(R.id.youtube1);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		cardview6 = (CardView) findViewById(R.id.cardview6);
		cardview11 = (CardView) findViewById(R.id.cardview11);
		cardview10 = (CardView) findViewById(R.id.cardview10);
		cardview13 = (CardView) findViewById(R.id.cardview13);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview9 = (TextView) findViewById(R.id.textview9);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview7 = (TextView) findViewById(R.id.textview7);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview11 = (TextView) findViewById(R.id.textview11);
		dialogytlink = getSharedPreferences("dialogytlink", Activity.MODE_PRIVATE);
		t = new RequestNetwork(this);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		h = new AlertDialog.Builder(this);
		
		imageview3.setOnClickListener(new View.OnClickListener() {
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
		
		cardview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				w.setAction(Intent.ACTION_VIEW);
				w.setClass(getApplicationContext(), DialogYtplayerActivity.class);
				startActivity(w);
				finish();
			}
		});
		
		cardview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				enterPictureInPictureMode();
				vscroll1.setVisibility(View.GONE);
				cardview2.setVisibility(View.GONE);
				linear6.setBackgroundColor(0xFF000000);
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
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
		textview11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/googlesansbold.ttf"), 0);
		if (settings.getString("darkmode", "").equals("1")) {
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =DialogYtplayerActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
			}
			cardview1.setCardBackgroundColor(0xFF000000);
			cardview2.setCardBackgroundColor(0xFF212121);
			cardview3.setCardBackgroundColor(0xFF000000);
			cardview6.setCardBackgroundColor(0xFF212121);
			cardview10.setCardBackgroundColor(0xFF212121);
			cardview11.setCardBackgroundColor(0xFF212121);
			cardview13.setCardBackgroundColor(0xFF212121);
			textview1.setTextColor(0xFFFFFFFF);
			textview7.setTextColor(0xFFFFFFFF);
			textview9.setTextColor(0xFFFFFFFF);
			textview11.setTextColor(0xFFFFFFFF);
			imageview2.setImageResource(R.drawable.ic_get_app_white);
			imageview3.setImageResource(R.drawable.ic_close_white);
			imageview4.setImageResource(R.drawable.ic_loop_white);
			imageview5.setImageResource(R.drawable.ic_send_white);
			imageview7.setImageResource(R.drawable.ic_tab_unselected_white);
			textview5.setTextColor(0xFFFFFFFF);
		}
		else {
			getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
			getWindow().setStatusBarColor(0xFFFFFFFF);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =DialogYtplayerActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
			}
			cardview1.setCardBackgroundColor(0xFFFFFFFF);
			cardview2.setCardBackgroundColor(0xFFEEEEEE);
			cardview3.setCardBackgroundColor(0xFFFFFFFF);
			cardview6.setCardBackgroundColor(0xFFF5F5F5);
			cardview10.setCardBackgroundColor(0xFFF5F5F5);
			cardview11.setCardBackgroundColor(0xFFF5F5F5);
			cardview13.setCardBackgroundColor(0xFFF5F5F5);
			textview1.setTextColor(0xFF000000);
			textview7.setTextColor(0xFF000000);
			textview9.setTextColor(0xFF000000);
			textview11.setTextColor(0xFF000000);
			imageview2.setImageResource(R.drawable.ic_get_app_black);
			imageview3.setImageResource(R.drawable.ic_clear_black);
			imageview4.setImageResource(R.drawable.ic_loop_black);
			imageview5.setImageResource(R.drawable.ic_send_black);
			imageview7.setImageResource(R.drawable.ic_tab_unselected_black);
			textview5.setTextColor(0xFF000000);
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
	
	
	public void _setViewSize (final View _view1, final double _width, final double _height) {
		_view1.setLayoutParams(new LinearLayout.LayoutParams((int)_width, (int)_height));
	}
	
	
	public void _invisible () {
		
		cardview2.setVisibility(View.GONE);
		
	}
	
	
	public void _visible () {
		
		cardview2.setVisibility(View.VISIBLE);
		if (true) {
			
		}
	}
	
	
	public void _removeScrollBar (final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
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