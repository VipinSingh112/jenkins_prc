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
 * The table class for the &quot;nbp_janaac_add_cer_per_sec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelSecond
 * @generated
 */
public class AddCerPersonnelSecondTable
	extends BaseTable<AddCerPersonnelSecondTable> {

	public static final AddCerPersonnelSecondTable INSTANCE =
		new AddCerPersonnelSecondTable();

	public final Column<AddCerPersonnelSecondTable, Long>
		addCerPersonnelSecondId = createColumn(
			"addCerPersonnelSecondId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddCerPersonnelSecondTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, String> role = createColumn(
		"role_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, String>
		certificateStandard = createColumn(
			"certificateStandard", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, String> areaOfExpertise =
		createColumn(
			"areaOfExpertise", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelSecondTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddCerPersonnelSecondTable() {
		super("nbp_janaac_add_cer_per_sec", AddCerPersonnelSecondTable::new);
	}

}