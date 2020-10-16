package com.lpy.modulea;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.komlin.libcommon.base.standard.BaseActivity;
import com.komlin.libcommon.arouter.RouteUtils;
import com.lpy.modulea.databinding.ModaActivityMainBinding;

/**
 * @author lipeiyong
 * @date 2020/9/30 9:48 AM
 */
@Route(path = RouteUtils.ModA_Activity_Main)
public class MainActivity extends BaseActivity<ModaActivityMainBinding> {
    @Override
    protected int getLayoutId() {
        return R.layout.moda_activity_main;
    }

    @Override
    public void init(Bundle savedInstanceState) {
        mBinding.btn1.setOnClickListener(v -> {
            ARouter.getInstance().build(RouteUtils.ModB_Activity_Main)
                    .withString("value", "X")
                    .navigation();
        });
        mBinding.btn2.setOnClickListener(v -> {
            ARouter.getInstance().build(RouteUtils.ModB_Activity_Main)
                    .withString("value", "Y")
                    .navigation();
        });
    }
}
