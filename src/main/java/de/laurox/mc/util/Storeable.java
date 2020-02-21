package de.laurox.mc.util;

public interface Storeable {
    String toCSV();
    <T> T parseFromString();
}
