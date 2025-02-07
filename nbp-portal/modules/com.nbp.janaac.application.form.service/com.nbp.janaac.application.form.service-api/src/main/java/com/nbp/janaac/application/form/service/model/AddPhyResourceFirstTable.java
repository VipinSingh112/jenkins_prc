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
 * The table class for the &quot;nbp_janaac_add_ins_phy_first&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceFirst
 * @generated
 */
public class AddPhyResourceFirstTable
	extends BaseTable<AddPhyResourceFirstTable> {

	public static final AddPhyResourceFirstTable INSTANCE =
		new AddPhyResourceFirstTable();

	public final Column<AddPhyResourceFirstTable, Long> addPhyResourceFirstId =
		createColumn(
			"addPhyResourceFirstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddPhyResourceFirstTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, String> inventoryNumber =
		createColumn(
			"inventoryNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, String> item = createColumn(
		"item", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, String> manufacturer =
		createColumn(
			"manufacturer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, String> modelNumber =
		createColumn(
			"modelNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, String> calibrationInterval =
		createColumn(
			"calibrationInterval", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, String> calibratedBy =
		createColumn(
			"calibratedBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddPhyResourceFirstTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddPhyResourceFirstTable() {
		super("nbp_janaac_add_ins_phy_first", AddPhyResourceFirstTable::new);
	}

}