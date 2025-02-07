/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;agriculture_crop&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureCrop
 * @generated
 */
public class AgricultureCropTable extends BaseTable<AgricultureCropTable> {

	public static final AgricultureCropTable INSTANCE =
		new AgricultureCropTable();

	public final Column<AgricultureCropTable, Long> agricultureCropId =
		createColumn(
			"agricultureCropId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AgricultureCropTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, String> cropType = createColumn(
		"cropType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, String> cropHectare =
		createColumn(
			"cropHectare", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, String> averageAnnualProduction =
		createColumn(
			"averageAnnualProduction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, String> cropMarketLocal =
		createColumn(
			"cropMarketLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, String> cropMarketForeign =
		createColumn(
			"cropMarketForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, String> valueOfSale =
		createColumn(
			"valueOfSale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, String> cropCounter =
		createColumn(
			"cropCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureCropTable, Long> agricultureApplicationId =
		createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgricultureCropTable() {
		super("agriculture_crop", AgricultureCropTable::new);
	}

}