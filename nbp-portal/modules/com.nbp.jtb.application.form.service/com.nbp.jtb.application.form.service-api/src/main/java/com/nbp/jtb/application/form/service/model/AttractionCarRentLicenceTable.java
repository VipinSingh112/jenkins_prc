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

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_car_rent_licence&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentLicence
 * @generated
 */
public class AttractionCarRentLicenceTable
	extends BaseTable<AttractionCarRentLicenceTable> {

	public static final AttractionCarRentLicenceTable INSTANCE =
		new AttractionCarRentLicenceTable();

	public final Column<AttractionCarRentLicenceTable, Long>
		attractionCarRentLicenceId = createColumn(
			"attractionCarRentLicenceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionCarRentLicenceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentApplicantName = createColumn(
			"newCarRentApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentAddress = createColumn(
			"newCarRentAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentCompanyName = createColumn(
			"newCarRentCompanyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentCompanyAddr = createColumn(
			"newCarRentCompanyAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentTelephone = createColumn(
			"newCarRentTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String> newCarRentEmail =
		createColumn(
			"newCarRentEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentManagerName = createColumn(
			"newCarRentManagerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, Date> newCarRentDate =
		createColumn(
			"newCarRentDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentVehiclesNo = createColumn(
			"newCarRentVehiclesNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentEmployeesNo = createColumn(
			"newCarRentEmployeesNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentOfficeLoc = createColumn(
			"newCarRentOfficeLoc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentPosition = createColumn(
			"newCarRentPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, String>
		newCarRentOfficeLoc1 = createColumn(
			"newCarRentOfficeLoc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, Date> newCarRentDate1 =
		createColumn(
			"newCarRentDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionCarRentLicenceTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionCarRentLicenceTable() {
		super("nbp_jtb_car_rent_licence", AttractionCarRentLicenceTable::new);
	}

}