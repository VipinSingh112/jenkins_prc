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
 * The table class for the &quot;nbp_janaac_acc_cer_manage&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyManageReq
 * @generated
 */
public class AccCerBodyManageReqTable
	extends BaseTable<AccCerBodyManageReqTable> {

	public static final AccCerBodyManageReqTable INSTANCE =
		new AccCerBodyManageReqTable();

	public final Column<AccCerBodyManageReqTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, Long> accCerBodyManageReqId =
		createColumn(
			"accCerBodyManageReqId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccCerBodyManageReqTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> optionFollow =
		createColumn(
			"optionFollow", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> impartialityPolicy =
		createColumn(
			"impartialityPolicy", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefImpartiality =
		createColumn(
			"qMRefImpartiality", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> riskAssessment =
		createColumn(
			"riskAssessment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefRisk =
		createColumn(
			"qMRefRisk", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> orgStructure =
		createColumn(
			"orgStructure", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefOrgStruct =
		createColumn(
			"qMRefOrgStruct", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> termsOfReference =
		createColumn(
			"termsOfReference", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefTerms =
		createColumn(
			"qMRefTerms", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> processForControl =
		createColumn(
			"processForControl", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefProcess =
		createColumn(
			"qMRefProcess", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> criteriaReq =
		createColumn(
			"criteriaReq", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefCriteria =
		createColumn(
			"qMRefCriteria", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> initialCompetence =
		createColumn(
			"initialCompetence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefInitial =
		createColumn(
			"qMRefInitial", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> selectingTraining =
		createColumn(
			"selectingTraining", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefSelecting =
		createColumn(
			"qMRefSelecting", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> monitoringCompetence =
		createColumn(
			"monitoringCompetence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefMonitoring =
		createColumn(
			"qMRefMonitoring", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> writtenAgreement =
		createColumn(
			"writtenAgreement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefWritten =
		createColumn(
			"qMRefWritten", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> descOfProcess =
		createColumn(
			"descOfProcess", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefDescProcess =
		createColumn(
			"qMRefDescProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> processForMonitor =
		createColumn(
			"processForMonitor", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefMonitorProcess =
		createColumn(
			"qMRefMonitorProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> auditProcess =
		createColumn(
			"auditProcess", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefAuditProcess =
		createColumn(
			"qMRefAuditProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> processGranting =
		createColumn(
			"processGranting", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefGranting =
		createColumn(
			"qMRefGranting", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> managemntSys =
		createColumn(
			"managemntSys", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefManagemnt =
		createColumn(
			"qMRefManagemnt", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> useOfCertification =
		createColumn(
			"useOfCertification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefUseOfCerti =
		createColumn(
			"qMRefUseOfCerti", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> handlingReq =
		createColumn(
			"handlingReq", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefHandling =
		createColumn(
			"qMRefHandling", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> impartialityPolicies =
		createColumn(
			"impartialityPolicies", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefImpartPolicy =
		createColumn(
			"qMRefImpartPolicy", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> provisionInform =
		createColumn(
			"provisionInform", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefProvision =
		createColumn(
			"qMRefProvision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> certificationDoc =
		createColumn(
			"certificationDoc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefCertification =
		createColumn(
			"qMRefCertification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> rulesGoverning =
		createColumn(
			"rulesGoverning", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefGoverning =
		createColumn(
			"qMRefGoverning", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String>
		enforcableArrangements = createColumn(
			"enforcableArrangements", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefEnforcable =
		createColumn(
			"qMRefEnforcable", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> ensureConfidential =
		createColumn(
			"ensureConfidential", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefEnsureConfid =
		createColumn(
			"qMRefEnsureConfid", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> informingMechanism =
		createColumn(
			"informingMechanism", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefInforming =
		createColumn(
			"qMRefInforming", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> applicationProcess =
		createColumn(
			"applicationProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefApplication =
		createColumn(
			"qMRefApplication", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> applicationReview =
		createColumn(
			"applicationReview", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefReview =
		createColumn(
			"qMRefReview", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> certificationCycle =
		createColumn(
			"certificationCycle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefCertiCycle =
		createColumn(
			"qMRefCertiCycle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> auditTime =
		createColumn(
			"auditTime", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefAuditTime =
		createColumn(
			"qMRefAuditTime", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> samplingProgram =
		createColumn(
			"samplingProgram", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefSampling =
		createColumn(
			"qMRefSampling", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> auditPlanning =
		createColumn(
			"auditPlanning", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefPlanning =
		createColumn(
			"qMRefPlanning", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> auditTeam =
		createColumn(
			"auditTeam", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefAuditTeam =
		createColumn(
			"qMRefAuditTeam", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> onSiteAudit =
		createColumn(
			"onSiteAudit", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefonSiteAudit =
		createColumn(
			"qMRefonSiteAudit", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> auditReport =
		createColumn(
			"auditReport", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefAuditReport =
		createColumn(
			"qMRefAuditReport", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> correctiveActions =
		createColumn(
			"correctiveActions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefCorrective =
		createColumn(
			"qMRefCorrective", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> reviewPriorDecision =
		createColumn(
			"reviewPriorDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefReviewPrior =
		createColumn(
			"qMRefReviewPrior", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String>
		transferCertification = createColumn(
			"transferCertification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefTransfer =
		createColumn(
			"qMRefTransfer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> suspensionPolicies =
		createColumn(
			"suspensionPolicies", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefSuspension =
		createColumn(
			"qMRefSuspension", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> suspensionProcedure =
		createColumn(
			"suspensionProcedure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefSuspensionProc =
		createColumn(
			"qMRefSuspensionProc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> decisionOnAppeals =
		createColumn(
			"decisionOnAppeals", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefDecision =
		createColumn(
			"qMRefDecision", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> handlingComplaints =
		createColumn(
			"handlingComplaints", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefComplaints =
		createColumn(
			"qMRefComplaints", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String>
		recordRetentionPolicy = createColumn(
			"recordRetentionPolicy", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefRetentionPolicy =
		createColumn(
			"qMRefRetentionPolicy", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> recordRetentionProc =
		createColumn(
			"recordRetentionProc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefRetentionProc =
		createColumn(
			"qMRefRetentionProc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> manageSysPolicies =
		createColumn(
			"manageSysPolicies", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefPolicies =
		createColumn(
			"qMRefPolicies", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> manageSysObjective =
		createColumn(
			"manageSysObjective", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefObjective =
		createColumn(
			"qMRefObjective", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> manageSysManual =
		createColumn(
			"manageSysManual", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefManual =
		createColumn(
			"qMRefManual", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> docControlProcedure =
		createColumn(
			"docControlProcedure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefDocControl =
		createColumn(
			"qMRefDocControl", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> recControlProc =
		createColumn(
			"recControlProc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefRecControl =
		createColumn(
			"qMRefRecControl", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> managementReview =
		createColumn(
			"managementReview", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefManagementRev =
		createColumn(
			"qMRefManagementRev", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> internalAudits =
		createColumn(
			"internalAudits", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefInternal =
		createColumn(
			"qMRefInternal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> identificationProc =
		createColumn(
			"identificationProc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefIdentification =
		createColumn(
			"qMRefIdentification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMSScopeB =
		createColumn(
			"qMSScopeB", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefQMSScopeB =
		createColumn(
			"qMRefQMSScopeB", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> designDevB =
		createColumn(
			"designDevB", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefDesignB =
		createColumn(
			"qMRefDesignB", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String>
		interestedPartyNeedsB = createColumn(
			"interestedPartyNeedsB", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> qMRefInterestedB =
		createColumn(
			"qMRefInterestedB", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String> managementReviewB =
		createColumn(
			"managementReviewB", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, String>
		qMRefmanagementReviewB = createColumn(
			"qMRefmanagementReviewB", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccCerBodyManageReqTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccCerBodyManageReqTable() {
		super("nbp_janaac_acc_cer_manage", AccCerBodyManageReqTable::new);
	}

}