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
 * The table class for the &quot;nbp_tourism_bona_attraction_fs&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormSecond
 * @generated
 */
public class TourismBonaAttractionFormSecondTable
	extends BaseTable<TourismBonaAttractionFormSecondTable> {

	public static final TourismBonaAttractionFormSecondTable INSTANCE =
		new TourismBonaAttractionFormSecondTable();

	public final Column<TourismBonaAttractionFormSecondTable, Long>
		tourismBonaAttractFormSecId = createColumn(
			"tourismBonaAttractFormSecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaAttractionFormSecondTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaTargetMarketLocal = createColumn(
			"bonaTargetMarketLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaTargetMarketForeign = createColumn(
			"bonaTargetMarketForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaTargetMarketCountries = createColumn(
			"bonaTargetMarketCountries", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaOwnerCountryOfOrigin = createColumn(
			"bonaOwnerCountryOfOrigin", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaOwnerJointVenture = createColumn(
			"bonaOwnerJointVenture", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaOwnerLocal = createColumn(
			"bonaOwnerLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaOwnerForeign = createColumn(
			"bonaOwnerForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaCapitalUSComponent = createColumn(
			"bonaCapitalUSComponent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaCapitalizationJEquivalent = createColumn(
			"bonaCapitalizationJEquivalent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaCapitalRateOfExchange = createColumn(
			"bonaCapitalRateOfExchange", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaCapitalizationJComponent = createColumn(
			"bonaCapitalizationJComponent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaCapitalCapitalInvest = createColumn(
			"bonaCapitalCapitalInvest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaSourcesLoan = createColumn(
			"bonaSourcesLoan ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaSourcesEquity = createColumn(
			"bonaSourcesEquity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaSourcesStateOfLoanFinanc = createColumn(
			"bonaSourcesStateOfLoanFinanc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaAnnualProjectedYearOne = createColumn(
			"bonaAnnualProjectedYearOne ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaAnnualProjectedYearTwo = createColumn(
			"bonaAnnualProjectedYearTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaAnnualProjectedYearThree = createColumn(
			"bonaAnnualProjectedYearThree ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, String>
		bonaAnnualProjectedNumber = createColumn(
			"bonaAnnualProjectedNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionFormSecondTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaAttractionFormSecondTable() {
		super(
			"nbp_tourism_bona_attraction_fs",
			TourismBonaAttractionFormSecondTable::new);
	}

}