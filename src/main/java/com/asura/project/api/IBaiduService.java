package com.asura.project.api;

import feign.RequestLine;

public interface IBaiduService {

    String URL_BAIDU = "https://www.baidu.com";

    @RequestLine("GET /")
    String checkBaidu();

}
