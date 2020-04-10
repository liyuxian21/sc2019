package com.xzsd.pc.store.entity;

public class ChinaVo {
    /**
     * 字典id
     */
    private String dictionariesId;
    /**
     * 字典名称
     */
    private String dictionariesName;
    /**
     * 父级编码
     */
    private String parentCode;

    public String getDictionariesId() {
        return dictionariesId;
    }

    public void setDictionariesId(String dictionariesId) {
        this.dictionariesId = dictionariesId;
    }

    public String getDictionariesName() {
        return dictionariesName;
    }

    public void setDictionariesName(String dictionariesName) {
        this.dictionariesName = dictionariesName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
}
