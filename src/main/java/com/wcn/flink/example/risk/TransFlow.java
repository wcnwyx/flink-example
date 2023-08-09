package com.wcn.flink.example.risk;

public class TransFlow {
    private String orgId;
    private String merchantId;
    private String cardNo;
    private long amt;

    public TransFlow() {
    }

    public TransFlow(String orgId, String merchantId, String cardNo, long amt) {
        this.orgId = orgId;
        this.merchantId = merchantId;
        this.cardNo = cardNo;
        this.amt = amt;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public long getAmt() {
        return amt;
    }

    public void setAmt(long amt) {
        this.amt = amt;
    }

    @Override
    public String toString() {
        return "TransFlow{" +
                "orgId='" + orgId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", amt=" + amt +
                '}';
    }
}
