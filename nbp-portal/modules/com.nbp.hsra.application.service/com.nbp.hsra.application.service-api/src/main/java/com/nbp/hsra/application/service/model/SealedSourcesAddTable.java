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
 * The table class for the &quot;nbp_hsra_sealed_source&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SealedSourcesAdd
 * @generated
 */
public class SealedSourcesAddTable extends BaseTable<SealedSourcesAddTable> {

	public static final SealedSourcesAddTable INSTANCE =
		new SealedSourcesAddTable();

	public final Column<SealedSourcesAddTable, Long> sealedSourcesAddId =
		createColumn(
			"sealedSourcesAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SealedSourcesAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, String> sealedSourcesRadionu =
		createColumn(
			"sealedSourcesRadionu", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, String>
		sealedSourcesMaxActivity = createColumn(
			"sealedSourcesMaxActivity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, Date> sealedSourcesActivityDate =
		createColumn(
			"sealedSourcesActivityDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, String> sealedSourcesCategories =
		createColumn(
			"sealedSourcesCategories", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, String> sealedSourcesUse =
		createColumn(
			"sealedSourcesUse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SealedSourcesAddTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private SealedSourcesAddTable() {
		super("nbp_hsra_sealed_source", SealedSourcesAddTable::new);
	}

}