package com.dhanraj.humanerror.app;

import com.dhanraj.humanerror.service.ErrorAnalysisService;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.Files;

public class MainApp {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Serve HTML page
        server.createContext("/", exchange -> {
            File file = new File("web/index.html");
            byte[] response = Files.readAllBytes(file.toPath());
            exchange.sendResponseHeaders(200, response.length);
            exchange.getResponseBody().write(response);
            exchange.getResponseBody().close();
        });

        // API endpoint
        server.createContext("/simulate", exchange -> {
            String response = ErrorAnalysisService.simulateError();
            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(response.getBytes());
            exchange.getResponseBody().close();
        });

        server.start();
        System.out.println("✅ Open browser: http://localhost:8080");
    }
}
