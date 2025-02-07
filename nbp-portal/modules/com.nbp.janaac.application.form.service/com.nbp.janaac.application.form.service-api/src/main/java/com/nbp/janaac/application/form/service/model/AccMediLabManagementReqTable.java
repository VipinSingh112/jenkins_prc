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
 * The table class for the &quot;nbp_janaac_acc_med_manage_req&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabManagementReq
 * @generated
 */
public class AccMediLabManagementReqTable
	extends BaseTable<AccMediLabManagementReqTable> {

	public static final AccMediLabManagementReqTable INSTANCE =
		new AccMediLabManagementReqTable();

	public final Column<AccMediLabManagementReqTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, Long>
		accMediLabManagementReqId = createColumn(
			"accMediLabManagementReqId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccMediLabManagementReqTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		managementEstablished = createColumn(
			"managementEstablished", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> qMRefManagement =
		createColumn(
			"qMRefManagement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> personAware =
		createColumn(
			"personAware", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> qMRefPerson =
		createColumn(
			"qMRefPerson", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		policiesAcknowledged = createColumn(
			"policiesAcknowledged", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> qMRefPolicies =
		createColumn(
			"qMRefPolicies", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		controlledDocument = createColumn(
			"controlledDocument", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> qMRefControlDoc =
		createColumn(
			"qMRefControlDoc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		laboratoryEstablished = createColumn(
			"laboratoryEstablished", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> qMReflabEstab =
		createColumn(
			"qMReflabEstab", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> identifiedRisks =
		createColumn(
			"identifiedRisks", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> qMRefRisks =
		createColumn(
			"qMRefRisks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> havePersonnel =
		createColumn(
			"havePersonnel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> qMRefPersonnel =
		createColumn(
			"qMRefPersonnel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		authorizePersonnel = createColumn(
			"authorizePersonnel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> qMRefAuthorize =
		createColumn(
			"qMRefAuthorize", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		labControlDocsFulfilment = createColumn(
			"labControlDocsFulfilment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> otherRefFulfil =
		createColumn(
			"otherRefFulfil", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		legibleRecordsFulfil = createColumn(
			"legibleRecordsFulfil", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		otherRefLegibleRec = createColumn(
			"otherRefLegibleRec", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		proceduresInPlace = createColumn(
			"proceduresInPlace", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		otherRefProcedure = createColumn(
			"otherRefProcedure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		communicatedRequirement = createColumn(
			"communicatedRequirement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		otherRefRequirement = createColumn(
			"otherRefRequirement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		procedureForSelection = createColumn(
			"procedureForSelection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		otherRefSelection = createColumn(
			"otherRefSelection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		arrangementInPlace = createColumn(
			"arrangementInPlace", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> otherRefArrange =
		createColumn(
			"otherRefArrange", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> processInPlace =
		createColumn(
			"processInPlace", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> otherRefProcess =
		createColumn(
			"otherRefProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		labOperateProgramme = createColumn(
			"labOperateProgramme", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		otherRefLabOperate = createColumn(
			"otherRefLabOperate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		identifyOpportunities = createColumn(
			"identifyOpportunities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		otherRefOpportunity = createColumn(
			"otherRefOpportunity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		demonstrateFulfilment = createColumn(
			"demonstrateFulfilment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		otherRefDemonstrate = createColumn(
			"otherRefDemonstrate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> ensureLabPlan =
		createColumn(
			"ensureLabPlan", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		otherRefEnsurePlan = createColumn(
			"otherRefEnsurePlan", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		plannedManageReview = createColumn(
			"plannedManageReview", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> otherRefPlanned =
		createColumn(
			"otherRefPlanned", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		availablePersonnel = createColumn(
			"availablePersonnel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefAvailable = createColumn(
			"manualRefAvailable", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		educationProgramme = createColumn(
			"educationProgramme", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefEducation = createColumn(
			"manualRefEducation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		ensureAccomodation = createColumn(
			"ensureAccomodation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> manualRefAccom =
		createColumn(
			"manualRefAccom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		processForSelection = createColumn(
			"processForSelection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefSelection = createColumn(
			"manualRefSelection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> verifyReagents =
		createColumn(
			"verifyReagents", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefReagents = createColumn(
			"manualRefReagents", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> docProcedure =
		createColumn(
			"docProcedure", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefDocProce = createColumn(
			"manualRefDocProce", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> useExamMethods =
		createColumn(
			"useExamMethods", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> manualRefExam =
		createColumn(
			"manualRefExam", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		monitoringValidity = createColumn(
			"monitoringValidity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefValidity = createColumn(
			"manualRefValidity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> validateExam =
		createColumn(
			"validateExam", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefValidateExam = createColumn(
			"manualRefValidateExam", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		uncertainityReview = createColumn(
			"uncertainityReview", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefUncertainity = createColumn(
			"manualRefUncertainity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		preventResRelease = createColumn(
			"preventResRelease", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> manualRefPrevent =
		createColumn(
			"manualRefPrevent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		equipmentMaintenance = createColumn(
			"equipmentMaintenance", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefMaintenance = createColumn(
			"manualRefMaintenance", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String> equipCalibration =
		createColumn(
			"equipCalibration", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefCalibrat = createColumn(
			"manualRefCalibrat", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		proficencyTesting = createColumn(
			"proficencyTesting", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefProfiTest = createColumn(
			"manualRefProfiTest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		postExamReliabilty = createColumn(
			"postExamReliabilty", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefPostExam = createColumn(
			"manualRefPostExam", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		reportedAccurately = createColumn(
			"reportedAccurately", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefReported = createColumn(
			"manualRefReported", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		responsiblitySpecified = createColumn(
			"responsiblitySpecified", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefSpecified = createColumn(
			"manualRefSpecified", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		ensureAuthorities = createColumn(
			"ensureAuthorities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, String>
		manualRefAuthorities = createColumn(
			"manualRefAuthorities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabManagementReqTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccMediLabManagementReqTable() {
		super(
			"nbp_janaac_acc_med_manage_req", AccMediLabManagementReqTable::new);
	}

}