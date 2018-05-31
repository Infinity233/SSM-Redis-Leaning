package com.Infinity.validator;

import com.Infinity.pojo.Transaction;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TransactionValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Transaction.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Transaction trans = (Transaction) o;

        double dis = trans.getAmount() - (trans.getPrice() * trans.getQuantity());

        if (Math.abs(dis) > 0.01) {
            errors.rejectValue("amount", null, "交易金额和购买数量与价格不匹配");
        }
    }
}
