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
 * The table class for the &quot;nbp_janaac_add_fda_per_first&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFirst
 * @generated
 */
public class AddFdaPersonnelFirstTable
	extends BaseTable<AddFdaPersonnelFirstTable> {

	public static final AddFdaPersonnelFirstTable INSTANCE =
		new AddFdaPersonnelFirstTable();

	public final Column<AddFdaPersonnelFirstTable, Long>
		addFdaPersonnelFirstId = createColumn(
			"addFdaPersonnelFirstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddFdaPersonnelFirstTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, String> nameOfStaff =
		createColumn(
			"nameOfStaff", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, String> jobTitle =
		createColumn(
			"jobTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, String>
		majorResponsibilites = createColumn(
			"majorResponsibilites", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, String> specificFunctions =
		createColumn(
			"specificFunctions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFirstTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddFdaPersonnelFirstTable() {
		super("nbp_janaac_add_fda_per_first", AddFdaPersonnelFirstTable::new);
	}

}