package com.gtlugo.ampere.api;

public class Grid {
  private double max_wattage;
  private double in_use_wattage;

  public void register() {

  }

  public boolean is_overloaded() {
    return max_wattage < in_use_wattage;
  }
}

git update-index --chmod=+x gradlew
git add .
git commit -m "Changing permission of gradlew"
git push