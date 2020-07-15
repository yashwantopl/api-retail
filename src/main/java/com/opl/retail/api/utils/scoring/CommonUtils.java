package com.opl.retail.api.utils.scoring;

import java.util.Collection;
import java.util.List;

public class CommonUtils {
	private CommonUtils(){}
	
	public static final String SOMETHING_WENT_WRONG = "Something went wrong";
	public static final String EXCEPTION = "Exception :: ";

	public static final Integer VALUE = 1;
	public static final Integer DROPDOWN = 2;
	public static final Integer FORMULA = 3;

	public final class CommonText
	{
		private CommonText(){
			// Do nothing because of X and Y.
		}
		public static final String NO_LIMIT = "NO LIMIT";
		public static final String NEGATIVE_ELIGIBLITY = "NEGATIVE ELIGIBLITY";
		public static final String NO_LOAN_OBLIGATION = "NO LOAN OBLIGATION";
		public static final String NO_DEBT = "NO DEBT";
		public static final String NO_EBITDA = "NO EBITDA";
		public static final String NO_TURNOVER = "NO TURNOVER";
		public static final String ONE_YEAR_ITR = "ONE_YEAR_ITR";
		public static final String NO_ATNW = "NO ATNW";
		public static final String CMR_SCORE = "No CMR";
		

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


	public static Double getPMTCalculationByLoanAmt(double roi, double tenure, double circularLoanAmount) {

		return ((roi) / (1 - Math.pow(1 + roi, - tenure)) * circularLoanAmount)*12;
	}
}