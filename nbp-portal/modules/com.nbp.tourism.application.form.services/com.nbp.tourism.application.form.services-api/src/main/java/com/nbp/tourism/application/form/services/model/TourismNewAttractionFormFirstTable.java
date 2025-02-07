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
 * The table class for the &quot;nbp_tourism_new_attraction_ff&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirst
 * @generated
 */
public class TourismNewAttractionFormFirstTable
	extends BaseTable<TourismNewAttractionFormFirstTable> {

	public static final TourismNewAttractionFormFirstTable INSTANCE =
		new TourismNewAttractionFormFirstTable();

	public final Column<TourismNewAttractionFormFirstTable, Long>
		tourismNewAttractFormFirstId = createColumn(
			"tourismNewAttractFormFirstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAttractionFormFirstTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, Date>
		attractionDateOfApplication = createColumn(
			"attractionDateOfApplication", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		typeOfAttrcation = createColumn(
			"typeOfAttrcation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionNameOfProperty = createColumn(
			"attractionNameOfProperty", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionNameOfOwner = createColumn(
			"attractionNameOfOwner", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionLocation = createColumn(
			"attractionLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionCompanyNumber = createColumn(
			"attractionCompanyNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionBusinessRegisNo = createColumn(
			"attractionBusinessRegisNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, Date>
		attractionDateOfRegistration = createColumn(
			"attractionDateOfRegistration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionOwnerTrnNumber = createColumn(
			"attractionOwnerTrnNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionTccNumber = createColumn(
			"attractionTccNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, Date>
		attractionExpiryDate = createColumn(
			"attractionExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionNameOfOperator = createColumn(
			"attractionNameOfOperator", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionoperatorTrnNumber = createColumn(
			"attractionoperatorTrnNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionOperatorTccNumber = createColumn(
			"attractionOperatorTccNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, Date>
		attractOperatorExpiryDate = createColumn(
			"attractOperatorExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionContactPerson = createColumn(
			"attractionContactPerson", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionPositionHeld = createColumn(
			"attractionPositionHeld", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionEntityId = createColumn(
			"attractionEntityId", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, String>
		attractionBriefdescription = createColumn(
			"attractionBriefdescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormFirstTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAttractionFormFirstTable() {
		super(
			"nbp_tourism_new_attraction_ff",
			TourismNewAttractionFormFirstTable::new);
	}

}