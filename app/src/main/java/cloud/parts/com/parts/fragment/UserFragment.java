package cloud.parts.com.parts.fragment;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cloud.parts.com.parts.R;
import java.util.concurrent.ExecutorService;

public class UserFragment extends Fragment implements OnClickListener {

	protected static final String TAG = "UserFragment";
	private TextView use_iremain, total_imoney, income_mouth, income_year,
			income_sum,income_rmb;
	private RelativeLayout income_totals, income_remains;
	private LinearLayout user_loading;
	private LinearLayout user_views;
	private String token;
	private ExecutorService userThreads=null;
	private View root;
	private int height;
	private int width;
	private float denstiy;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.i(TAG, "fragment onCreateView!");

			root = inflater.inflate(R.layout.user_fragment, container, false);

			return root;
	}


	@Override
	public void onResume() {
		super.onResume();

	}
	@Override
	public void onPause() {
		super.onPause();
//		MobclickAgent.onPageEnd(TAG);
	}
	@Override
	public void onDestroy() {
		if (userThreads != null)
			userThreads.shutdown();
		super.onDestroy();
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {

		default:
			break;
		}
	}
	}


