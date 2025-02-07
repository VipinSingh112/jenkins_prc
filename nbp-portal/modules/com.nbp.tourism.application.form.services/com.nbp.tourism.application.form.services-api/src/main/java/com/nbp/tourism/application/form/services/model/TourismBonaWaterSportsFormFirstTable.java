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
 * The table class for the &quot;nbp_tourism_bona_water_sff&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirst
 * @generated
 */
public class TourismBonaWaterSportsFormFirstTable
	extends BaseTable<TourismBonaWaterSportsFormFirstTable> {

	public static final TourismBonaWaterSportsFormFirstTable INSTANCE =
		new TourismBonaWaterSportsFormFirstTable();

	public final Column<TourismBonaWaterSportsFormFirstTable, Long>
		tourismBonaWaterSFFirstId = createColumn(
			"tourismBonaWaterSFFirstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaWaterSportsFormFirstTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterTypeOfAttract = createColumn(
			"bonaWaterTypeOfAttract", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterPurposeOfIncentives = createColumn(
			"bonaWaterPurposeOfIncentives", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterOtherIncPurpose = createColumn(
			"bonaWaterOtherIncPurpose", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaNameOfWatersportsEntity = createColumn(
			"bonaNameOfWatersportsEntity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterNameOfOwnerCompany = createColumn(
			"bonaWaterNameOfOwnerCompany", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterLocation = createColumn(
			"bonaWaterLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterCompanyNo = createColumn(
			"bonaWaterCompanyNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterBusinessRegisNo = createColumn(
			"bonaWaterBusinessRegisNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, Date>
		bonaWaterDateOfRegistration = createColumn(
			"bonaWaterDateOfRegistration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterOwnerTrnNo = createColumn(
			"bonaWaterOwnerTrnNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterTccNo = createColumn(
			"bonaWaterTccNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterExpiryDate = createColumn(
			"bonaWaterExpiryDate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterNameOfOperator = createColumn(
			"bonaWaterNameOfOperator", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterOperatorTrnNo = createColumn(
			"bonaWaterOperatorTrnNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterOperatorTccNo = createColumn(
			"bonaWaterOperatorTccNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, Date>
		bonaWaterOperatorExpiryDate = createColumn(
			"bonaWaterOperatorExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterContactPerson = createColumn(
			"bonaWaterContactPerson", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterPositionHeld = createColumn(
			"bonaWaterPositionHeld", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, String>
		bonaWaterbriefdescription = createColumn(
			"bonaWaterbriefdescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormFirstTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaWaterSportsFormFirstTable() {
		super(
			"nbp_tourism_bona_water_sff",
			TourismBonaWaterSportsFormFirstTable::new);
	}

}