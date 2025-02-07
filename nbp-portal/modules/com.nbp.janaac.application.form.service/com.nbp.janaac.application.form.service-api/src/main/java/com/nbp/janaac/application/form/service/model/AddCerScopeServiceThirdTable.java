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
 * The table class for the &quot;nbp_janaac_add_scope_ser_third&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeServiceThird
 * @generated
 */
public class AddCerScopeServiceThirdTable
	extends BaseTable<AddCerScopeServiceThirdTable> {

	public static final AddCerScopeServiceThirdTable INSTANCE =
		new AddCerScopeServiceThirdTable();

	public final Column<AddCerScopeServiceThirdTable, Long>
		addCerScopeServiceThirdId = createColumn(
			"addCerScopeServiceThirdId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddCerScopeServiceThirdTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, String> organizationName =
		createColumn(
			"organizationName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, String>
		organizationAddress = createColumn(
			"organizationAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, String>
		certificationScheme = createColumn(
			"certificationScheme", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, String> currentStatus =
		createColumn(
			"currentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, Date> dateFirstGranted =
		createColumn(
			"dateFirstGranted", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, Date>
		DateOfNextExamination = createColumn(
			"DateOfNextExamination", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddCerScopeServiceThirdTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddCerScopeServiceThirdTable() {
		super(
			"nbp_janaac_add_scope_ser_third",
			AddCerScopeServiceThirdTable::new);
	}

}