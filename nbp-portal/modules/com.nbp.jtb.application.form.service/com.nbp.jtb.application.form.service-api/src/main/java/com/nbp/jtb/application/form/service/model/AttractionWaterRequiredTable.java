/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_water_required&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterRequired
 * @generated
 */
public class AttractionWaterRequiredTable
	extends BaseTable<AttractionWaterRequiredTable> {

	public static final AttractionWaterRequiredTable INSTANCE =
		new AttractionWaterRequiredTable();

	public final Column<AttractionWaterRequiredTable, Long>
		attractionWaterRequiredId = createColumn(
			"attractionWaterRequiredId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionWaterRequiredTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, String> generalOperator =
		createColumn(
			"generalOperator", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, String> waterCraft =
		createColumn(
			"waterCraft", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, String> waterSki =
		createColumn(
			"waterSki", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, String> sunfishSail =
		createColumn(
			"sunfishSail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, String> parasail =
		createColumn(
			"parasail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, String> scubaDiving =
		createColumn(
			"scubaDiving", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, String> glassBoat =
		createColumn(
			"glassBoat", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, String> bananaBoat =
		createColumn(
			"bananaBoat", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterRequiredTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionWaterRequiredTable() {
		super("nbp_jtb_water_required", AttractionWaterRequiredTable::new);
	}

}