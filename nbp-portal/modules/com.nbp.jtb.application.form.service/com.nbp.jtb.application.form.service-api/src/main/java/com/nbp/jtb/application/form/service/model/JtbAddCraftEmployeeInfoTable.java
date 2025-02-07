/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_craft_employee&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftEmployeeInfo
 * @generated
 */
public class JtbAddCraftEmployeeInfoTable
	extends BaseTable<JtbAddCraftEmployeeInfoTable> {

	public static final JtbAddCraftEmployeeInfoTable INSTANCE =
		new JtbAddCraftEmployeeInfoTable();

	public final Column<JtbAddCraftEmployeeInfoTable, Long>
		jtbAddCraftEmployeeInfoId = createColumn(
			"jtbAddCraftEmployeeInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JtbAddCraftEmployeeInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftEmployeeInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftEmployeeInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftEmployeeInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftEmployeeInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftEmployeeInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftEmployeeInfoTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftEmployeeInfoTable, String> empName =
		createColumn(
			"empName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftEmployeeInfoTable, String> empAddress =
		createColumn(
			"empAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftEmployeeInfoTable, String> empPhoneNo =
		createColumn(
			"empPhoneNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddCraftEmployeeInfoTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private JtbAddCraftEmployeeInfoTable() {
		super("nbp_jtb_craft_employee", JtbAddCraftEmployeeInfoTable::new);
	}

}