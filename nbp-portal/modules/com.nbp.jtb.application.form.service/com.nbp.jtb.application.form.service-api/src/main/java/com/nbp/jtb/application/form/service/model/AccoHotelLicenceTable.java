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
 * The table class for the &quot;nbp_jtb_acco_licence&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccoHotelLicence
 * @generated
 */
public class AccoHotelLicenceTable extends BaseTable<AccoHotelLicenceTable> {

	public static final AccoHotelLicenceTable INSTANCE =
		new AccoHotelLicenceTable();

	public final Column<AccoHotelLicenceTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, Long> accoHotelLicenceId =
		createColumn(
			"accoHotelLicenceId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccoHotelLicenceTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, String> nameOfOwner =
		createColumn(
			"nameOfOwner", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, String> nameOfHotel =
		createColumn(
			"nameOfHotel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, String> telephoneNo =
		createColumn(
			"telephoneNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, String> faxNo = createColumn(
		"faxNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, String> parish = createColumn(
		"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHotelLicenceTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AccoHotelLicenceTable() {
		super("nbp_jtb_acco_licence", AccoHotelLicenceTable::new);
	}

}