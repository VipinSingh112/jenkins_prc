/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_acc_cer_manage_2&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyMngReqTwo
 * @generated
 */
public class AccCerBodyMngReqTwoTable
	extends BaseTable<AccCerBodyMngReqTwoTable> {

	public static final AccCerBodyMngReqTwoTable INSTANCE =
		new AccCerBodyMngReqTwoTable();

	public final Column<AccCerBodyMngReqTwoTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, Long> accCerBodyMngReqTwoId =
		createColumn(
			"accCerBodyMngReqTwoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccCerBodyMngReqTwoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> optionFollow =
		createColumn(
			"optionFollow", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> certiAgreement =
		createColumn(
			"certiAgreement", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefCertiAgreement =
		createColumn(
			"qMRefCertiAgreement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> riskAssessment =
		createColumn(
			"riskAssessment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefRisk =
		createColumn(
			"qMRefRisk", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> confidentiality =
		createColumn(
			"confidentiality", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefConfidentiality =
		createColumn(
			"qMRefConfidentiality", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> security =
		createColumn(
			"security", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefSecurity =
		createColumn(
			"qMRefSecurity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> certificationScheme =
		createColumn(
			"certificationScheme", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefCertifiScheme =
		createColumn(
			"qMRefCertifiScheme", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> validCertification =
		createColumn(
			"validCertification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String>
		qMRefValidCertification = createColumn(
			"qMRefValidCertification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> preRequisites =
		createColumn(
			"preRequisites", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefPrerequisites =
		createColumn(
			"qMRefPrerequisites", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> infoProvided =
		createColumn(
			"infoProvided", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefInfoProvided =
		createColumn(
			"qMRefInfoProvided", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> handlingAppeals =
		createColumn(
			"handlingAppeals", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefHandlingAppeals =
		createColumn(
			"qMRefHandlingAppeals", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> handlingComplaints =
		createColumn(
			"handlingComplaints", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String>
		qMRefHandlingComplaint = createColumn(
			"qMRefHandlingComplaint", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> orgStructure =
		createColumn(
			"orgStructure", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefOrgStructure =
		createColumn(
			"qMRefOrgStructure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> formalRules =
		createColumn(
			"formalRules", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefFormalRules =
		createColumn(
			"qMRefFormalRules", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String>
		safeguardingMechanism = createColumn(
			"safeguardingMechanism", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefSafeguarding =
		createColumn(
			"qMRefSafeguarding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> managementProc =
		createColumn(
			"managementProc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefManagementProc =
		createColumn(
			"qMRefManagementProc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> contractExaminer =
		createColumn(
			"contractExaminer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefExaminer =
		createColumn(
			"qMRefExaminer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> contractBody =
		createColumn(
			"contractBody", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefContractBody =
		createColumn(
			"qMRefContractBody", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> docPolicies =
		createColumn(
			"docPolicies", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefDocPolicies =
		createColumn(
			"qMRefDocPolicies", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> specifiedStandard =
		createColumn(
			"specifiedStandard", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefSpecified =
		createColumn(
			"qMRefSpecified", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> applicationForm =
		createColumn(
			"applicationForm", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefAppliForm =
		createColumn(
			"qMRefAppliForm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> applicationReview =
		createColumn(
			"applicationReview", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefAppliReview =
		createColumn(
			"qMRefAppliReview", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> assessmentPlan =
		createColumn(
			"assessmentPlan", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefAssessmentPlan =
		createColumn(
			"qMRefAssessmentPlan", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> examinationProcess =
		createColumn(
			"examinationProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefExamProcess =
		createColumn(
			"qMRefExamProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String>
		certificationDecision = createColumn(
			"certificationDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefCertiDecision =
		createColumn(
			"qMRefCertiDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> certificationDoc =
		createColumn(
			"certificationDoc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefCertiDoc =
		createColumn(
			"qMRefCertiDoc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> useOfCertificates =
		createColumn(
			"useOfCertificates", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String>
		qMRefUseOfCertificate = createColumn(
			"qMRefUseOfCertificate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> suspension =
		createColumn(
			"suspension", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefSuspension =
		createColumn(
			"qMRefSuspension", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> processToReceive =
		createColumn(
			"processToReceive", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefReceiveProcess =
		createColumn(
			"qMRefReceiveProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> generalManage =
		createColumn(
			"generalManage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefGeneral =
		createColumn(
			"qMRefGeneral", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> docControl =
		createColumn(
			"docControl", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefDocControl =
		createColumn(
			"qMRefDocControl", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> recordControl =
		createColumn(
			"recordControl", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefRecControl =
		createColumn(
			"qMRefRecControl", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> manageReview =
		createColumn(
			"manageReview", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefManageReview =
		createColumn(
			"qMRefManageReview", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> internalAudit =
		createColumn(
			"internalAudit", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefInternal =
		createColumn(
			"qMRefInternal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> correctiveAction =
		createColumn(
			"correctiveAction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefCorrective =
		createColumn(
			"qMRefCorrective", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> preventiveAction =
		createColumn(
			"preventiveAction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefPreventive =
		createColumn(
			"qMRefPreventive", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> docInKeeping =
		createColumn(
			"docInKeeping", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, String> qMRefDocInKeeping =
		createColumn(
			"qMRefDocInKeeping", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyMngReqTwoTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccCerBodyMngReqTwoTable() {
		super("nbp_janaac_acc_cer_manage_2", AccCerBodyMngReqTwoTable::new);
	}

}