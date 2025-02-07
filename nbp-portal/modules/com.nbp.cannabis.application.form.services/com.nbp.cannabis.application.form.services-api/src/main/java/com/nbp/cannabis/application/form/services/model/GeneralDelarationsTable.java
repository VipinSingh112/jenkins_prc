/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_gd&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see GeneralDelarations
 * @generated
 */
public class GeneralDelarationsTable
	extends BaseTable<GeneralDelarationsTable> {

	public static final GeneralDelarationsTable INSTANCE =
		new GeneralDelarationsTable();

	public final Column<GeneralDelarationsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GeneralDelarationsTable, Long> generalDeclarationId =
		createColumn(
			"generalDeclarationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<GeneralDelarationsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GeneralDelarationsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GeneralDelarationsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GeneralDelarationsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GeneralDelarationsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<GeneralDelarationsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<GeneralDelarationsTable, String> declartionQuestion =
		createColumn(
			"declartionQuestion", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GeneralDelarationsTable, String> answer = createColumn(
		"answer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GeneralDelarationsTable, Long> cannabisApplicationId =
		createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private GeneralDelarationsTable() {
		super("nbp_cannabis_gd", GeneralDelarationsTable::new);
	}

}