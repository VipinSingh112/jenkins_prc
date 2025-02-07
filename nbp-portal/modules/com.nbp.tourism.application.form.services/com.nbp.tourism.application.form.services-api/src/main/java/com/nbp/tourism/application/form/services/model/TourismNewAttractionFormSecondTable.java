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
 * The table class for the &quot;nbp_tourism_new_attraction_fs&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormSecond
 * @generated
 */
public class TourismNewAttractionFormSecondTable
	extends BaseTable<TourismNewAttractionFormSecondTable> {

	public static final TourismNewAttractionFormSecondTable INSTANCE =
		new TourismNewAttractionFormSecondTable();

	public final Column<TourismNewAttractionFormSecondTable, Long>
		tourismNewAttractionFormSecId = createColumn(
			"tourismNewAttractionFormSecId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAttractionFormSecondTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		targetMarketLocal = createColumn(
			"targetMarketLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		targetMarketForeign = createColumn(
			"targetMarketForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		targetMarketCountries = createColumn(
			"targetMarketCountries", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		ownerCountryOfOrigin = createColumn(
			"ownerCountryOfOrigin", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		ownerJointVenture = createColumn(
			"ownerJointVenture", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		ownerLocal = createColumn(
			"ownerLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		ownerForeign = createColumn(
			"ownerForeign", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		capitalizationUSComponent = createColumn(
			"capitalizationUSComponent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		capitalizationJEquivalent = createColumn(
			"capitalizationJEquivalent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		capitalizationRateOfExchange = createColumn(
			"capitalizationRateOfExchange", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		capitalizationJComponent = createColumn(
			"capitalizationJComponent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		capitalizationCapitalInvest = createColumn(
			"capitalizationCapitalInvest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		sourcesLoan = createColumn(
			"sourcesLoan ", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		sourcesEquity = createColumn(
			"sourcesEquity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		sourcesStateSourceOfLoanFinanc = createColumn(
			"sourcesStateSourceOfLoanFinanc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		annualProjectedOne = createColumn(
			"annualProjectedOne ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		annualProjectedTwo = createColumn(
			"annualProjectedTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		annualProjectedThree = createColumn(
			"annualProjectedThree ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, String>
		annualProjectedNumber = createColumn(
			"annualProjectedNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionFormSecondTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAttractionFormSecondTable() {
		super(
			"nbp_tourism_new_attraction_fs",
			TourismNewAttractionFormSecondTable::new);
	}

}