package net.cse485;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Objects;

public class Calculator {
    public BigDecimal left;
    public BigDecimal right;

    public Calculator() {
        left = new BigDecimal("0.0");
        right = new BigDecimal("0.0");
    }

    public Calculator(String leftIn, String rightIn) {
        left = new BigDecimal(leftIn);
        right = new BigDecimal(rightIn);
    }

    public Calculator(int leftIn, int rightIn) {
        left = new BigDecimal(leftIn);
        right = new BigDecimal(rightIn);
    }

    public String add() {
        BigDecimal operated = left.add(right);
        return operated.toString();
    }

    public String sub() {
        BigDecimal operated = left.subtract(right);
        return operated.toString();
    }

    public String mul() {
        BigDecimal operated = left.multiply(right);
        return operated.toString();
    }

    public String div() {
        if(Objects.equals(right.toString(), "0") || Objects.equals(right.toString(), "0.0")) {
            return "-1";
        }
        BigDecimal operated = left.divide(right, RoundingMode.HALF_UP);
        return operated.toString();
    }

    public String pow() {
        int exponent = right.intValue();

        BigDecimal operated = left.pow(exponent, MathContext.DECIMAL128);
        return operated.toString();
    }
}