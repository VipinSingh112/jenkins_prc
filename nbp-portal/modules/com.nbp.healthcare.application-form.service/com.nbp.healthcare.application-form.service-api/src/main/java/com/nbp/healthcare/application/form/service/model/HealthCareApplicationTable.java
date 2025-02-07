/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_healthcare_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplication
 * @generated
 */
public class HealthCareApplicationTable
	extends BaseTable<HealthCareApplicationTable> {

	public static final HealthCareApplicationTable INSTANCE =
		new HealthCareApplicationTable();

	public final Column<HealthCareApplicationTable, Long>
		healthCareApplicationId = createColumn(
			"healthCareApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<HealthCareApplicationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, String> healthCareFacility =
		createColumn(
			"healthCareFacility", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, String>
		healthCareRegistrationNum = createColumn(
			"healthCareRegistrationNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, String> icmDocumentPath =
		createColumn(
			"icmDocumentPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicationTable, String>
		appCurrentStageName = createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private HealthCareApplicationTable() {
		super("nbp_healthcare_application", HealthCareApplicationTable::new);
	}

}