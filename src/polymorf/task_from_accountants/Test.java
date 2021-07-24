package polymorf.task_from_accountants;

import polymorf.task_from_accountants.tax_type.IncomeTaxType;
import polymorf.task_from_accountants.tax_type.ProgressiveTaxType;
import polymorf.task_from_accountants.tax_type.VATaxType;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("100000"), new VATaxType(), taxService),
                new Bill(new BigDecimal("130000"), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal("70000"), new IncomeTaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}