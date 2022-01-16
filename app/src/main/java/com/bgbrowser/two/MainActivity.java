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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ProgressBar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;
import android.widget.ImageView;
import android.widget.EditText;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.content.ClipData;
import android.view.View;
import android.webkit.WebViewClient;
import android.text.Editable;
import android.text.TextWatcher;
import android.graphics.Typeface;
import android.content.ClipboardManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.bumptech.glide.Glide;
import java.text.DecimalFormat;
import androidx.webkit.*;
import com.hkm.ezwebview.*;
import com.monstertechno.adblocker.*;
import im.delight.android.webview.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import android.widget.TextView.OnEditorActionListener;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.EditorInfo;
import java.lang.reflect.*;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
	public final int REQ_CD_RUNHTML = 101;
	private Timer _timer = new Timer();
	
	private double width = 0;
	private double TotalItems = 0;
	private boolean FoundItems = false;
	private HashMap<String, Object> spinner = new HashMap<>();
	private HashMap<String, Object> UpdatifyMap = new HashMap<>();
	private String name = "";
	private String package_name = "";
	private String your_version = "";
	private String new_version = "";
	private HashMap<String, Object> mapversion = new HashMap<>();
	private String path = "";
	private boolean isKeyboardVisible = false;
	private boolean hasFocus = false;
	private String share = "";
	private String s = "";
	private double titlevisibility = 0;
	private double edittextvisibility = 0;
	
	private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	
	private LinearLayout rootlinear;
	private LinearLayout linear17;
	private LinearLayout intenturlpage;
	private LinearLayout linear19;
	private LinearLayout linear18;
	private TextView languagetext;
	private LinearLayout linear20;
	private LinearLayout linear14;
	private LinearLayout linearspacingtop;
	private LinearLayout suggesturl;
	private ProgressBar progressbar1;
	private LinearLayout linear21;
	private SwipeRefreshLayout swiperefreshlayout1;
	private SwipeRefreshLayout swiperefreshlayout2;
	private SwipeRefreshLayout swiperefreshlayout6;
	private SwipeRefreshLayout swiperefreshlayout3;
	private SwipeRefreshLayout swiperefreshlayout4;
	private LinearLayout linear7;
	private ImageView imageview31;
	private ImageView unneededimageview;
	private LinearLayout linear27;
	private LinearLayout linear26;
	private LinearLayout shader;
	private TextView texttabholder;
	private LinearLayout linear25;
	private ImageView imageview34;
	private ImageView imageview20;
	private TextView textview13;
	private TextView textview14;
	private LinearLayout linear28;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private ImageView imageview30;
	private EditText edittext2;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private WebView webview1;
	private WebView webview2;
	private LinearLayout nonet;
	private ImageView imageview24;
	private LinearLayout linear33;
	private TextView textview6;
	private TextView textview7;
	private WebView webview3;
	private WebView webview4;
	private TextView intenturltext;
	private EditText edittext1;
	private TextView textview3;
	private LinearLayout linear13;
	private ImageView tab1;
	private ImageView tab2;
	private ImageView tab3;
	private ImageView tab4;
	private ImageView tabclose;
	private ImageView tabadd;
	private LinearLayout linear16;
	private SwipeRefreshLayout swiperefreshlayout5;
	private ImageView imageview21;
	private TextView textview5;
	private ProgressBar progressbar2;
	private ImageView imageview23;
	private ImageView imageview22;
	private WebView webview5;
	
	private AlertDialog.Builder bxhz;
	private TimerTask bd;
	private SharedPreferences lastpage;
	private Intent bzh = new Intent();
	private SharedPreferences adaptive;
	private TimerTask gobt;
	private TimerTask round;
	private SharedPreferences url;
	private AlertDialog.Builder jd;
	private TimerTask textopening;
	private SharedPreferences settings;
	private TimerTask settingsreolader;
	private SharedPreferences ex;
	private AlertDialog.Builder homepage;
	private SharedPreferences setup;
	private TimerTask urll;
	private AlertDialog.Builder pro;
	private SharedPreferences zoom;
	private Notification music;
	private SharedPreferences dms;
	private SharedPreferences logs;
	private Calendar ei = Calendar.getInstance();
	private TimerTask logscache;
	private Calendar ie = Calendar.getInstance();
	private SharedPreferences tabcount;
	private SharedPreferences intenturl;
	private TimerTask syscheck;
	private SharedPreferences history;
	private RequestNetwork webcheck;
	private RequestNetwork.RequestListener _webcheck_request_listener;
	private TimerTask webchecker;
	private TimerTask darkmoderloader;
	private Intent ytb = new Intent();
	private SharedPreferences dialogytlink;
	private SharedPreferences splash;
	private Intent a11 = new Intent();
	private TimerTask a;
	private Intent d = new Intent();
	private Intent spinnerdialog = new Intent();
	private SharedPreferences pdf;
	private SharedPreferences UCSP;
	private RequestNetwork updatcheck;
	private RequestNetwork.RequestListener _updatcheck_request_listener;
	private SharedPreferences webhistory;
	private SharedPreferences historycounter;
	private SharedPreferences shortcut;
	private Intent editask = new Intent();
	private Intent settdialog = new Intent();
	private Calendar filname = Calendar.getInstance();
	private SharedPreferences savess;
	private Intent dlgupdate = new Intent();
	private SharedPreferences pfp;
	private Intent runhtml = new Intent(Intent.ACTION_GET_CONTENT);
	private TimerTask lhtml;
	private SharedPreferences extracthtml;
	private Intent exhtml = new Intent();
	private TimerTask txopening2;
	private TimerTask txopening3;
	private Intent warn = new Intent();
	private TimerTask upt;
	private Intent tabintent = new Intent();
	private SharedPreferences tabtitles;
	private TimerTask loaddtabs;
	private SharedPreferences selectedtab;
	private TimerTask iy;
	private Intent jdjd = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		}
		else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		rootlinear = (LinearLayout) findViewById(R.id.rootlinear);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		intenturlpage = (LinearLayout) findViewById(R.id.intenturlpage);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		languagetext = (TextView) findViewById(R.id.languagetext);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linearspacingtop = (LinearLayout) findViewById(R.id.linearspacingtop);
		suggesturl = (LinearLayout) findViewById(R.id.suggesturl);
		progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		swiperefreshlayout1 = (SwipeRefreshLayout) findViewById(R.id.swiperefreshlayout1);
		swiperefreshlayout2 = (SwipeRefreshLayout) findViewById(R.id.swiperefreshlayout2);
		swiperefreshlayout6 = (SwipeRefreshLayout) findViewById(R.id.swiperefreshlayout6);
		swiperefreshlayout3 = (SwipeRefreshLayout) findViewById(R.id.swiperefreshlayout3);
		swiperefreshlayout4 = (SwipeRefreshLayout) findViewById(R.id.swiperefreshlayout4);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		imageview31 = (ImageView) findViewById(R.id.imageview31);
		unneededimageview = (ImageView) findViewById(R.id.unneededimageview);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		shader = (LinearLayout) findViewById(R.id.shader);
		texttabholder = (TextView) findViewById(R.id.texttabholder);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		imageview34 = (ImageView) findViewById(R.id.imageview34);
		imageview20 = (ImageView) findViewById(R.id.imageview20);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		imageview30 = (ImageView) findViewById(R.id.imageview30);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		webview2 = (WebView) findViewById(R.id.webview2);
		webview2.getSettings().setJavaScriptEnabled(true);
		webview2.getSettings().setSupportZoom(true);
		nonet = (LinearLayout) findViewById(R.id.nonet);
		imageview24 = (ImageView) findViewById(R.id.imageview24);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		webview3 = (WebView) findViewById(R.id.webview3);
		webview3.getSettings().setJavaScriptEnabled(true);
		webview3.getSettings().setSupportZoom(true);
		webview4 = (WebView) findViewById(R.id.webview4);
		webview4.getSettings().setJavaScriptEnabled(true);
		webview4.getSettings().setSupportZoom(true);
		intenturltext = (TextView) findViewById(R.id.intenturltext);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		tab1 = (ImageView) findViewById(R.id.tab1);
		tab2 = (ImageView) findViewById(R.id.tab2);
		tab3 = (ImageView) findViewById(R.id.tab3);
		tab4 = (ImageView) findViewById(R.id.tab4);
		tabclose = (ImageView) findViewById(R.id.tabclose);
		tabadd = (ImageView) findViewById(R.id.tabadd);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		swiperefreshlayout5 = (SwipeRefreshLayout) findViewById(R.id.swiperefreshlayout5);
		imageview21 = (ImageView) findViewById(R.id.imageview21);
		textview5 = (TextView) findViewById(R.id.textview5);
		progressbar2 = (ProgressBar) findViewById(R.id.progressbar2);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		imageview22 = (ImageView) findViewById(R.id.imageview22);
		webview5 = (WebView) findViewById(R.id.webview5);
		webview5.getSettings().setJavaScriptEnabled(true);
		webview5.getSettings().setSupportZoom(true);
		bxhz = new AlertDialog.Builder(this);
		lastpage = getSharedPreferences("lastpage", Activity.MODE_PRIVATE);
		adaptive = getSharedPreferences("adaptive", Activity.MODE_PRIVATE);
		url = getSharedPreferences("url", Activity.MODE_PRIVATE);
		jd = new AlertDialog.Builder(this);
		settings = getSharedPreferences("settings", Activity.MODE_PRIVATE);
		ex = getSharedPreferences("ex", Activity.MODE_PRIVATE);
		homepage = new AlertDialog.Builder(this);
		setup = getSharedPreferences("setup", Activity.MODE_PRIVATE);
		pro = new AlertDialog.Builder(this);
		zoom = getSharedPreferences("zoom", Activity.MODE_PRIVATE);
		dms = getSharedPreferences("dms", Activity.MODE_PRIVATE);
		logs = getSharedPreferences("logs", Activity.MODE_PRIVATE);
		tabcount = getSharedPreferences("tabcount", Activity.MODE_PRIVATE);
		intenturl = getSharedPreferences("intenturl", Activity.MODE_PRIVATE);
		history = getSharedPreferences("history", Activity.MODE_PRIVATE);
		webcheck = new RequestNetwork(this);
		dialogytlink = getSharedPreferences("dialogytlink", Activity.MODE_PRIVATE);
		splash = getSharedPreferences("splash", Activity.MODE_PRIVATE);
		pdf = getSharedPreferences("pdf", Activity.MODE_PRIVATE);
		UCSP = getSharedPreferences("UCSP", Activity.MODE_PRIVATE);
		updatcheck = new RequestNetwork(this);
		webhistory = getSharedPreferences("webhistory", Activity.MODE_PRIVATE);
		historycounter = getSharedPreferences("historycounter", Activity.MODE_PRIVATE);
		shortcut = getSharedPreferences("shortcut", Activity.MODE_PRIVATE);
		savess = getSharedPreferences("savess", Activity.MODE_PRIVATE);
		pfp = getSharedPreferences("loc", Activity.MODE_PRIVATE);
		runhtml.setType("text/html");
		runhtml.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		extracthtml = getSharedPreferences("extracthtml", Activity.MODE_PRIVATE);
		tabtitles = getSharedPreferences("tabtitles", Activity.MODE_PRIVATE);
		selectedtab = getSharedPreferences("selectedtab", Activity.MODE_PRIVATE);
		
		swiperefreshlayout1.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
			@Override 
			public void onRefresh() {
				webview1.loadUrl(webview1.getUrl());
			}
		});
		
		swiperefreshlayout2.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
			@Override 
			public void onRefresh() {
				webview2.loadUrl(webview2.getUrl());
			}
		});
		
		swiperefreshlayout6.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
			@Override 
			public void onRefresh() {
				if (swiperefreshlayout1.isEnabled()) {
					webview1.loadUrl(webview1.getUrl());
				}
				else {
					if (swiperefreshlayout2.isEnabled()) {
						webview2.loadUrl(webview2.getUrl());
					}
					else {
						if (swiperefreshlayout3.isEnabled()) {
							webview3.loadUrl(webview3.getUrl());
						}
						else {
							if (swiperefreshlayout4.isEnabled()) {
								webview4.loadUrl(webview4.getUrl());
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "err:no tab");
							}
						}
					}
				}
			}
		});
		
		swiperefreshlayout3.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
			@Override 
			public void onRefresh() {
				webview3.loadUrl(webview3.getUrl());
			}
		});
		
		swiperefreshlayout4.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
			@Override 
			public void onRefresh() {
				webview4.loadUrl(webview4.getUrl());
			}
		});
		
		imageview34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", textview14.getText().toString()));
				SketchwareUtil.showMessage(getApplicationContext(), "Copied to clipboard");
			}
		});
		
		imageview30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear21.setVisibility(View.GONE);
				linear14.setVisibility(View.VISIBLE);
				webview1.findAllAsync(""); 
				webview1.findNext(true); 
				webview1.findFocus();
				webview2.findAllAsync(""); 
				webview2.findNext(true); 
				webview2.findFocus();
				webview3.findAllAsync(""); 
				webview3.findNext(true); 
				webview3.findFocus();
				webview4.findAllAsync(""); 
				webview4.findNext(true); 
				webview4.findFocus();
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (webview1.isEnabled()) {
					webview1.findAllAsync(edittext2.getText().toString()); 
					webview1.findNext(true); 
					webview1.findFocus();
				}
				else {
					if (webview2.isEnabled()) {
						webview2.findAllAsync(edittext2.getText().toString()); 
						webview2.findNext(true); 
						webview2.findFocus();
					}
					else {
						if (webview3.isEnabled()) {
							webview3.findAllAsync(edittext2.getText().toString()); 
							webview3.findNext(true); 
							webview3.findFocus();
						}
						else {
							if (webview4.isEnabled()) {
								webview4.findAllAsync(edittext2.getText().toString()); 
								webview4.findNext(true); 
								webview4.findFocus();
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "err(08):no tab found");
							}
						}
					}
				}
				textview10.setText(String.valueOf((long)(TotalItems)));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
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
		
		//webviewOnProgressChanged
		webview2.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		webview2.setWebViewClient(new WebViewClient() {
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
		webview3.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		webview3.setWebViewClient(new WebViewClient() {
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
		webview4.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		webview4.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				if (swiperefreshlayout4.isEnabled()) {
					progressbar1.setVisibility(View.VISIBLE);
					edittext1.setText(webview4.getUrl());
					if (settings.getString("ytplayer", "").equals("1")) {
						if (webview4.getUrl().contains("m.youtube.com/watch")) {
							ytb.setClass(getApplicationContext(), YtplrbsheetActivity.class);
							startActivity(ytb);
							dialogytlink.edit().putString("link", webview4.getUrl()).commit();
							webview4.stopLoading();
							webview4.goBack();
						}
					}
					else {
						
					}
				}
				history.edit().putString("history", "[".concat(new SimpleDateFormat("hh:mm:ss").format(ei.getTime()).concat("]".concat("Tab 4:".concat(webview4.getUrl())))).concat("\n".concat(history.getString("history", "")))).commit();
				if (settings.getString("killnoconnection", "").equals("1")) {
					
				}
				else {
					webcheck.startRequestNetwork(RequestNetworkController.GET, webview4.getUrl(), "A", _webcheck_request_listener);
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		tab1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				swiperefreshlayout6.setVisibility(View.GONE);
				swiperefreshlayout1.setEnabled(true);
				swiperefreshlayout2.setEnabled(false);
				swiperefreshlayout3.setEnabled(false);
				swiperefreshlayout4.setEnabled(false);
				linear7.setEnabled(false);
				swiperefreshlayout1.setVisibility(View.VISIBLE);
				swiperefreshlayout2.setVisibility(View.GONE);
				swiperefreshlayout3.setVisibility(View.GONE);
				swiperefreshlayout4.setVisibility(View.GONE);
				linear7.setVisibility(View.GONE);
				edittext1.setText(webview1.getTitle());
			}
		});
		
		tab2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				swiperefreshlayout6.setVisibility(View.GONE);
				swiperefreshlayout2.setEnabled(true);
				swiperefreshlayout1.setEnabled(false);
				swiperefreshlayout3.setEnabled(false);
				swiperefreshlayout4.setEnabled(false);
				linear7.setEnabled(false);
				swiperefreshlayout1.setVisibility(View.GONE);
				swiperefreshlayout2.setVisibility(View.VISIBLE);
				swiperefreshlayout3.setVisibility(View.GONE);
				swiperefreshlayout4.setVisibility(View.GONE);
				linear7.setVisibility(View.GONE);
				edittext1.setText(webview2.getTitle());
			}
		});
		
		tab3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				swiperefreshlayout6.setVisibility(View.GONE);
				
				swiperefreshlayout3.setEnabled(true);
				swiperefreshlayout2.setEnabled(false);
				swiperefreshlayout1.setEnabled(false);
				swiperefreshlayout4.setEnabled(false);
				linear7.setEnabled(false);
				swiperefreshlayout3.setVisibility(View.VISIBLE);
				swiperefreshlayout2.setVisibility(View.GONE);
				swiperefreshlayout1.setVisibility(View.GONE);
				swiperefreshlayout4.setVisibility(View.GONE);
				linear7.setVisibility(View.GONE);
				edittext1.setText(webview3.getTitle());
			}
		});
		
		tab4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext1.setText(webview2.getUrl());
				swiperefreshlayout6.setVisibility(View.GONE);
				swiperefreshlayout4.setEnabled(true);
				swiperefreshlayout1.setEnabled(false);
				swiperefreshlayout3.setEnabled(false);
				swiperefreshlayout2.setEnabled(false);
				linear7.setEnabled(false);
				swiperefreshlayout1.setVisibility(View.GONE);
				swiperefreshlayout4.setVisibility(View.VISIBLE);
				swiperefreshlayout3.setVisibility(View.GONE);
				swiperefreshlayout2.setVisibility(View.GONE);
				linear7.setVisibility(View.GONE);
				edittext1.setText(webview4.getTitle());
			}
		});
		
		tabclose.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (tabcount.getString("tabcount", "").equals("4")) {
					tab1.setVisibility(View.VISIBLE);
					tab2.setVisibility(View.VISIBLE);
					tab3.setVisibility(View.VISIBLE);
					tab4.setVisibility(View.GONE);
					tabadd.setVisibility(View.VISIBLE);
					tabclose.setVisibility(View.VISIBLE);
					tabcount.edit().putString("tabcount", "3").commit();
					webview4.loadUrl("about:blank");
					swiperefreshlayout6.setVisibility(View.GONE);
					if (swiperefreshlayout4.isEnabled()) {
						swiperefreshlayout4.setEnabled(false);
						swiperefreshlayout4.setVisibility(View.GONE);
						swiperefreshlayout3.setEnabled(true);
						swiperefreshlayout3.setVisibility(View.VISIBLE);
						swiperefreshlayout6.setVisibility(View.GONE);
					}
					else {
						
					}
				}
				else {
					if (tabcount.getString("tabcount", "").equals("3")) {
						tab1.setVisibility(View.VISIBLE);
						tab2.setVisibility(View.VISIBLE);
						tab3.setVisibility(View.GONE);
						tab4.setVisibility(View.GONE);
						tabadd.setVisibility(View.VISIBLE);
						tabclose.setVisibility(View.VISIBLE);
						tabcount.edit().putString("tabcount", "2").commit();
						webview3.loadUrl("about:blank");
						swiperefreshlayout6.setVisibility(View.GONE);
						if (swiperefreshlayout3.isEnabled()) {
							swiperefreshlayout3.setEnabled(false);
							swiperefreshlayout3.setVisibility(View.GONE);
							swiperefreshlayout2.setEnabled(true);
							swiperefreshlayout2.setVisibility(View.VISIBLE);
							swiperefreshlayout6.setVisibility(View.GONE);
						}
						else {
							
						}
					}
					else {
						if (tabcount.getString("tabcount", "").equals("2")) {
							tab1.setVisibility(View.VISIBLE);
							tab2.setVisibility(View.GONE);
							tab3.setVisibility(View.GONE);
							tab4.setVisibility(View.GONE);
							tabadd.setVisibility(View.VISIBLE);
							tabclose.setVisibility(View.GONE);
							tabcount.edit().putString("tabcount", "1").commit();
							webview2.loadUrl("about:blank");
							swiperefreshlayout6.setVisibility(View.GONE);
							if (swiperefreshlayout2.isEnabled()) {
								swiperefreshlayout2.setEnabled(false);
								swiperefreshlayout2.setVisibility(View.GONE);
								swiperefreshlayout1.setEnabled(true);
								swiperefreshlayout1.setVisibility(View.VISIBLE);
								swiperefreshlayout6.setVisibility(View.GONE);
							}
							else {
								
							}
						}
						else {
							
						}
					}
				}
			}
		});
		
		tabadd.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (tabcount.getString("tabcount", "").equals("1")) {
					tab1.setVisibility(View.VISIBLE);
					tab2.setVisibility(View.VISIBLE);
					tab3.setVisibility(View.GONE);
					tab4.setVisibility(View.GONE);
					tabadd.setVisibility(View.VISIBLE);
					tabclose.setVisibility(View.VISIBLE);
					tabcount.edit().putString("tabcount", "2").commit();
				}
				else {
					if (tabcount.getString("tabcount", "").equals("2")) {
						tab1.setVisibility(View.VISIBLE);
						tab2.setVisibility(View.VISIBLE);
						tab3.setVisibility(View.VISIBLE);
						tab4.setVisibility(View.GONE);
						tabadd.setVisibility(View.VISIBLE);
						tabclose.setVisibility(View.VISIBLE);
						tabcount.edit().putString("tabcount", "3").commit();
					}
					else {
						if (tabcount.getString("tabcount", "").equals("3")) {
							tab1.setVisibility(View.VISIBLE);
							tab2.setVisibility(View.VISIBLE);
							tab3.setVisibility(View.VISIBLE);
							tab4.setVisibility(View.VISIBLE);
							tabadd.setVisibility(View.GONE);
							tabclose.setVisibility(View.VISIBLE);
							tabcount.edit().putString("tabcount", "4").commit();
						}
						else {
							
						}
					}
				}
			}
		});
		
		swiperefreshlayout5.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
			@Override 
			public void onRefresh() {
				webview5.loadUrl(webview5.getUrl());
			}
		});
		
		imageview21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		imageview23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intenturl.edit().putString("app", "1").commit();
				intenturl.edit().putString("link", webview5.getUrl()).commit();
				bzh.setClass(getApplicationContext(), MainActivity.class);
				startActivity(bzh);
				finish();
			}
		});
		
		imageview22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", webview5.getUrl()));
				SketchwareUtil.showMessage(getApplicationContext(), "Copied to clipboard");
			}
		});
		
		//webviewOnProgressChanged
		webview5.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		webview5.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				progressbar2.setVisibility(View.VISIBLE);
				webcheck.startRequestNetwork(RequestNetworkController.GET, webview5.getUrl(), "A", _webcheck_request_listener);
				if (settings.getString("ytplayer", "").equals("1")) {
					if (webview5.getUrl().contains("m.youtube.com")) {
						
						startActivity(ytb);
						dialogytlink.edit().putString("link", webview5.getUrl()).commit();
						webview5.stopLoading();
						webview5.goBack();
					}
				}
				else {
					
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				textview5.setText(webview5.getTitle());
				progressbar2.setVisibility(View.GONE);
				swiperefreshlayout5.setRefreshing(false);
				super.onPageFinished(_param1, _param2);
			}
		});
		
		_webcheck_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				if (swiperefreshlayout1.isEnabled()) {
					swiperefreshlayout6.setVisibility(View.GONE);
					swiperefreshlayout1.setVisibility(View.VISIBLE);
				}
				else {
					if (swiperefreshlayout2.isEnabled()) {
						swiperefreshlayout6.setVisibility(View.GONE);
						swiperefreshlayout2.setVisibility(View.VISIBLE);
					}
					else {
						if (swiperefreshlayout3.isEnabled()) {
							swiperefreshlayout6.setVisibility(View.GONE);
							swiperefreshlayout3.setVisibility(View.VISIBLE);
						}
						else {
							if (swiperefreshlayout4.isEnabled()) {
								swiperefreshlayout6.setVisibility(View.GONE);
								swiperefreshlayout4.setVisibility(View.VISIBLE);
							}
							else {
								
							}
						}
					}
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				if (swiperefreshlayout1.isEnabled()) {
					swiperefreshlayout6.setVisibility(View.VISIBLE);
					swiperefreshlayout1.setVisibility(View.GONE);
					textview7.setText("You don't have internet or the site you trying to visit is currently down.\n\nError Code\n".concat(_message));
				}
				else {
					if (swiperefreshlayout2.isEnabled()) {
						swiperefreshlayout6.setVisibility(View.VISIBLE);
						swiperefreshlayout2.setVisibility(View.GONE);
						textview7.setText("You don't have internet or the site you trying to visit is currently down.\n\nError Code\n".concat(_message));
					}
					else {
						if (swiperefreshlayout3.isEnabled()) {
							swiperefreshlayout6.setVisibility(View.VISIBLE);
							swiperefreshlayout3.setVisibility(View.GONE);
							textview7.setText("You don't have internet or the site you trying to visit is currently down.\n\nError Code\n".concat(_message));
						}
						else {
							if (swiperefreshlayout4.isEnabled()) {
								swiperefreshlayout6.setVisibility(View.VISIBLE);
								swiperefreshlayout4.setVisibility(View.GONE);
								textview7.setText("You don't have internet or the site you trying to visit is currently down.\n\nError Code\n".concat(_message));
							}
							else {
								
							}
						}
					}
				}
			}
		};
		
		_updatcheck_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				listmap = new Gson().fromJson(_response, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
				if (Double.parseDouble(your_version) < Double.parseDouble(listmap.get((int)0).get("update-version").toString())) {
					dlgupdate.setClass(getApplicationContext(), UpdatedialogActivity.class);
					startActivity(dlgupdate);
					upt = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									
								}
							});
						}
					};
					_timer.schedule(upt, (int)(4000));
					settings.edit().putString("uptavab", "1").commit();
				}
				else {
					settings.edit().putString("uptavab", "0").commit();
				}
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		package_name = "com.bgbrowser.two";
		try {
			android.content.pm.PackageInfo pinfo = getPackageManager().getPackageInfo( package_name, android.content.pm.PackageManager.GET_ACTIVITIES);
			your_version = pinfo.versionName; }
		catch (Exception e){ showMessage(e.toString()); }
		updatcheck.startRequestNetwork(RequestNetworkController.GET, "https://raw.githubusercontent.com/ios7jbpro/bgbrowserdatabase/main/database.json", "", _updatcheck_request_listener);
		_checkupdt();
		_function();
		String s = String.valueOf(MathClass.getStatusBarHeight(getApplicationContext()));
		settings.edit().putString("sbheight", s).commit();
		
		Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#000000"));
		if (settings.getString("splash", "").equals("1")) {
			bzh.setClass(getApplicationContext(), SplashActivity.class);
			startActivity(bzh);
		}
		settingsreolader = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						splash.edit().putString("splash", "1").commit();
					}
				});
			}
		};
		_timer.schedule(settingsreolader, (int)(1800));
		languagetext.setText(Locale.getDefault().getDisplayLanguage());
		if (settings.getString("debug", "").equals("1")) {
			bzh.setClass(getApplicationContext(), ExperimentalActivity.class);
			startActivity(bzh);
			finish();
		}
		_font();
		_language();
		if (settings.getString("desktopmode", "").equals("1")) {
			_desktop_mode(webview1);
			_desktop_mode(webview2);
			_desktop_mode(webview3);
			_desktop_mode(webview4);
		}
		else {
			_mobile_mode(webview1);
			_mobile_mode(webview2);
			_mobile_mode(webview3);
			_mobile_mode(webview4);
		}
		intenturlpage.setVisibility(View.GONE);
		intenturlpage.setEnabled(false);
		swiperefreshlayout6.setEnabled(false);
		swiperefreshlayout6.setVisibility(View.GONE);
		linear21.setVisibility(View.GONE);
		textview11.setVisibility(View.GONE);
		textview12.setVisibility(View.GONE);
		suggesturl.setVisibility(View.GONE);
		webview1.setFindListener(new WebView.FindListener() {
			 @Override
			 public void onFindResultReceived(int actionMatchOrdinal, int numberOfMatches, boolean isDoneCounting) {
				  TotalItems = numberOfMatches;
				  FoundItems = isDoneCounting;
				   
				 }
		});
		webview2.setFindListener(new WebView.FindListener() {
			 @Override
			 public void onFindResultReceived(int actionMatchOrdinal, int numberOfMatches, boolean isDoneCounting) {
				  TotalItems = numberOfMatches;
				  FoundItems = isDoneCounting;
				   
				 }
		});
		webview3.setFindListener(new WebView.FindListener() {
			 @Override
			 public void onFindResultReceived(int actionMatchOrdinal, int numberOfMatches, boolean isDoneCounting) {
				  TotalItems = numberOfMatches;
				  FoundItems = isDoneCounting;
				   
				 }
		});
		webview4.setFindListener(new WebView.FindListener() {
			 @Override
			 public void onFindResultReceived(int actionMatchOrdinal, int numberOfMatches, boolean isDoneCounting) {
				  TotalItems = numberOfMatches;
				  FoundItems = isDoneCounting;
				   
				 }
		});
		webview1.getSettings().setAppCachePath(getApplicationContext().getCacheDir().getAbsolutePath()); 
		webview1.getSettings().setAllowFileAccess(true);
		webview1.getSettings().setAppCacheEnabled(true);
		webview1.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		webview1.getSettings().setLoadWithOverviewMode(true);
		webview1.getSettings().setUseWideViewPort(true);
		webview1.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
		webview1.getSettings().setDomStorageEnabled(true);
		webview1.getSettings().setSaveFormData(true);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setBuiltInZoomControls(true);
		webview1.getSettings().setDisplayZoomControls(false);
		webview2.getSettings().setAppCachePath(getApplicationContext().getCacheDir().getAbsolutePath()); 
		webview2.getSettings().setAllowFileAccess(true);
		webview2.getSettings().setAppCacheEnabled(true);
		webview2.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		webview2.getSettings().setLoadWithOverviewMode(true);
		webview2.getSettings().setUseWideViewPort(true);
		webview2.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
		webview2.getSettings().setDomStorageEnabled(true);
		webview2.getSettings().setSaveFormData(true);
		webview2.getSettings().setJavaScriptEnabled(true);
		webview2.getSettings().setBuiltInZoomControls(true);
		webview2.getSettings().setDisplayZoomControls(false);
		webview3.getSettings().setAppCachePath(getApplicationContext().getCacheDir().getAbsolutePath()); 
		webview3.getSettings().setAllowFileAccess(true);
		webview3.getSettings().setAppCacheEnabled(true);
		webview3.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		webview3.getSettings().setLoadWithOverviewMode(true);
		webview3.getSettings().setUseWideViewPort(true);
		webview3.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
		webview3.getSettings().setDomStorageEnabled(true);
		webview3.getSettings().setSaveFormData(true);
		webview3.getSettings().setJavaScriptEnabled(true);
		webview3.getSettings().setBuiltInZoomControls(true);
		webview3.getSettings().setDisplayZoomControls(false);
		webview4.getSettings().setAppCachePath(getApplicationContext().getCacheDir().getAbsolutePath()); 
		webview4.getSettings().setAllowFileAccess(true);
		webview4.getSettings().setAppCacheEnabled(true);
		webview4.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		webview4.getSettings().setLoadWithOverviewMode(true);
		webview4.getSettings().setUseWideViewPort(true);
		webview4.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
		webview4.getSettings().setDomStorageEnabled(true);
		webview4.getSettings().setSaveFormData(true);
		webview4.getSettings().setJavaScriptEnabled(true);
		webview4.getSettings().setBuiltInZoomControls(true);
		webview4.getSettings().setDisplayZoomControls(false);
		webview5.getSettings().setAppCachePath(getApplicationContext().getCacheDir().getAbsolutePath()); 
		webview5.getSettings().setAllowFileAccess(true);
		webview5.getSettings().setAppCacheEnabled(true);
		webview5.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		webview5.getSettings().setLoadWithOverviewMode(true);
		webview5.getSettings().setUseWideViewPort(true);
		webview5.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
		webview5.getSettings().setDomStorageEnabled(true);
		webview5.getSettings().setSaveFormData(true);
		webview5.getSettings().setJavaScriptEnabled(true);
		webview5.getSettings().setBuiltInZoomControls(true);
		webview5.getSettings().setDisplayZoomControls(false);
		swiperefreshlayout2.setEnabled(false);
		progressbar1.setVisibility(View.GONE);
		swiperefreshlayout2.setVisibility(View.GONE);
		swiperefreshlayout3.setVisibility(View.GONE);
		swiperefreshlayout3.setEnabled(false);
		swiperefreshlayout4.setVisibility(View.GONE);
		swiperefreshlayout4.setEnabled(false);
		linear16.setElevation(2);
		linear7.setEnabled(false);
		linear7.setVisibility(View.GONE);
		width = Math.round(SketchwareUtil.getDisplayWidthPixels(getApplicationContext()));
		_checkers();
		if (settings.getString("seen", "").equals("")) {
			settings.edit().putString("seen", "google").commit();
			logs.edit().putString("logs", logs.getString("logs", "").concat("\n[".concat(new SimpleDateFormat("hh:mm:ss").format(ei.getTime()).concat("]".concat("setSearchEngine:Google"))))).commit();
		}
		if (settings.getString("mnb", "").equals("1")) {
			if (settings.getString("darkmode", "").equals("1")) {
				window.setNavigationBarColor(Color.parseColor("#000000"));
				Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor("#000000"));
			}
			else {
				window.setNavigationBarColor(Color.parseColor("#FFFFFF"));
				Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor("#9E9E9E"));
			}
		}
		if (Double.parseDouble(Build.VERSION.SDK) > 28) {
			settings.edit().putString("mnb", "1").commit();
		}
		if (settings.getString("tabletmode", "").equals("1")) {
			
		}
		else {
			linear19.setVisibility(View.GONE);
		}
		_tabcheck();
		_reloader();
		if (intenturl.getString("app", "").equals("1")) {
			webview1.loadUrl(intenturl.getString("link", ""));
			intenturl.edit().putString("app", "0").commit();
			intenturl.edit().putString("link", "").commit();
		}
		try{ Intent intent = getIntent(); Uri data = intent.getData(); 
			intenturltext.setText(data.toString());
			intenturl.edit().putString("intenturl", intenturltext.getText().toString()).commit();
			if (intenturl.getString("intenturl", "").equals(intenturltext.getText().toString())) {
				intenturlpage.setVisibility(View.VISIBLE);
				intenturlpage.setEnabled(true);
				webview5.loadUrl(intenturl.getString("intenturl", ""));
				progressbar2.setVisibility(View.VISIBLE);
				linear17.setVisibility(View.GONE);
				webview1.setEnabled(false);
				webview2.setEnabled(false);
				webview3.setEnabled(false);
				webview4.setEnabled(false);
				webview1.setVisibility(View.GONE);
				webview2.setVisibility(View.GONE);
				webview3.setVisibility(View.GONE);
				webview4.setVisibility(View.GONE);
				linear19.setVisibility(View.GONE);
				progressbar1.setVisibility(View.GONE);
				textview5.setText(webview5.getUrl());
				webview5.setVisibility(View.VISIBLE);
				SketchwareUtil.showMessage(getApplicationContext(), "You can change default browser at settings.");
			}
		} catch (Exception e){}
		View a = getWindow().getDecorView();
		a.setSystemUiVisibility(0);
		if (Double.parseDouble(Build.VERSION.SDK) > 27) {
			if (settings.getString("flagfollowsystem", "").equals("1")) {
				switch (getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) {
					    case Configuration.UI_MODE_NIGHT_YES:
					if (Double.parseDouble(Build.VERSION.SDK) > 30) {
						_a12darkmode();
					}
					else {
						_dmlm1();
					}
					window.setNavigationBarColor(Color.parseColor("#000000"));
					getWindow().getDecorView();
					a.setSystemUiVisibility(0);
					if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
						Window w =MainActivity.this.getWindow();
						w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
						w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
					}
					settings.edit().putString("darkmode", "1").commit();
					
					        break;
					    case Configuration.UI_MODE_NIGHT_NO:
					if (Double.parseDouble(Build.VERSION.SDK) > 30) {
						_a12lightmode();
					}
					else {
						_dmdm1();
					}
					if (settings.getString("mnb", "").equals("1")) {
						window.setNavigationBarColor(Color.parseColor("#FFFFFF"));
					}
					else {
						window.setNavigationBarColor(Color.parseColor("#000000"));
					}
					getWindow().getDecorView();
					a.setSystemUiVisibility(0);
					getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
					getWindow().setStatusBarColor(0xFFFFFFFF);
					if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
						Window w =MainActivity.this.getWindow();
						w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
						w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
					}
					settings.edit().putString("darkmode", "0").commit();
					break; 
				}
			}
			else {
				if (settings.getString("darkmode", "").equals("1")) {
					_dmlm1();
					window.setNavigationBarColor(Color.parseColor("#000000"));
					getWindow().getDecorView();
					a.setSystemUiVisibility(0);
					if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
						Window w =MainActivity.this.getWindow();
						w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
						w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
					}
				}
				else {
					_dmdm1();
					if (settings.getString("mnb", "").equals("1")) {
						window.setNavigationBarColor(Color.parseColor("#FFFFFF"));
					}
					else {
						window.setNavigationBarColor(Color.parseColor("#000000"));
					}
					getWindow().getDecorView();
					a.setSystemUiVisibility(0);
					getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
					getWindow().setStatusBarColor(0xFFFFFFFF);
					if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
						Window w =MainActivity.this.getWindow();
						w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
						w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
					}
				}
			}
		}
		else {
			_dmdm1();
			getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
			getWindow().setStatusBarColor(0xFFFFFFFF);
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				Window w =MainActivity.this.getWindow();
				w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
			}
		}
		_Ripple("GREY", tab1);
		_Ripple("GREY", tab2);
		_Ripple("GREY", tab3);
		_Ripple("GREY", tab4);
		_Ripple("GREY", tabclose);
		_Ripple("GREY", tabadd);
		_Ripple("GREY", imageview20);
		_Ripple("GREY", imageview21);
		_Ripple("GREY", imageview22);
		_Ripple("GREY", imageview23);
		_Ripple("GREY", imageview34);
		_urloverlay();
		_lastpageloader();
		if (FileUtil.isExistFile(FileUtil.getExternalStorageDir().concat("/BgBrowser2/Saved"))) {
			
		}
		else {
			FileUtil.makeDir(FileUtil.getExternalStorageDir().concat("/BgBrowser2/Saved"));
		}
		webview1.getSettings().setUseWideViewPort(true);
		webview2.getSettings().setUseWideViewPort(true);
		webview3.getSettings().setUseWideViewPort(true);
		webview4.getSettings().setUseWideViewPort(true);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {
			case REQ_CD_RUNHTML:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				if (_filePath.get((int)(0)).endsWith(".html")) {
					path = _filePath.get((int)(0));
					if (swiperefreshlayout1.isEnabled()) {
						webview1.loadUrl("file:///" + path);
					}
					else {
						if (swiperefreshlayout2.isEnabled()) {
							webview2.loadUrl("file:///" + path);
						}
						else {
							if (swiperefreshlayout3.isEnabled()) {
								webview3.loadUrl("file:///" + path);
							}
							else {
								if (swiperefreshlayout4.isEnabled()) {
									webview4.loadUrl("file:///" + path);
								}
								else {
									SketchwareUtil.showMessage(getApplicationContext(), "illegalException:No View Enabled");
								}
							}
						}
					}
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Not a HTML file.");
				}
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (swiperefreshlayout1.isEnabled()) {
			if (webview1.canGoBack()) {
				webview1.goBack();
			}
			else {
				finish();
			}
		}
		else {
			if (swiperefreshlayout2.isEnabled()) {
				if (webview2.canGoBack()) {
					webview2.goBack();
				}
				else {
					finish();
				}
			}
			else {
				if (swiperefreshlayout3.isEnabled()) {
					if (webview3.canGoBack()) {
						webview3.goBack();
					}
					else {
						finish();
					}
				}
				else {
					if (swiperefreshlayout4.isEnabled()) {
						if (webview4.canGoBack()) {
							webview4.goBack();
						}
						else {
							finish();
						}
					}
					else {
						if (intenturlpage.isEnabled()) {
							if (webview5.canGoBack()) {
								webview5.goBack();
							}
							else {
								finish();
							}
						}
						else {
							
						}
					}
				}
			}
		}
	}
	
	public void _font () {
		if (ex.getString("googlesans", "").equals("1")) {
			
			
			
			
		}
	}
	
	
	public void _lastpageloader () {
		if (lastpage.getString("lastpagetab1", "").equals("")) {
			webview1.loadUrl("https://www.google.com");
			if (lastpage.getString("lastpagetab2", "").equals("")) {
				webview2.loadUrl("https://www.google.com");
				if (lastpage.getString("lastpagetab3", "").equals("")) {
					webview3.loadUrl("https://www.google.com");
					if (lastpage.getString("lastpagetab4", "").equals("")) {
						webview4.loadUrl("https://www.google.com");
					}
					else {
						webview4.loadUrl(lastpage.getString("lastpagetab4", ""));
					}
				}
				else {
					webview3.loadUrl(lastpage.getString("lastpagetab3", ""));
					if (lastpage.getString("lastpagetab4", "").equals("")) {
						webview4.loadUrl("https://www.google.com");
					}
					else {
						webview4.loadUrl(lastpage.getString("lastpagetab4", ""));
					}
				}
			}
			else {
				webview2.loadUrl(lastpage.getString("lastpagetab2", ""));
				if (lastpage.getString("lastpagetab3", "").equals("")) {
					webview3.loadUrl("https://www.google.com");
					if (lastpage.getString("lastpagetab4", "").equals("")) {
						webview4.loadUrl("https://www.google.com");
					}
					else {
						webview4.loadUrl(lastpage.getString("lastpagetab4", ""));
					}
				}
				else {
					webview3.loadUrl(lastpage.getString("lastpagetab3", ""));
					if (lastpage.getString("lastpagetab4", "").equals("")) {
						webview4.loadUrl("https://www.google.com");
					}
					else {
						webview4.loadUrl(lastpage.getString("lastpagetab4", ""));
					}
				}
			}
		}
		else {
			webview1.loadUrl(lastpage.getString("lastpagetab1", ""));
			if (lastpage.getString("lastpagetab2", "").equals("")) {
				webview2.loadUrl("https://www.google.com");
				if (lastpage.getString("lastpagetab3", "").equals("")) {
					webview3.loadUrl("https://www.google.com");
					if (lastpage.getString("lastpagetab4", "").equals("")) {
						webview4.loadUrl("https://www.google.com");
					}
					else {
						webview4.loadUrl(lastpage.getString("lastpagetab4", ""));
					}
				}
				else {
					webview3.loadUrl(lastpage.getString("lastpagetab3", ""));
					if (lastpage.getString("lastpagetab4", "").equals("")) {
						webview4.loadUrl("https://www.google.com");
					}
					else {
						webview4.loadUrl(lastpage.getString("lastpagetab4", ""));
					}
				}
			}
			else {
				webview2.loadUrl(lastpage.getString("lastpagetab2", ""));
				if (lastpage.getString("lastpagetab3", "").equals("")) {
					webview3.loadUrl("https://www.google.com");
					if (lastpage.getString("lastpagetab4", "").equals("")) {
						webview4.loadUrl("https://www.google.com");
					}
					else {
						webview4.loadUrl(lastpage.getString("lastpagetab4", ""));
					}
				}
				else {
					webview3.loadUrl(lastpage.getString("lastpagetab3", ""));
					if (lastpage.getString("lastpagetab4", "").equals("")) {
						webview4.loadUrl("https://www.google.com");
					}
					else {
						webview4.loadUrl(lastpage.getString("lastpagetab4", ""));
					}
				}
			}
		}
	}
	
	
	public void _language () {
		if (languagetext.getText().toString().equals("English")) {
			textview3.setText("Tabs");
		}
		else {
			if (languagetext.getText().toString().equals("Türkçe")) {
				textview3.setText("Sekmeler");
			}
			else {
				if (languagetext.getText().toString().equals("Deutsch")) {
					textview3.setText("Tabs");
				}
				else {
					if (languagetext.getText().toString().equals("español")) {
						textview3.setText("Pestañas");
					}
					else {
						
					}
				}
			}
		}
	}
	
	
	public void _darkmode () {
		if (Double.parseDouble(Build.VERSION.SDK) > 30) {
			
			Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#000000"));
			if (settings.getString("darkmode", "").equals("1")) {
				_a12darkmode();
				window.setNavigationBarColor(Color.parseColor("#000000"));
				View decor = getWindow().getDecorView();
				decor.setSystemUiVisibility(0);
				if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
					Window w =MainActivity.this.getWindow();
					w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
				}
			}
			else {
				_a12lightmode();
				if (settings.getString("mnb", "").equals("1")) {
					window.setNavigationBarColor(Color.parseColor("#FFFFFF"));
				}
				else {
					window.setNavigationBarColor(Color.parseColor("#000000"));
				}
				View decor = getWindow().getDecorView();
				decor.setSystemUiVisibility(0);
				getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
				getWindow().setStatusBarColor(0xFFFFFFFF);
				if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
					Window w =MainActivity.this.getWindow();
					w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
				}
			}
		}
		else {
			
			Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#000000"));
			if (settings.getString("darkmode", "").equals("1")) {
				_dmlm1();
				window.setNavigationBarColor(Color.parseColor("#000000"));
				View decor = getWindow().getDecorView();
				decor.setSystemUiVisibility(0);
				if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
					Window w =MainActivity.this.getWindow();
					w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
				}
			}
			else {
				_dmdm1();
				if (settings.getString("mnb", "").equals("1")) {
					window.setNavigationBarColor(Color.parseColor("#FFFFFF"));
				}
				else {
					window.setNavigationBarColor(Color.parseColor("#000000"));
				}
				View decor = getWindow().getDecorView();
				decor.setSystemUiVisibility(0);
				getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
				getWindow().setStatusBarColor(0xFFFFFFFF);
				if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
					Window w =MainActivity.this.getWindow();
					w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
					w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
				}
			}
		}
	}
	
	
	public void _dmlm1 () {
		linear19.setBackgroundColor(0xFF000000);
		linear7.setBackgroundColor(0xFF000000);
		nonet.setBackgroundColor(0xFF000000);
		textview3.setTextColor(0xFFFFFFFF);
		textview5.setTextColor(0xFFFFFFFF);
		textview6.setTextColor(0xFFFFFFFF);
		textview7.setTextColor(0xFFFFFFFF);
		edittext2.setTextColor(0xFFFFFFFF);
		textview9.setTextColor(0xFFFFFFFF);
		textview10.setTextColor(0xFFFFFFFF);
		textview11.setTextColor(0xFFFFFFFF);
		textview12.setTextColor(0xFFFFFFFF);
		textview13.setTextColor(0xFFFFFFFF);
		linear14.setBackgroundColor(0xFF000000);
		linear16.setBackgroundColor(0xFF000000);
		linear21.setBackgroundColor(0xFF000000);
		edittext2.setBackgroundColor(0xFF000000);
		linearspacingtop.setBackgroundColor(0xFF000000);
		imageview20.setImageResource(R.drawable.ic_create_white);
		imageview21.setImageResource(R.drawable.ic_close_white);
		imageview22.setImageResource(R.drawable.ic_filter_none_white);
		imageview23.setImageResource(R.drawable.ic_launch_white);
		imageview24.setImageResource(R.drawable.ic_do_not_disturb_white);
		imageview34.setImageResource(R.drawable.ic_filter_none_white);
		tabadd.setImageResource(R.drawable.ic_add_to_photos_white);
		tabclose.setImageResource(R.drawable.ic_close_white);
		imageview30.setImageResource(R.drawable.ic_chevron_left_white);
		suggesturl.setBackgroundColor(0xFF000000);
		if (settings.getString("darkwebview", "").equals("1")) {
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview1.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview2.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview3.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview4.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview5.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
		}
	}
	
	
	public void _dmdm1 () {
		linear19.setBackgroundColor(0xFFFFFFFF);
		linear7.setBackgroundColor(0xFFFFFFFF);
		nonet.setBackgroundColor(0xFFFFFFFF);
		textview3.setTextColor(0xFF000000);
		textview5.setTextColor(0xFF000000);
		textview6.setTextColor(0xFF000000);
		textview7.setTextColor(0xFF000000);
		edittext2.setTextColor(0xFF000000);
		textview9.setTextColor(0xFF000000);
		textview10.setTextColor(0xFF000000);
		textview11.setTextColor(0xFF000000);
		textview12.setTextColor(0xFF000000);
		textview13.setTextColor(0xFF000000);
		linear14.setBackgroundColor(0xFFFFFFFF);
		linear16.setBackgroundColor(0xFFFFFFFF);
		linear21.setBackgroundColor(0xFFFFFFFF);
		edittext2.setBackgroundColor(0xFFFFFFFF);
		linearspacingtop.setBackgroundColor(0xFFFFFFFF);
		imageview20.setImageResource(R.drawable.ic_create_black);
		imageview21.setImageResource(R.drawable.ic_clear_black);
		imageview22.setImageResource(R.drawable.ic_filter_none_black);
		imageview23.setImageResource(R.drawable.ic_open_in_new_black);
		imageview24.setImageResource(R.drawable.ic_do_not_disturb_black);
		imageview34.setImageResource(R.drawable.ic_filter_none_black);
		tabadd.setImageResource(R.drawable.ic_my_library_add_black);
		tabclose.setImageResource(R.drawable.ic_clear_black);
		imageview30.setImageResource(R.drawable.ic_chevron_left_black);
		suggesturl.setBackgroundColor(0xFFFFFFFF);
		if (settings.getString("darkwebview", "").equals("1")) {
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview1.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview2.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview3.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview4.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview5.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
		}
	}
	
	
	public void _checkers () {
		if (setup.getString("setup", "").equals("done")) {
			
		}
		else {
			bzh.setClass(getApplicationContext(), Welcome1Activity.class);
			startActivity(bzh);
		}
		if (settings.getString("space", "").equals("")) {
			settings.edit().putString("space", "off").commit();
		}
		if (zoom.getString("zoom", "").equals("")) {
			zoom.edit().putString("zoom", "off").commit();
		}
		if (settings.getString("cookies", "").equals("")) {
			settings.edit().putString("cookies", "0").commit();
		}
		if (dms.getString("dms", "").equals("")) {
			dms.edit().putString("dms", "0").commit();
		}
		if (tabcount.getString("tabcount", "").equals("")) {
			tabcount.edit().putString("tabcount", "1").commit();
		}
		if (settings.getString("ytplayer", "").equals("")) {
			tabcount.edit().putString("ytplayer", "0").commit();
		}
		if (settings.getString("debug", "").equals("")) {
			settings.edit().putString("debug", "0").commit();
		}
		if (settings.getString("flagfollowsystem", "").equals("")) {
			if (Double.parseDouble(Build.VERSION.SDK) > 27) {
				settings.edit().putString("flagfollowsystem", "1").commit();
			}
		}
		if (settings.getString("tabletmode", "").equals("")) {
			settings.edit().putString("tabletmode", "0").commit();
		}
		if (webhistory.getString("webhistory", "").equals("")) {
			webhistory.edit().putString("webhistory", "0").commit();
		}
		if (historycounter.getString("historycounter", "").equals("")) {
			historycounter.edit().putString("historycounter", "0").commit();
		}
		if (settings.getString("urlbartip", "").equals("1")) {
			
		}
		else {
			jdjd.setClass(getApplicationContext(), UrlbartipActivity.class);
			startActivity(jdjd);
		}
	}
	
	
	public void _reloader () {
		settingsreolader = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (settings.getString("cookies", "").equals("1")) {
							CookieManager.getInstance().setAcceptCookie(true);
						}
						else {
							CookieManager.getInstance().setAcceptCookie(false);
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(settingsreolader, (int)(0), (int)(1000));
		if (Double.parseDouble(Build.VERSION.SDK) < 28) {
			if (settings.getString("flagfollowsystem", "").equals("1")) {
				_darkmode();
			}
		}
	}
	
	
	public void _tabcheck () {
		if (tabcount.getString("tabcount", "").equals("1")) {
			tab1.setVisibility(View.VISIBLE);
			tab2.setVisibility(View.GONE);
			tab3.setVisibility(View.GONE);
			tab4.setVisibility(View.GONE);
			tabadd.setVisibility(View.VISIBLE);
			tabclose.setVisibility(View.GONE);
		}
		else {
			if (tabcount.getString("tabcount", "").equals("2")) {
				tab1.setVisibility(View.VISIBLE);
				tab2.setVisibility(View.VISIBLE);
				tab3.setVisibility(View.GONE);
				tab4.setVisibility(View.GONE);
				tabadd.setVisibility(View.VISIBLE);
				tabclose.setVisibility(View.VISIBLE);
			}
			else {
				if (tabcount.getString("tabcount", "").equals("3")) {
					tab1.setVisibility(View.VISIBLE);
					tab2.setVisibility(View.VISIBLE);
					tab3.setVisibility(View.VISIBLE);
					tab4.setVisibility(View.GONE);
					tabadd.setVisibility(View.VISIBLE);
					tabclose.setVisibility(View.VISIBLE);
				}
				else {
					if (tabcount.getString("tabcount", "").equals("4")) {
						tab1.setVisibility(View.VISIBLE);
						tab2.setVisibility(View.VISIBLE);
						tab3.setVisibility(View.VISIBLE);
						tab4.setVisibility(View.VISIBLE);
						tabadd.setVisibility(View.GONE);
						tabclose.setVisibility(View.VISIBLE);
					}
					else {
						
					}
				}
			}
		}
	}
	
	
	public void _loadurl () {
		if (edittext1.getText().toString().equals("bgbrowser://flags")) {
			bzh.setClass(getApplicationContext(), ExperimentalActivity.class);
			startActivity(bzh);
			finish();
		}
		else {
			if (swiperefreshlayout1.isEnabled()) {
				logs.edit().putString("logs", logs.getString("logs", "").concat("\n[".concat(new SimpleDateFormat("hh:mm:ss").format(ei.getTime()).concat("]".concat("webview1:Loaded URL"))))).commit();
				if (edittext1.getText().toString().contains("http://") || edittext1.getText().toString().contains("https://")) {
					webview1.loadUrl(edittext1.getText().toString());
				}
				else {
					if (edittext1.getText().toString().contains("chrome://")) {
						webview1.loadUrl(edittext1.getText().toString());
					}
					else {
						if (settings.getString("seen", "").equals("google")) {
							webview1.loadUrl("https://www.google.com/search?ie=UTF-8&source=android-browser&q=".concat(edittext1.getText().toString()));
						}
						else {
							if (settings.getString("seen", "").equals("yandex")) {
								webview1.loadUrl("https://yandex.com.tr/search/touch/?text=".concat(edittext1.getText().toString()));
							}
							else {
								if (settings.getString("seen", "").equals("webud")) {
									webview1.loadUrl("https://portal.webud.xyz/search?q=".concat(edittext1.getText().toString()));
								}
								else {
									if (settings.getString("seen", "").equals("duckduckgo")) {
										webview1.loadUrl("https://duckduckgo.com/?q=".concat(edittext1.getText().toString()));
									}
									else {
										if (settings.getString("seen", "").equals("yahoo")) {
											webview1.loadUrl("https://search.yahoo.com/search?p=".concat(edittext1.getText().toString()));
										}
										else {
											if (settings.getString("seen", "").equals("bing")) {
												webview1.loadUrl("https://www.bing.com/search?q=".concat(edittext1.getText().toString()));
											}
											else {
												SketchwareUtil.showMessage(getApplicationContext(), "Please select a default search engine over from settings.");
											}
										}
									}
								}
							}
						}
					}
				}
			}
			else {
				if (swiperefreshlayout2.isEnabled()) {
					logs.edit().putString("logs", logs.getString("logs", "").concat("\n[".concat(new SimpleDateFormat("hh:mm:ss").format(ei.getTime()).concat("]".concat("webview2:Loaded URL"))))).commit();
					if (edittext1.getText().toString().contains("http://") || edittext1.getText().toString().contains("https://")) {
						webview2.loadUrl(edittext1.getText().toString());
					}
					else {
						if (edittext1.getText().toString().contains("chrome://")) {
							webview2.loadUrl(edittext1.getText().toString());
						}
						else {
							if (settings.getString("seen", "").equals("google")) {
								webview2.loadUrl("https://www.google.com/search?ie=UTF-8&source=android-browser&q=".concat(edittext1.getText().toString()));
							}
							else {
								if (settings.getString("seen", "").equals("yandex")) {
									webview2.loadUrl("https://yandex.com.tr/search/touch/?text=".concat(edittext1.getText().toString()));
								}
								else {
									if (settings.getString("seen", "").equals("webud")) {
										webview2.loadUrl("https://portal.webud.xyz/search?q=".concat(edittext1.getText().toString()));
									}
									else {
										if (settings.getString("seen", "").equals("duckduckgo")) {
											webview2.loadUrl("https://duckduckgo.com/?q=".concat(edittext1.getText().toString()));
										}
										else {
											if (settings.getString("seen", "").equals("yahoo")) {
												webview2.loadUrl("https://search.yahoo.com/search?p=".concat(edittext1.getText().toString()));
											}
											else {
												if (settings.getString("seen", "").equals("bing")) {
													webview2.loadUrl("https://www.bing.com/search?q=".concat(edittext1.getText().toString()));
												}
												else {
													SketchwareUtil.showMessage(getApplicationContext(), "Please select a default search engine over from settings.");
												}
											}
										}
									}
								}
							}
						}
					}
				}
				else {
					if (swiperefreshlayout3.isEnabled()) {
						logs.edit().putString("logs", logs.getString("logs", "").concat("\n[".concat(new SimpleDateFormat("hh:mm:ss").format(ei.getTime()).concat("]".concat("webview3:Loaded URL"))))).commit();
						if (edittext1.getText().toString().contains("http://") || edittext1.getText().toString().contains("https://")) {
							webview3.loadUrl(edittext1.getText().toString());
						}
						else {
							if (edittext1.getText().toString().contains("chrome://")) {
								webview3.loadUrl(edittext1.getText().toString());
							}
							else {
								if (settings.getString("seen", "").equals("google")) {
									webview3.loadUrl("https://www.google.com/search?ie=UTF-8&source=android-browser&q=".concat(edittext1.getText().toString()));
								}
								else {
									if (settings.getString("seen", "").equals("yandex")) {
										webview3.loadUrl("https://yandex.com.tr/search/touch/?text=".concat(edittext1.getText().toString()));
									}
									else {
										if (settings.getString("seen", "").equals("webud")) {
											webview3.loadUrl("https://portal.webud.xyz/search?q=".concat(edittext1.getText().toString()));
										}
										else {
											if (settings.getString("seen", "").equals("duckduckgo")) {
												webview3.loadUrl("https://duckduckgo.com/?q=".concat(edittext1.getText().toString()));
											}
											else {
												if (settings.getString("seen", "").equals("yahoo")) {
													webview3.loadUrl("https://search.yahoo.com/search?p=".concat(edittext1.getText().toString()));
												}
												else {
													if (settings.getString("seen", "").equals("bing")) {
														webview3.loadUrl("https://www.bing.com/search?q=".concat(edittext1.getText().toString()));
													}
													else {
														SketchwareUtil.showMessage(getApplicationContext(), "Please select a default search engine over from settings.");
													}
												}
											}
										}
									}
								}
							}
						}
					}
					else {
						if (swiperefreshlayout4.isEnabled()) {
							logs.edit().putString("logs", logs.getString("logs", "").concat("\n[".concat(new SimpleDateFormat("hh:mm:ss").format(ei.getTime()).concat("]".concat("webview4:Loaded URL"))))).commit();
							if (edittext1.getText().toString().contains("http://") || edittext1.getText().toString().contains("https://")) {
								webview4.loadUrl(edittext1.getText().toString());
							}
							else {
								if (edittext1.getText().toString().contains("chrome://")) {
									webview4.loadUrl(edittext1.getText().toString());
								}
								else {
									if (settings.getString("seen", "").equals("google")) {
										webview4.loadUrl("https://www.google.com/search?ie=UTF-8&source=android-browser&q=".concat(edittext1.getText().toString()));
									}
									else {
										if (settings.getString("seen", "").equals("yandex")) {
											webview4.loadUrl("https://yandex.com.tr/search/touch/?text=".concat(edittext1.getText().toString()));
										}
										else {
											if (settings.getString("seen", "").equals("webud")) {
												webview4.loadUrl("https://portal.webud.xyz/search?q=".concat(edittext1.getText().toString()));
											}
											else {
												if (settings.getString("seen", "").equals("duckduckgo")) {
													webview4.loadUrl("https://duckduckgo.com/?q=".concat(edittext1.getText().toString()));
												}
												else {
													if (settings.getString("seen", "").equals("yahoo")) {
														webview4.loadUrl("https://search.yahoo.com/search?p=".concat(edittext1.getText().toString()));
													}
													else {
														if (settings.getString("seen", "").equals("bing")) {
															webview4.loadUrl("https://www.bing.com/search?q=".concat(edittext1.getText().toString()));
														}
														else {
															SketchwareUtil.showMessage(getApplicationContext(), "Please select a default search engine over from settings.");
														}
													}
												}
											}
										}
									}
								}
							}
						}
						else {
							
						}
					}
				}
			}
			SketchwareUtil.hideKeyboard(getApplicationContext());
			imageview20.setVisibility(View.GONE);
		}
	}
	
	
	public void _hideSoftKeyboard (final View _view) {
		InputMethodManager inputMethodManager =(InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE); inputMethodManager.hideSoftInputFromWindow(_view.getWindowToken(), 0);
	}
	
	
	public void _Ripple (final String _color, final View _view) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[] {Color.parseColor(_color)}); android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr,null,null); _view.setBackground(ripdr);
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
	
	
	public void _Popup () {
		View popupView = getLayoutInflater().inflate(R.layout.popup, null);
		
		//popup is the name of your custom view
		
		final PopupWindow popup = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
		//Text
		TextView text1 = popupView.findViewById(R.id.text1);
		TextView text2 = popupView.findViewById(R.id.text2);
		TextView text3 = popupView.findViewById(R.id.text3);
		TextView text4 = popupView.findViewById(R.id.text4);
		TextView text5 = popupView.findViewById(R.id.text5);
		TextView text6 = popupView.findViewById(R.id.text6);
		TextView text7 = popupView.findViewById(R.id.text7);
		TextView text8 = popupView.findViewById(R.id.text8);
		TextView text9 = popupView.findViewById(R.id.text9);
		TextView text10 = popupView.findViewById(R.id.text10);
		
		//Image
		ImageView image_settings = popupView.findViewById(R.id.image_settings);
		ImageView image_editsaved = popupView.findViewById(R.id.image_editsaved);
		ImageView image_savepdf = popupView.findViewById(R.id.image_savepdf);
		ImageView image_find = popupView.findViewById(R.id.image_find);
		ImageView image_download = popupView.findViewById(R.id.image_download);
		ImageView image_savepicture = popupView.findViewById(R.id.image_savepicture);
		ImageView image_reload = popupView.findViewById(R.id.image_reload);
		ImageView image_forward = popupView.findViewById(R.id.image_forward);
		ImageView image_html = popupView.findViewById(R.id.image_html);
		ImageView image_extracthtml = popupView.findViewById(R.id.image_extracthtml);
		ImageView image_desktopmode = popupView.findViewById(R.id.image_desktopmode);
		ImageView image_share = popupView.findViewById(R.id.image_share);
		ImageView image_update = popupView.findViewById(R.id.image_update);
		
		//Lines
		LinearLayout line_popup = popupView.findViewById(R.id.line_popup);
		LinearLayout line_Download = popupView.findViewById(R.id.line_Download);
		LinearLayout line_find = popupView.findViewById(R.id.line_find);
		LinearLayout line_editsaved = popupView.findViewById(R.id.line_editsaved);
		LinearLayout line_pdf = popupView.findViewById(R.id.line_pdf);
		LinearLayout line_settings = popupView.findViewById(R.id.line_settings);
		LinearLayout line_savepicture = popupView.findViewById(R.id.line_savepicture);
		LinearLayout line_reload = popupView.findViewById(R.id.line_reload);
		LinearLayout line_forward = popupView.findViewById(R.id.line_forward);
		LinearLayout line_html = popupView.findViewById(R.id.line_html);
		LinearLayout line_extracthtml = popupView.findViewById(R.id.line_extracthtml);
		LinearLayout line_desktopmode = popupView.findViewById(R.id.line_desktopmode);
		LinearLayout line_share = popupView.findViewById(R.id.line_share);
		LinearLayout line_update = popupView.findViewById(R.id.line_update);
		
		//Dividers
		LinearLayout holder_top = popupView.findViewById(R.id.holder_top);
		LinearLayout line_div1 = popupView.findViewById(R.id.line_div1);
		LinearLayout line_div2 = popupView.findViewById(R.id.line_div2);
		LinearLayout line_div3 = popupView.findViewById(R.id.line_div3);
		LinearLayout line_div4 = popupView.findViewById(R.id.line_div4);
		LinearLayout line_div5 = popupView.findViewById(R.id.line_div5);
		LinearLayout line_div6 = popupView.findViewById(R.id.line_div6);
		LinearLayout line_div7 = popupView.findViewById(R.id.line_div7);
		LinearLayout line_div8 = popupView.findViewById(R.id.line_div8);
		LinearLayout line_div9 = popupView.findViewById(R.id.line_div9);
		line_Download.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				bzh.setClass(getApplicationContext(), DownloadActivity.class);
				startActivity(bzh);
				popup.dismiss();
			} });
		
		line_find.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				linear14.setVisibility(View.GONE);
				linear21.setVisibility(View.VISIBLE);
				popup.dismiss();
			} });
		
		line_pdf.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				//print web page
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
					PrintTheWebPage(webview1);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "h");
				}
				popup.dismiss();
			} });
		
		line_settings.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				bzh.setClass(getApplicationContext(), SettingsActivity.class);
				startActivity(bzh);
				popup.dismiss();
			} });
		
		line_savepicture.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				filname = Calendar.getInstance();
				name = FileUtil.getExternalStorageDir().concat("/BgBrowser2/Saved/".concat(String.valueOf((long)(filname.getTimeInMillis())).concat(".png")));
				if (swiperefreshlayout1.isEnabled()) {
					_saveView(swiperefreshlayout1);
				}
				else {
					if (swiperefreshlayout2.isEnabled()) {
						_saveView(swiperefreshlayout2);
					}
					else {
						if (swiperefreshlayout3.isEnabled()) {
							_saveView(swiperefreshlayout3);
						}
						else {
							if (swiperefreshlayout4.isEnabled()) {
								_saveView(swiperefreshlayout4);
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "No tab found to save.");
							}
						}
					}
				}
				savess.edit().putString("savess", name).commit();
				editask.setAction(Intent.ACTION_VIEW);
				editask.setClass(getApplicationContext(), EditpicActivity.class);
				startActivity(editask);
				popup.dismiss();
			} });
		
		line_reload.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				if (swiperefreshlayout1.isEnabled()) {
					webview1.loadUrl(webview1.getUrl());
				}
				else {
					if (swiperefreshlayout2.isEnabled()) {
						webview2.loadUrl(webview2.getUrl());
					}
					else {
						if (swiperefreshlayout3.isEnabled()) {
							webview3.loadUrl(webview3.getUrl());
						}
						else {
							if (swiperefreshlayout4.isEnabled()) {
								webview4.loadUrl(webview4.getUrl());
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "No tab found to reload.");
							}
						}
					}
				}
				popup.dismiss();
			} });
		
		line_forward.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				if (swiperefreshlayout1.isEnabled()) {
					if (webview1.canGoForward()) {
						webview1.goForward();
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "The current tab can't go forward");
					}
				}
				else {
					if (swiperefreshlayout2.isEnabled()) {
						if (webview2.canGoForward()) {
							webview2.goForward();
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "The current tab can't go forward");
						}
					}
					else {
						if (swiperefreshlayout3.isEnabled()) {
							if (webview3.canGoForward()) {
								webview3.goForward();
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "The current tab can't go forward");
							}
						}
						else {
							if (swiperefreshlayout4.isEnabled()) {
								if (webview4.canGoForward()) {
									webview4.goForward();
								}
								else {
									SketchwareUtil.showMessage(getApplicationContext(), "The current tab can't go forward");
								}
							}
							else {
								SketchwareUtil.showMessage(getApplicationContext(), "No tab found to forward.");
							}
						}
					}
				}
				popup.dismiss();
			} });
		
		line_editsaved.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				bzh.setClass(getApplicationContext(), EditimageActivity.class);
				startActivity(bzh);
				popup.dismiss();
			} });
		
		line_html.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				startActivityForResult(runhtml, REQ_CD_RUNHTML);
				settings.edit().putString("killnoconnection", "1").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Disable No Connection has been turned on so app can load the HTML file.");
				popup.dismiss();
			} });
		
		line_extracthtml.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				_extractcode();
				popup.dismiss();
			} });
		
		line_desktopmode.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				if (settings.getString("desktopmode", "").equals("1")) {
					image_desktopmode.setImageResource(R.drawable.ic_desktop_mac_black);
					if (settings.getString("darkmode", "").equals("1")) {
						image_desktopmode.setImageResource(R.drawable.ic_desktop_mac_white);
					}
					text8.setText("Desktop Mode");
					settings.edit().putString("desktopmode", "0").commit();
					_mobile_mode(webview1);
					_mobile_mode(webview2);
					_mobile_mode(webview3);
					_mobile_mode(webview4);
				}
				else {
					image_desktopmode.setImageResource(R.drawable.ic_phone_android_black);
					if (settings.getString("darkmode", "").equals("1")) {
						image_desktopmode.setImageResource(R.drawable.ic_phone_android_white);
					}
					text8.setText("Mobile Mode");
					settings.edit().putString("desktopmode", "1").commit();
					_desktop_mode(webview1);
					_desktop_mode(webview2);
					_desktop_mode(webview3);
					_desktop_mode(webview4);
				}
				webview1.loadUrl(webview1.getUrl());
				webview2.loadUrl(webview2.getUrl());
				webview3.loadUrl(webview3.getUrl());
				webview4.loadUrl(webview4.getUrl());
				popup.dismiss();
			} });
		
		line_share.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				_sharelink();
				popup.dismiss();
			} });
		
		line_update.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				dlgupdate.setClass(getApplicationContext(), UpdatedialogActivity.class);
				startActivity(dlgupdate);
				popup.dismiss();
			} });
		
		if (settings.getString("darkmode", "").equals("1")) {
			if (Double.parseDouble(Build.VERSION.SDK) > 30) {
				android.graphics.drawable.GradientDrawable round = new android.graphics.drawable.GradientDrawable ();
				round.setColor (getColor("system_accent2_800"));
				
				
				round.setCornerRadius (20);
				
				line_popup.setBackground (round);
				
				line_popup.setElevation(8);
				
				text1.setTextColor(0xFFFFFFFF);
				text2.setTextColor(0xFFFFFFFF);
				text3.setTextColor(0xFFFFFFFF);
				text4.setTextColor(0xFFFFFFFF);
				text5.setTextColor(0xFFFFFFFF);
				text6.setTextColor(0xFFFFFFFF);
				text7.setTextColor(0xFFFFFFFF);
				text8.setTextColor(0xFFFFFFFF);
				text9.setTextColor(0xFFFFFFFF);
				
				line_div1.setBackgroundColor(0xFF202124);
				line_div2.setBackgroundColor(0xFF202124);
				line_div3.setBackgroundColor(0xFF202124);
				line_div4.setBackgroundColor(0xFF202124);
				line_div5.setBackgroundColor(0xFF202124);
				line_div6.setBackgroundColor(0xFF202124);
				line_div7.setBackgroundColor(0xFF202124);
				line_div8.setBackgroundColor(0xFF202124);
				line_div9.setBackgroundColor(0xFF202124);
				
				image_settings.setImageResource(R.drawable.outline_settings_white_48);
				image_savepdf.setImageResource(R.drawable.ic_insert_drive_file_white);
				image_find.setImageResource(R.drawable.ic_search_white);
				image_download.setImageResource(R.drawable.ic_get_app_white);
				image_savepicture.setImageResource(R.drawable.ic_image_white);
				image_reload.setImageResource(R.drawable.ic_loop_white);
				image_forward.setImageResource(R.drawable.ic_chevron_right_white);
			}
			else {
				android.graphics.drawable.GradientDrawable round = new android.graphics.drawable.GradientDrawable ();
				round.setColor (Color.parseColor("#2E2F32"));
				
				
				round.setCornerRadius (20);
				
				line_popup.setBackground (round);
				
				line_popup.setElevation(8);
				
				text1.setTextColor(0xFFFFFFFF);
				text2.setTextColor(0xFFFFFFFF);
				text3.setTextColor(0xFFFFFFFF);
				text4.setTextColor(0xFFFFFFFF);
				text5.setTextColor(0xFFFFFFFF);
				text6.setTextColor(0xFFFFFFFF);
				text7.setTextColor(0xFFFFFFFF);
				text8.setTextColor(0xFFFFFFFF);
				text9.setTextColor(0xFFFFFFFF);
				
				line_div1.setBackgroundColor(0xFF202124);
				line_div2.setBackgroundColor(0xFF202124);
				line_div3.setBackgroundColor(0xFF202124);
				line_div4.setBackgroundColor(0xFF202124);
				line_div5.setBackgroundColor(0xFF202124);
				line_div6.setBackgroundColor(0xFF202124);
				line_div7.setBackgroundColor(0xFF202124);
				line_div8.setBackgroundColor(0xFF202124);
				line_div9.setBackgroundColor(0xFF202124);
				
				image_settings.setImageResource(R.drawable.outline_settings_white_48);
				image_savepdf.setImageResource(R.drawable.ic_insert_drive_file_white);
				image_find.setImageResource(R.drawable.ic_search_white);
				image_download.setImageResource(R.drawable.ic_get_app_white);
				image_savepicture.setImageResource(R.drawable.ic_image_white);
				image_reload.setImageResource(R.drawable.ic_loop_white);
				image_forward.setImageResource(R.drawable.ic_chevron_right_white);
				_rippleRoundStroke(holder_top, "#2E2F32", "#FFFFFF", 20, 0, "#FFFFFF");
				_rippleRoundStroke(line_forward, "#2E2F32", "#FFFFFF", 20, 0, "#FFFFFF");
				_rippleRoundStroke(line_reload, "#2E2F32", "#FFFFFF", 20, 0, "#FFFFFF");
				_rippleRoundStroke(line_Download, "#2E2F32", "#FFFFFF", 20, 0, "#FFFFFF");
				_rippleRoundStroke(line_find, "#000000", "#FFFFFF", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_pdf, "#000000", "#FFFFFF", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_savepicture, "#000000", "#FFFFFF", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_html, "#000000", "#FFFFFF", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_editsaved, "#000000", "#FFFFFF", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_extracthtml, "#000000", "#FFFFFF", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_desktopmode, "#000000", "#FFFFFF", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_share, "#000000", "#FFFFFF", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_update, "#000000", "#FFFFFF", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_settings, "#000000", "#FFFFFF", 20, 0, "#FFFFFF");
			}
			image_editsaved.setImageResource(R.drawable.ic_create_white);
			image_html.setImageResource(R.drawable.ic_fast_forward_white);
			image_extracthtml.setImageResource(R.drawable.ic_create_white);
			image_share.setImageResource(R.drawable.ic_send_white);
			if (settings.getString("desktopmode", "").equals("1")) {
				image_desktopmode.setImageResource(R.drawable.ic_phone_android_white);
				text8.setText("Mobile Mode");
			}
			else {
				image_desktopmode.setImageResource(R.drawable.ic_desktop_mac_white);
				text8.setText("Desktop Mode");
			}
		}
		else {
			if (Double.parseDouble(Build.VERSION.SDK) > 30) {
				android.graphics.drawable.GradientDrawable round2 = new android.graphics.drawable.GradientDrawable ();
				round2.setColor (getColor("system_accent2_50"));
				
				
				round2.setCornerRadius (20);
				
				line_popup.setBackground (round2);
				
				line_popup.setElevation(8);
				
				text1.setTextColor(0xFF000000);
				text2.setTextColor(0xFF000000);
				text3.setTextColor(0xFF000000);
				text4.setTextColor(0xFF000000);
				text5.setTextColor(0xFF000000);
				text6.setTextColor(0xFF000000);
				text7.setTextColor(0xFF000000);
				text8.setTextColor(0xFF000000);
				text9.setTextColor(0xFF000000);
				
				line_div1.setBackgroundColor(0xFFF1F3F4);
				line_div2.setBackgroundColor(0xFFF1F3F4);
				line_div3.setBackgroundColor(0xFFF1F3F4);
				line_div4.setBackgroundColor(0xFFF1F3F4);
				line_div5.setBackgroundColor(0xFFF1F3F4);
				line_div6.setBackgroundColor(0xFFF1F3F4);
				line_div7.setBackgroundColor(0xFFF1F3F4);
				line_div8.setBackgroundColor(0xFFF1F3F4);
				line_div9.setBackgroundColor(0xFFF1F3F4);
				
				image_settings.setImageResource(R.drawable.settings);
				image_savepdf.setImageResource(R.drawable.ic_insert_drive_file_black);
				image_find.setImageResource(R.drawable.ic_search_black);
				image_download.setImageResource(R.drawable.ic_get_app_black);
				image_savepicture.setImageResource(R.drawable.ic_photo_black);
				image_reload.setImageResource(R.drawable.ic_loop_black);
				image_forward.setImageResource(R.drawable.ic_chevron_right_black);
			}
			else {
				android.graphics.drawable.GradientDrawable round2 = new android.graphics.drawable.GradientDrawable ();
				round2.setColor (Color.parseColor("#FFFFFF"));
				
				
				round2.setCornerRadius (20);
				
				line_popup.setBackground (round2);
				
				line_popup.setElevation(8);
				
				text1.setTextColor(0xFF000000);
				text2.setTextColor(0xFF000000);
				text3.setTextColor(0xFF000000);
				text4.setTextColor(0xFF000000);
				text5.setTextColor(0xFF000000);
				text6.setTextColor(0xFF000000);
				text7.setTextColor(0xFF000000);
				text8.setTextColor(0xFF000000);
				text9.setTextColor(0xFF000000);
				
				line_div1.setBackgroundColor(0xFFF1F3F4);
				line_div2.setBackgroundColor(0xFFF1F3F4);
				line_div3.setBackgroundColor(0xFFF1F3F4);
				line_div4.setBackgroundColor(0xFFF1F3F4);
				line_div5.setBackgroundColor(0xFFF1F3F4);
				line_div6.setBackgroundColor(0xFFF1F3F4);
				line_div7.setBackgroundColor(0xFFF1F3F4);
				line_div8.setBackgroundColor(0xFFF1F3F4);
				line_div9.setBackgroundColor(0xFFF1F3F4);
				
				image_settings.setImageResource(R.drawable.settings);
				image_savepdf.setImageResource(R.drawable.ic_insert_drive_file_black);
				image_find.setImageResource(R.drawable.ic_search_black);
				image_download.setImageResource(R.drawable.ic_get_app_black);
				image_savepicture.setImageResource(R.drawable.ic_photo_black);
				image_reload.setImageResource(R.drawable.ic_loop_black);
				image_forward.setImageResource(R.drawable.ic_chevron_right_black);
				_rippleRoundStroke(holder_top, "#EEEEEE", "#000000", 20, 0, "#FFFFFF");
				_rippleRoundStroke(line_forward, "#EEEEEE", "#000000", 20, 0, "#FFFFFF");
				_rippleRoundStroke(line_reload, "#EEEEEE", "#000000", 20, 0, "#FFFFFF");
				_rippleRoundStroke(line_Download, "#EEEEEE", "#000000", 20, 0, "#FFFFFF");
				_rippleRoundStroke(line_find, "#FFFFFF", "#000000", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_pdf, "#FFFFFF", "#000000", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_savepicture, "#FFFFFF", "#000000", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_html, "#FFFFFF", "#000000", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_editsaved, "#FFFFFF", "#000000", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_extracthtml, "#FFFFFF", "#000000", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_desktopmode, "#FFFFFF", "#000000", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_share, "#FFFFFF", "#000000", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_update, "#FFFFFF", "#000000", 0, 0, "#FFFFFF");
				_rippleRoundStroke(line_settings, "#FFFFFF", "#000000", 20, 0, "#FFFFFF");
			}
			image_editsaved.setImageResource(R.drawable.ic_create_black);
			image_html.setImageResource(R.drawable.ic_fast_forward_black);
			image_extracthtml.setImageResource(R.drawable.ic_create_black);
			image_share.setImageResource(R.drawable.ic_send_black);
			if (settings.getString("desktopmode", "").equals("1")) {
				image_desktopmode.setImageResource(R.drawable.ic_phone_android_black);
				text8.setText("Mobile Mode");
			}
			else {
				image_desktopmode.setImageResource(R.drawable.ic_desktop_mac_black);
				text8.setText("Desktop Mode");
			}
		}
		if (swiperefreshlayout1.isEnabled()) {
			if (webview1.canGoForward()) {
				
			}
			else {
				image_forward.setImageResource(R.drawable.ic_keyboard_arrow_right_grey);
			}
		}
		else {
			if (swiperefreshlayout2.isEnabled()) {
				if (webview2.canGoForward()) {
					
				}
				else {
					image_forward.setImageResource(R.drawable.ic_keyboard_arrow_right_grey);
				}
			}
			else {
				if (swiperefreshlayout3.isEnabled()) {
					if (webview3.canGoForward()) {
						
					}
					else {
						image_forward.setImageResource(R.drawable.ic_keyboard_arrow_right_grey);
					}
				}
				else {
					if (swiperefreshlayout4.isEnabled()) {
						if (webview4.canGoForward()) {
							
						}
						else {
							image_forward.setImageResource(R.drawable.ic_keyboard_arrow_right_grey);
						}
					}
					else {
						
					}
				}
			}
		}
		popup.setAnimationStyle(android.R.style.Animation_Dialog);
		
		popup.showAsDropDown(imageview31, 0,0);
		if (settings.getString("uptavab", "").equals("1")) {
			
		}
		else {
			line_update.setVisibility(View.GONE);
			line_div9.setVisibility(View.GONE);
		}
	}
	
	
	public void _UpdatifyComponent (final String _response) {
		try {
			//GET EVERYTHING READY
			
			String UpdatifyColorBack = "0";
			
			double UpdatifyRound = 60;
			
			String UpdatifyColor = "0";
			
			String UpdatifyCurrVer = "0";
			
			String UpdatifyTxtColor = "0";
			
			String UpdatifyBtnTxtColor = "0";
			//GET CURRENT VERSION
			
			android.content.pm.PackageInfo packageInfo = this.getPackageManager().getPackageInfo(getPackageName(), 0);
			
			UpdatifyCurrVer = packageInfo.versionName;
			UpdatifyMap = new Gson().fromJson(_response, new TypeToken<HashMap<String, Object>>(){}.getType());
			//FILL DIALOG DATA
			
			String updatifyContent1 = (UpdatifyMap.get("dialogTitle").toString());
			
			String updatifyContent2 = (UpdatifyMap.get("dialogSubtitle").toString());
			
			String updatifyContent3 = (UpdatifyMap.get("dialogBtnExtraTxt").toString());
			
			String updatifyContent4 = (UpdatifyMap.get("dialogBtnMainTxt").toString());
			if (UpdatifyMap.get("dialogOption").toString().equals("warning")) {
				UpdatifyColor = "#BD081C";
				
				UpdatifyColorBack = "#FFFFFF";
				
				UpdatifyRound = 60;
				
				UpdatifyTxtColor = "#212121";
				
				UpdatifyBtnTxtColor = "#FFFFFF";
			}
			else {
				if (UpdatifyMap.get("dialogOption").toString().equals("update")) {
					UpdatifyColor = "#0084FF";
					
					UpdatifyColorBack = "#FFFFFF";
					
					UpdatifyRound = 60;
					
					UpdatifyTxtColor = "#212121";
					
					UpdatifyBtnTxtColor = "#FFFFFF";
				}
				else {
					if (UpdatifyMap.get("dialogOption").toString().equals("message")) {
						UpdatifyColor = "#00B489";
						
						UpdatifyColorBack = "#FFFFFF";
						
						UpdatifyRound = 60;
						
						UpdatifyTxtColor = "#212121";
						
						UpdatifyBtnTxtColor = "#FFFFFF";
					}
					else {
						UpdatifyColor = (UpdatifyMap.get("customDialogAccent").toString());
						
						UpdatifyColorBack = (UpdatifyMap.get("customDialogBack").toString());
						
						UpdatifyRound = Double.parseDouble(UpdatifyMap.get("customDialogRound").toString());
						
						UpdatifyTxtColor = (UpdatifyMap.get("customDialogMainTxtColor").toString());
						
						UpdatifyBtnTxtColor = (UpdatifyMap.get("customDialogBtnTxtColor").toString());
					}
				}
			}
			if (!UpdatifyMap.containsKey("alertOption")) {
				UpdatifyMap.put("alertOption", "dialog");
			}
			//CREATE MAIN LAYOUT
			
			final LinearLayout main_layout = new LinearLayout(this);
			main_layout.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
			main_layout.setPadding(0,0,0,0);
			main_layout.setOrientation(LinearLayout.VERTICAL);
			main_layout.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
			//CHECK DIALOG OR SHEET
			
			if (UpdatifyMap.get("alertOption").toString().equals("sheet")) {
						
				updatifySheet = new com.google.android.material.bottomsheet.BottomSheetDialog(this);
				updatifySheet.setContentView(main_layout);	updatifySheet.getWindow().findViewById(R.id.design_bottom_sheet).setBackgroundResource(android.R.color.transparent);
						
			} else if (UpdatifyMap.get("alertOption").toString().equals("dialog")) {
				updatifyDialog = new AlertDialog.Builder(this).create();	
				updatifyDialog.setView(main_layout);	updatifyDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
						
			}
			
			//CUSTOMIZE MAIN LAYOUT
			
			android.graphics.drawable.GradientDrawable wg1 = new android.graphics.drawable.GradientDrawable();
			wg1.setColor(Color.parseColor(UpdatifyColor));
			wg1.setCornerRadius(100);
			
			final LinearLayout linear_1 = new LinearLayout(this);
			linear_1.setLayoutParams(new LinearLayout.LayoutParams(175,175, 0.0f));
			linear_1.setPadding(0,0,0,0);
			linear_1.setOrientation(LinearLayout.VERTICAL);
			linear_1.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
			linear_1.setBackground(wg1);
			
			main_layout.addView(linear_1);
			
			android.graphics.drawable.GradientDrawable wg0 = new android.graphics.drawable.GradientDrawable();
			wg0.setColor(Color.parseColor(UpdatifyColorBack));
			wg0.setCornerRadius((float)UpdatifyRound);
			
			LinearLayout.LayoutParams lp1= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT); 
			lp1.setMargins(40,0,40,0);
			final LinearLayout linear_55 = new LinearLayout(this);
			linear_55.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
			linear_55.setPadding(45,140,45,45);
			linear_55.setLayoutParams(lp1);
			linear_55.setOrientation(LinearLayout.VERTICAL);
			linear_55.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
			linear_55.setBackground(wg0);
			main_layout.addView(linear_55);
			linear_55.setTranslationY((float)(-57.5d));
			//TITLE TEXTVIEW
			
			final TextView textview_3 = new TextView(this);
			textview_3.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
			textview_3.setPadding(0,0,0,0);
			textview_3.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
			textview_3.setText(updatifyContent1);
			textview_3.setTextSize(16);
			textview_3.setTypeface(null, Typeface.BOLD);
			
			textview_3.setTextColor(Color.parseColor(UpdatifyTxtColor));
			textview_3.setSingleLine(true);
			linear_55.addView(textview_3);
			
			final LinearLayout linear_71 = new LinearLayout(this);
			linear_71.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,15, 0.0f));
			linear_71.setPadding(10,10,10,10);
			linear_71.setOrientation(LinearLayout.HORIZONTAL);
			linear_71.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
			linear_55.addView(linear_71);
			//SUBTITLE TEXTVIEW
			
			final TextView textview_4 = new TextView(this);
			textview_4.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, 0.0f));
			textview_4.setPadding(0,20,0,20);
			textview_4.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
			textview_4.setText(updatifyContent2);
			textview_4.setTextSize(14);
			textview_4.setTypeface(textview_4.getTypeface(), 1);
			textview_4.setTextColor(Color.parseColor(UpdatifyTxtColor));
			linear_55.addView(textview_4);
			//DIALOG IMAGE
			
			final ImageView img1 = new ImageView(this);
			img1.setLayoutParams(new LinearLayout.LayoutParams(90,90, 0.0f));
			img1.setPadding(0,0,0,0);
			if (UpdatifyMap.get("dialogOption").toString().equals("custom")) {
				Glide.with(getApplicationContext()).load(Uri.parse((UpdatifyMap.get("customDialogIcon").toString()))).into(img1);
			}
			else {
				if (UpdatifyMap.get("dialogOption").toString().equals("message")) {
					Glide.with(getApplicationContext()).load(Uri.parse("https://nerbly.com/updatify/media/dialog/dia_msg.png")).into(img1);
				}
				else {
					if (UpdatifyMap.get("dialogOption").toString().equals("warning")) {
						Glide.with(getApplicationContext()).load(Uri.parse("https://nerbly.com/updatify/media/dialog/dia_warning.png")).into(img1);
					}
					else {
						Glide.with(getApplicationContext()).load(Uri.parse("https://nerbly.com/updatify/media/dialog/dia_update.png")).into(img1);
					}
				}
				img1.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor("#FFFFFF"), Color.parseColor("#FFFFFF")}));
			}
			linear_1.addView(img1);
			linear_1.setElevation((float)5);
			linear_1.setTranslationY((float)(30));
			if (UpdatifyMap.get("dialogBtnExtra").toString().equals("true")) {
				//EXTRA BUTTON BACKGROUND
				
				final LinearLayout linear_5 = new LinearLayout(this);
				linear_5.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,50, 0.0f));
				linear_5.setPadding(8,8,8,8);
				linear_5.setOrientation(LinearLayout.HORIZONTAL);
				linear_55.addView(linear_5);
				//EXTRA BUTTON TEXTVIEW
				
				final TextView textview_5 = new TextView(this);
				textview_5.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,100, 01.0f));
				textview_5.setPadding(16,8,16,8);
				textview_5.setText(updatifyContent3);
				textview_5.setTextSize(14);
				textview_5.setTextColor(Color.parseColor(UpdatifyTxtColor));
				textview_5.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
				linear_55.addView(textview_5);
				
				android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
				GG.setColor(Color.parseColor(UpdatifyColorBack));
				GG.setCornerRadius((float)UpdatifyRound);
				GG.setStroke((int) 0,
				Color.parseColor(UpdatifyColor));
				android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor("#EEEEEE")}), GG, null);
				textview_5.setBackground(RE);
				textview_5.setOnClickListener(new OnClickListener() { 
					public void onClick(View v) {
						if (UpdatifyMap.get("dialogBtnExtraClick").toString().equals("exit")) {
							finishAffinity();
						}
						else {
							if (UpdatifyMap.get("dialogBtnExtraClick").toString().equals("browser")) {
								if (UpdatifyMap.get("isCancelable").toString().equals("true")) {
									try {
										Intent UpdatifyIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(UpdatifyMap.get("openLinkExtra").toString()));
										startActivity(UpdatifyIntent);
									} catch(Exception e) {
										SketchwareUtil.showMessage(getApplicationContext(), (e.toString()));
									}
								}
								else {
									if (UpdatifyMap.get("isCancelable").toString().equals("false")) {
										try {
											Intent UpdatifyIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(UpdatifyMap.get("openLinkExtra").toString()));
											startActivity(UpdatifyIntent);
											finishAffinity();
										} catch(Exception e) {
											SketchwareUtil.showMessage(getApplicationContext(), (e.toString()));
										}
									}
									else {
										SketchwareUtil.showMessage(getApplicationContext(), "Updatify error [CANCEL]");
									}
								}
							}
							else {
								if (UpdatifyMap.get("dialogBtnExtraClick").toString().equals("dismiss")) {
									if (UpdatifyMap.get("alertOption").toString().equals("sheet")) {
										
										updatifySheet.dismiss();		
												
									} else if (UpdatifyMap.get("alertOption").toString().equals("dialog")) {
										    
										updatifyDialog.dismiss();
												
									}
									
								}
								else {
									SketchwareUtil.showMessage(getApplicationContext(), "Updatify error [DISMISS]");
								}
							}
						}
					} 
				});
			}
			if (UpdatifyMap.get("dialogBtnMain").toString().equals("true")) {
				//MAIN BUTTON BACKGROUND
				
				final LinearLayout linear_512 = new LinearLayout(this);
				linear_512.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,30, 0.0f));
				linear_512.setPadding(8,8,8,8);
				linear_512.setOrientation(LinearLayout.HORIZONTAL);
				linear_55.addView(linear_512);
				//MAIN BUTTON BACKGROUND
				
				final TextView textview_6 = new TextView(this);
				textview_6.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,100, 0.0f));
				textview_6.setPadding(16,8,16,8);
				textview_6.setText(updatifyContent4);
				textview_6.setTextSize(14);
				textview_6.setTextColor(Color.parseColor(UpdatifyBtnTxtColor));
				textview_6.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
				linear_55.addView(textview_6);
				
				android.graphics.drawable.GradientDrawable GG1 = new android.graphics.drawable.GradientDrawable();
				GG1.setColor(Color.parseColor(UpdatifyColor));
				GG1.setCornerRadius((float)UpdatifyRound);
				GG1.setStroke((int) 0,
				Color.parseColor(UpdatifyColor));
				android.graphics.drawable.RippleDrawable RE1 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor("#EEEEEE")}), GG1, null);
				textview_6.setBackground(RE1);
				textview_6.setOnClickListener(new OnClickListener() { 
					public void onClick(View v) {
						if (UpdatifyMap.get("dialogBtnMainClick").toString().equals("exit")) {
							finishAffinity();
						}
						else {
							if (UpdatifyMap.get("dialogBtnMainClick").toString().equals("browser")) {
								if (UpdatifyMap.get("isCancelable").toString().equals("true")) {
									try {
										Intent UpdatifyIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(UpdatifyMap.get("openLinkMain").toString()));
										startActivity(UpdatifyIntent);
										finishAffinity();
									} catch(Exception e) {
										SketchwareUtil.showMessage(getApplicationContext(), (e.toString()));
									}
								}
								else {
									if (UpdatifyMap.get("isCancelable").toString().equals("false")) {
										try {
											Intent UpdatifyIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(UpdatifyMap.get("openLinkMain").toString()));
											startActivity(UpdatifyIntent);
										} catch(Exception e) {
											SketchwareUtil.showMessage(getApplicationContext(), (e.toString()));
										}
									}
									else {
										SketchwareUtil.showMessage(getApplicationContext(), "Updatify error [CANCEL]");
									}
								}
							}
							else {
								if (UpdatifyMap.get("dialogBtnMainClick").toString().equals("dismiss")) {
									if (UpdatifyMap.get("alertOption").toString().equals("sheet")) {
										
										updatifySheet.dismiss();		
												
									} else if (UpdatifyMap.get("alertOption").toString().equals("dialog")) {
										
										updatifyDialog.dismiss();
												
									}
								}
								else {
									SketchwareUtil.showMessage(getApplicationContext(), "Updatify error [DISMISS]");
								}
							}
						}
					} 
				});
			}
			if (UpdatifyMap.get("isCancelable").toString().equals("false")) {
				if (UpdatifyMap.get("alertOption").toString().equals("sheet")) {
					
					updatifySheet.setCancelable(false);		
							
				} else if (UpdatifyMap.get("alertOption").toString().equals("dialog")) {
					
					updatifyDialog.setCancelable(false);
							
				}
			}
			else {
				if (UpdatifyMap.get("isCancelable").toString().equals("true")) {
					if (UpdatifyMap.get("alertOption").toString().equals("sheet")) {
						
						updatifySheet.setCancelable(true);		
								
					} else if (UpdatifyMap.get("alertOption").toString().equals("dialog")) {
						
						updatifyDialog.setCancelable(true);
								
					}
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Updatify error [CANCEL]");
				}
			}
			if (UpdatifyMap.get("newVersion").toString().equals(UpdatifyCurrVer)) {
				
			}
			else {
				if (UpdatifyMap.get("isOneTime").toString().equals("true")) {
					if ((UCSP.getString("isOneTime", "").equals(UpdatifyMap.get("isOneTimeKey").toString()))) {
						
					}
					else {
						UCSP.edit().putString("isOneTime", UpdatifyMap.get("isOneTimeKey").toString()).commit();
						
						if (UpdatifyMap.get("alertOption").toString().equals("sheet")) {
							
							updatifySheet.show();		
									
						} else if (UpdatifyMap.get("alertOption").toString().equals("dialog")) {
							
							updatifyDialog.show();
							
						}
						
					}
				}
				else {
					if (UpdatifyMap.get("alertOption").toString().equals("sheet")) {
						
						updatifySheet.show();		
								
					} else if (UpdatifyMap.get("alertOption").toString().equals("dialog")) {
						
						updatifyDialog.show();
						
					}
				}
			}
		} catch(Exception e) {
			SketchwareUtil.showMessage(getApplicationContext(), (e.toString()));
		}
	}
	AlertDialog updatifyDialog;
	com.google.android.material.bottomsheet.BottomSheetDialog updatifySheet;
	{
		
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
			if (MainActivity.this == null) {
				return null; }
			return BitmapFactory.decodeResource(MainActivity.this.getApplicationContext().getResources(), 2130837573); }
		
		public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback viewCallback) {
			if (this.mCustomView != null) {
				onHideCustomView();
				return; }
			this.mCustomView = paramView;
			this.mOriginalSystemUiVisibility = MainActivity.this.getWindow().getDecorView().getSystemUiVisibility();
			// When CustomView is shown screen orientation changes to mOriginalOrientation (Landscape).
			MainActivity.this.setRequestedOrientation(this.mOriginalOrientation);
			// After that mOriginalOrientation is set to portrait.
			this.mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
			this.mCustomViewCallback = viewCallback; ((FrameLayout)MainActivity.this.getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1)); MainActivity.this.getWindow().getDecorView().setSystemUiVisibility(0);
		}
		
		public void onHideCustomView() {
			((FrameLayout)MainActivity.this.getWindow().getDecorView()).removeView(this.mCustomView);
			this.mCustomView = null;
			MainActivity.this.getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
			// When CustomView is hidden, screen orientation is set to mOriginalOrientation (portrait).
			MainActivity.this.setRequestedOrientation(this.mOriginalOrientation);
			// After that mOriginalOrientation is set to landscape.
			this.mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE; this.mCustomViewCallback.onCustomViewHidden();
			this.mCustomViewCallback = null;
		}
	}
	
	{
	}
	
	
	public void _saveView (final View _view) {
		Bitmap returnedBitmap = Bitmap.createBitmap(_view.getWidth(), _view.getHeight(),Bitmap.Config.ARGB_8888);
		
		Canvas canvas = new Canvas(returnedBitmap);
		android.graphics.drawable.Drawable bgDrawable =_view.getBackground();
		if (bgDrawable!=null) {
			bgDrawable.draw(canvas);
		} else {
			canvas.drawColor(Color.WHITE);
		}
		_view.draw(canvas);
		
		java.io.File pictureFile = new java.io.File(name);
		if (pictureFile == null) {
			showMessage("Error creating media file, check storage permissions: ");
			return; }
		try {
			java.io.FileOutputStream fos = new java.io.FileOutputStream(pictureFile); returnedBitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
			fos.close();
			showMessage("Image Saved in BgBrowser2/Saved folder");
		} catch (java.io.FileNotFoundException e) {
			showMessage("File not found: " + e.getMessage()); } catch (java.io.IOException e) {
			showMessage("Error accessing file: " + e.getMessage());
			
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
	
	
	public void _bscoded () {
		Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#000000"));
		
		View a = getWindow().getDecorView();
		a.setSystemUiVisibility(0);
		if (settings.getString("mnb", "").equals("1")) {
			window.setNavigationBarColor(Color.parseColor("#FFFFFF"));
		}
		else {
			window.setNavigationBarColor(Color.parseColor("#000000"));
		}
		getWindow().getDecorView();
		a.setSystemUiVisibility(0);
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		getWindow().setStatusBarColor(0xFFFFFFFF);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =MainActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFFFFFFFF);
		}
	}
	
	
	public void _bscodel () {
		Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS); window.setNavigationBarColor(Color.parseColor("#000000"));
		
		View a = getWindow().getDecorView();
		a.setSystemUiVisibility(0);
		window.setNavigationBarColor(Color.parseColor("#000000"));
		getWindow().getDecorView();
		a.setSystemUiVisibility(0);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =MainActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000000);
		}
	}
	
	
	public void _checkupdt () {
		
	}
	
	
	public void _extractcode () {
		if (swiperefreshlayout1.isEnabled()) {
			extracthtml.edit().putString("link", webview1.getUrl()).commit();
			exhtml.setAction(Intent.ACTION_VIEW);
			exhtml.setClass(getApplicationContext(), ExtracthtmlActivity.class);
			startActivity(exhtml);
		}
		else {
			if (swiperefreshlayout2.isEnabled()) {
				extracthtml.edit().putString("link", webview2.getUrl()).commit();
				exhtml.setAction(Intent.ACTION_VIEW);
				exhtml.setClass(getApplicationContext(), ExtracthtmlActivity.class);
				startActivity(exhtml);
			}
			else {
				if (swiperefreshlayout3.isEnabled()) {
					extracthtml.edit().putString("link", webview3.getUrl()).commit();
					exhtml.setAction(Intent.ACTION_VIEW);
					exhtml.setClass(getApplicationContext(), ExtracthtmlActivity.class);
					startActivity(exhtml);
				}
				else {
					if (swiperefreshlayout4.isEnabled()) {
						extracthtml.edit().putString("link", webview4.getUrl()).commit();
						exhtml.setAction(Intent.ACTION_VIEW);
						exhtml.setClass(getApplicationContext(), ExtracthtmlActivity.class);
						startActivity(exhtml);
					}
					else {
						SketchwareUtil.showMessage(getApplicationContext(), "illegalException:");
					}
				}
			}
		}
	}
	
	
	public void _mobile_mode (final WebView _view) {
		_view.getSettings().setLoadWithOverviewMode(true); _view.getSettings().setUseWideViewPort(true); final WebSettings webSettings = _view.getSettings(); final String newUserAgent; newUserAgent = "Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.61 Mobile Safari/537.36"; webSettings.setUserAgentString(newUserAgent); 
	}
	
	
	public void _desktop_mode (final WebView _webview) {
		_webview.getSettings().setLoadWithOverviewMode(true); _webview.getSettings().setUseWideViewPort(true); final WebSettings webSettings = _webview.getSettings(); final String newUserAgent; newUserAgent = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/63.0"; webSettings.setUserAgentString(newUserAgent); 
	}
	
	
	public void _getUrlOf () {
		if (swiperefreshlayout1.isEnabled()) {
			textview14.setText(webview1.getUrl());
		}
		else {
			if (swiperefreshlayout2.isEnabled()) {
				textview14.setText(webview2.getUrl());
			}
			else {
				if (swiperefreshlayout3.isEnabled()) {
					textview14.setText(webview3.getUrl());
				}
				else {
					if (swiperefreshlayout4.isEnabled()) {
						textview14.setText(webview4.getUrl());
					}
					else {
						
					}
				}
			}
		}
	}
	
	
	public void _focusOnEnabledView () {
		if (swiperefreshlayout1.isEnabled()) {
			webview1.requestFocus();
		}
		else {
			if (swiperefreshlayout2.isEnabled()) {
				webview2.requestFocus();
			}
			else {
				if (swiperefreshlayout3.isEnabled()) {
					webview3.requestFocus();
				}
				else {
					if (swiperefreshlayout4.isEnabled()) {
						webview4.requestFocus();
					}
					else {
						
					}
				}
			}
		}
	}
	
	
	public void _sharelink () {
		if (swiperefreshlayout1.isEnabled()) {
			share = webview1.getUrl();
		}
		else {
			if (swiperefreshlayout2.isEnabled()) {
				share = webview2.getUrl();
			}
			else {
				if (swiperefreshlayout3.isEnabled()) {
					share = webview3.getUrl();
				}
				else {
					if (swiperefreshlayout4.isEnabled()) {
						share = webview4.getUrl();
					}
					else {
						
					}
				}
			}
		}
		Intent i = new Intent(android.content.Intent.ACTION_SEND);i.setType("text/plain"); i.putExtra(android.content.Intent.EXTRA_TEXT, share); startActivity(Intent.createChooser(i,"Share using"));
	}
	
	
	public void _function () {
	}
	private int getColor(String name){
		return getColor(getResources().getIdentifier(name,"color","android"));
	}
	
	{
	}
	
	
	public void _a12lightmode () {
		linear19.setBackgroundColor(getColor("system_accent2_100"));
		linear7.setBackgroundColor(getColor("system_accent2_100"));
		nonet.setBackgroundColor(0xFFFFFFFF);
		textview3.setTextColor(0xFF000000);
		textview5.setTextColor(0xFF000000);
		textview6.setTextColor(0xFF000000);
		textview7.setTextColor(0xFF000000);
		edittext2.setTextColor(0xFF000000);
		textview9.setTextColor(0xFF000000);
		textview10.setTextColor(0xFF000000);
		textview11.setTextColor(0xFF000000);
		textview12.setTextColor(0xFF000000);
		textview13.setTextColor(0xFF000000);
		linear14.setBackgroundColor(0xFFFFFFFF);
		linear16.setBackgroundColor(getColor("system_accent2_100"));
		linear21.setBackgroundColor(getColor("system_accent2_100"));
		edittext2.setBackgroundColor(getColor("system_accent2_100"));
		linearspacingtop.setBackgroundColor(0xFFFFFFFF);
		imageview20.setImageResource(R.drawable.ic_create_black);
		imageview21.setImageResource(R.drawable.ic_clear_black);
		imageview22.setImageResource(R.drawable.ic_filter_none_black);
		imageview23.setImageResource(R.drawable.ic_open_in_new_black);
		imageview24.setImageResource(R.drawable.ic_do_not_disturb_black);
		imageview34.setImageResource(R.drawable.ic_filter_none_black);
		tabadd.setImageResource(R.drawable.ic_my_library_add_black);
		tabclose.setImageResource(R.drawable.ic_clear_black);
		imageview30.setImageResource(R.drawable.ic_chevron_left_black);
		suggesturl.setBackgroundColor(0xFFFFFFFF);
		if (settings.getString("darkwebview", "").equals("1")) {
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview1.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview2.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview3.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview4.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview5.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
		}
	}
	
	
	public void _a12darkmode () {
		linear19.setBackgroundColor(getColor("system_accent2_800"));
		linear7.setBackgroundColor(getColor("system_accent2_800"));
		nonet.setBackgroundColor(0xFF000000);
		textview3.setTextColor(0xFFFFFFFF);
		textview5.setTextColor(0xFFFFFFFF);
		textview6.setTextColor(0xFFFFFFFF);
		textview7.setTextColor(0xFFFFFFFF);
		edittext2.setTextColor(0xFFFFFFFF);
		textview9.setTextColor(0xFFFFFFFF);
		textview10.setTextColor(0xFFFFFFFF);
		textview11.setTextColor(0xFFFFFFFF);
		textview12.setTextColor(0xFFFFFFFF);
		textview13.setTextColor(0xFFFFFFFF);
		linear14.setBackgroundColor(0xFF000000);
		linear16.setBackgroundColor(getColor("system_accent2_800"));
		linear21.setBackgroundColor(getColor("system_accent2_800"));
		edittext2.setBackgroundColor(getColor("system_accent2_800"));
		linearspacingtop.setBackgroundColor(0xFF000000);
		imageview20.setImageResource(R.drawable.ic_create_white);
		imageview21.setImageResource(R.drawable.ic_close_white);
		imageview22.setImageResource(R.drawable.ic_filter_none_white);
		imageview23.setImageResource(R.drawable.ic_launch_white);
		imageview24.setImageResource(R.drawable.ic_do_not_disturb_white);
		imageview34.setImageResource(R.drawable.ic_filter_none_white);
		tabadd.setImageResource(R.drawable.ic_add_to_photos_white);
		tabclose.setImageResource(R.drawable.ic_close_white);
		imageview30.setImageResource(R.drawable.ic_chevron_left_white);
		suggesturl.setBackgroundColor(0xFF000000);
		if (settings.getString("darkwebview", "").equals("1")) {
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview1.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview2.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview3.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview4.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(webview5.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
		}
	}
	
	
	public void _urloverlay () {
		ViewGroup parent = (ViewGroup)rootlinear.getParent(); 
		ViewGroup root = (ViewGroup) parent.getParent(); 
		View inflate = getLayoutInflater().inflate(R.layout.urlbaroverlay, null); 
		inflate.setLayoutParams(new android.widget.LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.MATCH_PARENT)); 
		root.addView(inflate); 
		LinearLayout linear14 = inflate.findViewById(R.id.linear14);
		EditText urltext = inflate.findViewById(R.id.urltext);
		ImageView imagespinner = inflate.findViewById(R.id.imagespinner);
		ImageView imageview8 = inflate.findViewById(R.id.imageview8);
		ImageView imageview32 = inflate.findViewById(R.id.imageview32);
		ImageView imageviewexpand = inflate.findViewById(R.id.imageviewexpand);
		ImageView profile_picture = inflate.findViewById(R.id.profile_picture);
		CardView cardview1 = inflate.findViewById(R.id.cardview1);
		CardView cardview2 = inflate.findViewById(R.id.cardview2);
		CardView cardviewexpand = inflate.findViewById(R.id.cardviewexpand);
		LinearLayout bottomlinear = inflate.findViewById(R.id.bottomlinear);
		LinearLayout expandedbtns = inflate.findViewById(R.id.expandedbtns);
		ImageView homebtn = inflate.findViewById(R.id.homebtn);
		ImageView tabsbtn = inflate.findViewById(R.id.tabsbtn);
		final CardView holdercard = inflate.findViewById(R.id.holdercard);
		_Ripple("GREY", imageview31);
		holdercard.setCardBackgroundColor(0xFFFFFFFF);
		homebtn.setImageResource(R.drawable.home);
		if (Double.parseDouble(Build.VERSION.SDK) > 30) {
			cardview1.setCardBackgroundColor(getColor("system_accent2_100"));
			cardview2.setCardBackgroundColor(getColor("system_accent2_100"));
			cardviewexpand.setCardBackgroundColor(getColor("system_accent2_100"));
			urltext.setBackgroundColor(getColor("system_accent2_100"));
			holdercard.setCardBackgroundColor(getColor("system_accent2_100"));
		}
		if (settings.getString("darkmode", "").equals("1")) {
			if (Double.parseDouble(Build.VERSION.SDK) > 30) {
				cardview1.setCardBackgroundColor(getColor("system_accent2_800"));
				cardview2.setCardBackgroundColor(getColor("system_accent2_800"));
				cardviewexpand.setCardBackgroundColor(getColor("system_accent2_800"));
				urltext.setBackgroundColor(getColor("system_accent2_800"));
				holdercard.setCardBackgroundColor(getColor("system_accent2_800"));
			}
			else {
				cardview1.setCardBackgroundColor(0xFF000000);
				cardview2.setCardBackgroundColor(0xFF000000);
				cardviewexpand.setCardBackgroundColor(0xFF000000);
				holdercard.setCardBackgroundColor(0xFF000000);
			}
			urltext.setTextColor(0xFFFFFFFF);
			urltext.setBackgroundColor(0xFF000000);
			imageview8.setImageResource(R.drawable.ic_arrow_forward_white);
			imagespinner.setImageResource(R.drawable.ic_more_vert_white);
			imageviewexpand.setImageResource(R.drawable.ic_chevron_right_white);
			homebtn.setImageResource(R.drawable.outline_home_white_48);
		}
		cardview1.setVisibility(View.GONE);
		cardview1.setEnabled(false);
		cardview2.setVisibility(View.GONE);
		holdercard.setVisibility(View.GONE);
		if (settings.getString("darkmode", "").equals("1")) {
			imageviewexpand.setImageResource(R.drawable.ic_chevron_left_white);
		}
		else {
			imageviewexpand.setImageResource(R.drawable.ic_chevron_left_black);
		}
		KeyboardUtils.addKeyboardToggleListener(this, new KeyboardUtils.SoftKeyboardToggleListener(){
			 @Override
			    public void onToggleSoftKeyboard(boolean isVisible){
				        isKeyboardVisible = isVisible;
				if (isKeyboardVisible) {
					if(urltext.hasFocus()){
						   suggesturl.setVisibility(View.VISIBLE);
						textview13.setText(urltext.getText().toString());
						urltext.setText("");
						_getUrlOf();
						imageview8.setVisibility(View.VISIBLE);
					}else{
						suggesturl.setVisibility(View.GONE);
						if (swiperefreshlayout1.isEnabled()) {
							urltext.setText(webview1.getUrl());
							urltext.setText(webview1.getTitle());
						}
						if (swiperefreshlayout2.isEnabled()) {
							urltext.setText(webview2.getUrl());
							urltext.setText(webview2.getTitle());
						}
						if (swiperefreshlayout3.isEnabled()) {
							urltext.setText(webview3.getUrl());
							urltext.setText(webview3.getTitle());
						}
						if (swiperefreshlayout4.isEnabled()) {
							urltext.setText(webview4.getUrl());
							urltext.setText(webview4.getTitle());
						}
						_focusOnEnabledView();
						imageview8.setVisibility(View.GONE);
						profile_picture.performClick();
					}
					linearspacingtop.setVisibility(View.VISIBLE);
				}
				else {
					suggesturl.setVisibility(View.GONE);
					urltext.setText(textview13.getText().toString());
					imageview8.setVisibility(View.GONE);
					profile_picture.performClick();
					linearspacingtop.setVisibility(View.GONE);
				}
				
			} 
		});
		iy = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (selectedtab.getString("choose", "").equals("1")) {
							if (swiperefreshlayout1.isEnabled()) {
								urltext.setText(webview1.getTitle());
							}
							if (swiperefreshlayout2.isEnabled()) {
								urltext.setText(webview2.getTitle());
							}
							if (swiperefreshlayout3.isEnabled()) {
								urltext.setText(webview3.getTitle());
							}
							if (swiperefreshlayout4.isEnabled()) {
								urltext.setText(webview4.getTitle());
							}
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(iy, (int)(0), (int)(400));
		if (swiperefreshlayout1.isEnabled()) {
			webview1.setWebViewClient(new WebViewClient() {
							@Override
							public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
									final String _url = _param2;
									//code
					if (swiperefreshlayout1.isEnabled()) {
						progressbar1.setVisibility(View.VISIBLE);
						if (webview1.getUrl().contains("m.youtube.com/watch")) {
							if (settings.getString("ytplayer", "").equals("1")) {
								dialogytlink.edit().putString("link", webview1.getUrl()).commit();
								ytb.setClass(getApplicationContext(), YtplrbsheetActivity.class);
								startActivity(ytb);
								webview1.stopLoading();
								webview1.goBack();
							}
							else {
								
							}
						}
						if (webview1.getUrl().contains("https://web.telegram.org/")) {
							ytb.setClass(getApplicationContext(), TgwebActivity.class);
							startActivity(ytb);
							SketchwareUtil.showMessage(getApplicationContext(), "Telegram Web detected. Switched to TgWebLib.");
							webview1.stopLoading();
							webview1.goBack();
						}
					}
					history.edit().putString(String.valueOf(Double.parseDouble(webhistory.getString("webhistory", "")) + 1), webview1.getUrl()).commit();
					if (settings.getString("killnoconnection", "").equals("1")) {
						
					}
					else {
						webcheck.startRequestNetwork(RequestNetworkController.GET, webview1.getUrl(), "A", _webcheck_request_listener);
					}
					super.onPageStarted(_param1, _param2, _param3);
							}
				
							@Override
							public void onPageFinished(WebView _param1, String _param2) {
									final String _url = _param2;
					//code
					urltext.setText(webview1.getTitle());
					if (webview1.getUrl().indexOf("https://") == 0) {
						imageview32.setImageResource(R.drawable.ic_check_white);
						imageview32.setColorFilter(0xFF4CAF50, PorterDuff.Mode.MULTIPLY);
					}
					else {
						if (webview1.getUrl().indexOf("file://") == 0) {
							imageview32.setImageResource(R.drawable.ic_fast_forward_white);
							imageview32.setColorFilter(0xFFFBC02D, PorterDuff.Mode.MULTIPLY);
						}
						else {
							imageview32.setImageResource(R.drawable.ic_error_white);
							imageview32.setColorFilter(0xFFF44336, PorterDuff.Mode.MULTIPLY);
						}
					}
					lastpage.edit().putString("lastpagetab1", webview1.getUrl()).commit();
					url.edit().putString("urltab1", webview1.getUrl()).commit();
					swiperefreshlayout1.setRefreshing(false);
					progressbar1.setVisibility(View.GONE);
					textview13.setText(webview1.getTitle());
					super.onPageFinished(_param1, _param2);
							}
					});
		}
		if (swiperefreshlayout2.isEnabled()) {
			webview2.setWebViewClient(new WebViewClient() {
							@Override
							public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
									final String _url = _param2;
								 //code
					if (swiperefreshlayout2.isEnabled()) {
						progressbar1.setVisibility(View.VISIBLE);
						webview2.setVisibility(View.VISIBLE);
						edittext1.setText(webview2.getUrl());
						if (settings.getString("ytplayer", "").equals("1")) {
							if (webview2.getUrl().contains("m.youtube.com/watch")) {
								ytb.setClass(getApplicationContext(), YtplrbsheetActivity.class);
								startActivity(ytb);
								dialogytlink.edit().putString("link", webview2.getUrl()).commit();
								webview2.stopLoading();
								webview2.goBack();
							}
						}
						else {
							
						}
					}
					history.edit().putString("history", "[".concat(new SimpleDateFormat("hh:mm:ss").format(ei.getTime()).concat("]".concat("Tab 2:".concat(webview2.getUrl())))).concat("\n".concat(history.getString("history", "")))).commit();
					if (settings.getString("killnoconnection", "").equals("1")) {
						
					}
					else {
						webcheck.startRequestNetwork(RequestNetworkController.GET, webview2.getUrl(), "A", _webcheck_request_listener);
					}
									super.onPageStarted(_param1, _param2, _param3);
							}
							
							@Override
							public void onPageFinished(WebView _param1, String _param2) {
									final String _url = _param2;
					//code
					urltext.setText(webview2.getTitle());
					urltext.setText(edittext1.getText().toString());
					if (webview1.getUrl().indexOf("https://") == 0) {
						imageview32.setImageResource(R.drawable.ic_check_white);
						imageview32.setColorFilter(0xFF4CAF50, PorterDuff.Mode.MULTIPLY);
					}
					else {
						if (webview1.getUrl().indexOf("file://") == 0) {
							imageview32.setImageResource(R.drawable.ic_fast_forward_white);
							imageview32.setColorFilter(0xFFFBC02D, PorterDuff.Mode.MULTIPLY);
						}
						else {
							imageview32.setImageResource(R.drawable.ic_error_white);
							imageview32.setColorFilter(0xFFF44336, PorterDuff.Mode.MULTIPLY);
						}
					}
					lastpage.edit().putString("lastpagetab2", webview2.getUrl()).commit();
					url.edit().putString("urltab2", webview2.getUrl()).commit();
					swiperefreshlayout2.setRefreshing(false);
					progressbar1.setVisibility(View.GONE);
					textview13.setText(webview2.getTitle());
					super.onPageFinished(_param1, _param2);
							}
					});
		}
		if (swiperefreshlayout3.isEnabled()) {
			webview3.setWebViewClient(new WebViewClient() {
							@Override
							public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
									final String _url = _param2;
									//code
					if (swiperefreshlayout3.isEnabled()) {
						progressbar1.setVisibility(View.VISIBLE);
						edittext1.setText(webview3.getUrl());
						if (settings.getString("ytplayer", "").equals("1")) {
							if (webview3.getUrl().contains("m.youtube.com/watch")) {
								ytb.setClass(getApplicationContext(), YtplrbsheetActivity.class);
								startActivity(ytb);
								dialogytlink.edit().putString("link", webview3.getUrl()).commit();
								webview3.stopLoading();
								webview3.goBack();
							}
						}
						else {
							
						}
					}
					history.edit().putString("history", "[".concat(new SimpleDateFormat("hh:mm:ss").format(ei.getTime()).concat("]".concat("Tab 3:".concat(webview3.getUrl())))).concat("\n".concat(history.getString("history", "")))).commit();
					if (settings.getString("killnoconnection", "").equals("1")) {
						
					}
					else {
						webcheck.startRequestNetwork(RequestNetworkController.GET, webview3.getUrl(), "A", _webcheck_request_listener);
					}
					super.onPageStarted(_param1, _param2, _param3);
							}
							
							@Override
							public void onPageFinished(WebView _param1, String _param2) {
									final String _url = _param2;
					//code
					edittext1.setText(webview4.getTitle());
					urltext.setText(edittext1.getText().toString());
					if (webview1.getUrl().indexOf("https://") == 0) {
						imageview32.setImageResource(R.drawable.ic_check_white);
						imageview32.setColorFilter(0xFF4CAF50, PorterDuff.Mode.MULTIPLY);
					}
					else {
						if (webview1.getUrl().indexOf("file://") == 0) {
							imageview32.setImageResource(R.drawable.ic_fast_forward_white);
							imageview32.setColorFilter(0xFFFBC02D, PorterDuff.Mode.MULTIPLY);
						}
						else {
							imageview32.setImageResource(R.drawable.ic_error_white);
							imageview32.setColorFilter(0xFFF44336, PorterDuff.Mode.MULTIPLY);
						}
					}
					lastpage.edit().putString("lastpagetab3", webview3.getUrl()).commit();
					url.edit().putString("urltab3", webview3.getUrl()).commit();
					swiperefreshlayout3.setRefreshing(false);
					progressbar1.setVisibility(View.GONE);
					textview13.setText(webview3.getTitle());
					super.onPageFinished(_param1, _param2);
							}
					});
		}
		if (swiperefreshlayout4.isEnabled()) {
			webview4.setWebViewClient(new WebViewClient() {
							@Override
							public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
									final String _url = _param2;
									//code
					if (swiperefreshlayout4.isEnabled()) {
						progressbar1.setVisibility(View.VISIBLE);
						edittext1.setText(webview4.getUrl());
						if (settings.getString("ytplayer", "").equals("1")) {
							if (webview4.getUrl().contains("m.youtube.com/watch")) {
								ytb.setClass(getApplicationContext(), YtplrbsheetActivity.class);
								startActivity(ytb);
								dialogytlink.edit().putString("link", webview4.getUrl()).commit();
								webview4.stopLoading();
								webview4.goBack();
							}
						}
						else {
							
						}
					}
					history.edit().putString("history", "[".concat(new SimpleDateFormat("hh:mm:ss").format(ei.getTime()).concat("]".concat("Tab 4:".concat(webview4.getUrl())))).concat("\n".concat(history.getString("history", "")))).commit();
					if (settings.getString("killnoconnection", "").equals("1")) {
						
					}
					else {
						webcheck.startRequestNetwork(RequestNetworkController.GET, webview4.getUrl(), "A", _webcheck_request_listener);
					}
					super.onPageStarted(_param1, _param2, _param3);
							}
							
							@Override
							public void onPageFinished(WebView _param1, String _param2) {
									final String _url = _param2;
					//code
					edittext1.setText(webview3.getTitle());
					urltext.setText(edittext1.getText().toString());
					if (webview1.getUrl().indexOf("https://") == 0) {
						imageview32.setImageResource(R.drawable.ic_check_white);
						imageview32.setColorFilter(0xFF4CAF50, PorterDuff.Mode.MULTIPLY);
					}
					else {
						if (webview1.getUrl().indexOf("file://") == 0) {
							imageview32.setImageResource(R.drawable.ic_fast_forward_white);
							imageview32.setColorFilter(0xFFFBC02D, PorterDuff.Mode.MULTIPLY);
						}
						else {
							imageview32.setImageResource(R.drawable.ic_error_white);
							imageview32.setColorFilter(0xFFF44336, PorterDuff.Mode.MULTIPLY);
						}
					}
					lastpage.edit().putString("lastpagetab4", webview4.getUrl()).commit();
					url.edit().putString("urltab4", webview4.getUrl()).commit();
					swiperefreshlayout4.setRefreshing(false);
					progressbar1.setVisibility(View.GONE);
					textview13.setText(webview4.getTitle());
					super.onPageFinished(_param1, _param2);
							}
					});
		}
		if (settings.getString("pfp", "").equals("1")) {
			profile_picture.setVisibility(View.VISIBLE);
			if (settings.getString("tabletmode", "").equals("1")) {
				profile_picture.setVisibility(View.GONE);
			}
			else {
				profile_picture.setVisibility(View.VISIBLE);
			}
		}
		else {
			profile_picture.setVisibility(View.GONE);
		}
		profile_picture.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(pfp.getString("loc", ""), 1024, 1024));
		suggesturl.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				profile_picture.requestFocus();
				SketchwareUtil.hideKeyboard(getApplicationContext());
			}
		});
		imageview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (webview1.isEnabled()) {
					urltext.setText(webview1.getUrl());
				}
				else {
					if (webview2.isEnabled()) {
						urltext.setText(webview2.getUrl());
					}
					else {
						if (webview3.isEnabled()) {
							urltext.setText(webview3.getUrl());
						}
						else {
							if (webview4.isEnabled()) {
								urltext.setText(webview4.getUrl());
							}
							else {
								
							}
						}
					}
				}
			}
		});
		imagespinner.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				_Popup();
			} });
		imageview8.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				_loadurl();
			} });
		imageviewexpand.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				if (cardview1.isEnabled()) {
					cardview1.setVisibility(View.GONE);
					cardview1.setEnabled(false);
					cardview2.setVisibility(View.GONE);
					holdercard.setVisibility(View.GONE);
					if (settings.getString("darkmode", "").equals("1")) {
						imageviewexpand.setImageResource(R.drawable.ic_chevron_left_white);
					}
					else {
						imageviewexpand.setImageResource(R.drawable.ic_chevron_left_black);
					}
				}
				else {
					cardview1.setVisibility(View.VISIBLE);
					cardview1.setEnabled(true);
					cardview2.setVisibility(View.VISIBLE);
					holdercard.setVisibility(View.VISIBLE);
					if (settings.getString("darkmode", "").equals("1")) {
						imageviewexpand.setImageResource(R.drawable.ic_keyboard_arrow_right_white);
					}
					else {
						imageviewexpand.setImageResource(R.drawable.ic_keyboard_arrow_right_black);
					}
				}
			} });
		imageview32.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				if (swiperefreshlayout1.isEnabled()) {
					pdf.edit().putString("url", webview1.getUrl()).commit();
				}
				else {
					if (swiperefreshlayout2.isEnabled()) {
						pdf.edit().putString("url", webview2.getUrl()).commit();
					}
					else {
						if (swiperefreshlayout3.isEnabled()) {
							pdf.edit().putString("url", webview3.getUrl()).commit();
						}
						else {
							if (swiperefreshlayout4.isEnabled()) {
								pdf.edit().putString("url", webview4.getUrl()).commit();
							}
							else {
								
							}
						}
					}
				}
				spinnerdialog.setAction(Intent.ACTION_VIEW);
				spinnerdialog.setClass(getApplicationContext(), SeccheckActivity.class);
				startActivity(spinnerdialog);
			} });
		homebtn.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				if (settings.getString("homeurl", "").equals("")) {
					homepage.setTitle("You did not set a homepage yet!");
					homepage.setMessage("Go to the settings to set a homepage.");
					homepage.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							bzh.setClass(getApplicationContext(), SettingsActivity.class);
							startActivity(bzh);
						}
					});
					homepage.create().show();
				}
				else {
					if (swiperefreshlayout1.isEnabled()) {
						webview1.loadUrl(settings.getString("homeurl", ""));
					}
					else {
						if (swiperefreshlayout2.isEnabled()) {
							webview2.loadUrl(settings.getString("homeurl", ""));
						}
						else {
							if (swiperefreshlayout3.isEnabled()) {
								webview3.loadUrl(settings.getString("homeurl", ""));
							}
							else {
								if (swiperefreshlayout4.isEnabled()) {
									webview4.loadUrl(settings.getString("homeurl", ""));
								}
								else {
									
								}
							}
						}
					}
				}
			} });
		tabsbtn.setOnClickListener(new OnClickListener() { public void onClick(View view) {
				if (settings.getString("usenewtabs", "").equals("1")) {
					texttabholder.setText(webview1.getTitle());
					tabtitles.edit().putString("1title", texttabholder.getText().toString()).commit();
					tabtitles.edit().putString("1link", webview1.getUrl()).commit();
					texttabholder.setText(webview2.getTitle());
					tabtitles.edit().putString("2title", texttabholder.getText().toString()).commit();
					tabtitles.edit().putString("2link", webview2.getUrl()).commit();
					texttabholder.setText(webview3.getTitle());
					tabtitles.edit().putString("3title", texttabholder.getText().toString()).commit();
					tabtitles.edit().putString("3link", webview3.getUrl()).commit();
					texttabholder.setText(webview4.getTitle());
					tabtitles.edit().putString("4title", texttabholder.getText().toString()).commit();
					tabtitles.edit().putString("4link", webview4.getUrl()).commit();
					tabintent.setAction(Intent.ACTION_VIEW);
					tabintent.setClass(getApplicationContext(), OpentabsActivity.class);
					startActivity(tabintent);
					selectedtab.edit().putString("choose", "0").commit();
					_loaddtabsinvidually();
				}
				else {
					if (linear7.isEnabled()) {
						linear7.setVisibility(View.GONE);
						linear7.setEnabled(false);
					}
					else {
						linear7.setVisibility(View.VISIBLE);
						linear7.setEnabled(true);
					}
				}
			} });
		urltext.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String _charSeq = _param1.toString();
				edittext1.setText(urltext.getText().toString());
			}
			@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		EditText editText = (EditText)findViewById(R.id.urltext); editText.setOnEditorActionListener(new OnEditorActionListener() {
			@Override
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				boolean handled = false;
				if (actionId == EditorInfo.IME_ACTION_GO) {
					_loadurl();
					_hideSoftKeyboard(urltext);
					handled = true;
				}
				return handled;
			}
		});
	}
	
	
	public void _loaddtabsinvidually () {
		loaddtabs = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (selectedtab.getString("selectedtab", "").equals("1")) {
							swiperefreshlayout1.setVisibility(View.VISIBLE);
							swiperefreshlayout1.setEnabled(true);
							swiperefreshlayout2.setVisibility(View.GONE);
							swiperefreshlayout2.setEnabled(false);
							swiperefreshlayout3.setVisibility(View.GONE);
							swiperefreshlayout3.setEnabled(false);
							swiperefreshlayout4.setVisibility(View.GONE);
							swiperefreshlayout4.setEnabled(false);
							if (selectedtab.getString("choose", "").equals("1")) {
								loaddtabs.cancel();
							}
						}
						if (selectedtab.getString("selectedtab", "").equals("2")) {
							swiperefreshlayout1.setVisibility(View.GONE);
							swiperefreshlayout1.setEnabled(false);
							swiperefreshlayout2.setVisibility(View.VISIBLE);
							swiperefreshlayout2.setEnabled(true);
							swiperefreshlayout3.setVisibility(View.GONE);
							swiperefreshlayout3.setEnabled(false);
							swiperefreshlayout4.setVisibility(View.GONE);
							swiperefreshlayout4.setEnabled(false);
							if (selectedtab.getString("choose", "").equals("1")) {
								loaddtabs.cancel();
							}
						}
						if (selectedtab.getString("selectedtab", "").equals("3")) {
							swiperefreshlayout1.setVisibility(View.GONE);
							swiperefreshlayout1.setEnabled(false);
							swiperefreshlayout2.setVisibility(View.GONE);
							swiperefreshlayout2.setEnabled(false);
							swiperefreshlayout3.setVisibility(View.VISIBLE);
							swiperefreshlayout3.setEnabled(true);
							swiperefreshlayout4.setVisibility(View.GONE);
							swiperefreshlayout4.setEnabled(false);
							if (selectedtab.getString("choose", "").equals("1")) {
								loaddtabs.cancel();
							}
						}
						if (selectedtab.getString("selectedtab", "").equals("4")) {
							swiperefreshlayout1.setVisibility(View.GONE);
							swiperefreshlayout1.setEnabled(false);
							swiperefreshlayout2.setVisibility(View.GONE);
							swiperefreshlayout2.setEnabled(false);
							swiperefreshlayout3.setVisibility(View.GONE);
							swiperefreshlayout3.setEnabled(false);
							swiperefreshlayout4.setVisibility(View.VISIBLE);
							swiperefreshlayout4.setEnabled(true);
							if (selectedtab.getString("choose", "").equals("1")) {
								loaddtabs.cancel();
							}
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(loaddtabs, (int)(0), (int)(100));
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