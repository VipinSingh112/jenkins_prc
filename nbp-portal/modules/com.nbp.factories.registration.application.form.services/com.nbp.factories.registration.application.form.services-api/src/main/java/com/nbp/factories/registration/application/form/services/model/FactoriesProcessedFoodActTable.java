/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_factories_pro_food_act&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProcessedFoodAct
 * @generated
 */
public class FactoriesProcessedFoodActTable
	extends BaseTable<FactoriesProcessedFoodActTable> {

	public static final FactoriesProcessedFoodActTable INSTANCE =
		new FactoriesProcessedFoodActTable();

	public final Column<FactoriesProcessedFoodActTable, Long>
		factoriesProcessedFoodActId = createColumn(
			"factoriesProcessedFoodActId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FactoriesProcessedFoodActTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, String>
		processedActEstablishmentName = createColumn(
			"processedActEstablishmentName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, String>
		processedActParishAddress = createColumn(
			"processedActParishAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, String>
		processedActAddress = createColumn(
			"processedActAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, String>
		processedActOperatorName = createColumn(
			"processedActOperatorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, String>
		processedActOperatorAddress = createColumn(
			"processedActOperatorAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, String>
		processedActParish = createColumn(
			"processedActParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, String>
		processedActDescription = createColumn(
			"processedActDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, String>
		establishmentOperated = createColumn(
			"establishmentOperated", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, Date>
		processedActLastDate = createColumn(
			"processedActLastDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, String>
		processedActManufactured = createColumn(
			"processedActManufactured", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, Date> processedActDate =
		createColumn(
			"processedActDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProcessedFoodActTable, Long>
		factoriesApplicationId = createColumn(
			"factoriesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FactoriesProcessedFoodActTable() {
		super(
			"nbp_factories_pro_food_act", FactoriesProcessedFoodActTable::new);
	}

}