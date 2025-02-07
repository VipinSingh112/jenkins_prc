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
 * The table class for the &quot;nbp_tourism_new_acco_annual&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAnnualEarnings
 * @generated
 */
public class TourismNewAnnualEarningsTable
	extends BaseTable<TourismNewAnnualEarningsTable> {

	public static final TourismNewAnnualEarningsTable INSTANCE =
		new TourismNewAnnualEarningsTable();

	public final Column<TourismNewAnnualEarningsTable, Long>
		tourismNewAnnualEarningsId = createColumn(
			"tourismNewAnnualEarningsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAnnualEarningsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> yearOne =
		createColumn(
			"yearOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> yearTwo =
		createColumn(
			"yearTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> yearThree =
		createColumn(
			"yearThree", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> targetLocalPer =
		createColumn(
			"targetLocalPer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String>
		targetForeignPer = createColumn(
			"targetForeignPer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> targetCountries =
		createColumn(
			"targetCountries", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> estimatedPer =
		createColumn(
			"estimatedPer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> volume =
		createColumn(
			"volume", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> expenditure =
		createColumn(
			"expenditure", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String>
		manufactureEstimatedPer = createColumn(
			"manufactureEstimatedPer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String>
		manufactureVolume = createColumn(
			"manufactureVolume", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String>
		manufactureExpenditure = createColumn(
			"manufactureExpenditure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> seafoodPer =
		createColumn(
			"seafoodPer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> seafoodVolume =
		createColumn(
			"seafoodVolume", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String>
		seafoodExpenditure = createColumn(
			"seafoodExpenditure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> enterServices =
		createColumn(
			"enterServices", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> enterLocal =
		createColumn(
			"enterLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, String> enterForeign =
		createColumn(
			"enterForeign", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAnnualEarningsTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAnnualEarningsTable() {
		super(
			"nbp_tourism_new_acco_annual", TourismNewAnnualEarningsTable::new);
	}

}