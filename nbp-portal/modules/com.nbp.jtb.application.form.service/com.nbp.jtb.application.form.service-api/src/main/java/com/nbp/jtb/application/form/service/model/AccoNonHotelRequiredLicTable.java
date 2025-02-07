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
 * The table class for the &quot;nbp_jtb_non_hotel_req_lic&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelRequiredLic
 * @generated
 */
public class AccoNonHotelRequiredLicTable
	extends BaseTable<AccoNonHotelRequiredLicTable> {

	public static final AccoNonHotelRequiredLicTable INSTANCE =
		new AccoNonHotelRequiredLicTable();

	public final Column<AccoNonHotelRequiredLicTable, Long>
		accoNonHotelRequiredLicId = createColumn(
			"accoNonHotelRequiredLicId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccoNonHotelRequiredLicTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelRequiredLicTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelRequiredLicTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelRequiredLicTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelRequiredLicTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelRequiredLicTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelRequiredLicTable, String> requiredLicence =
		createColumn(
			"requiredLicence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelRequiredLicTable, String> requiredBedroom =
		createColumn(
			"requiredBedroom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelRequiredLicTable, String> requiredBathroom =
		createColumn(
			"requiredBathroom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelRequiredLicTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AccoNonHotelRequiredLicTable() {
		super("nbp_jtb_non_hotel_req_lic", AccoNonHotelRequiredLicTable::new);
	}

}