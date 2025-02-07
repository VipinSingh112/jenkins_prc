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
 * The table class for the &quot;nbp_janaac_add_fda_per_four&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFour
 * @generated
 */
public class AddFdaPersonnelFourTable
	extends BaseTable<AddFdaPersonnelFourTable> {

	public static final AddFdaPersonnelFourTable INSTANCE =
		new AddFdaPersonnelFourTable();

	public final Column<AddFdaPersonnelFourTable, Long> addFdaPersonnelFourId =
		createColumn(
			"addFdaPersonnelFourId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddFdaPersonnelFourTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, String> number = createColumn(
		"number_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, String> locationAddress =
		createColumn(
			"locationAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, String>
		certificationActivities = createColumn(
			"certificationActivities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, String> contactDetails =
		createColumn(
			"contactDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddFdaPersonnelFourTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddFdaPersonnelFourTable() {
		super("nbp_janaac_add_fda_per_four", AddFdaPersonnelFourTable::new);
	}

}