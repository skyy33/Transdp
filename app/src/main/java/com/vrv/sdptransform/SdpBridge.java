package com.vrv.sdptransform;

public class SdpBridge {
    static {

        System.loadLibrary("sdptransform-android");
    }

    public static native String parse( String sdp);

    public static native String parseParams(String params);

    public static native String parsePayloads( String payloads);

    public static native String parseImageAttributes( String params);

    public static native String parseSimulcastStreamList( String streams);

    public static native String write(String sdp);
}
