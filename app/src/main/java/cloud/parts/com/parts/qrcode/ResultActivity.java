package cloud.parts.com.parts.qrcode;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orhanobut.logger.Logger;

import cloud.parts.com.parts.R;


public class ResultActivity extends Activity implements View.OnClickListener {


    private Button bt_login;
    private Button bt_cancel;
    private String uuid;
    private String tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initView();
        initData();
    }

    private void initData() {
        uuid  = getIntent().getStringExtra("result");
        Logger.e(uuid);
        Logger.e(tel);
    }

    private void initView() {
     /*   bt_login = (Button) findViewById(R.id.bt_login);
        bt_cancel = (Button) findViewById(R.id.bt_cancel);*/
        bt_login.setOnClickListener(this);
        bt_cancel.setOnClickListener(this);
    }

  /*  private void getResult(String uuid, String tel) {
        RetrofitUtil.getInstance().qrlogin(uuid, tel, new Observer<EvaluteBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(EvaluteBean value) {
                if (value.isStatus()) {
                    Logger.e(value.isStatus()+"");
                    ToastUtils.showToast(ResultActivity.this, "授权成功");
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                finish();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }).start();

                } else {
                    ToastUtils.showToast(ResultActivity.this, value.getErrorMsg());
                }
            }

            @Override
            public void onError(Throwable e) {
                Logger.e(e.toString()+"二维码--------------------------");
            }

            @Override
            public void onComplete() {


            }
        });
    }*/

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
          /*  case R.id.bt_login:
                getResult(uuid,tel);
                break;
            case R.id.bt_cancel:
                finish();
                break;*/
        }
    }
}