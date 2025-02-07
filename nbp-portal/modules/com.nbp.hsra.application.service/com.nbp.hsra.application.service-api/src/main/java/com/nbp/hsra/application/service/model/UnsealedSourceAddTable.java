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
 * The table class for the &quot;nbp_hsra_unsealed_sources&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see UnsealedSourceAdd
 * @generated
 */
public class UnsealedSourceAddTable extends BaseTable<UnsealedSourceAddTable> {

	public static final UnsealedSourceAddTable INSTANCE =
		new UnsealedSourceAddTable();

	public final Column<UnsealedSourceAddTable, Long> unsealedSourceAddId =
		createColumn(
			"unsealedSourceAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<UnsealedSourceAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, String> unsealedSourcesRadionu =
		createColumn(
			"unsealedSourcesRadionu", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, String>
		unsealedSourcesActivity = createColumn(
			"unsealedSourcesActivity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, String>
		unsealedSourcesTotalYear = createColumn(
			"unsealedSourcesTotalYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, String> unsealedSourcesUse =
		createColumn(
			"unsealedSourcesUse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UnsealedSourceAddTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private UnsealedSourceAddTable() {
		super("nbp_hsra_unsealed_sources", UnsealedSourceAddTable::new);
	}

}