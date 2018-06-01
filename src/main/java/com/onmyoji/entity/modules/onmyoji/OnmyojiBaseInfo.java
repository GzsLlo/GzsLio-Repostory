/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.entity.modules.onmyoji;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jiangchao
 * Created on 2018/3/25
 * 阴阳师基本信息实体类.
 */
public class OnmyojiBaseInfo implements Serializable {

  private int onmyojiId;

  private String onmyojiName;

  private int nameCode;

  private String password;

  //等级
  private int level;

  //账号锁定状态
  private int playerLocked;

  //账号锁定时间
  private Date lockedTime;

  //解锁日期
  private Date unlockTime;

  private Date createTime;

  public int getOnmyojiId() {
    return onmyojiId;
  }

  public void setOnmyojiId(int onmyojiId) {
    this.onmyojiId = onmyojiId;
  }

  public String getOnmyojiName() {
    return onmyojiName;
  }

  public void setOnmyojiName(String onmyojiName) {
    this.onmyojiName = onmyojiName;
  }

  public int getNameCode() {
    return nameCode;
  }

  public void setNameCode(int nameCode) {
    this.nameCode = nameCode;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getPlayerLocked() {
    return playerLocked;
  }

  public void setPlayerLocked(int playerLocked) {
    this.playerLocked = playerLocked;
  }

  public Date getLockedTime() {
    return lockedTime;
  }

  public void setLockedTime(Date lockedTime) {
    this.lockedTime = lockedTime;
  }

  public Date getUnlockTime() {
    return unlockTime;
  }

  public void setUnlockTime(Date unlockTime) {
    this.unlockTime = unlockTime;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public OnmyojiBaseInfo(int onmyojiId, String onmyojiName, int nameCode, String password, int level,
                         int playerLocked, Date lockedTime, Date unlockTime, Date createTime) {
    this.onmyojiId = onmyojiId;
    this.onmyojiName = onmyojiName;
    this.nameCode = nameCode;
    this.password = password;
    this.level = level;
    this.playerLocked = playerLocked;
    this.lockedTime = lockedTime;
    this.unlockTime = unlockTime;
    this.createTime = createTime;
  }

  public OnmyojiBaseInfo() {
  }
}
