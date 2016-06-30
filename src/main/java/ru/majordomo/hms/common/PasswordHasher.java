package ru.majordomo.hms.common;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.nio.charset.Charset;

public class PasswordHasher {

    public static String hashForFtp(String plainPassword) {
        String hash;
        Charset charset = Charset.forName("UTF-8");
        HashFunction md5HashFunction = Hashing.md5();
        HashFunction sha1HashFunction = Hashing.sha1();

        hash = sha1HashFunction.hashString(plainPassword, charset).toString();
        hash = md5HashFunction.hashString(hash, charset).toString();
        hash = sha1HashFunction.hashString(hash, charset).toString();

        return hash;
    }
}