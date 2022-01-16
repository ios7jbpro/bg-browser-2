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
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.content.SharedPreferences;
import androidx.webkit.*;
import com.hkm.ezwebview.*;
import com.monstertechno.adblocker.*;
import im.delight.android.webview.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class UrlbartipActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private ImageView imageview1;
	private TextView textview1;
	private TextView textview2;
	
	private SharedPreferences settings;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.urlbartip);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
	}
	
	private void initializeLogic() {
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFF000000);SketchUi.setCornerRadii(new float[]{
				d*16,d*16,d*16 ,d*16,d*0,d*0 ,d*0,d*0});
			linear1.setBackground(SketchUi);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
			SketchUi.setColor(0xFFFFFFFF);SketchUi.setCornerRadii(new float[]{
				d*16,d*16,d*16 ,d*16,d*0,d*0 ,d*0,d*0});
			linear1.setBackground(SketchUi);
		}
		settings.edit().putString("urlbartip", "1").commit();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			
			default:
			break;
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