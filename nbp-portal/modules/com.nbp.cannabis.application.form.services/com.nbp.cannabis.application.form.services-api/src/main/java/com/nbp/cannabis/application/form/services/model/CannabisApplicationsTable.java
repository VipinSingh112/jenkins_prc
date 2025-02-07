/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_applications&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplications
 * @generated
 */
public class CannabisApplicationsTable
	extends BaseTable<CannabisApplicationsTable> {

	public static final CannabisApplicationsTable INSTANCE =
		new CannabisApplicationsTable();

	public final Column<CannabisApplicationsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, Long> cannabisApplicationId =
		createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisApplicationsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> requestType =
		createColumn(
			"requestType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> licenseCategory =
		createColumn(
			"licenseCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> licenseSubCategory =
		createColumn(
			"licenseSubCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> typeOfEntity =
		createColumn(
			"typeOfEntity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> expiredLicenseAppNo =
		createColumn(
			"expiredLicenseAppNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, Long> PdfFileEntryId =
		createColumn(
			"PdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationsTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private CannabisApplicationsTable() {
		super("nbp_cannabis_applications", CannabisApplicationsTable::new);
	}

}