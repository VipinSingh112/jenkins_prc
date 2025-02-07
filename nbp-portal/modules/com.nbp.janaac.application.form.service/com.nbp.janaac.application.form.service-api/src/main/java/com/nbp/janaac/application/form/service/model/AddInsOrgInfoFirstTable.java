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
 * The table class for the &quot;nbp_janaac_add_ins_org_first&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoFirst
 * @generated
 */
public class AddInsOrgInfoFirstTable
	extends BaseTable<AddInsOrgInfoFirstTable> {

	public static final AddInsOrgInfoFirstTable INSTANCE =
		new AddInsOrgInfoFirstTable();

	public final Column<AddInsOrgInfoFirstTable, Long> addInsOrgInfoFirstId =
		createColumn(
			"addInsOrgInfoFirstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AddInsOrgInfoFirstTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoFirstTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoFirstTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoFirstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoFirstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoFirstTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoFirstTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoFirstTable, String> position =
		createColumn(
			"position", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoFirstTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<AddInsOrgInfoFirstTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AddInsOrgInfoFirstTable() {
		super("nbp_janaac_add_ins_org_first", AddInsOrgInfoFirstTable::new);
	}

}