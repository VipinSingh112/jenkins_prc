/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_licence_certificate&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QueryLicenceCertificate
 * @generated
 */
public class QueryLicenceCertificateTable
	extends BaseTable<QueryLicenceCertificateTable> {

	public static final QueryLicenceCertificateTable INSTANCE =
		new QueryLicenceCertificateTable();

	public final Column<QueryLicenceCertificateTable, Long>
		queryLicenceCertificateId = createColumn(
			"queryLicenceCertificateId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QueryLicenceCertificateTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, String>
		licenceCertificate = createColumn(
			"licenceCertificate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, String> category =
		createColumn(
			"category", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, Date> issueDate =
		createColumn(
			"issueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, Date> expirationDate =
		createColumn(
			"expirationDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QueryLicenceCertificateTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private QueryLicenceCertificateTable() {
		super(
			"nbp_quarry_licence_certificate",
			QueryLicenceCertificateTable::new);
	}

}