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
import androidx.cardview.widget.CardView;
import android.widget.ImageView;
import de.hdodenhof.circleimageview.*;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.webkit.*;
import com.tuyenmonkey.mkloader.*;
import com.monstertechno.adblocker.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class CreditsActivity extends AppCompatActivity {
	
	private ScrollView vscroll1;
	private LinearLayout linear32;
	private LinearLayout linear1;
	private TextView textview1;
	private CardView cardview9;
	private CardView cardview11;
	private CardView cardview13;
	private CardView cardview1;
	private CardView cardview3;
	private CardView cardview5;
	private CardView cardview7;
	private CardView cardview15;
	private LinearLayout linear54;
	private LinearLayout linear22;
	private LinearLayout linear26;
	private LinearLayout linear28;
	private TextView textview26;
	private LinearLayout linear33;
	private LinearLayout linear35;
	private LinearLayout linear37;
	private TextView textview22;
	private TextView textview23;
	private TextView textview24;
	private TextView textview25;
	private ImageView imageview1;
	private TextView textview21;
	private TextView textview20;
	private LinearLayout linear63;
	private CardView cardview10;
	private LinearLayout linear64;
	private LinearLayout linear65;
	private TextView textview43;
	private LinearLayout linear66;
	private LinearLayout linear75;
	private CircleImageView circleimageview18;
	private TextView textview44;
	private ImageView imageview6;
	private ImageView imageview10;
	private ImageView imageview15;
	private ImageView imageview17;
	private LinearLayout linear67;
	private CardView cardview12;
	private LinearLayout linear68;
	private LinearLayout linear69;
	private TextView textview45;
	private LinearLayout linear70;
	private ImageView imageview7;
	private CircleImageView circleimageview19;
	private TextView textview46;
	private LinearLayout linear71;
	private CardView cardview14;
	private LinearLayout linear72;
	private LinearLayout linear73;
	private TextView textview47;
	private LinearLayout linear74;
	private LinearLayout linear78;
	private CircleImageView circleimageview20;
	private TextView textview48;
	private TextView textview51;
	private ImageView imageview8;
	private ImageView imageview13;
	private LinearLayout linear55;
	private CardView cardview2;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private TextView textview36;
	private LinearLayout linear59;
	private LinearLayout linear77;
	private CircleImageView circleimageview14;
	private TextView textview35;
	private ImageView imageview2;
	private ImageView imageview12;
	private LinearLayout linear56;
	private CardView cardview4;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private TextView textview37;
	private LinearLayout linear60;
	private ImageView imageview3;
	private CircleImageView circleimageview15;
	private TextView textview38;
	private LinearLayout linear57;
	private CardView cardview6;
	private LinearLayout linear50;
	private LinearLayout linear51;
	private TextView textview39;
	private LinearLayout linear61;
	private ImageView imageview4;
	private CircleImageView circleimageview16;
	private TextView textview40;
	private LinearLayout linear58;
	private CardView cardview8;
	private LinearLayout linear52;
	private LinearLayout linear53;
	private TextView textview41;
	private LinearLayout linear62;
	private LinearLayout linear76;
	private CircleImageView circleimageview17;
	private TextView textview42;
	private ImageView imageview5;
	private ImageView imageview11;
	private ImageView imageview14;
	private LinearLayout linear79;
	private CardView cardview16;
	private LinearLayout linear80;
	private LinearLayout linear81;
	private TextView textview49;
	private LinearLayout linear82;
	private ImageView imageview16;
	private CircleImageView circleimageview21;
	private TextView textview50;
	private CircleImageView circleimageview5;
	private LinearLayout linear23;
	private TextView textview10;
	private TextView textview11;
	private CircleImageView circleimageview7;
	private LinearLayout linear27;
	private TextView textview14;
	private TextView textview15;
	private CircleImageView circleimageview8;
	private LinearLayout linear29;
	private TextView textview16;
	private TextView textview17;
	private CircleImageView circleimageview10;
	private LinearLayout linear34;
	private TextView textview27;
	private TextView textview28;
	private CircleImageView circleimageview11;
	private LinearLayout linear36;
	private TextView textview29;
	private TextView textview30;
	private CircleImageView circleimageview12;
	private LinearLayout linear38;
	private TextView textview31;
	private TextView textview32;
	
	private Intent tg = new Intent();
	private Intent github = new Intent();
	private Intent youtube = new Intent();
	private Intent instagram = new Intent();
	
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
		cardview9 = (CardView) findViewById(R.id.cardview9);
		cardview11 = (CardView) findViewById(R.id.cardview11);
		cardview13 = (CardView) findViewById(R.id.cardview13);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		cardview5 = (CardView) findViewById(R.id.cardview5);
		cardview7 = (CardView) findViewById(R.id.cardview7);
		cardview15 = (CardView) findViewById(R.id.cardview15);
		linear54 = (LinearLayout) findViewById(R.id.linear54);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		textview26 = (TextView) findViewById(R.id.textview26);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview24 = (TextView) findViewById(R.id.textview24);
		textview25 = (TextView) findViewById(R.id.textview25);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview21 = (TextView) findViewById(R.id.textview21);
		textview20 = (TextView) findViewById(R.id.textview20);
		linear63 = (LinearLayout) findViewById(R.id.linear63);
		cardview10 = (CardView) findViewById(R.id.cardview10);
		linear64 = (LinearLayout) findViewById(R.id.linear64);
		linear65 = (LinearLayout) findViewById(R.id.linear65);
		textview43 = (TextView) findViewById(R.id.textview43);
		linear66 = (LinearLayout) findViewById(R.id.linear66);
		linear75 = (LinearLayout) findViewById(R.id.linear75);
		circleimageview18 = (CircleImageView) findViewById(R.id.circleimageview18);
		textview44 = (TextView) findViewById(R.id.textview44);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		imageview15 = (ImageView) findViewById(R.id.imageview15);
		imageview17 = (ImageView) findViewById(R.id.imageview17);
		linear67 = (LinearLayout) findViewById(R.id.linear67);
		cardview12 = (CardView) findViewById(R.id.cardview12);
		linear68 = (LinearLayout) findViewById(R.id.linear68);
		linear69 = (LinearLayout) findViewById(R.id.linear69);
		textview45 = (TextView) findViewById(R.id.textview45);
		linear70 = (LinearLayout) findViewById(R.id.linear70);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		circleimageview19 = (CircleImageView) findViewById(R.id.circleimageview19);
		textview46 = (TextView) findViewById(R.id.textview46);
		linear71 = (LinearLayout) findViewById(R.id.linear71);
		cardview14 = (CardView) findViewById(R.id.cardview14);
		linear72 = (LinearLayout) findViewById(R.id.linear72);
		linear73 = (LinearLayout) findViewById(R.id.linear73);
		textview47 = (TextView) findViewById(R.id.textview47);
		linear74 = (LinearLayout) findViewById(R.id.linear74);
		linear78 = (LinearLayout) findViewById(R.id.linear78);
		circleimageview20 = (CircleImageView) findViewById(R.id.circleimageview20);
		textview48 = (TextView) findViewById(R.id.textview48);
		textview51 = (TextView) findViewById(R.id.textview51);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		linear55 = (LinearLayout) findViewById(R.id.linear55);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		textview36 = (TextView) findViewById(R.id.textview36);
		linear59 = (LinearLayout) findViewById(R.id.linear59);
		linear77 = (LinearLayout) findViewById(R.id.linear77);
		circleimageview14 = (CircleImageView) findViewById(R.id.circleimageview14);
		textview35 = (TextView) findViewById(R.id.textview35);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		linear56 = (LinearLayout) findViewById(R.id.linear56);
		cardview4 = (CardView) findViewById(R.id.cardview4);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		textview37 = (TextView) findViewById(R.id.textview37);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		circleimageview15 = (CircleImageView) findViewById(R.id.circleimageview15);
		textview38 = (TextView) findViewById(R.id.textview38);
		linear57 = (LinearLayout) findViewById(R.id.linear57);
		cardview6 = (CardView) findViewById(R.id.cardview6);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		textview39 = (TextView) findViewById(R.id.textview39);
		linear61 = (LinearLayout) findViewById(R.id.linear61);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		circleimageview16 = (CircleImageView) findViewById(R.id.circleimageview16);
		textview40 = (TextView) findViewById(R.id.textview40);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		cardview8 = (CardView) findViewById(R.id.cardview8);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		textview41 = (TextView) findViewById(R.id.textview41);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		linear76 = (LinearLayout) findViewById(R.id.linear76);
		circleimageview17 = (CircleImageView) findViewById(R.id.circleimageview17);
		textview42 = (TextView) findViewById(R.id.textview42);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		linear79 = (LinearLayout) findViewById(R.id.linear79);
		cardview16 = (CardView) findViewById(R.id.cardview16);
		linear80 = (LinearLayout) findViewById(R.id.linear80);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		textview49 = (TextView) findViewById(R.id.textview49);
		linear82 = (LinearLayout) findViewById(R.id.linear82);
		imageview16 = (ImageView) findViewById(R.id.imageview16);
		circleimageview21 = (CircleImageView) findViewById(R.id.circleimageview21);
		textview50 = (TextView) findViewById(R.id.textview50);
		circleimageview5 = (CircleImageView) findViewById(R.id.circleimageview5);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		circleimageview7 = (CircleImageView) findViewById(R.id.circleimageview7);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		circleimageview8 = (CircleImageView) findViewById(R.id.circleimageview8);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		circleimageview10 = (CircleImageView) findViewById(R.id.circleimageview10);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview28 = (TextView) findViewById(R.id.textview28);
		circleimageview11 = (CircleImageView) findViewById(R.id.circleimageview11);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		textview29 = (TextView) findViewById(R.id.textview29);
		textview30 = (TextView) findViewById(R.id.textview30);
		circleimageview12 = (CircleImageView) findViewById(R.id.circleimageview12);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		textview31 = (TextView) findViewById(R.id.textview31);
		textview32 = (TextView) findViewById(R.id.textview32);
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tg.setAction(Intent.ACTION_VIEW);
				tg.setData(Uri.parse("https://t.me/ios7jbpro"));
				startActivity(tg);
			}
		});
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				github.setAction(Intent.ACTION_VIEW);
				github.setData(Uri.parse("https://github.com/ios7jbpro"));
				startActivity(github);
			}
		});
		
		imageview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				youtube.setAction(Intent.ACTION_VIEW);
				youtube.setData(Uri.parse("https://youtube.com/channel/UCGOaraPPCHN49MvSDRYY3Nw"));
				startActivity(youtube);
			}
		});
		
		imageview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				instagram.setAction(Intent.ACTION_VIEW);
				instagram.setData(Uri.parse("https://www.instagram.com/ios7jbpro/"));
				startActivity(instagram);
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tg.setAction(Intent.ACTION_VIEW);
				tg.setData(Uri.parse("https://t.me/KayMynd"));
				startActivity(tg);
			}
		});
		
		imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tg.setAction(Intent.ACTION_VIEW);
				tg.setData(Uri.parse("https://t.me/qirkl"));
				startActivity(tg);
			}
		});
		
		imageview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				youtube.setAction(Intent.ACTION_VIEW);
				youtube.setData(Uri.parse("https://youtube.com/c/MoffiDesigns"));
				startActivity(youtube);
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tg.setAction(Intent.ACTION_VIEW);
				tg.setData(Uri.parse("https://t.me/artx4dev"));
				startActivity(tg);
			}
		});
		
		imageview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				github.setAction(Intent.ACTION_VIEW);
				github.setData(Uri.parse("https://github.com/Artx-II"));
				startActivity(github);
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tg.setAction(Intent.ACTION_VIEW);
				tg.setData(Uri.parse("https://t.me/AMIR_ALI_AZIMI"));
				startActivity(tg);
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tg.setAction(Intent.ACTION_VIEW);
				tg.setData(Uri.parse("https://t.me/treydev"));
				startActivity(tg);
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tg.setAction(Intent.ACTION_VIEW);
				tg.setData(Uri.parse("https://t.me/WindowZ414"));
				startActivity(tg);
			}
		});
		
		imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				github.setAction(Intent.ACTION_VIEW);
				github.setData(Uri.parse("https://github.com/windowzytch"));
				startActivity(github);
			}
		});
		
		imageview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				youtube.setAction(Intent.ACTION_VIEW);
				youtube.setData(Uri.parse("https://youtube.com/channel/UCWY1wG5VTJn-24IQwJRJY5g"));
				startActivity(youtube);
			}
		});
		
		imageview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tg.setAction(Intent.ACTION_VIEW);
				tg.setData(Uri.parse("https://t.me/ImAVeryTastyCake"));
				startActivity(tg);
			}
		});
	}
	
	private void initializeLogic() {
		cardview1.setCardBackgroundColor(0xFF9E9E9E);
		cardview1.setRadius((float)16);
		cardview1.setCardElevation((float)0);
		cardview1.setPreventCornerOverlap(false);
		cardview2.setCardBackgroundColor(0xFF212121);
		cardview2.setRadius((float)16);
		cardview2.setCardElevation((float)0);
		cardview2.setPreventCornerOverlap(true);
		cardview3.setCardBackgroundColor(0xFF9E9E9E);
		cardview3.setRadius((float)16);
		cardview3.setCardElevation((float)0);
		cardview3.setPreventCornerOverlap(false);
		cardview4.setCardBackgroundColor(0xFF212121);
		cardview4.setRadius((float)16);
		cardview4.setCardElevation((float)0);
		cardview4.setPreventCornerOverlap(true);
		cardview5.setCardBackgroundColor(0xFF9E9E9E);
		cardview5.setRadius((float)16);
		cardview5.setCardElevation((float)0);
		cardview5.setPreventCornerOverlap(false);
		cardview6.setCardBackgroundColor(0xFF212121);
		cardview6.setRadius((float)16);
		cardview6.setCardElevation((float)0);
		cardview6.setPreventCornerOverlap(true);
		cardview7.setCardBackgroundColor(0xFF9E9E9E);
		cardview7.setRadius((float)16);
		cardview7.setCardElevation((float)0);
		cardview7.setPreventCornerOverlap(false);
		cardview8.setCardBackgroundColor(0xFF212121);
		cardview8.setRadius((float)16);
		cardview8.setCardElevation((float)0);
		cardview8.setPreventCornerOverlap(true);
		cardview9.setCardBackgroundColor(0xFF9E9E9E);
		cardview9.setRadius((float)16);
		cardview9.setCardElevation((float)0);
		cardview9.setPreventCornerOverlap(false);
		cardview10.setCardBackgroundColor(0xFF212121);
		cardview10.setRadius((float)16);
		cardview10.setCardElevation((float)0);
		cardview10.setPreventCornerOverlap(true);
		cardview11.setCardBackgroundColor(0xFF9E9E9E);
		cardview11.setRadius((float)16);
		cardview11.setCardElevation((float)0);
		cardview11.setPreventCornerOverlap(false);
		cardview12.setCardBackgroundColor(0xFF212121);
		cardview12.setRadius((float)16);
		cardview12.setCardElevation((float)0);
		cardview12.setPreventCornerOverlap(true);
		cardview13.setCardBackgroundColor(0xFF9E9E9E);
		cardview13.setRadius((float)16);
		cardview13.setCardElevation((float)0);
		cardview13.setPreventCornerOverlap(false);
		cardview14.setCardBackgroundColor(0xFF212121);
		cardview14.setRadius((float)16);
		cardview14.setCardElevation((float)0);
		cardview14.setPreventCornerOverlap(true);
		cardview15.setCardBackgroundColor(0xFF9E9E9E);
		cardview15.setRadius((float)16);
		cardview15.setCardElevation((float)0);
		cardview15.setPreventCornerOverlap(false);
		cardview16.setCardBackgroundColor(0xFF212121);
		cardview16.setRadius((float)16);
		cardview16.setCardElevation((float)0);
		cardview16.setPreventCornerOverlap(true);
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