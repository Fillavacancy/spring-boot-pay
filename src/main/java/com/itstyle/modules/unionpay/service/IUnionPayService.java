package com.itstyle.modules.unionpay.service;

import java.util.Map;

import com.itstyle.common.model.Product;


public interface IUnionPayService {

    /**
     * 银联支付
     *
     * @param product
     * @return String
     * @Date 2017年8月2日 更新日志
     */
    String unionPay(Product product);

    /**
     * 前台回调验证
     *
     * @param valideData
     * @param encoding
     * @return String
     * @Date 2017年8月2日 更新日志
     */
    String validate(Map<String, String> valideData, String encoding);

    /**
     * 对账单下载
     *
     * @return void
     * @Date 2017年8月2日 更新日志
     */
    void fileTransfer();
}
