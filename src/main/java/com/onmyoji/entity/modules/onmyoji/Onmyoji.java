/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.entity.modules.onmyoji;

import com.onmyoji.entity.modules.guild.Guild;
import com.onmyoji.entity.modules.partition.Partition;

import java.io.Serializable;

/**
 * @author jiangchao
 * Created on 2018/3/30
 * 阴阳师实体类.
 */
public class Onmyoji implements Serializable {

  //基本信息
  private OnmyojiBaseInfo onmyojiBaseInfo;

  //现实信息
  private OnmyojiRealityInfo onmyojiRealityInfo;

  //游戏信息
  private OnmyojiGanmeInfo onmyojiGanmeInfo;

  //所属分区
  private Partition partition;

  //所属阴阳寮
  private Guild guild;


  public OnmyojiBaseInfo getOnmyojiBaseInfo() {
    return onmyojiBaseInfo;
  }

  public void setOnmyojiBaseInfo(OnmyojiBaseInfo onmyojiBaseInfo) {
    this.onmyojiBaseInfo = onmyojiBaseInfo;
  }

  public OnmyojiRealityInfo getOnmyojiRealityInfo() {
    return onmyojiRealityInfo;
  }

  public void setOnmyojiRealityInfo(OnmyojiRealityInfo onmyojiRealityInfo) {
    this.onmyojiRealityInfo = onmyojiRealityInfo;
  }

  public OnmyojiGanmeInfo getOnmyojiGanmeInfo() {
    return onmyojiGanmeInfo;
  }

  public void setOnmyojiGanmeInfo(OnmyojiGanmeInfo onmyojiGanmeInfo) {
    this.onmyojiGanmeInfo = onmyojiGanmeInfo;
  }

  public Partition getPartition() {
    return partition;
  }

  public void setPartition(Partition partition) {
    this.partition = partition;
  }

  public Guild getGuild() {
    return guild;
  }

  public void setGuild(Guild guild) {
    this.guild = guild;
  }

  public Onmyoji(OnmyojiBaseInfo onmyojiBaseInfo, OnmyojiRealityInfo onmyojiRealityInfo,
                 OnmyojiGanmeInfo onmyojiGanmeInfo, Partition partition, Guild guild) {
    this.onmyojiBaseInfo = onmyojiBaseInfo;
    this.onmyojiRealityInfo = onmyojiRealityInfo;
    this.onmyojiGanmeInfo = onmyojiGanmeInfo;
    this.partition = partition;
    this.guild = guild;
  }

  public Onmyoji() {
  }
}
