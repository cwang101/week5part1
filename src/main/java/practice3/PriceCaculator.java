package practice3;

import java.math.BigDecimal;
import java.util.List;

public class PriceCaculator {

    public BigDecimal calculateGrandTotal(List<OrderLineItem> orderLineItemList, List<BigDecimal> discounts,BigDecimal tax){
        BigDecimal subTotal = new BigDecimal(0);

        // Total up line items
        for (OrderLineItem lineItem : orderLineItemList) {
            subTotal = subTotal.add(lineItem.getPrice());
        }

        // Subtract discounts
        for (BigDecimal discount : discounts) {
            subTotal = subTotal.subtract(discount);
        }

        // calculate tax
        BigDecimal taxTotal = subTotal.multiply(tax);

        // calculate GrandTotal
        BigDecimal grandTotal = subTotal.add(taxTotal);

        return grandTotal;
    }
}
