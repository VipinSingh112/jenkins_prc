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
 * The table class for the &quot;nbp_factories_product_det&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProductDetailsAdd
 * @generated
 */
public class FactoriesProductDetailsAddTable
	extends BaseTable<FactoriesProductDetailsAddTable> {

	public static final FactoriesProductDetailsAddTable INSTANCE =
		new FactoriesProductDetailsAddTable();

	public final Column<FactoriesProductDetailsAddTable, Long>
		factoriesProductDetailsAddId = createColumn(
			"factoriesProductDetailsAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FactoriesProductDetailsAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, String> productBrand =
		createColumn(
			"productBrand", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, String> product =
		createColumn(
			"product", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, String> productSize =
		createColumn(
			"productSize", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, String>
		productMeasurementVal = createColumn(
			"productMeasurementVal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesProductDetailsAddTable, Long>
		factoriesApplicationId = createColumn(
			"factoriesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FactoriesProductDetailsAddTable() {
		super(
			"nbp_factories_product_det", FactoriesProductDetailsAddTable::new);
	}

}