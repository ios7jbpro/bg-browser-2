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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.webkit.*;
import com.monstertechno.adblocker.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class Welcome1Activity extends AppCompatActivity {
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private LinearLayout linear5;
	private LinearLayout linear4;
	private Button button1;
	private LinearLayout linear3;
	private ImageView imageview2;
	private TextView textview2;
	
	private TimerTask loading;
	private Intent hjs = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.welcome1);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		button1 = (Button) findViewById(R.id.button1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview2 = (TextView) findViewById(R.id.textview2);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				hjs.setClass(getApplicationContext(), Welcome2Activity.class);
				startActivity(hjs);
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor("#2196F3"));
		gd.setCornerRadius(11);
		button1.setBackground(gd);
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
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
		SketchwareUtil.showMessage(getApplicationContext(), "Please complete setup before!");
	}
	public void _loadinganimation () {
		loading = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						
						loading = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										
										loading = new TimerTask() {
											@Override
											public void run() {
												runOnUiThread(new Runnable() {
													@Override
													public void run() {
														
														loading = new TimerTask() {
															@Override
															public void run() {
																runOnUiThread(new Runnable() {
																	@Override
																	public void run() {
																		
																		loading = new TimerTask() {
																			@Override
																			public void run() {
																				runOnUiThread(new Runnable() {
																					@Override
																					public void run() {
																						
																						loading = new TimerTask() {
																							@Override
																							public void run() {
																								runOnUiThread(new Runnable() {
																									@Override
																									public void run() {
																										
																										loading = new TimerTask() {
																											@Override
																											public void run() {
																												runOnUiThread(new Runnable() {
																													@Override
																													public void run() {
																														
																														loading = new TimerTask() {
																															@Override
																															public void run() {
																																runOnUiThread(new Runnable() {
																																	@Override
																																	public void run() {
																																		
																																		loading = new TimerTask() {
																																			@Override
																																			public void run() {
																																				runOnUiThread(new Runnable() {
																																					@Override
																																					public void run() {
																																						
																																						loading = new TimerTask() {
																																							@Override
																																							public void run() {
																																								runOnUiThread(new Runnable() {
																																									@Override
																																									public void run() {
																																										
																																										loading = new TimerTask() {
																																											@Override
																																											public void run() {
																																												runOnUiThread(new Runnable() {
																																													@Override
																																													public void run() {
																																														
																																														loading = new TimerTask() {
																																															@Override
																																															public void run() {
																																																runOnUiThread(new Runnable() {
																																																	@Override
																																																	public void run() {
																																																		
																																																	}
																																																});
																																															}
																																														};
																																														_timer.schedule(loading, (int)(50));
																																													}
																																												});
																																											}
																																										};
																																										_timer.schedule(loading, (int)(50));
																																									}
																																								});
																																							}
																																						};
																																						_timer.schedule(loading, (int)(50));
																																					}
																																				});
																																			}
																																		};
																																		_timer.schedule(loading, (int)(50));
																																	}
																																});
																															}
																														};
																														_timer.schedule(loading, (int)(50));
																													}
																												});
																											}
																										};
																										_timer.schedule(loading, (int)(50));
																									}
																								});
																							}
																						};
																						_timer.schedule(loading, (int)(50));
																					}
																				});
																			}
																		};
																		_timer.schedule(loading, (int)(50));
																	}
																});
															}
														};
														_timer.schedule(loading, (int)(50));
													}
												});
											}
										};
										_timer.schedule(loading, (int)(50));
									}
								});
							}
						};
						_timer.schedule(loading, (int)(50));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(loading, (int)(0), (int)(600));
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