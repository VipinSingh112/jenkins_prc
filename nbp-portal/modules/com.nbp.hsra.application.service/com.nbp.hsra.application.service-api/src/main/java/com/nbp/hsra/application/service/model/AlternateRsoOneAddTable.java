/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_alter_rso_one_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoOneAdd
 * @generated
 */
public class AlternateRsoOneAddTable
	extends BaseTable<AlternateRsoOneAddTable> {

	public static final AlternateRsoOneAddTable INSTANCE =
		new AlternateRsoOneAddTable();

	public final Column<AlternateRsoOneAddTable, Long> alternateRsoOneAddId =
		createColumn(
			"alternateRsoOneAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AlternateRsoOneAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, String> alternateRsoOneName =
		createColumn(
			"alternateRsoOneName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, String> alternateRsoOneTitle =
		createColumn(
			"alternateRsoOneTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, String>
		alternateRsoOneTelephone = createColumn(
			"alternateRsoOneTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, String> alternateRsoOneExt =
		createColumn(
			"alternateRsoOneExt", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, String> alternateRsoOneFax =
		createColumn(
			"alternateRsoOneFax", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, String>
		alternateRsoOneEmailAdd = createColumn(
			"alternateRsoOneEmailAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoOneAddTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AlternateRsoOneAddTable() {
		super("nbp_hsra_alter_rso_one_add", AlternateRsoOneAddTable::new);
	}

}