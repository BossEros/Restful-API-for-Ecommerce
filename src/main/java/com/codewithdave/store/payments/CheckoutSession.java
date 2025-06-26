package com.codewithdave.store.payments;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CheckoutSession {
    private String checkoutUrl;
}
