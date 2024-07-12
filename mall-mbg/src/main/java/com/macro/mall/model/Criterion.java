package com.macro.mall.model;

// Criterion class
public class Criterion {
    private String condition;
    private Object value;

    public Criterion(String condition) {
        this.condition = condition;
    }

    public Criterion(String condition, Object value) {
        this.condition = condition;
        this.value = value;
    }

    public String getCondition() {
        return condition;
    }

    public Object getValue() {
        return value;
    }
}
