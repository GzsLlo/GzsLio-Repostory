/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.entity.modules.guild;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jiangchao
 * Created on 2018/3/25
 * 工会实体类.
 */
public class Guild implements Serializable {

  private int guildId;

  private String guildName;

  private int level;

  //资金
  private int capital;

  //阴阳师数量
  private int onmyojiNum;

  private Date createTime;

  public int getGuildId() {
    return guildId;
  }

  public void setGuildId(int guildId) {
    this.guildId = guildId;
  }

  public String getGuildName() {
    return guildName;
  }

  public void setGuildName(String guildName) {
    this.guildName = guildName;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getCapital() {
    return capital;
  }

  public void setCapital(int capital) {
    this.capital = capital;
  }

  public int getOnmyojiNum() {
    return onmyojiNum;
  }

  public void setOnmyojiNum(int onmyojiNum) {
    this.onmyojiNum = onmyojiNum;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Guild(int guildId, String guildName, int level, int capital, int onmyojiNum, Date createTime) {
    this.guildId = guildId;
    this.guildName = guildName;
    this.level = level;
    this.capital = capital;
    this.onmyojiNum = onmyojiNum;
    this.createTime = createTime;
  }

  public Guild() {
  }
}
