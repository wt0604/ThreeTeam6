package com.jk.pojo;


public class Account {
    private  Integer cwid;
    private double jinprice;
    private double goodsprice;
    private String goodsname;
    private double profit;
    private String cwdate;
    private String username;
    private String membernum;
    private int echa;

    public Integer getCwid() {
        return cwid;
    }

    public void setCwid(Integer cwid) {
        this.cwid = cwid;
    }

    public double getJinprice() {
        return jinprice;
    }

    public void setJinprice(double jinprice) {
        this.jinprice = jinprice;
    }

    public double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public String getCwdate() {
        return cwdate;
    }

    public void setCwdate(String cwdate) {
        this.cwdate = cwdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMembernum() {
        return membernum;
    }

    public void setMembernum(String membernum) {
        this.membernum = membernum;
    }

    public int getEcha() {
        return echa;
    }

    public void setEcha(int echa) {
        this.echa = echa;
    }
}
