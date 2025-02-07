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
 * The table class for the &quot;nbp_tourism_bona_ground_box&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransBox
 * @generated
 */
public class TourismBonaGroundTransBoxTable
	extends BaseTable<TourismBonaGroundTransBoxTable> {

	public static final TourismBonaGroundTransBoxTable INSTANCE =
		new TourismBonaGroundTransBoxTable();

	public final Column<TourismBonaGroundTransBoxTable, Long>
		tourismVehicleBoxBonaId = createColumn(
			"tourismVehicleBoxBonaId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaGroundTransBoxTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransBoxTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransBoxTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransBoxTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransBoxTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransBoxTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransBoxTable, String>
		vehicleMakeBona = createColumn(
			"vehicleMakeBona", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransBoxTable, String>
		vehiclemodelBona = createColumn(
			"vehiclemodelBona", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransBoxTable, String>
		vehicleYearBona = createColumn(
			"vehicleYearBona", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransBoxTable, String> vehicleCounter =
		createColumn(
			"vehicleCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransBoxTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaGroundTransBoxTable() {
		super(
			"nbp_tourism_bona_ground_box", TourismBonaGroundTransBoxTable::new);
	}

}