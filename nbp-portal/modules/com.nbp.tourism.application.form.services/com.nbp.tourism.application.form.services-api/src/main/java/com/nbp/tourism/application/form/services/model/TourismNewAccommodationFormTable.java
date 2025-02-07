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
 * The table class for the &quot;nbp_tourism_new_accommodation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationForm
 * @generated
 */
public class TourismNewAccommodationFormTable
	extends BaseTable<TourismNewAccommodationFormTable> {

	public static final TourismNewAccommodationFormTable INSTANCE =
		new TourismNewAccommodationFormTable();

	public final Column<TourismNewAccommodationFormTable, Long>
		tourismNewAccoFormId = createColumn(
			"tourismNewAccoFormId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAccommodationFormTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, Date>
		accoDateOfApplication = createColumn(
			"accoDateOfApplication", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoTypeOfAccommodation = createColumn(
			"accoTypeOfAccommodation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoNameOfProperty = createColumn(
			"accoNameOfProperty", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoNameOfOwner = createColumn(
			"accoNameOfOwner", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String> accoLocation =
		createColumn(
			"accoLocation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoCompanyNumber = createColumn(
			"accoCompanyNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoBusinessRegistrationNumber = createColumn(
			"accoBusinessRegistrationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, Date>
		accoDateOfRegistration = createColumn(
			"accoDateOfRegistration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoOwnerTrnNumber = createColumn(
			"accoOwnerTrnNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoTccNumber = createColumn(
			"accoTccNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, Date> accoExpiryDate =
		createColumn(
			"accoExpiryDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoNameOfOperator = createColumn(
			"accoNameOfOperator", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoOperatorTrnNumber = createColumn(
			"accoOperatorTrnNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoOperatorTccNumber = createColumn(
			"accoOperatorTccNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, Date>
		accoOperatorExpiryDate = createColumn(
			"accoOperatorExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoContactPerson = createColumn(
			"accoContactPerson", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, String>
		accoPositionHeld = createColumn(
			"accoPositionHeld", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccommodationFormTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAccommodationFormTable() {
		super(
			"nbp_tourism_new_accommodation",
			TourismNewAccommodationFormTable::new);
	}

}