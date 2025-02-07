/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_creative_economic_effect&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualEconomicEffect
 * @generated
 */
public class CreativeIndividualEconomicEffectTable
	extends BaseTable<CreativeIndividualEconomicEffectTable> {

	public static final CreativeIndividualEconomicEffectTable INSTANCE =
		new CreativeIndividualEconomicEffectTable();

	public final Column<CreativeIndividualEconomicEffectTable, Long>
		creativeIndiEcoEffectId = createColumn(
			"creativeIndiEcoEffectId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeIndividualEconomicEffectTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		shareCapitalJmd = createColumn(
			"shareCapitalJmd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		shareCapitalExchangeRate = createColumn(
			"shareCapitalExchangeRate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		shareCapitalUsd = createColumn(
			"shareCapitalUsd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		localCapitalJmd = createColumn(
			"localCapitalJmd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		localCapitalExchangeRate = createColumn(
			"localCapitalExchangeRate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		localCapitalUsd = createColumn(
			"localCapitalUsd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		otherJmd = createColumn(
			"otherJmd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		otherExchangeRate = createColumn(
			"otherExchangeRate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		otherUsd = createColumn(
			"otherUsd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		estimatedLocalExpenditure = createColumn(
			"estimatedLocalExpenditure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		otherEstimatedLocal = createColumn(
			"otherEstimatedLocal ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		annualYearOne = createColumn(
			"annualYearOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		annualOneUsd = createColumn(
			"annualOneUsd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		annualYearTwo = createColumn(
			"annualYearTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		annualTwoUsd = createColumn(
			"annualTwoUsd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		annualYearThree = createColumn(
			"annualYearThree", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		annualThreeUsd = createColumn(
			"annualThreeUsd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		targetMarketLocal = createColumn(
			"targetMarketLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		targetMarketForeign = createColumn(
			"targetMarketForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		targetMarketCountries = createColumn(
			"targetMarketCountries", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, String>
		declareInformationProvide = createColumn(
			"declareInformationProvide", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeIndividualEconomicEffectTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeIndividualEconomicEffectTable() {
		super(
			"nbp_creative_economic_effect",
			CreativeIndividualEconomicEffectTable::new);
	}

}