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
 * The table class for the &quot;nbp_janaac_acc_ins_body_manag&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesManageSys
 * @generated
 */
public class AccInsBodiesManageSysTable
	extends BaseTable<AccInsBodiesManageSysTable> {

	public static final AccInsBodiesManageSysTable INSTANCE =
		new AccInsBodiesManageSysTable();

	public final Column<AccInsBodiesManageSysTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, Long>
		accInsBodiesManageSysId = createColumn(
			"accInsBodiesManageSysId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccInsBodiesManageSysTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> optionFollow =
		createColumn(
			"optionFollow", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> manualApproval =
		createColumn(
			"manualApproval", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefManual =
		createColumn(
			"qMRefManual", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> relevantPolicies =
		createColumn(
			"relevantPolicies", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefRelevant =
		createColumn(
			"qMRefRelevant", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> overallObj =
		createColumn(
			"overallObj", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefOverallObj =
		createColumn(
			"qMRefOverallObj", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String>
		supportingProcedure = createColumn(
			"supportingProcedure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefSupporting =
		createColumn(
			"qMRefSupporting", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> technicalMangmnt =
		createColumn(
			"technicalMangmnt", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefTechnical =
		createColumn(
			"qMRefTechnical", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> documentation =
		createColumn(
			"documentation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefDocumentation =
		createColumn(
			"qMRefDocumentation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> docContolProc =
		createColumn(
			"docContolProc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefDocControl =
		createColumn(
			"qMRefDocControl", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> documntChanges =
		createColumn(
			"documntChanges", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String>
		qMRefDocumntChanges = createColumn(
			"qMRefDocumntChanges", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> controlOfQuality =
		createColumn(
			"controlOfQuality", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefControl =
		createColumn(
			"qMRefControl", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> managementReview =
		createColumn(
			"managementReview", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefManage =
		createColumn(
			"qMRefManage", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> insInternalAudits =
		createColumn(
			"insInternalAudits", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefInternalAudit =
		createColumn(
			"qMRefInternalAudit", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String>
		insCorrectiveAction = createColumn(
			"insCorrectiveAction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefCorrect =
		createColumn(
			"qMRefCorrect", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String>
		insPreventiveAction = createColumn(
			"insPreventiveAction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefPreventive =
		createColumn(
			"qMRefPreventive", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> personnel =
		createColumn(
			"personnel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefPersonnel =
		createColumn(
			"qMRefPersonnel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> equipment =
		createColumn(
			"equipment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefEquip =
		createColumn(
			"qMRefEquip", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> inspection =
		createColumn(
			"inspection", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefInspection =
		createColumn(
			"qMRefInspection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> contractualArrange =
		createColumn(
			"contractualArrange", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefContractual =
		createColumn(
			"qMRefContractual", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> handlingInsItem =
		createColumn(
			"handlingInsItem", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefHandling =
		createColumn(
			"qMRefHandling", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> complaintsAppeals =
		createColumn(
			"complaintsAppeals", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, String> qMRefComplaints =
		createColumn(
			"qMRefComplaints", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesManageSysTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccInsBodiesManageSysTable() {
		super("nbp_janaac_acc_ins_body_manag", AccInsBodiesManageSysTable::new);
	}

}