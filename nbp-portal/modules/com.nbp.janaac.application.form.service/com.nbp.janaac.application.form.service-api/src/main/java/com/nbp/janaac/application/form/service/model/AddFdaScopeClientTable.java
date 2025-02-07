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
 * The table class for the &quot;nbp_janaac_add_fda_scop_client&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaScopeClient
 * @generated
 */
public class AddFdaScopeClientTable extends BaseTable<AddFdaScopeClientTable> {

	public static final AddFdaScopeClientTable INSTANCE =
		new AddFdaScopeClientTable();

	public final Column<AddFdaScopeClientTable, Long> addFdaScopeClientId =
		createColumn(
			"addFdaScopeClientId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddFdaScopeClientTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, String> clientOrganization =
		createColumn(
			"clientOrganization", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, String> foodProducts =
		createColumn(
			"foodProducts", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, String> fdaRegulations =
		createColumn(
			"fdaRegulations", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, Date> dateGranted =
		createColumn(
			"dateGranted", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddFdaScopeClientTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddFdaScopeClientTable() {
		super("nbp_janaac_add_fda_scop_client", AddFdaScopeClientTable::new);
	}

}