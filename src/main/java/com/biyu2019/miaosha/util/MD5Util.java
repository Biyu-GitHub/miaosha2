package com.biyu2019.miaosha.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 明文密码2次MD5入库
 */
public class MD5Util {
    private static final String salt = "1a2b3c4d";

    // 对明文字符串做一次MD5
    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    // MD5（String + 固定salt）
    public static String inputPassToFormPass(String inputPass) {
        String str = "" + salt.charAt(0) + salt.charAt(2) + inputPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    // MD5（String + 随机salt）
    public static String formPassToDBPass(String formPass, String salt) {
        String str = "" + salt.charAt(0) + salt.charAt(2) + formPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    // 调用上述2次MD5
    public static String inputPassToDbPass(String inputPass, String saltDB) {
        String formPass = inputPassToFormPass(inputPass);
        String dbPass = formPassToDBPass(formPass, saltDB);
        return dbPass;
    }

    public static void main(String[] args) {
		System.out.println(inputPassToDbPass("123456", "1a2b3c4d"));//b7797cce01b4b131b433b6acf4add449
    }

}
