/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_licence_certificate&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjLicenceCertificate
 * @generated
 */
public class NcbjLicenceCertificateTable
	extends BaseTable<NcbjLicenceCertificateTable> {

	public static final NcbjLicenceCertificateTable INSTANCE =
		new NcbjLicenceCertificateTable();

	public final Column<NcbjLicenceCertificateTable, Long>
		ncbjLicenceCertificateId = createColumn(
			"ncbjLicenceCertificateId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjLicenceCertificateTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, String>
		licenceCertificate = createColumn(
			"licenceCertificate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, String> NameOfApplicant =
		createColumn(
			"NameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, String>
		nameOfCertification = createColumn(
			"nameOfCertification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, String>
		scopeOfCertification = createColumn(
			"scopeOfCertification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, Date> issueDate =
		createColumn(
			"issueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, Date> expirationDate =
		createColumn(
			"expirationDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjLicenceCertificateTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjLicenceCertificateTable() {
		super("nbp_ncbj_licence_certificate", NcbjLicenceCertificateTable::new);
	}

}