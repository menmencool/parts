package cloud.parts.com.parts.fragment;

import android.content.pm.ActivityInfo;
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


public class InquireFragment extends Fragment implements OnClickListener {
    private TextView include_title;
    private ImageView include_seek;
    private TextView include_new;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.inquinre_fragment, container,
                false);
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
        include_title.setText("配件查询");
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onClick(View v) {

    }


}
