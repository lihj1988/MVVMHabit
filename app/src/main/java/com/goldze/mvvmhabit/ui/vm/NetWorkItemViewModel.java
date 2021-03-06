package com.goldze.mvvmhabit.ui.vm;

import android.content.Context;
import android.os.Bundle;

import com.goldze.mvvmhabit.entity.DemoEntity;
import com.goldze.mvvmhabit.ui.fragment.DetailFragment;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import rx.functions.Action0;

/**
 * Created by goldze on 2017/7/17.
 */

public class NetWorkItemViewModel extends BaseViewModel {
    public DemoEntity.ItemsEntity entity;

    public NetWorkItemViewModel(Context context, DemoEntity.ItemsEntity entity) {
        super(context);
        this.entity = entity;
    }

    //条目的点击事件
    public BindingCommand itemClick = new BindingCommand(new Action0() {
        @Override
        public void call() {
            //跳转到详情界面,传入条目的实体对象
            Bundle mBundle = new Bundle();
            mBundle.putParcelable("entity", entity);
            startContainerActivity(DetailFragment.class.getCanonicalName(), mBundle);
        }
    });

}
