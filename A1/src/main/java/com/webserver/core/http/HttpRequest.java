package com.webserver.core.http;

import java.util.Map;
import java.util.HashMap;
import java.net.Socket;


public class HttpRequest {
    private String method;
    private String uri;
    private String protocol;
    private String requestURL;
    private String queryString;
    private Map<String,String> parameters = new HashMap<>();
    private Map<String,String> headers = new HashMap<>();
    private Socket socket;

    public HttpRequest(Socket socket){
        this.socket = socket;
    }
    private void parseRequestLine(){
        System.out.println("HttpRequest:解析请求行......");


    }


}
