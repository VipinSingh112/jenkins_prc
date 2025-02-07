create table nbp_insolv_com_security_tot (
	osiComSecurityTotalId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	comSecuritTotal VARCHAR(75) null,
	comAssetTotal VARCHAR(75) null,
	comSecuritTotalValue VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_not_used_security (
	notUsedSecurityId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	realProperty VARCHAR(75) null,
	notUsedLocation VARCHAR(500) null,
	notUsedDescription VARCHAR(500) null,
	notUsedCounter VARCHAR(75) null,
	notUsedValue VARCHAR(75) null,
	notNetValue VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_assessment_detail (
	assessmentDetailsId LONG not null primary key,
	groupId LONG,
	initialDateContact DATE null,
	personalName VARCHAR(75) null,
	personalAddress VARCHAR(500) null,
	personalEmail VARCHAR(75) null,
	personalTelNum VARCHAR(75) null,
	personalTrn VARCHAR(75) null,
	personalNis VARCHAR(75) null,
	personalDob DATE null,
	personalAge VARCHAR(75) null,
	personalMaritalStatus VARCHAR(75) null,
	personalDependents VARCHAR(75) null,
	personalOccupation VARCHAR(75) null,
	emergencyName VARCHAR(75) null,
	emergencyEmail VARCHAR(75) null,
	emergencyTelNum VARCHAR(75) null,
	emergencyAddress VARCHAR(500) null,
	emergencyEmployer VARCHAR(75) null,
	employerAddress VARCHAR(500) null,
	employerEmail VARCHAR(75) null,
	employerTelNum VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_comp_financial_pos (
	companyFinancialPositionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companySecured VARCHAR(75) null,
	companyUnsecured VARCHAR(75) null,
	companyAmount VARCHAR(75) null,
	companyDeficit VARCHAR(75) null,
	companyNetValue VARCHAR(75) null,
	companyAssetValue VARCHAR(75) null,
	companyDisposableAsset VARCHAR(75) null,
	companySurplus VARCHAR(75) null,
	companySummary VARCHAR(75) null,
	companyProposal VARCHAR(75) null,
	companyTrusteeResponse VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_company_details (
	companyDetailsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyDate DATE null,
	companyName VARCHAR(75) null,
	companyAddress VARCHAR(500) null,
	companyEmail VARCHAR(75) null,
	companyTelNum VARCHAR(75) null,
	companyTrn VARCHAR(75) null,
	companyDateInco DATE null,
	companyTypeOfCo VARCHAR(75) null,
	companyCore VARCHAR(75) null,
	companyEmployees VARCHAR(75) null,
	companyLastReturn DATE null,
	companyTurnover VARCHAR(75) null,
	companyShares VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_company_secretary (
	companySecretaryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	secretaryName VARCHAR(75) null,
	secretaryDate DATE null,
	secretaryOccupation VARCHAR(75) null,
	secretaryContactNum VARCHAR(75) null,
	secretaryAddress VARCHAR(500) null,
	secretaryCounter VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_directors_form (
	directorsFormId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	directorsName VARCHAR(75) null,
	directorsDateAppointed DATE null,
	directorsOccupation VARCHAR(75) null,
	directorsContactNum VARCHAR(75) null,
	directorsAddress VARCHAR(500) null,
	directorsCounter VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_financial_position (
	financialPositionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	securedLiabilities VARCHAR(75) null,
	unsecuredLiabilities VARCHAR(75) null,
	amountLiabilities VARCHAR(75) null,
	deficitLiabilities VARCHAR(75) null,
	assestsUsedAsSecurity VARCHAR(75) null,
	assestsNotUsedAsSecurity VARCHAR(75) null,
	assestsDisposable VARCHAR(75) null,
	assestsSurplus VARCHAR(75) null,
	assestsSummary VARCHAR(75) null,
	assestsProposal VARCHAR(75) null,
	assestsTrusteeResponse VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_grand_total (
	grandTotalId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	totalSecuredLiabilities VARCHAR(75) null,
	securedTotalMonthlyPayments VARCHAR(75) null,
	totalPreferredLiabilities VARCHAR(75) null,
	preferredTotalMonthlyPayments VARCHAR(75) null,
	totalUnsecuredLiabilities VARCHAR(75) null,
	unsecuredTotalMonthlyPayments VARCHAR(75) null,
	grandTotal VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_insolv_application (
	osiInsolvencyId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	entityId VARCHAR(75) null,
	applicantStatus VARCHAR(75) null,
	typeOfApplicant VARCHAR(75) null,
	subjectData VARCHAR(75) null,
	applicantIndividual VARCHAR(75) null,
	applicantCompany VARCHAR(75) null,
	realEstateBoard VARCHAR(75) null,
	caseId VARCHAR(500) null,
	status INTEGER,
	icmDocumentPath VARCHAR(500) null,
	applicationNumber VARCHAR(75) null,
	pdfFileEntryId LONG,
	appCurrentStageName VARCHAR(75) null
);

create table nbp_osi_insolv_current_stage (
	osiInsolvencyCurrentStageId LONG not null primary key,
	osiInsolvencyStageId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	currentStage VARCHAR(75) null,
	lastFormStage VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_insolv_payment (
	osiInsolvPaymentPlanId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	paymentMethod VARCHAR(75) null,
	amountPaid VARCHAR(75) null,
	paymentCurrencySelected VARCHAR(75) null,
	paymentMethodOther VARCHAR(75) null,
	paymentDocId VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_insolv_tot_assets (
	osiIndiTotalDetailOfAssetsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	totalValueOfAssetUsedSecu VARCHAR(75) null,
	totalValueOfAssetNotUsedSecu VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_insolv_tot_expense (
	osiTotalMonthlyExpenseId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	totalExpense VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_insolv_tot_liablity (
	osiComTotalLiabilityId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	totalLiability VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_insolv_total_liab (
	companyTotalLiabilityId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	comTotalLiability VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_insolvecy_app_payment (
	osiInsolveApplicationPaymentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	paymentMethod VARCHAR(75) null,
	paymentDocId VARCHAR(75) null,
	paymentStatus VARCHAR(75) null,
	paymentFee VARCHAR(75) null,
	amountPaid VARCHAR(75) null,
	amountCurrency VARCHAR(75) null,
	transactionNumber VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_insolvecy_asses_sign (
	osiAssessmentSignatureId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assessSignName VARCHAR(75) null,
	assessSignDate VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_insolvecy_det_asset (
	osiAssetDetailsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	totalAssetUsedAsSecurity VARCHAR(75) null,
	totalAssetNotUsedAsSec VARCHAR(75) null,
	totalValuesOfAsset VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_liability_detail (
	securedCreditorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	securedCreditorName VARCHAR(75) null,
	securedCreditorAsset VARCHAR(75) null,
	securedCreditorLiability VARCHAR(75) null,
	securedCreditorPayment VARCHAR(75) null,
	securedCreditorCounter VARCHAR(75) null,
	securedCreditorDate DATE null,
	osiInsolvencyId LONG
);

create table nbp_osi_monthly_expense (
	monthlyExpensesId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	typeOfExpense VARCHAR(75) null,
	lightExpense VARCHAR(75) null,
	cableExpense VARCHAR(75) null,
	waterExpense VARCHAR(75) null,
	expenseCounter VARCHAR(75) null,
	telephoneExpense VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_monthly_income (
	monthlyIncomeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	basicSalary VARCHAR(75) null,
	grossSalary VARCHAR(75) null,
	statutoryDeduction VARCHAR(75) null,
	otherDeductions VARCHAR(75) null,
	loanDeductions VARCHAR(75) null,
	totalDeductions VARCHAR(75) null,
	netSalary VARCHAR(75) null,
	otherIncome VARCHAR(75) null,
	incomeToCover VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_not_used_security (
	assetsNotUsedAsSecurityId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assetRealProp VARCHAR(75) null,
	assetNoValue VARCHAR(75) null,
	assetDescription VARCHAR(500) null,
	assetNoCounter VARCHAR(75) null,
	comTotalAssetNotUsedSecurity VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_preferred_detail (
	preferredCreditorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	preferredCreditorName VARCHAR(75) null,
	preferredCreditorLiability VARCHAR(75) null,
	preferredCreditorAmount VARCHAR(75) null,
	preferredCreditorPayment VARCHAR(75) null,
	preferredCreditorCounter VARCHAR(75) null,
	preferredCreditorDate DATE null,
	osiInsolvencyId LONG
);

create table nbp_osi_secured_creditor (
	companySecuredCreditorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	securedCreditor VARCHAR(75) null,
	securedSecurity VARCHAR(75) null,
	securedPurpose VARCHAR(75) null,
	securedLiabilty VARCHAR(75) null,
	comSecurityValue VARCHAR(75) null,
	comSecurityCounter VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_shareholder (
	shareholdersHoldingsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	shareholderName VARCHAR(75) null,
	shareholderDate DATE null,
	shareholderOccupation VARCHAR(75) null,
	shareholderShares VARCHAR(75) null,
	shareholderAddress VARCHAR(500) null,
	shareholderCounter VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_subject_data (
	subjectDataId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	verSubjectNameTitle VARCHAR(75) null,
	verSubjectFirstName VARCHAR(75) null,
	verSubjectMiddleName VARCHAR(75) null,
	verSubjectSurname VARCHAR(75) null,
	verSubjectDob DATE null,
	verPresentAddress VARCHAR(500) null,
	verPlaceOfBirth VARCHAR(500) null,
	verSubjectTrn VARCHAR(75) null,
	verSubjectTelNum VARCHAR(75) null,
	verSubjectEmail VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_total_indi_assets (
	osiIndiTotalDetailOfAssetsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	totalValueOfAssetUsedSecu VARCHAR(75) null,
	totalValueOfAssetNotUsedSecu VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_unsec_creditor (
	unsecuredCreditorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	unsecuredCreditorName VARCHAR(75) null,
	unsecuredCreditorDebt VARCHAR(75) null,
	unsecuredCreditorAmount VARCHAR(75) null,
	unsecuredCreditorPayment VARCHAR(75) null,
	unsecuredCreditorCounter VARCHAR(75) null,
	unsecuredCreditorDate DATE null,
	osiInsolvencyId LONG
);

create table nbp_osi_unsecured_cred (
	companyUnsecuredCreditorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	unsecuredCreditor VARCHAR(75) null,
	unsecuredDebtor VARCHAR(75) null,
	unsecuredPurpose VARCHAR(75) null,
	unsecuredLiabilty VARCHAR(75) null,
	unsecuredCounter VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_used_as_security (
	assetsUsedAsSecurityId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assetSecurity VARCHAR(75) null,
	assetSecurityHolder VARCHAR(75) null,
	assetDetails VARCHAR(75) null,
	assetValue VARCHAR(75) null,
	assetLiability VARCHAR(75) null,
	assetNetValue VARCHAR(75) null,
	assetCounter VARCHAR(75) null,
	comTotalAssetUsedSecurity VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_used_security (
	usedSecurityId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assetType VARCHAR(75) null,
	securityHolder VARCHAR(75) null,
	securityDetail VARCHAR(75) null,
	securityValue VARCHAR(75) null,
	securityLiability VARCHAR(75) null,
	securityNetValue VARCHAR(75) null,
	securityCounter VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_ver_company (
	verificationCompanyInfoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	verComName VARCHAR(75) null,
	verComTrn VARCHAR(75) null,
	osiInsolvencyId LONG
);

create table nbp_osi_ver_request_detail (
	requestorInformationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	verRequestorName VARCHAR(75) null,
	verRequestorLastName VARCHAR(75) null,
	verRequestorOccupation VARCHAR(75) null,
	verRequestorAddress VARCHAR(500) null,
	verDateOfRequest DATE null,
	verRequestorTelNum VARCHAR(75) null,
	verRequestorEmail VARCHAR(75) null,
	osiInsolvencyId LONG
);