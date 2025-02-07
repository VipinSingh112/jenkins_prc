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
 * The table class for the &quot;nbp_jtb_list_driver&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListDriverInfo
 * @generated
 */
public class JtbAddListDriverInfoTable
	extends BaseTable<JtbAddListDriverInfoTable> {

	public static final JtbAddListDriverInfoTable INSTANCE =
		new JtbAddListDriverInfoTable();

	public final Column<JtbAddListDriverInfoTable, Long>
		jtbAddListDriverInfoId = createColumn(
			"jtbAddListDriverInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JtbAddListDriverInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddListDriverInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddListDriverInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JtbAddListDriverInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddListDriverInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAddListDriverInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JtbAddListDriverInfoTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddListDriverInfoTable, String> driverName =
		createColumn(
			"driverName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddListDriverInfoTable, String> driverLicence =
		createColumn(
			"driverLicence", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JtbAddListDriverInfoTable, Date> driverExpiryDate =
		createColumn(
			"driverExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JtbAddListDriverInfoTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private JtbAddListDriverInfoTable() {
		super("nbp_jtb_list_driver", JtbAddListDriverInfoTable::new);
	}

}