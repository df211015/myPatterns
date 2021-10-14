package com.example.demo100.business.impl;

import com.example.demo100.business.Filter;
import com.example.demo100.dto.Request;
import com.example.demo100.dto.Response;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<Filter>();

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request req, Response res) {
        for (Filter filter : filters) {
            filter.doFilter(req, res);
        }
    }
}