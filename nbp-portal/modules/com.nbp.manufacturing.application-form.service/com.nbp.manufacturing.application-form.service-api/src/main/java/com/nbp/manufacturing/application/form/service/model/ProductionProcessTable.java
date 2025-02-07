/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manufacture_production_pro&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ProductionProcess
 * @generated
 */
public class ProductionProcessTable extends BaseTable<ProductionProcessTable> {

	public static final ProductionProcessTable INSTANCE =
		new ProductionProcessTable();

	public final Column<ProductionProcessTable, Long> productionProcessId =
		createColumn(
			"productionProcessId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ProductionProcessTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductionProcessTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductionProcessTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductionProcessTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductionProcessTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProductionProcessTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProductionProcessTable, String> productionProcess =
		createColumn(
			"productionProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProductionProcessTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ProductionProcessTable() {
		super("nbp_manufacture_production_pro", ProductionProcessTable::new);
	}

}