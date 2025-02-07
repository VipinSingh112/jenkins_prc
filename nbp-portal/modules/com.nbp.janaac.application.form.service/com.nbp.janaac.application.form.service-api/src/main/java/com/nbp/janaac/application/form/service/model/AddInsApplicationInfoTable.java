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
 * The table class for the &quot;nbp_janaac_add_ins_appli_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsApplicationInfo
 * @generated
 */
public class AddInsApplicationInfoTable
	extends BaseTable<AddInsApplicationInfoTable> {

	public static final AddInsApplicationInfoTable INSTANCE =
		new AddInsApplicationInfoTable();

	public final Column<AddInsApplicationInfoTable, Long>
		addInsApplicationInfoId = createColumn(
			"addInsApplicationInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddInsApplicationInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsApplicationInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsApplicationInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsApplicationInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsApplicationInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddInsApplicationInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddInsApplicationInfoTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsApplicationInfoTable, String> email =
		createColumn("email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsApplicationInfoTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddInsApplicationInfoTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddInsApplicationInfoTable() {
		super("nbp_janaac_add_ins_appli_info", AddInsApplicationInfoTable::new);
	}

}