/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.entity.modules.onmyoji;

import com.onmyoji.entity.modules.common.Zone;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jiangchao
 * Created on 2018/3/25
 * 阴阳师现世信息实体类.
 */
public class OnmyojiRealityInfo implements Serializable {

  //信息编号
  private int infoId;

  //实名制状态
  private int realNameStatus;

  //身份证编号
  private String idCard;

  //所属地区
  private Zone subordinateZone;

  //邮箱号
  private String email;

  //是否打开定位
  private int openPosition;

  //在线状态
  private int isOnline;

  //最后登陆时间
  private Date lastLoginTime;

  public int getInfoId() {
    return infoId;
  }

  public void setInfoId(int infoId) {
    this.infoId = infoId;
  }

  public int getRealNameStatus() {
    return realNameStatus;
  }

  public void setRealNameStatus(int realNameStatus) {
    this.realNameStatus = realNameStatus;
  }

  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  public Zone getSubordinateZone() {
    return subordinateZone;
  }

  public void setSubordinateZone(Zone subordinateZone) {
    this.subordinateZone = subordinateZone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getOpenPosition() {
    return openPosition;
  }

  public void setOpenPosition(int openPosition) {
    this.openPosition = openPosition;
  }

  public int getIsOnline() {
    return isOnline;
  }

  public void setIsOnline(int isOnline) {
    this.isOnline = isOnline;
  }

  public Date getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(Date lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }

  public OnmyojiRealityInfo(int infoId, int realNameStatus, String idCard, Zone subordinateZone,
                            String email, int openPosition, int isOnline, Date lastLoginTime) {
    this.infoId = infoId;
    this.realNameStatus = realNameStatus;
    this.idCard = idCard;
    this.subordinateZone = subordinateZone;
    this.email = email;
    this.openPosition = openPosition;
    this.isOnline = isOnline;
    this.lastLoginTime = lastLoginTime;
  }

  public OnmyojiRealityInfo() {
  }

}
