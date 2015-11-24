package com.intel.rs;

public enum Format
{
    ANY(0),
    Z16(1), // 16 bit linear depth values. The depth is meters is equal to depth scale * pixel value
    DISPARITY16(2), // 16 bit linear disparity values. The depth in meters is equal to depth scale / pixel value
    YUYV(3),
    RGB8(4),
    BGR8(5),
    RGBA8(6),
    BGRA8(7),
    Y8(8),
    Y16(9),
    RAW10(10); // Four 10-bit luminance values encoded into a 5-byte macropixel
    public final int code;
    private Format(int code) { this.code = code; }
}