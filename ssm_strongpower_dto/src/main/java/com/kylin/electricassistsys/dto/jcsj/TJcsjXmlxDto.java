package com.kylin.electricassistsys.dto.jcsj;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
public class TJcsjXmlxDto  {


    private String tXmlxId;
    private String tXmlxName;
    private String tXmlxPx;
    private String tXmlxRemark;


    public String gettXmlxId() {
        return tXmlxId;
    }

    public void settXmlxId(String tXmlxId) {
        this.tXmlxId = tXmlxId;
    }

    public String gettXmlxName() {
        return tXmlxName;
    }

    public void settXmlxName(String tXmlxName) {
        this.tXmlxName = tXmlxName;
    }

    public String gettXmlxPx() {
        return tXmlxPx;
    }

    public void settXmlxPx(String tXmlxPx) {
        this.tXmlxPx = tXmlxPx;
    }

    public String gettXmlxRemark() {
        return tXmlxRemark;
    }

    public void settXmlxRemark(String tXmlxRemark) {
        this.tXmlxRemark = tXmlxRemark;
    }


    @Override
    public String toString() {
        return "TJcsjXmlx{" +
        "tXmlxId=" + tXmlxId +
        ", tXmlxName=" + tXmlxName +
        ", tXmlxPx=" + tXmlxPx +
        ", tXmlxRemark=" + tXmlxRemark +
        "}";
    }
}
