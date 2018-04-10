package com.example.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.myelectronbusinesscomplite.Moudle.MyReasultData;
import com.example.administrator.myelectronbusinesscomplite.Moudle.MyUtilsRealize;
import com.example.administrator.myelectronbusinesscomplite.R;
import com.example.bean.JsonBean;

import java.util.List;

/**
 * Created by Administrator on 2018/4/10 0010.
 */

public class Fragment3 extends Fragment implements MyReasultData{

    private View view;
    private RecyclerView shop_recyclerview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment3, container, false);

        //找控件
        init();

        return view;
    }
    //找控件
    public void init(){
        shop_recyclerview = view.findViewById(R.id.shop_recyclerview);
    }
    //接口回调显示购物车数据
    public void UtilsData(){
        MyUtilsRealize myUtilsRealize = new MyUtilsRealize((MyReasultData) getActivity());
        myUtilsRealize.utilsData();
    }

    @Override
    public void success(List<JsonBean.TuijianBean.ListBean> li) {
        /*List<JsonBean.>
        MyRecyclerAdapter mrvadapter=new MyRecyclerAdapter(getActivity(),li);
        shop_recyclerview.setAdapter();*/
    }

    @Override
    public void unsuccess() {

    }
}
