/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_mining_cert_issue&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationCertificateIssuance
 * @generated
 */
public class MiningApplicationCertificateIssuanceTable
	extends BaseTable<MiningApplicationCertificateIssuanceTable> {

	public static final MiningApplicationCertificateIssuanceTable INSTANCE =
		new MiningApplicationCertificateIssuanceTable();

	public final Column<MiningApplicationCertificateIssuanceTable, String>
		uuid = createColumn(
			"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, Long>
		miningCertIssuId = createColumn(
			"miningCertIssuId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MiningApplicationCertificateIssuanceTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, Date>
		dateCertificateIssued = createColumn(
			"dateCertificateIssued", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, Date>
		dateOfExpiration = createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, String>
		certificateNumber = createColumn(
			"certificateNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, String>
		caseId = createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiningApplicationCertificateIssuanceTable, Long>
		documentFileEntryId = createColumn(
			"documentFileEntryId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private MiningApplicationCertificateIssuanceTable() {
		super(
			"nbp_mining_cert_issue",
			MiningApplicationCertificateIssuanceTable::new);
	}

}