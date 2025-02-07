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
 * The table class for the &quot;nbp_janaac_add_cer_per_first&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelFirst
 * @generated
 */
public class AddCerPersonnelFirstTable
	extends BaseTable<AddCerPersonnelFirstTable> {

	public static final AddCerPersonnelFirstTable INSTANCE =
		new AddCerPersonnelFirstTable();

	public final Column<AddCerPersonnelFirstTable, Long>
		addCerPersonnelFirstId = createColumn(
			"addCerPersonnelFirstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddCerPersonnelFirstTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, String> nameOfStaff =
		createColumn(
			"nameOfStaff", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, String> jobTitle =
		createColumn(
			"jobTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, String> majorResponsibility =
		createColumn(
			"majorResponsibility", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, String> specificFunctions =
		createColumn(
			"specificFunctions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelFirstTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddCerPersonnelFirstTable() {
		super("nbp_janaac_add_cer_per_first", AddCerPersonnelFirstTable::new);
	}

}