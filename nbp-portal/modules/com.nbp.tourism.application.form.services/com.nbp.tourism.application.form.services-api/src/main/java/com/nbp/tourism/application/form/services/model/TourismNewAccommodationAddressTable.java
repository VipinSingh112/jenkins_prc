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
 * The table class for the &quot;nbp_tourism_new_accco_aoo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationAddress
 * @generated
 */
public class TourismNewAccommodationAddressTable
	extends BaseTable<TourismNewAccommodationAddressTable> {

	public static final TourismNewAccommodationAddressTable INSTANCE =
		new TourismNewAccommodationAddressTable();

	public final Column<TourismNewAccommodationAddressTable, Long>
		tourismNewAccommodationAOOId = createColumn(
			"tourismNewAccommodationAOOId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAccommodationAddressTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, String>
		addressType = createColumn(
			"addressType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, String>
		accoAddress = createColumn(
			"accoAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, String>
		accoTelephoneNumber = createColumn(
			"accoTelephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, String>
		accoFaxNumber = createColumn(
			"accoFaxNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, String> accoEmail =
		createColumn(
			"accoEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationAddressTable, Long>
		tourismNewAccoFormId = createColumn(
			"tourismNewAccoFormId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAccommodationAddressTable() {
		super(
			"nbp_tourism_new_accco_aoo",
			TourismNewAccommodationAddressTable::new);
	}

}