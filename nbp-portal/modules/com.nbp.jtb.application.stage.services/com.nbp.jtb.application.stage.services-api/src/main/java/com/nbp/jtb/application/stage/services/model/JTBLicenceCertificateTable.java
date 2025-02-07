/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_licence_certificate&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JTBLicenceCertificate
 * @generated
 */
public class JTBLicenceCertificateTable
	extends BaseTable<JTBLicenceCertificateTable> {

	public static final JTBLicenceCertificateTable INSTANCE =
		new JTBLicenceCertificateTable();

	public final Column<JTBLicenceCertificateTable, Long>
		jTBLicenceCertificateId = createColumn(
			"jTBLicenceCertificateId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JTBLicenceCertificateTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, String> licenceCertificate =
		createColumn(
			"licenceCertificate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, String> category =
		createColumn(
			"category", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, Date> issueDate =
		createColumn(
			"issueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, Date> expirationDate =
		createColumn(
			"expirationDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBLicenceCertificateTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private JTBLicenceCertificateTable() {
		super("nbp_jtb_licence_certificate", JTBLicenceCertificateTable::new);
	}

}