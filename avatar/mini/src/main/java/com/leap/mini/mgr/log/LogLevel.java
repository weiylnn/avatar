package com.leap.mini.mgr.log;

/**
 * Created by neil on 2017/4/15.
 */

public enum LogLevel {
  DEBUG(1), INFO(5), WARN(8), ERROR(10);

  public int point;

  private LogLevel(int point) {
    this.point = point;
  }
}
