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
 * The table class for the &quot;nbp_janaac_add_cer_per_third&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelThird
 * @generated
 */
public class AddCerPersonnelThirdTable
	extends BaseTable<AddCerPersonnelThirdTable> {

	public static final AddCerPersonnelThirdTable INSTANCE =
		new AddCerPersonnelThirdTable();

	public final Column<AddCerPersonnelThirdTable, Long>
		addCerPersonnelThirdId = createColumn(
			"addCerPersonnelThirdId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddCerPersonnelThirdTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, String> number =
		createColumn(
			"number_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, String> location =
		createColumn(
			"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, String>
		certificationActivities = createColumn(
			"certificationActivities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, String> contactDetails =
		createColumn(
			"contactDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddCerPersonnelThirdTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddCerPersonnelThirdTable() {
		super("nbp_janaac_add_cer_per_third", AddCerPersonnelThirdTable::new);
	}

}