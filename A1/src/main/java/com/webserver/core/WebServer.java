package com.webserver.core;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    private ServerSocket serverSocket;

    public WebServer(){
        try {
            System.out.println("正在启动客户端.......");
            serverSocket = new ServerSocket(8808);
            System.out.println("客户端启动完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            System.out.println("等待客户链接......");
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端链接了！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        WebServer  server = new WebServer();
        server.start();
    }





}
