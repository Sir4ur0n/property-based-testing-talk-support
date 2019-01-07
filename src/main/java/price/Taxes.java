package price;

import static java.math.RoundingMode.UNNECESSARY;

import java.math.BigDecimal;

class Taxes {

  private static final BigDecimal VAT = BigDecimal.valueOf(1.2);

  Price addTaxes(Price priceWithoutTaxes) {
    return priceWithoutTaxes.withMappedValue(value -> value.multiply(VAT));
  }

  Price removeTaxes(Price priceWithTaxes) {
    return priceWithTaxes.withMappedValue(value -> value.divide(VAT, UNNECESSARY));
  }

}
