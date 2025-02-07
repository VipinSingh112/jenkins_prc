/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_miic_certificate_of_issuan&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiicCertificateOfIssuance
 * @generated
 */
public class MiicCertificateOfIssuanceTable
	extends BaseTable<MiicCertificateOfIssuanceTable> {

	public static final MiicCertificateOfIssuanceTable INSTANCE =
		new MiicCertificateOfIssuanceTable();

	public final Column<MiicCertificateOfIssuanceTable, Long>
		miicCertificateOfIssuanceId = createColumn(
			"miicCertificateOfIssuanceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiicCertificateOfIssuanceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, String>
		certificateNumber = createColumn(
			"certificateNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, Date>
		dateCertificateIssued = createColumn(
			"dateCertificateIssued", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, Date> dateOfExpiration =
		createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, Long>
		documentFileEntryId = createColumn(
			"documentFileEntryId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicCertificateOfIssuanceTable, String>
		nameOfLicensedTrustee = createColumn(
			"nameOfLicensedTrustee", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private MiicCertificateOfIssuanceTable() {
		super(
			"nbp_miic_certificate_of_issuan",
			MiicCertificateOfIssuanceTable::new);
	}

}