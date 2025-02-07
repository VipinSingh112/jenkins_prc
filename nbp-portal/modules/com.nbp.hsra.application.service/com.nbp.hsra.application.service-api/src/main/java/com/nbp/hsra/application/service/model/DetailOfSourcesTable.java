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
 * The table class for the &quot;nbp_hsra_noti_detail_source&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfSources
 * @generated
 */
public class DetailOfSourcesTable extends BaseTable<DetailOfSourcesTable> {

	public static final DetailOfSourcesTable INSTANCE =
		new DetailOfSourcesTable();

	public final Column<DetailOfSourcesTable, Long> detailOfSourcesId =
		createColumn(
			"detailOfSourcesId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DetailOfSourcesTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfSourcesTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfSourcesTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfSourcesTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfSourcesTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailOfSourcesTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailOfSourcesTable, String> sourceIdentification =
		createColumn(
			"sourceIdentification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfSourcesTable, String> sourceLocation =
		createColumn(
			"sourceLocation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfSourcesTable, String> stateActivity =
		createColumn(
			"stateActivity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfSourcesTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DetailOfSourcesTable() {
		super("nbp_hsra_noti_detail_source", DetailOfSourcesTable::new);
	}

}