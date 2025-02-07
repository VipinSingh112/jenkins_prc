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
 * The table class for the &quot;nbp_hsra_source_detail_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SourcesDetailAdd
 * @generated
 */
public class SourcesDetailAddTable extends BaseTable<SourcesDetailAddTable> {

	public static final SourcesDetailAddTable INSTANCE =
		new SourcesDetailAddTable();

	public final Column<SourcesDetailAddTable, Long> sourcesDetailAddId =
		createColumn(
			"sourcesDetailAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SourcesDetailAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SourcesDetailAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SourcesDetailAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SourcesDetailAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SourcesDetailAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SourcesDetailAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SourcesDetailAddTable, String> sourceIdentification =
		createColumn(
			"sourceIdentification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SourcesDetailAddTable, String> stateActivity =
		createColumn(
			"stateActivity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SourcesDetailAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SourcesDetailAddTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private SourcesDetailAddTable() {
		super("nbp_hsra_source_detail_add", SourcesDetailAddTable::new);
	}

}