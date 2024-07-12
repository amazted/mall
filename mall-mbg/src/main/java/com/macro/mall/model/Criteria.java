package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

// Criteria class
public class Criteria {
    private List<Criterion> criteria;

    public Criteria() {
        criteria = new ArrayList<>();
    }

    public boolean isValid() {
        return criteria.size() > 0;
    }

    public List<Criterion> getAllCriteria() {
        return criteria;
    }

    // Methods for adding criteria
    public Criteria addCriterion(String condition) {
        if (condition == null) {
            throw new IllegalArgumentException("Value for condition cannot be null");
        }
        criteria.add(new Criterion(condition));
        return this;
    }

    public Criteria addCriterion(String condition, Object value, String property) {
        if (value == null) {
            throw new IllegalArgumentException("Value for " + property + " cannot be null");
        }
        criteria.add(new Criterion(condition, value));
        return this;
    }

    public Criteria addCriterion(String condition, Object value1, Object value2, String property) {
        if (value1 == null || value2 == null) {
            throw new IllegalArgumentException("Between values for " + property + " cannot be null");
        }
        criteria.add(new Criterion(condition));
        return this;
    }
}
