package com.onmyoji.entity.modules.onmyoji;

import java.io.Serializable;

public class User implements Serializable {

  int partitionId;

  String acctName;

  String cityCode;

  String acctType;

  public int getPartitionId() {
    return partitionId;
  }

  public void setPartitionId(int partitionId) {
    this.partitionId = partitionId;
  }

  public String getAcctName() {
    return acctName;
  }

  public void setAcctName(String acctName) {
    this.acctName = acctName;
  }

  public String getCityCode() {
    return cityCode;
  }

  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  public String getAcctType() {
    return acctType;
  }

  public void setAcctType(String acctType) {
    this.acctType = acctType;
  }

  public User(int partitionId, String acctName, String cityCode, String acctType) {
    this.partitionId = partitionId;
    this.acctName = acctName;
    this.cityCode = cityCode;
    this.acctType = acctType;
  }

  public User() {
  }
}
