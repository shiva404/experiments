package com.intuit.exp.types;

/***
 *
 */
public class TransactionsJob extends Job {

    private String attr5;
    private String attr6;
    private String attr7;
    private String attr8;

    public String getAttr5() {
        return attr5;
    }

    public void setAttr5(String attr5) {
        this.attr5 = attr5;
    }

    public String getAttr6() {
        return attr6;
    }

    public void setAttr6(String attr6) {
        this.attr6 = attr6;
    }

    public TransactionsJob() {
    }

    public TransactionsJob(String attr5, String attr6, String attr7, String attr8) {

        this.attr5 = attr5;
        this.attr6 = attr6;
        this.attr7 = attr7;
        this.attr8 = attr8;
    }

    public String getAttr7() {
        return attr7;

    }

    public void setAttr7(String attr7) {
        this.attr7 = attr7;
    }

    public String getAttr8() {
        return attr8;
    }

    public void setAttr8(String attr8) {
        this.attr8 = attr8;
    }
}
