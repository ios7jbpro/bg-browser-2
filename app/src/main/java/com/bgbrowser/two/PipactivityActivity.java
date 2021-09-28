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
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.*;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import android.widget.TextView;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import androidx.webkit.*;
import com.tuyenmonkey.mkloader.*;
import com.monstertechno.adblocker.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class PipactivityActivity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private LinearLayout linear4;
	private LinearLayout linear5;
	private YouTubePlayerView youtube1;
	private LinearLayout linear1;
	private TextView textview3;
	private TextView textview4;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private TextView textview1;
	private TextView textview2;
	
	private RequestNetwork t;
	private RequestNetwork.RequestListener _t_request_listener;
	private SharedPreferences dialogytlink;
	private Intent ytb = new Intent();
	private TimerTask ct;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.pipactivity);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		youtube1 = (YouTubePlayerView) findViewById(R.id.youtube1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		t = new RequestNetwork(this);
		dialogytlink = getSharedPreferences("dialogytlink", Activity.MODE_PRIVATE);
		
		linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ytb.setAction(Intent.ACTION_VIEW);
				ytb.setClass(getApplicationContext(), DialogYtplayerActivity.class);
				startActivity(ytb);
				finish();
			}
		});
		
		linear2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				enterPictureInPictureMode();
				linear1.setVisibility(View.GONE);
				linear4.setVisibility(View.GONE);
				youtube1.getPlayerUiController().showUi(false);
				youtube1.setVisibility(View.GONE);
				linear5.setVisibility(View.VISIBLE);
				ct = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								textview4.setText("Quit PiP and press\nback to show buttons.(4)");
								ct = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												textview4.setText("Quit PiP and press\nback to show buttons.(3)");
												ct = new TimerTask() {
													@Override
													public void run() {
														runOnUiThread(new Runnable() {
															@Override
															public void run() {
																textview4.setText("Quit PiP and press\nback to show buttons.(2)");
																ct = new TimerTask() {
																	@Override
																	public void run() {
																		runOnUiThread(new Runnable() {
																			@Override
																			public void run() {
																				textview4.setText("Quit PiP and press\nback to show buttons.(1)");
																				ct = new TimerTask() {
																					@Override
																					public void run() {
																						runOnUiThread(new Runnable() {
																							@Override
																							public void run() {
																								textview4.setText("Quit PiP and press\nback to show buttons.(0)");
																								ct = new TimerTask() {
																									@Override
																									public void run() {
																										runOnUiThread(new Runnable() {
																											@Override
																											public void run() {
																												youtube1.setVisibility(View.VISIBLE);
																												linear5.setVisibility(View.GONE);
																											}
																										});
																									}
																								};
																								_timer.schedule(ct, (int)(1000));
																							}
																						});
																					}
																				};
																				_timer.schedule(ct, (int)(1000));
																			}
																		});
																	}
																};
																_timer.schedule(ct, (int)(1000));
															}
														});
													}
												};
												_timer.schedule(ct, (int)(1000));
											}
										});
									}
								};
								_timer.schedule(ct, (int)(1000));
							}
						});
					}
				};
				_timer.schedule(ct, (int)(1000));
			}
		});
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
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
		SketchwareUtil.showMessage(getApplicationContext(), "Start the video, and press the button to go PiP.");
		getLifecycle().addObserver(youtube1);
		youtube1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
			  @Override
			  public void onReady(@NonNull YouTubePlayer youTubePlayer) {
				    String videoId = dialogytlink.getString("link", "");
				    youTubePlayer.cueVideo(videoId, 0);
				     
				  }
		});
		linear5.setVisibility(View.GONE);
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
		linear1.setVisibility(View.VISIBLE);
		linear4.setVisibility(View.VISIBLE);
		youtube1.getPlayerUiController().showUi(true);
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