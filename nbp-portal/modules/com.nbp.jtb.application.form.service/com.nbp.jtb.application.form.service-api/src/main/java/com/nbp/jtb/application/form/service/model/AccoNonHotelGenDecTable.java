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
 * The table class for the &quot;nbp_jtb_acco_non_hotel_gen&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelGenDec
 * @generated
 */
public class AccoNonHotelGenDecTable
	extends BaseTable<AccoNonHotelGenDecTable> {

	public static final AccoNonHotelGenDecTable INSTANCE =
		new AccoNonHotelGenDecTable();

	public final Column<AccoNonHotelGenDecTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, Long> accoNonHotelGenDecId =
		createColumn(
			"accoNonHotelGenDecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccoNonHotelGenDecTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, String> nhAccoOperatorName =
		createColumn(
			"nhAccoOperatorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, Date> dateFrom = createColumn(
		"dateFrom", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, Date> dateTo = createColumn(
		"dateTo", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, Date> nhAccoSince =
		createColumn(
			"nhAccoSince", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, Date> nhAccoDate =
		createColumn(
			"nhAccoDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoNonHotelGenDecTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AccoNonHotelGenDecTable() {
		super("nbp_jtb_acco_non_hotel_gen", AccoNonHotelGenDecTable::new);
	}

}