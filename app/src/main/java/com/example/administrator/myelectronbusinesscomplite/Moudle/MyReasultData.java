package com.example.administrator.myelectronbusinesscomplite.Moudle;

import com.example.bean.JsonBean;

import java.util.List;

/**
 * Created by Administrator on 2018/4/10 0010.
 */

public interface MyReasultData {
    void success(List<JsonBean.TuijianBean.ListBean> li);
    void unsuccess();
}
