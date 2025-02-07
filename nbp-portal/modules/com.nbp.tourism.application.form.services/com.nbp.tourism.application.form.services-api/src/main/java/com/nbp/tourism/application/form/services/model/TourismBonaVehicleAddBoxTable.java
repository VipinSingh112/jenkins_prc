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

package com.nbp.tourism.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_bona_vehicle_box&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaVehicleAddBox
 * @generated
 */
public class TourismBonaVehicleAddBoxTable
	extends BaseTable<TourismBonaVehicleAddBoxTable> {

	public static final TourismBonaVehicleAddBoxTable INSTANCE =
		new TourismBonaVehicleAddBoxTable();

	public final Column<TourismBonaVehicleAddBoxTable, Long>
		tourismBonaVehBoxId = createColumn(
			"tourismBonaVehBoxId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaVehicleAddBoxTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaVehicleAddBoxTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaVehicleAddBoxTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaVehicleAddBoxTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaVehicleAddBoxTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaVehicleAddBoxTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaVehicleAddBoxTable, String> bonaMake =
		createColumn(
			"bonaMake", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaVehicleAddBoxTable, String> bonaYear =
		createColumn(
			"bonaYear", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaVehicleAddBoxTable, String> bonaModel =
		createColumn(
			"bonaModel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaVehicleAddBoxTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaVehicleAddBoxTable() {
		super(
			"nbp_tourism_bona_vehicle_box", TourismBonaVehicleAddBoxTable::new);
	}

}