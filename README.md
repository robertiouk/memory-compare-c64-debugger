# memory-compare-c64-debugger
Compare byte value changes in C64 Debugger snapshots. Takes two .bin snapshots from the C64 Debugger tool, and a third byte value in hexadecimal as command line arguments.

If this value exists in one of the memory snapshots, but not both, it will list the memory locations, in hexadecimal.

## Usage
```--file1``` The first .bin C64 Debugger snapshot

```--file2``` The second .bin C64 Debugger snapshot

```--value``` The value (hex) that has changed between snapshots
