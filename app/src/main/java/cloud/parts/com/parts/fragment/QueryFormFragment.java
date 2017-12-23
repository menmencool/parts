package cloud.parts.com.parts.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import cloud.parts.com.parts.R;


public class QueryFormFragment extends Fragment implements OnClickListener {
	private TextView include_title;
	private ImageView include_seek;
	private TextView include_new;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.queryform_chart, container, false);
		initView(rootView);
		return rootView;
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

	}


	private void initView(View rootView) {
		include_title = (TextView) rootView.findViewById(R.id.include_title);
		include_title.setVisibility(View.VISIBLE);
		include_title.setText("我的询价单");
		include_seek = (ImageView) rootView.findViewById(R.id.include_seek);
		include_new = (TextView) rootView.findViewById(R.id.include_new);
		include_new.setVisibility(View.VISIBLE);
		include_new.setText("新建");
		include_seek.setVisibility(View.VISIBLE);
		include_seek.setImageResource(R.drawable.newpricelist3x);
	}
	@Override
	public void onResume() {
		super.onResume();
	}
	@Override
	public void onPause() {
		super.onPause();
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {

		default:
			break;
		}
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
	}

}