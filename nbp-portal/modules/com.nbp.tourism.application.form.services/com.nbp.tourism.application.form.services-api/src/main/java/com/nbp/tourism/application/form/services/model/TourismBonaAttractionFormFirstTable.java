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
 * The table class for the &quot;nbp_tourism_bona_attraction_ff&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirst
 * @generated
 */
public class TourismBonaAttractionFormFirstTable
	extends BaseTable<TourismBonaAttractionFormFirstTable> {

	public static final TourismBonaAttractionFormFirstTable INSTANCE =
		new TourismBonaAttractionFormFirstTable();

	public final Column<TourismBonaAttractionFormFirstTable, Long>
		tourismBonaAttractFormFirstId = createColumn(
			"tourismBonaAttractFormFirstId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaAttractionFormFirstTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, Date>
		bonaAttractDateOfApplication = createColumn(
			"bonaAttractDateOfApplication", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaTypeOfAttrcation = createColumn(
			"bonaTypeOfAttrcation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractPurposeOfIncentives = createColumn(
			"bonaAttractPurposeOfIncentives", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractOtherIncPurpose = createColumn(
			"bonaAttractOtherIncPurpose", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractionNameOfProperty = createColumn(
			"bonaAttractionNameOfProperty", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractionNameOfOwner = createColumn(
			"bonaAttractionNameOfOwner", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractionLocation = createColumn(
			"bonaAttractionLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractionCompanyNumber = createColumn(
			"bonaAttractionCompanyNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractionBusinessRegisNo = createColumn(
			"bonaAttractionBusinessRegisNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, Date>
		bonaAttractionDateOfRegis = createColumn(
			"bonaAttractionDateOfRegis", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractionOwnerTrnNumber = createColumn(
			"bonaAttractionOwnerTrnNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractionTccNumber = createColumn(
			"bonaAttractionTccNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, Date>
		bonaAttractionExpiryDate = createColumn(
			"bonaAttractionExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractionNameOfOperator = createColumn(
			"bonaAttractionNameOfOperator", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractionoperatorTrnNo = createColumn(
			"bonaAttractionoperatorTrnNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonattractionOperatorTccNO = createColumn(
			"bonattractionOperatorTccNO", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, Date>
		bonaAttractOperatorExpiryDate = createColumn(
			"bonaAttractOperatorExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractContactPerson = createColumn(
			"bonaAttractContactPerson", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractPositionHeld = createColumn(
			"bonaAttractPositionHeld", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractEntityId = createColumn(
			"bonaAttractEntityId", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, String>
		bonaAttractionBriefdescription = createColumn(
			"bonaAttractionBriefdescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormFirstTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaAttractionFormFirstTable() {
		super(
			"nbp_tourism_bona_attraction_ff",
			TourismBonaAttractionFormFirstTable::new);
	}

}