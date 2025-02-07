/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manufacture_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplication
 * @generated
 */
public class ManufacturingApplicationTable
	extends BaseTable<ManufacturingApplicationTable> {

	public static final ManufacturingApplicationTable INSTANCE =
		new ManufacturingApplicationTable();

	public final Column<ManufacturingApplicationTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ManufacturingApplicationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String> requestType =
		createColumn(
			"requestType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String> licenseRequest =
		createColumn(
			"licenseRequest", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String> licenseCategory =
		createColumn(
			"licenseCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String>
		licenseSubCategory = createColumn(
			"licenseSubCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String>
		applicationNumber = createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String>
		expiredLicenseAppNumber = createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String>
		icmDocumentsPath = createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, Date> dateOfExpiration =
		createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<ManufacturingApplicationTable, String>
		appCurrentStageName = createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private ManufacturingApplicationTable() {
		super(
			"nbp_manufacture_application", ManufacturingApplicationTable::new);
	}

}