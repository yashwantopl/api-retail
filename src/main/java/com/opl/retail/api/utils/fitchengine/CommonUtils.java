package com.opl.retail.api.utils.fitchengine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CommonUtils {
	private CommonUtils(){
		// Do nothing because of X and Y.
	}
	
	public static final String IRR= "IRR";
	public static final String SOMETHING_WENT_WRONG = "Something went wrong";

	public static final class BusinessType{
		private BusinessType(){
			//Nothing to do
		}
		public static final Integer MANUFACTURING = 1;
		public static final Integer SERVICE = 2;
		public static final Integer TRADING = 3;
	}
	
	public static final class QualitativeInputType
	{
		private QualitativeInputType()
		{
			//Nothing to do
		}
		public static final class Manufacturing
			{
				private Manufacturing(){
					// nothing.
				}
			public static final Integer ACCOUNTING_QUALITY= 1;
			public static final Integer CONTINGENT_LIABILITIES_NET_WORTH  = 2;
			public static final Integer UNHEDGED_FOREIGN_CURRENCY_EXPOSURE = 3;
			public static final Integer FINANCIAL_RESTRUCTURING_HISTORY  = 4;
			public static final Integer CUSTOMER_QUALITY_AND_CONCENTRATION = 5;
			public static final Integer SUPPLIER_QUALITY_AND_CONCENTRATION = 6;
			public static final Integer ORDER_BOOK_POSITION_DEMAND = 7;
			public static final Integer INDUSTRIAL_EMPLOYEE_RELATIONS = 8;
			public static final Integer INTEGRITY  = 9;
			public static final Integer BUSINESS_COMMITMENT = 10;
			public static final Integer MANAGEMENT_COMPETENCE = 11;
			public static final Integer BUSINESS_EXPERIENCE = 12;
			public static final Integer SUCCESSION_PLANNING = 13;
			public static final Integer FINANCIALS_TRENGTH_GROUP_SUPPORT = 14;
			public static final Integer ABILITY_TO_RAISE_FUNDS = 15;
			public static final Integer INTRA_COMPANY_GROUP_CONFLICTS = 16;
			public static final Integer STATUS_OF_PROJECT_CLEARANCES = 17;
			public static final Integer STATUS_OF_FINANCIAL_CLOSURE = 18;
			public static final Integer PROJECTED_DEBT_SERVICE_COVERAGE_RATIO= 19;
			public static final Integer INTERNAL_RATE_OF_RETURN= 20;
			public static final Integer SENSITITIVITY_ANALYSIS= 21;
			public static final Integer INFRASTRUCTURE_AVAILABILITY = 22;
			public static final Integer CONSTRUCTION_CONTRACT  = 23;
			public static final Integer DESIGN_AND_TECHNOLOGY_RISK  = 24;
			public static final Integer NUMBER_OF_CHEQUES_BILLS_RETURNED = 25;
			public static final Integer NUMBER_OF_TIMES_DP_LIMIT_OVERDRAWN = 26;
			public static final Integer CUMULATIVE_NO_OF_DAYS_DP_LIMIT_OVERDRAWN  = 27;
			public static final Integer COMPLIANCE_WITH_SANCTIONED_DISBURSEMENT_CONDITIONS= 28;
			public static final Integer SUBMISSION_OF_PROGRESS_REPORTS = 29;
			public static final Integer DELAY_IN_RECEIPT_OF_PRINCIPAL_INTEREST_INSTALMENTS = 30;
			public static final Integer DELAY_IN_SUBMISSION_OF_AUDITED_BS_AND_PL_TO_THE_BA = 31;
			public static final Integer VARIANCE_IN_PROJECTED_SALES_VERSUS_ACTUAL_SALES = 32;
			public static final Integer NUMBER_OF_LC_BG_ISSUED_IN_FAVOR_OF_THE_BORROWER_IN= 33;
			
			public static final List<Integer> lookupPercentageList=new ArrayList<Integer>(
					Arrays.asList(LookupInputType.Manufacturing.ROCE_COMPUTATION,
							LookupInputType.Manufacturing.CARG_DE,
							LookupInputType.Manufacturing.SALES_GROWTH_LESS_THAN,
							LookupInputType.Manufacturing.SALES_GROWTH_BETWEEN,
							LookupInputType.Manufacturing.SALES_GROWTH_GREATER_THAN,
							LookupInputType.Manufacturing.CFO_MARGIN_TREND,
							LookupInputType.Manufacturing.INTER_GROUP_EXPLOSURE));
		}
		public static final class Service {
			private Service() {
				//nothing.
			}

			public static final Integer ACCOUNTING_QUALITY= 34;
			public static final Integer CONTINGENT_LIABILITIES_NET_WORTH  = 35;
			public static final Integer CUSTOMER_QUALITY_AND_CONCENTRATION = 36;
			public static final Integer SUPPLIER_QUALITY_AND_CONCENTRATION = 37;
			public static final Integer SUSTAINABILITY_PRODUCT_DEMAND = 38;
			public static final Integer PRODUCT_SEASONALITY = 39;
			public static final Integer IMPACT_ON_OPERATING_MARGINS = 40;
			public static final Integer ENVIRONMENTAL_IMPACT = 41;
			public static final Integer INTEGRITY  = 42;
			public static final Integer BUSINESS_COMMITMENT = 43;
			public static final Integer MANAGEMENT_COMPETENCE = 44;
			public static final Integer BUSINESS_EXPERIENCE = 45;
			public static final Integer SUCCESSION_PLANNING = 46;
			public static final Integer FINANCIAL_STRENGTH= 47;
			public static final Integer INTER_CONTROLL= 48;
			public static final Integer CREDIT_TRACK_RECORD= 49;
			public static final Integer NUMBER_OF_CHEQUES_BILLS_RETURNED = 50;
			public static final Integer NUMBER_OF_TIMES_DP_LIMIT_OVERDRAWN = 51;
			public static final Integer CUMULATIVE_NO_OF_DAYS_DP_LIMIT_OVERDRAWN  = 52;
			public static final Integer COMPLIANCE_WITH_SANCTIONED_DISBURSEMENT_CONDITIONS= 53;
			public static final Integer SUBMISSION_OF_PROGRESS_REPORTS = 54;
			public static final Integer DELAY_IN_RECEIPT_OF_PRINCIPAL_INTEREST_INSTALMENTS = 55;
			public static final Integer DELAY_IN_SUBMISSION_OF_AUDITED_BS_AND_PL_TO_THE_BA = 56;
			public static final Integer VARIANCE_IN_PROJECTED_SALES_VERSUS_ACTUAL_SALES = 57;
			public static final Integer NUMBER_OF_LC_BG_ISSUED_IN_FAVOR_OF_THE_BORROWER_IN= 58;


			public static final List<Integer> lookupPercentageList=new ArrayList<Integer>(
					Arrays.asList(LookupInputType.Service.EBITDA_NET_SALES,
							LookupInputType.Service.SALES_GROWTH,
							LookupInputType.Service.CHANGE_IN_NWC_EBITDA
						));
		}
		public static final class Trading{
				private Trading(){
					//nothing.
				}
			
			public static final Integer ACCOUNTING_QUALITY= 59;
			public static final Integer CONTINGENT_LIABILITIES_NET_WORTH  = 60;
			public static final Integer CUSTOMER_QUALITY_AND_CONCENTRATION = 61;
			public static final Integer SUPPLIER_QUALITY_AND_CONCENTRATION = 62;
			public static final Integer SUSTAINABILITY_PRODUCT_DEMAND = 63;
			public static final Integer PRODUCT_SEASONALITY = 64;
			public static final Integer IMPACT_ON_OPERATING_MARGINS = 65;
			public static final Integer ENVIRONMENTAL_IMPACT = 66;
			public static final Integer INTEGRITY  = 67;
			public static final Integer BUSINESS_COMMITMENT = 68;
			public static final Integer MANAGEMENT_COMPETENCE = 69;
			public static final Integer BUSINESS_EXPERIENCE = 70;
			public static final Integer SUCCESSION_PLANNING = 71;
			public static final Integer FINANCIAL_STRENGTH= 72;
			public static final Integer INTER_CONTROLL= 73;
			public static final Integer CREDIT_TRACK_RECORD= 74;
			public static final Integer NUMBER_OF_CHEQUES_BILLS_RETURNED = 75;
			public static final Integer NUMBER_OF_TIMES_DP_LIMIT_OVERDRAWN = 76;
			public static final Integer CUMULATIVE_NO_OF_DAYS_DP_LIMIT_OVERDRAWN  = 77;
			public static final Integer COMPLIANCE_WITH_SANCTIONED_DISBURSEMENT_CONDITIONS= 78;
			public static final Integer SUBMISSION_OF_PROGRESS_REPORTS = 79;
			public static final Integer DELAY_IN_RECEIPT_OF_PRINCIPAL_INTEREST_INSTALMENTS = 80;
			public static final Integer DELAY_IN_SUBMISSION_OF_AUDITED_BS_AND_PL_TO_THE_BA = 81;
			public static final Integer VARIANCE_IN_PROJECTED_SALES_VERSUS_ACTUAL_SALES = 82;
			public static final Integer NUMBER_OF_LC_BG_ISSUED_IN_FAVOR_OF_THE_BORROWER_IN= 83;
			
			public static final List<Integer> lookupPercentageList=new ArrayList<Integer>(
					Arrays.asList(LookupInputType.Trading.EBITDA_NET_SALES,
							LookupInputType.Trading.SALES_GROWTH,
							LookupInputType.Trading.CHANGE_IN_NWC_EBITDA
						));
		}
	}
	
	public static final class LookupInputType{
		private LookupInputType () {
			//nothing.

		}
		public static final class Manufacturing{
			private Manufacturing()
			{
				//nothing.
			}
			public static final Integer ROCE_COMPUTATION=1;
			public static final Integer CASH_INTEREST_COVERAGE=2;
			public static final Integer DEBT_EBITED=3;
			public static final Integer QUICK_RATIO=4;
			public static final Integer CARG_DE=5;
			public static final Integer SALES_GROWTH_LESS_THAN=6;
			public static final Integer SALES_GROWTH_BETWEEN=7;
			public static final Integer SALES_GROWTH_GREATER_THAN=8;
			public static final Integer FREE_RESERVES_EQUITY=9;
			public static final Integer CFO_MARGIN_TREND=10;
			public static final Integer INTER_GROUP_EXPLOSURE=11;
		}
		
		public static final class Service{
			private Service()
			{
				//nothing.
			}
			
			public static final Integer EBITDA_NET_SALES=12;
			public static final Integer INTEREST_COVERAGE=13;
			public static final Integer QUICK_RATIO=14;
			public static final Integer SALES_GROWTH=15;
			public static final Integer TOL_TNW = 16;
			public static final Integer CHANGE_IN_NWC_EBITDA=17;
		}
		
		public static final class Trading{
			private Trading(){
				// nothing.
			}

			public static final Integer EBITDA_NET_SALES=18;
			public static final Integer INTEREST_COVERAGE=19;
			public static final Integer QUICK_RATIO=20;
			public static final Integer SALES_GROWTH=21;
			public static final Integer TOL_TNW = 22;
			public static final Integer CHANGE_IN_NWC_EBITDA=23;
		}
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
