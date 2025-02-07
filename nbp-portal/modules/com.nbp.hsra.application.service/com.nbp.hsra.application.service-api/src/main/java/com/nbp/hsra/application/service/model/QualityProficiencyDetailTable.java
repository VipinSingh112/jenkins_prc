/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_quality_proficient&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QualityProficiencyDetail
 * @generated
 */
public class QualityProficiencyDetailTable
	extends BaseTable<QualityProficiencyDetailTable> {

	public static final QualityProficiencyDetailTable INSTANCE =
		new QualityProficiencyDetailTable();

	public final Column<QualityProficiencyDetailTable, Long>
		qualityProficiDetailId = createColumn(
			"qualityProficiDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QualityProficiencyDetailTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String>
		proficiencyDetails = createColumn(
			"proficiencyDetails", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> workDurationOne =
		createColumn(
			"workDurationOne", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacityOne =
		createColumn(
			"capacityOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> workDurationTwo =
		createColumn(
			"workDurationTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacityTwo =
		createColumn(
			"capacityTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String>
		workDurationThree = createColumn(
			"workDurationThree", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacityThree =
		createColumn(
			"capacityThree", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String>
		workDurationFour = createColumn(
			"workDurationFour", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacityFour =
		createColumn(
			"capacityFour", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String>
		workDurationFive = createColumn(
			"workDurationFive", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacityFive =
		createColumn(
			"capacityFive", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> workDurationSix =
		createColumn(
			"workDurationSix", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacitySix =
		createColumn(
			"capacitySix", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String>
		workDurationSeven = createColumn(
			"workDurationSeven", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacitySeven =
		createColumn(
			"capacitySeven", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String>
		workDurationEight = createColumn(
			"workDurationEight", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacityEight =
		createColumn(
			"capacityEight", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String>
		workDurationNine = createColumn(
			"workDurationNine", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacityNine =
		createColumn(
			"capacityNine", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> workDurationTen =
		createColumn(
			"workDurationTen", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacityTen =
		createColumn(
			"capacityTen", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String>
		workDurationEleven = createColumn(
			"workDurationEleven", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacityEleven =
		createColumn(
			"capacityEleven", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String>
		workDurationTwelve = createColumn(
			"workDurationTwelve", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, String> capacityTwelve =
		createColumn(
			"capacityTwelve", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QualityProficiencyDetailTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private QualityProficiencyDetailTable() {
		super(
			"nbp_hsra_quality_proficient", QualityProficiencyDetailTable::new);
	}

}