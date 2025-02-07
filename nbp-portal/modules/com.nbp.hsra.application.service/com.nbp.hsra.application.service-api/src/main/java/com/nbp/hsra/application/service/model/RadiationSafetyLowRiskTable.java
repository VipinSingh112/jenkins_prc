/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_low_risk_safety&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyLowRisk
 * @generated
 */
public class RadiationSafetyLowRiskTable
	extends BaseTable<RadiationSafetyLowRiskTable> {

	public static final RadiationSafetyLowRiskTable INSTANCE =
		new RadiationSafetyLowRiskTable();

	public final Column<RadiationSafetyLowRiskTable, Long>
		radiationSafetyLowRiskId = createColumn(
			"radiationSafetyLowRiskId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<RadiationSafetyLowRiskTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String> appendixRsoName =
		createColumn(
			"appendixRsoName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String> appendixRsoTitle =
		createColumn(
			"appendixRsoTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String> appendixRsoTeleNo =
		createColumn(
			"appendixRsoTeleNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String> appendixRsoExt =
		createColumn(
			"appendixRsoExt", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String> appendixRsoFax =
		createColumn(
			"appendixRsoFax", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String> appendixRsoEmail =
		createColumn(
			"appendixRsoEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		appendixRsoDetails = createColumn(
			"appendixRsoDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		qualifiedAppendixName = createColumn(
			"qualifiedAppendixName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		qualifiedAppendixTitle = createColumn(
			"qualifiedAppendixTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		qualifiedAppendixTele = createColumn(
			"qualifiedAppendixTele", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		qualifiedAppendixExt = createColumn(
			"qualifiedAppendixExt", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		qualifiedAppendixFax = createColumn(
			"qualifiedAppendixFax", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		qualifiedAppendixEmail = createColumn(
			"qualifiedAppendixEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		qualifiedAppendixRegstNo = createColumn(
			"qualifiedAppendixRegstNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, Date>
		qualifiedAppendixDate = createColumn(
			"qualifiedAppendixDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		qualifiedAppendixDetails = createColumn(
			"qualifiedAppendixDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		monitoringExposure = createColumn(
			"monitoringExposure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String> recordSystem =
		createColumn(
			"recordSystem", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String> securityAccess =
		createColumn(
			"securityAccess", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		trainingInformation = createColumn(
			"trainingInformation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String> leakTesting =
		createColumn(
			"leakTesting", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		emergencyProcedures = createColumn(
			"emergencyProcedures", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, String>
		managementSourcesDis = createColumn(
			"managementSourcesDis", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationSafetyLowRiskTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private RadiationSafetyLowRiskTable() {
		super("nbp_hsra_low_risk_safety", RadiationSafetyLowRiskTable::new);
	}

}