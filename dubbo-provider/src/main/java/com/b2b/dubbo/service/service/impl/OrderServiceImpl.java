package com.b2b.dubbo.service.service.impl;

import com.b2b.dubbo.rpc.OrderService;
/**
 * @author Jin Haojie
 * @date 17-3-21
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public String get(String msg) {
        return msg;
    }
}
