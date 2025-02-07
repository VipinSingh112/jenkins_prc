/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_con_license&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicense
 * @generated
 */
public class CannabisConditionalLicenseTable
	extends BaseTable<CannabisConditionalLicenseTable> {

	public static final CannabisConditionalLicenseTable INSTANCE =
		new CannabisConditionalLicenseTable();

	public final Column<CannabisConditionalLicenseTable, Long>
		cannabisConditonalLicenseId = createColumn(
			"cannabisConditonalLicenseId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisConditionalLicenseTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, String> entityNumber =
		createColumn(
			"entityNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, String> entityName =
		createColumn(
			"entityName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, String> categoryTier =
		createColumn(
			"categoryTier", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, Integer>
		numberOfTheExtension = createColumn(
			"numberOfTheExtension", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, String>
		ListOfPreconditions = createColumn(
			"ListOfPreconditions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, String> payentAmtDue =
		createColumn(
			"payentAmtDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, Date> issueDate =
		createColumn(
			"issueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, Date> expirationDate =
		createColumn(
			"expirationDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, String>
		updatedBySource = createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisConditionalLicenseTable, Long>
		conditionalLicenseFileId = createColumn(
			"conditionalLicenseFileId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisConditionalLicenseTable() {
		super("nbp_cannabis_con_license", CannabisConditionalLicenseTable::new);
	}

}