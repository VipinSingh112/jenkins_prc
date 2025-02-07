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
 * The table class for the &quot;nbp_tourism_bona_ground_tcr&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportatioCarRental
 * @generated
 */
public class TourismBonaGroundTransportatioCarRentalTable
	extends BaseTable<TourismBonaGroundTransportatioCarRentalTable> {

	public static final TourismBonaGroundTransportatioCarRentalTable INSTANCE =
		new TourismBonaGroundTransportatioCarRentalTable();

	public final Column<TourismBonaGroundTransportatioCarRentalTable, Long>
		tourismBonaGroundTransportCRId = createColumn(
			"tourismBonaGroundTransportCRId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		TypeOfGroundTransportation = createColumn(
			"TypeOfGroundTransportation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, Date>
		bonaGroundDateOfApplication = createColumn(
			"bonaGroundDateOfApplication", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundNameOfCompany = createColumn(
			"bonaGroundNameOfCompany", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundTradingName = createColumn(
			"bonaGroundTradingName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundCompanyRegisNo = createColumn(
			"bonaGroundCompanyRegisNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundTelephonNo = createColumn(
			"bonaGroundTelephonNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundAddress = createColumn(
			"bonaGroundAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundEmailAddress = createColumn(
			"bonaGroundEmailAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundContactPerson = createColumn(
			"bonaGroundContactPerson", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundEntityType = createColumn(
			"bonaGroundEntityType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundTccNo = createColumn(
			"bonaGroundTccNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, Date>
		bonaGroundExpiryDate = createColumn(
			"bonaGroundExpiryDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundCopyAttached = createColumn(
			"bonaGroundCopyAttached", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundJtbLicense = createColumn(
			"bonaGroundJtbLicense", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, Date>
		bonaGroundExpiryDateTwo = createColumn(
			"bonaGroundExpiryDateTwo", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundCopyAttachedTwo = createColumn(
			"bonaGroundCopyAttachedTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundTrnNo = createColumn(
			"bonaGroundTrnNo ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundYearInBusiness = createColumn(
			"bonaGroundYearInBusiness", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundCopyOfRegAttached = createColumn(
			"bonaGroundCopyOfRegAttached ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundExistingFleetAmount = createColumn(
			"bonaGroundExistingFleetAmount", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundTotalVehicles = createColumn(
			"bonaGroundTotalVehicles", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundHowAdditionToFleet = createColumn(
			"bonaGroundHowAdditionToFleet", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundReplacement = createColumn(
			"bonaGroundReplacement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundSummaryDealer = createColumn(
			"bonaGroundSummaryDealer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundSummaryNumOfVechicle = createColumn(
			"bonaGroundSummaryNumOfVechicle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundSummarYear = createColumn(
			"bonaGroundSummarYear", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundSummaryType = createColumn(
			"bonaGroundSummaryType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundSummaryCCRating = createColumn(
			"bonaGroundSummaryCCRating", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundSummaryCommentary = createColumn(
			"bonaGroundSummaryCommentary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, String>
		bonaGroundDescription = createColumn(
			"bonaGroundDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaGroundTransportatioCarRentalTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaGroundTransportatioCarRentalTable() {
		super(
			"nbp_tourism_bona_ground_tcr",
			TourismBonaGroundTransportatioCarRentalTable::new);
	}

}