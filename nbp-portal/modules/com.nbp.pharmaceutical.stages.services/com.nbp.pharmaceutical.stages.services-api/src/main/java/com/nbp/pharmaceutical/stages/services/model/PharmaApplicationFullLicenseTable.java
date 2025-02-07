/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_pharma_full_license&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationFullLicense
 * @generated
 */
public class PharmaApplicationFullLicenseTable
	extends BaseTable<PharmaApplicationFullLicenseTable> {

	public static final PharmaApplicationFullLicenseTable INSTANCE =
		new PharmaApplicationFullLicenseTable();

	public final Column<PharmaApplicationFullLicenseTable, Long>
		pharmaFullLicenseId = createColumn(
			"pharmaFullLicenseId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PharmaApplicationFullLicenseTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, String>
		licenseNumber = createColumn(
			"licenseNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, Date> dateOfIssue =
		createColumn(
			"dateOfIssue", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, String>
		feePaidAmount = createColumn(
			"feePaidAmount", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, String>
		receiptNumber = createColumn(
			"receiptNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, String> leadTime =
		createColumn(
			"leadTime", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationFullLicenseTable, String>
		licenseDocId = createColumn(
			"licenseDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private PharmaApplicationFullLicenseTable() {
		super(
			"nbp_pharma_full_license", PharmaApplicationFullLicenseTable::new);
	}

}