package org.lld.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String path;
    private List<FileSystem> children;
    public Directory(String path) {
        this.path = path;
        this.children = new ArrayList<>();
    }

    public void addChild(FileSystem child) {
        children.add(child);
    }

    @Override
    public void ls() {
        children.forEach(FileSystem::ls);
    }
}
