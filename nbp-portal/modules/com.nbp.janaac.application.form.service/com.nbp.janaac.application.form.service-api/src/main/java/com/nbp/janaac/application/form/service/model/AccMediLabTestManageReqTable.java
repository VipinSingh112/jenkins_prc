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
 * The table class for the &quot;nbp_janaac_acc_med_test_manage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestManageReq
 * @generated
 */
public class AccMediLabTestManageReqTable
	extends BaseTable<AccMediLabTestManageReqTable> {

	public static final AccMediLabTestManageReqTable INSTANCE =
		new AccMediLabTestManageReqTable();

	public final Column<AccMediLabTestManageReqTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, Long>
		accMediLabTestManageReqId = createColumn(
			"accMediLabTestManageReqId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccMediLabTestManageReqTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		policiesForFulfil = createColumn(
			"policiesForFulfil", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefPolicies = createColumn(
			"labDocRefPolicies", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		impartialityProvision = createColumn(
			"impartialityProvision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefImpartProv = createColumn(
			"labDocRefImpartProv", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		confidientialityProv = createColumn(
			"confidientialityProv", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> labDocRefConfid =
		createColumn(
			"labDocRefConfid", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		commitmentEvidence = createColumn(
			"commitmentEvidence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefCommitment = createColumn(
			"labDocRefCommitment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		referenceEvidence = createColumn(
			"referenceEvidence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefReference = createColumn(
			"labDocRefReference", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		docDescribingRole = createColumn(
			"docDescribingRole", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> labDocRefDocDes =
		createColumn(
			"labDocRefDocDes", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> rolesofPersonnel =
		createColumn(
			"rolesofPersonnel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> labDocRefRoles =
		createColumn(
			"labDocRefRoles", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> competenceReq =
		createColumn(
			"competenceReq", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefCompetence = createColumn(
			"labDocRefCompetence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		selectionOfPerson = createColumn(
			"selectionOfPerson", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefSelection = createColumn(
			"labDocRefSelection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> handlingEquip =
		createColumn(
			"handlingEquip", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefHandling = createColumn(
			"labDocRefHandling", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		calibrationProgram = createColumn(
			"calibrationProgram", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefCalibrat = createColumn(
			"labDocRefCalibrat", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> approvingReq =
		createColumn(
			"approvingReq", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefApproving = createColumn(
			"labDocRefApproving", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		monitorPerformance = createColumn(
			"monitorPerformance", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> labDocRefMonitor =
		createColumn(
			"labDocRefMonitor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> ensuringService =
		createColumn(
			"ensuringService", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefEnsuring = createColumn(
			"labDocRefEnsuring", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> reviewOfRequest =
		createColumn(
			"reviewOfRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> labDocRefRequest =
		createColumn(
			"labDocRefRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> procedureForLab =
		createColumn(
			"procedureForLab", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefProcedure = createColumn(
			"labDocRefProcedure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		testMethodValidat = createColumn(
			"testMethodValidat", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefTestMethod = createColumn(
			"labDocRefTestMethod", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> samplingPlan =
		createColumn(
			"samplingPlan", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefSampling = createColumn(
			"labDocRefSampling", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		transportationReciept = createColumn(
			"transportationReciept", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefTransport = createColumn(
			"labDocRefTransport", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		uncertainityMeasure = createColumn(
			"uncertainityMeasure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefUncertain = createColumn(
			"labDocRefUncertain", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		testResultValidity = createColumn(
			"testResultValidity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocReftestResult = createColumn(
			"labDocReftestResult", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> complaints =
		createColumn(
			"complaints", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefComplaints = createColumn(
			"labDocRefComplaints", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		nonConformingWork = createColumn(
			"nonConformingWork", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefNonConfirm = createColumn(
			"labDocRefNonConfirm", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		uniqueIdentification = createColumn(
			"uniqueIdentification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> labDocRefUnique =
		createColumn(
			"labDocRefUnique", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		currentRevisionStatus = createColumn(
			"currentRevisionStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefCurrentRev = createColumn(
			"labDocRefCurrentRev", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		docChangeIdentify = createColumn(
			"docChangeIdentify", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefDocChange = createColumn(
			"labDocRefDocChange", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> recordControl =
		createColumn(
			"recordControl", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefRecordControl = createColumn(
			"labDocRefRecordControl", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> plannedAction =
		createColumn(
			"plannedAction", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> labDocRefPlanned =
		createColumn(
			"labDocRefPlanned", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		imporvementOpportunity = createColumn(
			"imporvementOpportunity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefImprovement = createColumn(
			"labDocRefImprovement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> correctiveAction =
		createColumn(
			"correctiveAction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefCorrective = createColumn(
			"labDocRefCorrective", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> internalAudits =
		createColumn(
			"internalAudits", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefInternal = createColumn(
			"labDocRefInternal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String> managementReview =
		createColumn(
			"managementReview", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, String>
		labDocRefManagement = createColumn(
			"labDocRefManagement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabTestManageReqTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccMediLabTestManageReqTable() {
		super(
			"nbp_janaac_acc_med_test_manage",
			AccMediLabTestManageReqTable::new);
	}

}