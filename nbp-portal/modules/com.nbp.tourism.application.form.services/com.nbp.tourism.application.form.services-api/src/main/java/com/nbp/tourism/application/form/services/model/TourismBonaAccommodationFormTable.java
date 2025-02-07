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
 * The table class for the &quot;nbp_tourism_bona_af&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationForm
 * @generated
 */
public class TourismBonaAccommodationFormTable
	extends BaseTable<TourismBonaAccommodationFormTable> {

	public static final TourismBonaAccommodationFormTable INSTANCE =
		new TourismBonaAccommodationFormTable();

	public final Column<TourismBonaAccommodationFormTable, Long>
		tourismBonaAFId = createColumn(
			"tourismBonaAFId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<TourismBonaAccommodationFormTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, Date>
		bonaAccoDateOfApplication = createColumn(
			"bonaAccoDateOfApplication", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoTypeOfAccommodation = createColumn(
			"bonaAccoTypeOfAccommodation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoPurposeOfIncentives = createColumn(
			"bonaAccoPurposeOfIncentives", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoOtherIncPurpose = createColumn(
			"bonaAccoOtherIncPurpose", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoNameOfProperty = createColumn(
			"bonaAccoNameOfProperty", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoNameOfOwner = createColumn(
			"bonaAccoNameOfOwner", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoLocation = createColumn(
			"bonaAccoLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoCompanyNumber = createColumn(
			"bonaAccoCompanyNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaBusinessRegistrationNumber = createColumn(
			"bonaBusinessRegistrationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, Date>
		bonaAccoDateOfRegistration = createColumn(
			"bonaAccoDateOfRegistration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoOwnerTrnNumber = createColumn(
			"bonaAccoOwnerTrnNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoTccNumber = createColumn(
			"bonaAccoTccNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, Date>
		bonaAccoExpiryDate = createColumn(
			"bonaAccoExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoNameOfOperator = createColumn(
			"bonaAccoNameOfOperator", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoOperatorTrnNumber = createColumn(
			"bonaAccoOperatorTrnNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoOperatorTccNumber = createColumn(
			"bonaAccoOperatorTccNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, Date>
		bonaAccoOperatorExpiryDate = createColumn(
			"bonaAccoOperatorExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoContactPerson = createColumn(
			"bonaAccoContactPerson", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, String>
		bonaAccoPositionHeld = createColumn(
			"bonaAccoPositionHeld", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccommodationFormTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaAccommodationFormTable() {
		super("nbp_tourism_bona_af", TourismBonaAccommodationFormTable::new);
	}

}