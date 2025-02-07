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
 * The table class for the &quot;nbp_jtb_acco_non_hotel_lic&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelLicence
 * @generated
 */
public class AccoNonHotelLicenceTable
	extends BaseTable<AccoNonHotelLicenceTable> {

	public static final AccoNonHotelLicenceTable INSTANCE =
		new AccoNonHotelLicenceTable();

	public final Column<AccoNonHotelLicenceTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, Long> accoNonHotelLicenceId =
		createColumn(
			"accoNonHotelLicenceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccoNonHotelLicenceTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> accoName =
		createColumn(
			"accoName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> accoAddress =
		createColumn(
			"accoAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> accoTeleNo =
		createColumn(
			"accoTeleNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> accoFaxNo =
		createColumn(
			"accoFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> accoEmail =
		createColumn(
			"accoEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> accoNoOfEmp =
		createColumn(
			"accoNoOfEmp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> accoOfferedType =
		createColumn(
			"accoOfferedType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> noOfRooms =
		createColumn(
			"noOfRooms", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> ownerName =
		createColumn(
			"ownerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> ownerAddress =
		createColumn(
			"ownerAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> ownerTeleNo =
		createColumn(
			"ownerTeleNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> ownerFaxNo =
		createColumn(
			"ownerFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> operCompName =
		createColumn(
			"operCompName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> operAddress =
		createColumn(
			"operAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> managerName =
		createColumn(
			"managerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> managerAddress =
		createColumn(
			"managerAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> managerTeleNo =
		createColumn(
			"managerTeleNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> managerFaxNo =
		createColumn(
			"managerFaxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, String> managerEmail =
		createColumn(
			"managerEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelLicenceTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AccoNonHotelLicenceTable() {
		super("nbp_jtb_acco_non_hotel_lic", AccoNonHotelLicenceTable::new);
	}

}