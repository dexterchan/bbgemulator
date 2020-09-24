package com.bloomberglp.blpapi;

import java.io.ByteArrayInputStream;

public class TlsOptions {
    public static TlsOptions createFromBlobs(byte[] var0, char[] var1, byte[] var2) throws TlsOptions.TlsInitializationException {

        return new TlsOptions();
    }


    public static class TlsInitializationException extends Exception {
        TlsInitializationException(String var1, Throwable var2) {
            super("Failed to initialize TLS: " + var1, var2);
        }

        TlsInitializationException(String var1) {
            super(var1);
        }
    }
}
