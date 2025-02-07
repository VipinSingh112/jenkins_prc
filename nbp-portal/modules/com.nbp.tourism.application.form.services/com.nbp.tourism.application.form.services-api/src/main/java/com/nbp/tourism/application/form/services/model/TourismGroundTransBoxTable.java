/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_new_ground_box&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismGroundTransBox
 * @generated
 */
public class TourismGroundTransBoxTable
	extends BaseTable<TourismGroundTransBoxTable> {

	public static final TourismGroundTransBoxTable INSTANCE =
		new TourismGroundTransBoxTable();

	public final Column<TourismGroundTransBoxTable, Long> tourismVehicleBoxId =
		createColumn(
			"tourismVehicleBoxId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismGroundTransBoxTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismGroundTransBoxTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismGroundTransBoxTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismGroundTransBoxTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismGroundTransBoxTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismGroundTransBoxTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismGroundTransBoxTable, String> vehicleMake =
		createColumn(
			"vehicleMake", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismGroundTransBoxTable, String> vehiclemodel =
		createColumn(
			"vehiclemodel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismGroundTransBoxTable, String> vehicleYear =
		createColumn(
			"vehicleYear", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismGroundTransBoxTable, String> vehicleCounter =
		createColumn(
			"vehicleCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismGroundTransBoxTable, Long> tourismApplicationId =
		createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismGroundTransBoxTable() {
		super("nbp_tourism_new_ground_box", TourismGroundTransBoxTable::new);
	}

}