package MemoryCompare;

import com.beust.jcommander.Parameter;

public class Args {
    @Parameter(
        names = "--file1",
        required = true
    )
    public String file1;

    @Parameter(
        names = "--file2",
        required = true
    )
    public String file2;

    @Parameter(
        names = "--value",
        required = true
    )
    public String value;
}