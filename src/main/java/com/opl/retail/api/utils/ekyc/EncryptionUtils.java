package com.opl.retail.api.utils.ekyc;

import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import java.util.Arrays;

@Convert
public class EncryptionUtils implements AttributeConverter<String, String> {
    private static final String ALGORITHM = "AES";
    private static final String CHAR_ENCODING = "UTF-8";
    private static final String KEY = "C@p!ta@W0rld#AES";
    public static final String EXCEPTION = " :: EXCEPTION : ";
    private static final Logger logger = LoggerFactory.getLogger(EncryptionUtils.class);


    public static boolean isObjectNullOrEmpty(Object value) {
        return (value == null
                || (value instanceof String
                ? (((String) value).isEmpty() || "".equals(((String) value).trim()) || "null".equals(value)
                || "undefined".equals(value))
                : false));
    }

    public String convertToDatabaseColumn(String plainText) {
        // do some encryption
        try {
            if (!isObjectNullOrEmpty(plainText)) {
                byte[] keyBytes = Arrays.copyOf(KEY.getBytes("ASCII"), 16);

                SecretKey key = new SecretKeySpec(keyBytes, ALGORITHM);
                Cipher cipher = Cipher.getInstance(ALGORITHM);
                cipher.init(Cipher.ENCRYPT_MODE, key);

                byte[] cleartext = plainText.getBytes(CHAR_ENCODING);
                byte[] ciphertextBytes = cipher.doFinal(cleartext);

                return new String(Hex.encodeHex(ciphertextBytes));
            }
        } catch (Exception e) {
            logger.error("error while encrypting data : " + plainText + EXCEPTION, e);
        }
        return null;
    }

    public String convertToEntityAttribute(String encryptedText) {
        // do some decryption
        try {
            if (!isObjectNullOrEmpty(encryptedText)) {
                byte[] keyBytes = Arrays.copyOf(KEY.getBytes("ASCII"), 16);

                SecretKey key = new SecretKeySpec(keyBytes, ALGORITHM);
                Cipher cipher = Cipher.getInstance(ALGORITHM);
                cipher.init(Cipher.DECRYPT_MODE, key);

                //byte[] ciphertextBytes = cipher.doFinal(cleartext);

                return new String(cipher.doFinal(Hex.decodeHex(encryptedText.toCharArray())));
            }
        } catch (Exception e) {
            logger.error("error while decrypting data : " + encryptedText + EXCEPTION, e);
        }
        return null;
    }
}
