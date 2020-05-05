package com.xyyima.downthemall.core.base;

/**
 * @author tonywang
 */
public interface Component {

    default String getName() {
        return this.getKey();
    }

    String getKey();

    default boolean isEnable() {
        return true;
    }
}
