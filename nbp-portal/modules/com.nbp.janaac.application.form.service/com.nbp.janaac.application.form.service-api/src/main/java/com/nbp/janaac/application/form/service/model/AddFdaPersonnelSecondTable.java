/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_add_fda_per_sec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelSecond
 * @generated
 */
public class AddFdaPersonnelSecondTable
	extends BaseTable<AddFdaPersonnelSecondTable> {

	public static final AddFdaPersonnelSecondTable INSTANCE =
		new AddFdaPersonnelSecondTable();

	public final Column<AddFdaPersonnelSecondTable, Long>
		addFdaPersonnelSecondId = createColumn(
			"addFdaPersonnelSecondId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddFdaPersonnelSecondTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelSecondTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelSecondTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelSecondTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelSecondTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelSecondTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelSecondTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelSecondTable, String> role = createColumn(
		"role_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelSecondTable, String> fdaRegulation =
		createColumn(
			"fdaRegulation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelSecondTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelSecondTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddFdaPersonnelSecondTable() {
		super("nbp_janaac_add_fda_per_sec", AddFdaPersonnelSecondTable::new);
	}

}