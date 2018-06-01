/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.entity.modules.partition;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jiangchao
 * Created on 2018/3/25
 * 游戏分区信息实体类.
 */
public class Partition implements Serializable {

  //区号
  private int partitionId;

  //区名
  private String partitionName;

  //平台类型
  private int platformType;

  //工会数量
  private int guildNum;

  //阴阳师数量
  private int onmyojiNum;

  private Date createDate;

  public int getPartitionId() {
    return partitionId;
  }

  public void setPartitionId(int partitionId) {
    this.partitionId = partitionId;
  }

  public String getPartitionName() {
    return partitionName;
  }

  public void setPartitionName(String partitionName) {
    this.partitionName = partitionName;
  }

  public int getPlatformType() {
    return platformType;
  }

  public void setPlatformType(int platformType) {
    this.platformType = platformType;
  }

  public int getGuildNum() {
    return guildNum;
  }

  public void setGuildNum(int guildNum) {
    this.guildNum = guildNum;
  }

  public int getOnmyojiNum() {
    return onmyojiNum;
  }

  public void setOnmyojiNum(int onmyojiNum) {
    this.onmyojiNum = onmyojiNum;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public Partition(int partitionId, String partitionName, int platformType,
                   int guildNum, int onmyojiNum, Date createDate) {
    this.partitionId = partitionId;
    this.partitionName = partitionName;
    this.platformType = platformType;
    this.guildNum = guildNum;
    this.onmyojiNum = onmyojiNum;
    this.createDate = createDate;
  }

  public Partition() {
  }

}
