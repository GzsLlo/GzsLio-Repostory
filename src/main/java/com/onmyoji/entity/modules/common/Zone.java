/**
 * Copyright 2018 lostyear Inc.
 **/

package com.onmyoji.entity.modules.common;

import java.io.Serializable;

/**
 * @author jiangchao
 * Created on 2018/3/30.
 */
public class Zone implements Serializable {

  private int zoneId;

  private int countryCode;

  private String countryName;

  private int provinceCode;

  private String provinceName;

  private int cityCode;

  private String cityName;

  public int getZoneId() {
    return zoneId;
  }

  public void setZoneId(int zoneId) {
    this.zoneId = zoneId;
  }

  public int getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(int countryCode) {
    this.countryCode = countryCode;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public int getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(int provinceCode) {
    this.provinceCode = provinceCode;
  }

  public String getProvinceName() {
    return provinceName;
  }

  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }

  public int getCityCode() {
    return cityCode;
  }

  public void setCityCode(int cityCode) {
    this.cityCode = cityCode;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public Zone(int zoneId, int countryCode, String countryName, int provinceCode,
              String provinceName, int cityCode, String cityName) {
    this.zoneId = zoneId;
    this.countryCode = countryCode;
    this.countryName = countryName;
    this.provinceCode = provinceCode;
    this.provinceName = provinceName;
    this.cityCode = cityCode;
    this.cityName = cityName;
  }

  public Zone() {
  }
}
