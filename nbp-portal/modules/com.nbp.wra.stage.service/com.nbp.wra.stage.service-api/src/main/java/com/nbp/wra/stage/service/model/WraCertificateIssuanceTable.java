/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_wra_licence_issu&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see WraCertificateIssuance
 * @generated
 */
public class WraCertificateIssuanceTable
	extends BaseTable<WraCertificateIssuanceTable> {

	public static final WraCertificateIssuanceTable INSTANCE =
		new WraCertificateIssuanceTable();

	public final Column<WraCertificateIssuanceTable, Long>
		wraCertificateIssuanceId = createColumn(
			"wraCertificateIssuanceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<WraCertificateIssuanceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, String> licenceNumber =
		createColumn(
			"licenceNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, String> Category =
		createColumn(
			"Category", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, Date> dateOfLicIssuance =
		createColumn(
			"dateOfLicIssuance", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, Date>
		dateOfLicenseExpiration = createColumn(
			"dateOfLicenseExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<WraCertificateIssuanceTable, Long> docLicFileEntryId =
		createColumn(
			"docLicFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private WraCertificateIssuanceTable() {
		super("nbp_wra_licence_issu", WraCertificateIssuanceTable::new);
	}

}