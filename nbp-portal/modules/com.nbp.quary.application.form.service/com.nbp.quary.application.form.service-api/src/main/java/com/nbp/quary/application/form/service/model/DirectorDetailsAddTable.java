/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_add_director&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DirectorDetailsAdd
 * @generated
 */
public class DirectorDetailsAddTable
	extends BaseTable<DirectorDetailsAddTable> {

	public static final DirectorDetailsAddTable INSTANCE =
		new DirectorDetailsAddTable();

	public final Column<DirectorDetailsAddTable, Long> directorDetailsAddId =
		createColumn(
			"directorDetailsAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<DirectorDetailsAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DirectorDetailsAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DirectorDetailsAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DirectorDetailsAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DirectorDetailsAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DirectorDetailsAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DirectorDetailsAddTable, String> directorName =
		createColumn(
			"directorName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DirectorDetailsAddTable, String> directorNationality =
		createColumn(
			"directorNationality", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DirectorDetailsAddTable, Long> quarryApplicationId =
		createColumn(
			"quarryApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<DirectorDetailsAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private DirectorDetailsAddTable() {
		super("nbp_quarry_add_director", DirectorDetailsAddTable::new);
	}

}