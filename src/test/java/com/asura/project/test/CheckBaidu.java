package com.asura.project.test;

import com.asura.project.api.IBaiduService;
import com.asura.project.utils.FeignUtil;
import org.junit.Test;

public class CheckBaidu {

    @Test
    public void checkBaidu() {
        String res = FeignUtil.getTarget(IBaiduService.class, IBaiduService.URL_BAIDU).checkBaidu();
        System.out.println(res);
    }

}
