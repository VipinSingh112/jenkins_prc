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
 * The table class for the &quot;nbp_tourism_new_ground_tarns&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundTransportation
 * @generated
 */
public class TourismNewGroundTransportationTable
	extends BaseTable<TourismNewGroundTransportationTable> {

	public static final TourismNewGroundTransportationTable INSTANCE =
		new TourismNewGroundTransportationTable();

	public final Column<TourismNewGroundTransportationTable, Long>
		TourismNewGroundTransId = createColumn(
			"TourismNewGroundTransId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewGroundTransportationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		typeOfGroundTransportation = createColumn(
			"typeOfGroundTransportation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundName = createColumn(
			"newGroundName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundHomeAddress = createColumn(
			"newGroundHomeAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundBusinessAddress = createColumn(
			"newGroundBusinessAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundLandlineNo = createColumn(
			"newGroundLandlineNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundMobileNo = createColumn(
			"newGroundMobileNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundFaxNo = createColumn(
			"newGroundFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundLicensedWith = createColumn(
			"newGroundLicensedWith", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, Date>
		newGroundBoardExpiryDate = createColumn(
			"newGroundBoardExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundHaveYouBenefitBefore = createColumn(
			"newGroundHaveYouBenefitBefore", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, Date>
		newGroundHaveBenefitDate = createColumn(
			"newGroundHaveBenefitDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundEntityType = createColumn(
			"newGroundEntityType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundVehicleInfoMake = createColumn(
			"newGroundVehicleInfoMake", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundVehicleInfoModel = createColumn(
			"newGroundVehicleInfoModel", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundVehicleInfoYear = createColumn(
			"newGroundVehicleInfoYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundSeatingCapacity = createColumn(
			"newGroundSeatingCapacity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundExistingFleetAmount = createColumn(
			"newGroundExistingFleetAmount", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, String>
		newGroundIndicateVehicleWill = createColumn(
			"newGroundIndicateVehicleWill", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewGroundTransportationTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewGroundTransportationTable() {
		super(
			"nbp_tourism_new_ground_tarns",
			TourismNewGroundTransportationTable::new);
	}

}