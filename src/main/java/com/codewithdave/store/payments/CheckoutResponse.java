package com.codewithdave.store.payments;

import lombok.Data;

@Data
public class CheckoutResponse {
    private Long orderID;
    private String checkoutUrl;

    public CheckoutResponse(Long orderID, String checkoutUrl){
        this.orderID = orderID;
        this.checkoutUrl = checkoutUrl;
    }
}
