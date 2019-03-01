package com.xxm.toolbase.http.interceptor;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by xxm on 2017/5/10.
 */
public class BaseInterceptor implements Interceptor {
    private Map<String, String> headers;

    public BaseInterceptor(Map<String, String> headers) {
        this.headers = headers;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request()
                .newBuilder();
        if (headers != null && headers.size() > 0) {
            Set<String> keys = headers.keySet();
            for (String headerKey : keys) {
                builder.addHeader(headerKey, headers.get(headerKey)).build();
            }
        }
//        String token = SpHelper.getInstance(Utils.getContext()).getString(BaseConstants.SP_TOKEN, "");
//        if (!StringUtils.isEmpty(token)){
//            RetrofitClient.getInstance().getBaseHeaderInfo().setToken(token);
//            builder.addHeader("token", token).build();
//        }
//        builder.addHeader("x-client-event",RetrofitClient.getInstance().getBaseHeaderInfo().getJsonStr());
        //请求信息
        return chain.proceed(builder.build());
    }
}