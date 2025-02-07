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
 * The table class for the &quot;nbp_janaac_add_fda_Appli_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaAppliInfo
 * @generated
 */
public class AddFdaAppliInfoTable extends BaseTable<AddFdaAppliInfoTable> {

	public static final AddFdaAppliInfoTable INSTANCE =
		new AddFdaAppliInfoTable();

	public final Column<AddFdaAppliInfoTable, Long> addFdaAppliInfoId =
		createColumn(
			"addFdaAppliInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AddFdaAppliInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaAppliInfoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaAppliInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaAppliInfoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaAppliInfoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaAppliInfoTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaAppliInfoTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaAppliInfoTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaAppliInfoTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddFdaAppliInfoTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddFdaAppliInfoTable() {
		super("nbp_janaac_add_fda_Appli_info", AddFdaAppliInfoTable::new);
	}

}