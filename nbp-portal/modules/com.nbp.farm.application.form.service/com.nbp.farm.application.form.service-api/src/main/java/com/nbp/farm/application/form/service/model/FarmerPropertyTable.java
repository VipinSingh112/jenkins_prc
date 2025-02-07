/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;farmer_property&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerProperty
 * @generated
 */
public class FarmerPropertyTable extends BaseTable<FarmerPropertyTable> {

	public static final FarmerPropertyTable INSTANCE =
		new FarmerPropertyTable();

	public final Column<FarmerPropertyTable, Long> farmerPropertyId =
		createColumn(
			"farmerPropertyId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<FarmerPropertyTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> property01Extension =
		createColumn(
			"property01Extension", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> property01District =
		createColumn(
			"property01District", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> property01Tenure =
		createColumn(
			"property01Tenure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> property01Status =
		createColumn(
			"property01Status", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> property01Size =
		createColumn(
			"property01Size", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> property01Usage =
		createColumn(
			"property01Usage", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> property01Volume =
		createColumn(
			"property01Volume", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> property01Folio =
		createColumn(
			"property01Folio", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String>
		property01DistanceFromRoad = createColumn(
			"property01DistanceFromRoad", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> propertyId02 =
		createColumn(
			"propertyId02", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> propertyId03 =
		createColumn(
			"propertyId03", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> propertyCounter =
		createColumn(
			"propertyCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, String> remarks = createColumn(
		"remarks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FarmerPropertyTable, Long> farmerApplicationId =
		createColumn(
			"farmerApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FarmerPropertyTable() {
		super("farmer_property", FarmerPropertyTable::new);
	}

}