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
 * The table class for the &quot;nbp_cannabis_license&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicense
 * @generated
 */
public class CannabisLicenseTable extends BaseTable<CannabisLicenseTable> {

	public static final CannabisLicenseTable INSTANCE =
		new CannabisLicenseTable();

	public final Column<CannabisLicenseTable, Long> cannabisLicenseId =
		createColumn(
			"cannabisLicenseId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CannabisLicenseTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> entityNumber =
		createColumn(
			"entityNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> entityName = createColumn(
		"entityName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> categoryTier =
		createColumn(
			"categoryTier", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> numberOfTheExtension =
		createColumn(
			"numberOfTheExtension", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> ListOfConditions =
		createColumn(
			"ListOfConditions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> payentAmtDue =
		createColumn(
			"payentAmtDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, Date> issueDate = createColumn(
		"issueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, Date> expirationDate =
		createColumn(
			"expirationDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, Long> cannabisApplicationId =
		createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> updatedBySource =
		createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> nameOfBPMStep =
		createColumn(
			"nameOfBPMStep", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String>
		licenseConditionsFulfilled = createColumn(
			"licenseConditionsFulfilled", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> dateFulfilled =
		createColumn(
			"dateFulfilled", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> feeOptionSelected =
		createColumn(
			"feeOptionSelected", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> feeAmount = createColumn(
		"feeAmount", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, Date> feePaidDate = createColumn(
		"feePaidDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> bpmUserNameRole =
		createColumn(
			"bpmUserNameRole", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> stageName = createColumn(
		"stageName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, String> licenseNumber =
		createColumn(
			"licenseNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicenseTable, Long> licenseFileId =
		createColumn(
			"licenseFileId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CannabisLicenseTable() {
		super("nbp_cannabis_license", CannabisLicenseTable::new);
	}

}