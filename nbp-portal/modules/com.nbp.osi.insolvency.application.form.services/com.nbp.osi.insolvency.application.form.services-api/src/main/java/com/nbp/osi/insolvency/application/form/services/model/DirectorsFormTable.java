/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_directors_form&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DirectorsForm
 * @generated
 */
public class DirectorsFormTable extends BaseTable<DirectorsFormTable> {

	public static final DirectorsFormTable INSTANCE = new DirectorsFormTable();

	public final Column<DirectorsFormTable, Long> directorsFormId =
		createColumn(
			"directorsFormId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DirectorsFormTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, String> directorsName =
		createColumn(
			"directorsName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, Date> directorsDateAppointed =
		createColumn(
			"directorsDateAppointed", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, String> directorsOccupation =
		createColumn(
			"directorsOccupation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, String> directorsContactNum =
		createColumn(
			"directorsContactNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, String> directorsAddress =
		createColumn(
			"directorsAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, String> directorsCounter =
		createColumn(
			"directorsCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DirectorsFormTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DirectorsFormTable() {
		super("nbp_osi_directors_form", DirectorsFormTable::new);
	}

}