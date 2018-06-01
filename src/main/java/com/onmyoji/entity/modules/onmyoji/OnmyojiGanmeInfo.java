/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.entity.modules.onmyoji;

import java.io.Serializable;

/**
 * @author jiangchao
 * Created on 2018/3/25
 * 游戏信息.
 */
public class OnmyojiGanmeInfo implements Serializable {

  //公会职位
  private int guildPosition;

  //斗技等级
  private int battleLevel;

  //勾玉
  private int magatama;

  //金币
  private int gold;

  //体力
  private int food;

  public int getGuildPosition() {
    return guildPosition;
  }

  public void setGuildPosition(int guildPosition) {
    this.guildPosition = guildPosition;
  }

  public int getBattleLevel() {
    return battleLevel;
  }

  public void setBattleLevel(int battleLevel) {
    this.battleLevel = battleLevel;
  }

  public int getMagatama() {
    return magatama;
  }

  public void setMagatama(int magatama) {
    this.magatama = magatama;
  }

  public int getGold() {
    return gold;
  }

  public void setGold(int gold) {
    this.gold = gold;
  }

  public int getFood() {
    return food;
  }

  public void setFood(int food) {
    this.food = food;
  }

  public OnmyojiGanmeInfo(int guildPosition, int battleLevel, int magatama, int gold, int food) {
    this.guildPosition = guildPosition;
    this.battleLevel = battleLevel;
    this.magatama = magatama;
    this.gold = gold;
    this.food = food;
  }

  public OnmyojiGanmeInfo() {
  }
}
