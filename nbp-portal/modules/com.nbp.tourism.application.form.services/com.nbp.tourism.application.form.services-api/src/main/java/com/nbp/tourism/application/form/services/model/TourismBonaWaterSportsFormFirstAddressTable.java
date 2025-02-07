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
 * The table class for the &quot;nbp_tourism_bona_water_sffa&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirstAddress
 * @generated
 */
public class TourismBonaWaterSportsFormFirstAddressTable
	extends BaseTable<TourismBonaWaterSportsFormFirstAddressTable> {

	public static final TourismBonaWaterSportsFormFirstAddressTable INSTANCE =
		new TourismBonaWaterSportsFormFirstAddressTable();

	public final Column<TourismBonaWaterSportsFormFirstAddressTable, Long>
		tourismBonaWaterSportsFFAId = createColumn(
			"tourismBonaWaterSportsFFAId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, String>
		addressType = createColumn(
			"addressType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, String>
		bonaWaterAddress = createColumn(
			"bonaWaterAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, String>
		bonaWaterTeleNo = createColumn(
			"bonaWaterTeleNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, String>
		bonaWaterFaxNo = createColumn(
			"bonaWaterFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, String>
		bonaWaterEmail = createColumn(
			"bonaWaterEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstAddressTable, Long>
		tourismBonaWaterSFFirstId = createColumn(
			"tourismBonaWaterSFFirstId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaWaterSportsFormFirstAddressTable() {
		super(
			"nbp_tourism_bona_water_sffa",
			TourismBonaWaterSportsFormFirstAddressTable::new);
	}

}