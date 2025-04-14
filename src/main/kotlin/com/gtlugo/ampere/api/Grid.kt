package com.gtlugo.ampere.api;

class Grid {
  private val maxWattage: Double
    get() {
      TODO()
    }

  private val inUseWattage: Double
    get() {
      TODO()
    }

  fun register() {
    TODO()
  }

  fun isOverloaded(): Boolean {
    return this.maxWattage < this.inUseWattage;
  }
}
