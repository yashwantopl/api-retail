package com.opl.retail.api.utils.bodmas;

import java.util.Collection;
import java.util.List;

public class CommonUtils {

    public static final String SOMETHING_WENT_WRONG = "Something went wrong";

    public static final String RND_CLIENT_BASE_URL = "rndClient.baseUrl";

    public static final String OPERAND = "+-/*()";
    public static final String POWER = "POWER";
    public static final String MAX = "MAX";
    public static final String MIN = "MIN";
    public static final String SQRT = "SQRT";
    public static final String CBRT = "CBRT";

    public final static class DataPoint {

        public static final String GST_GST1_IGST_TAX_15_2 = "GST>GST1>IGST>TAX>15>2";
        public static final String GST_GST1_CGST_TAX_20_0 = "GST>GST1>CGST>TAX>20>0";
        public static final String ITR_ITR4_NETSALE_CURRUNTYEAR = "ITR>ITR4>NETSALE>CURRUNTYEAR";
        public static final String ITR_ITR3_NETSALE_CURRUNTYEAR = "ITR>ITR3>NETSALE>CURRUNTYEAR";

    }

    public static final class DataPointMaster
    {
        private DataPointMaster()
        { // nothing to do.
        }
        public static final Integer GST = 1;
        public static final Integer ITR = 2;
        public static final Integer BANK_STATEMENT = 3;
        public static final Integer CIBIL_BUREAU = 4;
        public static final Integer CGTMSE = 5;
    }

    public static final class FormulaMainType
    {
        private FormulaMainType()
        { // nothing to do.
        }
        public static final Integer INDIVIDUAL = 1;
        public static final Integer FINAL = 2;
    }


    public static boolean isListNullOrEmpty(Collection<?> data) {
        return (data == null || data.isEmpty());
    }

    public static boolean isObjectListNull(Object... args) {
        for (Object object : args) {
            boolean flag = false;
            if (object instanceof List) {
                flag = isListNullOrEmpty((List)object);
                if(flag) return true;
                else continue;
            }
            flag = isObjectNullOrEmpty(object);
            if(flag) return true;
        }
        return false;
    }

    public static boolean isObjectNullOrEmpty(Object value) {
        return (value == null || (value instanceof String ? (((String) value).isEmpty()
                || "".equals(((String) value).trim()) || "null".equals(value) || "undefined".equals(value)) : false));
    }
}
