/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_lic_iss&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationLicenseIssuance
 * @generated
 */
public class HSRAApplicationLicenseIssuanceTable
	extends BaseTable<HSRAApplicationLicenseIssuanceTable> {

	public static final HSRAApplicationLicenseIssuanceTable INSTANCE =
		new HSRAApplicationLicenseIssuanceTable();

	public final Column<HSRAApplicationLicenseIssuanceTable, Long>
		hsraFullLicenseId = createColumn(
			"hsraFullLicenseId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<HSRAApplicationLicenseIssuanceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, String>
		licenseNumber = createColumn(
			"licenseNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, Date> dateOfIssue =
		createColumn(
			"dateOfIssue", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, Date>
		dateOfExpiry = createColumn(
			"dateOfExpiry", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, String>
		feePaidAmount = createColumn(
			"feePaidAmount", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, String>
		receiptNumber = createColumn(
			"receiptNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, String> leadTime =
		createColumn(
			"leadTime", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAApplicationLicenseIssuanceTable, String>
		licenseDocId = createColumn(
			"licenseDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private HSRAApplicationLicenseIssuanceTable() {
		super("nbp_hsra_lic_iss", HSRAApplicationLicenseIssuanceTable::new);
	}

}