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
 * The table class for the &quot;nbp_hsra_alternate_rso_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoAdd
 * @generated
 */
public class AlternateRsoAddTable extends BaseTable<AlternateRsoAddTable> {

	public static final AlternateRsoAddTable INSTANCE =
		new AlternateRsoAddTable();

	public final Column<AlternateRsoAddTable, Long> alternateRsoAddId =
		createColumn(
			"alternateRsoAddId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AlternateRsoAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, String> alternateRsoName =
		createColumn(
			"alternateRsoName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, String> alternateRsoTitle =
		createColumn(
			"alternateRsoTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, String> alternateRsoTelephone =
		createColumn(
			"alternateRsoTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, String> alternateRsoExt =
		createColumn(
			"alternateRsoExt", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, String> alternateRsoFax =
		createColumn(
			"alternateRsoFax", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, String> alternateRsoEmailAdd =
		createColumn(
			"alternateRsoEmailAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AlternateRsoAddTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AlternateRsoAddTable() {
		super("nbp_hsra_alternate_rso_add", AlternateRsoAddTable::new);
	}

}