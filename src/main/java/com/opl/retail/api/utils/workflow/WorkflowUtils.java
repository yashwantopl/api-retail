package com.opl.retail.api.utils.workflow;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class WorkflowUtils {

	public static final String USER_ID = "userId";
	public static final String USER_TYPE = "userType";
	public static final String INVALID_REQUEST = "Invalid Request !";
	public static final String SOMETHING_WENT_WRONG = "Something went wrong !";
	public static final String ELIGIBILITY_SERVICE_NOT_AVAILABLE = "Workflow Service is not available !";
	public static final String ENTITY_MANAGER_REFERENCE = "workflowDataStoreEM";
	public static final String TRANSACTION_MANAGER_REFERENCE = "workflowDataStoreTM";
	public static final String DATASTORE = "workflowDataStore";
	private static final String DATE_FORMATE = "dd-MM-yyyy";

	public static boolean isListNullOrEmpty(Collection<?> data) {
		return (data == null || data.isEmpty());
	}

	public static boolean isObjectNullOrEmpty(Object value) {
		return (value == null
				|| (value instanceof String
						? (((String) value).isEmpty() || "".equals(((String) value).trim())
								|| "null".equalsIgnoreCase((String) value) || "undefined".equals((String) value)
								|| "{}".equals((String) value) || "[]".equals((String) value))
						: false));
	}

	public static String formateDate(Date date) {
		if (date != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMATE);
			return dateFormat.format(date);
		} else {
			return null;
		}
	}

	public static String formateDate(Date date, String formate) {
		if (!isObjectNullOrEmpty(date)) {
			if (!isObjectNullOrEmpty(formate)) {
				SimpleDateFormat dateFormat = new SimpleDateFormat(formate);
				return dateFormat.format(date);
			}
			return formateDate(date);
		} else {
			return null;
		}
	}

	public static boolean isObjectListNull(Object... args) {
		for (Object object : args) {
			boolean flag = false;
			if (object instanceof List) {
				flag = isListNullOrEmpty((List<?>) object);
				if (flag)
					return true;
				else
					continue;
			}
			flag = isObjectNullOrEmpty(object);
			if (flag)
				return true;
		}
		return false;
	}

	public enum LoanType {
		WORKING_CAPITAL(1), TERM_LOAN(2), HOME_LOAN(3), CAR_LOAN(12), PERSONAL_LOAN(7), LAP_LOAN(13), LAS_LOAN(
				14), UNSECURED_LOAN(15);
		private int value;

		private LoanType(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public static LoanType getType(Integer x) {
			switch (x) {
			case 1:
				return WORKING_CAPITAL;
			case 2:
				return TERM_LOAN;
			case 3:
				return HOME_LOAN;
			case 12:
				return CAR_LOAN;
			case 7:
				return PERSONAL_LOAN;
			case 13:
				return LAP_LOAN;
			case 14:
				return LAS_LOAN;
			case 15:
				return UNSECURED_LOAN;
			}
			return null;
		}

	}

	public interface UserType {
		public static final int FUND_SEEKER = 1;
		public static final int FUND_PROVIDER = 2;
		public static final int SERVICE_PROVIDER = 3;
		public static final int NETWORK_PARTNER = 4;
	}

	public interface Action {
		public static final Long ASSIGN_TO_MAKER_ON_CREATE_PROCESS = 1l;
		public static final Long ASSIGN_TO_MAKER_ON_SAVE = 2l;
		public static final Long DDR_SUBMITTED_TO_CHECKER_ON_SUBMIT_TO_CHECKER = 3l;
		public static final Long DDR_SUBMITTED_TO_CHECKER_ON_SAVE = 4l;
		public static final Long DDR_SUBMITTED_TO_APPROVER_ON_SUBMIT_TO_APPROVE = 5l;
		public static final Long DDR_APPROVED_ON_APPROVE = 6l;
		public static final Long DDR_SEND_BACK_TO_CHECKER_ON_SEND_BACK = 7l;
		public static final Long PENDING = 16l;
	}

	public interface Workflow {
		public static final Long DDR = 1l;
		public static final Long BANK_PROCESS = 2l;
		public static final Long FP_SEND_REQUEST_PROCESS = 3l;
	}

	public interface Role {
		public static final Long MAKER = 1l;
		public static final Long CHECKER = 2l;
		public static final Long APPROVER = 3l;
	}
}
