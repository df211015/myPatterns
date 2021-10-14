package com.example.demo100.business;

import com.example.demo100.dto.Request;
import com.example.demo100.dto.Response;

public interface Filter {
    void doFilter(Request req, Response res);
}
