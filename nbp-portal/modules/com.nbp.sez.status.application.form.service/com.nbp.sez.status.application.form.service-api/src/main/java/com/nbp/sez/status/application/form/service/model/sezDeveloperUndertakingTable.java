/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_dev_undertaking&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see sezDeveloperUndertaking
 * @generated
 */
public class sezDeveloperUndertakingTable
	extends BaseTable<sezDeveloperUndertakingTable> {

	public static final sezDeveloperUndertakingTable INSTANCE =
		new sezDeveloperUndertakingTable();

	public final Column<sezDeveloperUndertakingTable, Long>
		sezDeveloperUndertakingId = createColumn(
			"sezDeveloperUndertakingId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<sezDeveloperUndertakingTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, String> titleOfApplicant =
		createColumn(
			"titleOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, String> nameOfApplicant =
		createColumn(
			"nameOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, String> telephoneNum =
		createColumn(
			"telephoneNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, Date>
		applicantSignatureDate = createColumn(
			"applicantSignatureDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, String>
		nameOfNotaryPublic = createColumn(
			"nameOfNotaryPublic", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, Date>
		publicNotarySignatureDate = createColumn(
			"publicNotarySignatureDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<sezDeveloperUndertakingTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private sezDeveloperUndertakingTable() {
		super("nbp_sez_dev_undertaking", sezDeveloperUndertakingTable::new);
	}

}