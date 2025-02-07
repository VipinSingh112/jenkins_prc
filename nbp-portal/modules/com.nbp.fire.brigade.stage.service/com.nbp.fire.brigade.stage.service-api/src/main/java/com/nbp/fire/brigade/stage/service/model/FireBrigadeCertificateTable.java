/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_fire_brigade_certificate&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCertificate
 * @generated
 */
public class FireBrigadeCertificateTable
	extends BaseTable<FireBrigadeCertificateTable> {

	public static final FireBrigadeCertificateTable INSTANCE =
		new FireBrigadeCertificateTable();

	public final Column<FireBrigadeCertificateTable, Long>
		fireBrigadeCertificateId = createColumn(
			"fireBrigadeCertificateId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FireBrigadeCertificateTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, String> nameOfOwner =
		createColumn(
			"nameOfOwner", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, String> typeOfPremises =
		createColumn(
			"typeOfPremises", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, Date> issueDate =
		createColumn(
			"issueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, Date> expirationDate =
		createColumn(
			"expirationDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeCertificateTable, String> certificateNumber =
		createColumn(
			"certificateNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private FireBrigadeCertificateTable() {
		super("nbp_fire_brigade_certificate", FireBrigadeCertificateTable::new);
	}

}