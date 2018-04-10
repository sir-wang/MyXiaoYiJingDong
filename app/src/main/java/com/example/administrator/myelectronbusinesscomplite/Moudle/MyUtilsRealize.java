package com.example.administrator.myelectronbusinesscomplite.Moudle;

import com.example.bean.JsonBean;
import com.example.util.Utils;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2018/4/10 0010.
 */

public class MyUtilsRealize implements MyUtilsData {
    //购物车数据
    private String url="https://www.zhaoapi.cn/ad/getAd";
    private MyReasultData myReasultData;

    public MyUtilsRealize(MyReasultData myReasultData) {
        this.myReasultData = myReasultData;
    }

    //private
    @Override
    public void utilsData() {
        Utils.doget(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                       myReasultData.unsuccess();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                Gson gson = new Gson();
                JsonBean jsonBean = gson.fromJson(string, JsonBean.class);
                List<JsonBean.TuijianBean.ListBean> list = jsonBean.getTuijian().getList();
                myReasultData.success(list);
            }
        });
    }
}
