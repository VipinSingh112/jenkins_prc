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
 * The table class for the &quot;nbp_tourism_bona_water_ssf&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormSecond
 * @generated
 */
public class TourismBonaWaterSportsFormSecondTable
	extends BaseTable<TourismBonaWaterSportsFormSecondTable> {

	public static final TourismBonaWaterSportsFormSecondTable INSTANCE =
		new TourismBonaWaterSportsFormSecondTable();

	public final Column<TourismBonaWaterSportsFormSecondTable, Long>
		tourismBonaWaterSportsFSecId = createColumn(
			"tourismBonaWaterSportsFSecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaWaterSportsFormSecondTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaTargetMarketLocal = createColumn(
			"bonaTargetMarketLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaTargetMarketForeign = createColumn(
			"bonaTargetMarketForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaTargetMarketCountries = createColumn(
			"bonaTargetMarketCountries", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaOwnerCountryOfOrigin = createColumn(
			"bonaOwnerCountryOfOrigin", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaOwnerJointVenture = createColumn(
			"bonaOwnerJointVenture", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaOwnerLocal = createColumn(
			"bonaOwnerLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaOwnerForeign = createColumn(
			"bonaOwnerForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaCapitalizationUSComponent = createColumn(
			"bonaCapitalizationUSComponent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaCapitalizationJEquivalent = createColumn(
			"bonaCapitalizationJEquivalent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaCapitalizationRateExchange = createColumn(
			"bonaCapitalizationRateExchange", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaCapitalizationJComponent = createColumn(
			"bonaCapitalizationJComponent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaCapitalCapitalInvest = createColumn(
			"bonaCapitalCapitalInvest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaSourcesLoan = createColumn(
			"bonaSourcesLoan ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaSourcesEquity = createColumn(
			"bonaSourcesEquity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaSourcesStateOfFinanc = createColumn(
			"bonaSourcesStateOfFinanc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaAnnualProjectedOne = createColumn(
			"bonaAnnualProjectedOne ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaAnnualProjectedTwo = createColumn(
			"bonaAnnualProjectedTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaAnnualProjectedThree = createColumn(
			"bonaAnnualProjectedThree ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, String>
		bonaAnnualProjectedNumber = createColumn(
			"bonaAnnualProjectedNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportsFormSecondTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaWaterSportsFormSecondTable() {
		super(
			"nbp_tourism_bona_water_ssf",
			TourismBonaWaterSportsFormSecondTable::new);
	}

}