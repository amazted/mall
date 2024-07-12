package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class CmsHelpExample {

    // Fields
    private String orderByClause;
    private boolean distinct;
    private List<Criteria> oredCriteria;

    // Constructors
    public CmsHelpExample() {
        oredCriteria = new ArrayList<>();
    }

    // Methods for orderByClause
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    // Methods for distinct
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    // Methods for oredCriteria
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    // Clear method
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    // Private method to create Criteria
    private Criteria createCriteriaInternal() {
        return new Criteria();
    }

    // Criteria class
    public static class Criteria {
        private List<Criterion> criteria;

        protected Criteria() {
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

    // Criterion class
    public static class Criterion {
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
}
