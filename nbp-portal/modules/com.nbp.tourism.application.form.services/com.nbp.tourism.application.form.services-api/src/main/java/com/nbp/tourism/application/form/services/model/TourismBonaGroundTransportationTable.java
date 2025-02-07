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
 * The table class for the &quot;nbp_tourism_bona_ground_t&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportation
 * @generated
 */
public class TourismBonaGroundTransportationTable
	extends BaseTable<TourismBonaGroundTransportationTable> {

	public static final TourismBonaGroundTransportationTable INSTANCE =
		new TourismBonaGroundTransportationTable();

	public final Column<TourismBonaGroundTransportationTable, Long>
		tourismBonaGroundTransportId = createColumn(
			"tourismBonaGroundTransportId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaGroundTransportationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		typeOfGroundTransportation = createColumn(
			"typeOfGroundTransportation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundName = createColumn(
			"bonaGroundName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundLandlineNo = createColumn(
			"bonaGroundLandlineNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundMobileNo = createColumn(
			"bonaGroundMobileNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundFaxNo = createColumn(
			"bonaGroundFaxNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundLicensedWith = createColumn(
			"bonaGroundLicensedWith", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, Date>
		bonaGroundBoardExpiryDate = createColumn(
			"bonaGroundBoardExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundHaveYouBenefitBefore = createColumn(
			"bonaGroundHaveYouBenefitBefore", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, Date>
		bonaGroundDateOfLastBenefit = createColumn(
			"bonaGroundDateOfLastBenefit", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundEntityType = createColumn(
			"bonaGroundEntityType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundVehicleInfoMake = createColumn(
			"bonaGroundVehicleInfoMake", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundVehicleInfoModel = createColumn(
			"bonaGroundVehicleInfoModel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundVehicleInfoYear = createColumn(
			"bonaGroundVehicleInfoYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundSeatingCapacity = createColumn(
			"bonaGroundSeatingCapacity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundExistingFleetAmount = createColumn(
			"bonaGroundExistingFleetAmount", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, String>
		bonaGroundIndicateVehicleWill = createColumn(
			"bonaGroundIndicateVehicleWill", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportationTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaGroundTransportationTable() {
		super(
			"nbp_tourism_bona_ground_t",
			TourismBonaGroundTransportationTable::new);
	}

}