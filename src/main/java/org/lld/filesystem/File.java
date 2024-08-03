package org.lld.filesystem;

public class File implements FileSystem{

    private String fileName;

    @Override
    public void ls() {
        System.out.println(fileName);
    }
}
