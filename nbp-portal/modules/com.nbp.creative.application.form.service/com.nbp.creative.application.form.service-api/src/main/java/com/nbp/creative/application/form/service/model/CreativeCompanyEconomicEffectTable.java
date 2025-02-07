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
 * The table class for the &quot;nbp_creative_com_eco_effect&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyEconomicEffect
 * @generated
 */
public class CreativeCompanyEconomicEffectTable
	extends BaseTable<CreativeCompanyEconomicEffectTable> {

	public static final CreativeCompanyEconomicEffectTable INSTANCE =
		new CreativeCompanyEconomicEffectTable();

	public final Column<CreativeCompanyEconomicEffectTable, Long>
		creativeComEconomicEffectId = createColumn(
			"creativeComEconomicEffectId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeCompanyEconomicEffectTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		assessmentcountryOfOrigin = createColumn(
			"assessmentcountryOfOrigin", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		ssessmentjointVenture = createColumn(
			"ssessmentjointVenture", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		assessmentLocal = createColumn(
			"assessmentLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		assessmentForeign = createColumn(
			"assessmentForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String> shareJmd =
		createColumn(
			"shareJmd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		shareExchangeRate = createColumn(
			"shareExchangeRate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String> shareUsd =
		createColumn(
			"shareUsd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String> localJmd =
		createColumn(
			"localJmd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		localExchangeRate = createColumn(
			"localExchangeRate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String> localUsd =
		createColumn(
			"localUsd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String> otherJmd =
		createColumn(
			"otherJmd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		otherExchangeRate = createColumn(
			"otherExchangeRate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String> OtherUsd =
		createColumn(
			"OtherUsd", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		permanentLocalMale = createColumn(
			"permanentLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		permanentLocalFemale = createColumn(
			"permanentLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		permanentForeignMale = createColumn(
			"permanentForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		permanentForeignFemale = createColumn(
			"permanentForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		temporaryLocalMale = createColumn(
			"temporaryLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		temporaryLocalFemale = createColumn(
			"temporaryLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		temporaryForeignMale = createColumn(
			"temporaryForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		temporaryForgeignFemale = createColumn(
			"temporaryForgeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		totalLocalMale = createColumn(
			"totalLocalMale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		totalLocalFemale = createColumn(
			"totalLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		totalForeignMale = createColumn(
			"totalForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, String>
		totalForeignFemale = createColumn(
			"totalForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyEconomicEffectTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeCompanyEconomicEffectTable() {
		super(
			"nbp_creative_com_eco_effect",
			CreativeCompanyEconomicEffectTable::new);
	}

}