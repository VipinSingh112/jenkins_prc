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
 * The table class for the &quot;nbp_jtb_place_interest&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionPlaceOfInterest
 * @generated
 */
public class AttractionPlaceOfInterestTable
	extends BaseTable<AttractionPlaceOfInterestTable> {

	public static final AttractionPlaceOfInterestTable INSTANCE =
		new AttractionPlaceOfInterestTable();

	public final Column<AttractionPlaceOfInterestTable, Long>
		attractionPlaceOfInterestId = createColumn(
			"attractionPlaceOfInterestId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionPlaceOfInterestTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterest = createColumn(
			"placeOfInterest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String> typeOfRole =
		createColumn(
			"typeOfRole", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeInterestOwnerName = createColumn(
			"placeInterestOwnerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		nameOfInterestLocation = createColumn(
			"nameOfInterestLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestLocation = createColumn(
			"placeOfInterestLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestMailing = createColumn(
			"placeOfInterestMailing", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestTelephone = createColumn(
			"placeOfInterestTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestEmail = createColumn(
			"placeOfInterestEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestEmployeesNo = createColumn(
			"placeOfInterestEmployeesNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestParish = createColumn(
			"placeOfInterestParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestOwnerGenDec = createColumn(
			"placeOfInterestOwnerGenDec", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestHotelLaws = createColumn(
			"placeOfInterestHotelLaws", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, Date>
		placeOfInterestDate = createColumn(
			"placeOfInterestDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestName = createColumn(
			"placeOfInterestName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, Date>
		placeOfInterestOperating = createColumn(
			"placeOfInterestOperating", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestAcresLand = createColumn(
			"placeOfInterestAcresLand", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String> walkingTour =
		createColumn(
			"walkingTour", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String> cemeteryTour =
		createColumn(
			"cemeteryTour", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String> gardenTour =
		createColumn(
			"gardenTour", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestRooms = createColumn(
			"placeOfInterestRooms", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestTentSpace = createColumn(
			"placeOfInterestTentSpace", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestShowers = createColumn(
			"placeOfInterestShowers", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, String>
		placeOfInterestSanitary = createColumn(
			"placeOfInterestSanitary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, Date>
		placeOfInterestSignDate = createColumn(
			"placeOfInterestSignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionPlaceOfInterestTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionPlaceOfInterestTable() {
		super("nbp_jtb_place_interest", AttractionPlaceOfInterestTable::new);
	}

}