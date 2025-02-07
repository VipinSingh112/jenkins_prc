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
 * The table class for the &quot;nbp_tourism_new_vehicle_box&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewVehicleAddBox
 * @generated
 */
public class TourismNewVehicleAddBoxTable
	extends BaseTable<TourismNewVehicleAddBoxTable> {

	public static final TourismNewVehicleAddBoxTable INSTANCE =
		new TourismNewVehicleAddBoxTable();

	public final Column<TourismNewVehicleAddBoxTable, Long> tourismNewVehBoxId =
		createColumn(
			"tourismNewVehBoxId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewVehicleAddBoxTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewVehicleAddBoxTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewVehicleAddBoxTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewVehicleAddBoxTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewVehicleAddBoxTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewVehicleAddBoxTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewVehicleAddBoxTable, String> newMake =
		createColumn(
			"newMake", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewVehicleAddBoxTable, String> newYear =
		createColumn(
			"newYear", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewVehicleAddBoxTable, String> newModel =
		createColumn(
			"newModel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewVehicleAddBoxTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewVehicleAddBoxTable() {
		super("nbp_tourism_new_vehicle_box", TourismNewVehicleAddBoxTable::new);
	}

}