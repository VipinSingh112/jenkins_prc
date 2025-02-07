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
 * The table class for the &quot;nbp_manu_pro_input_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormAdd
 * @generated
 */
public class ProductiveInputsFormAddTable
	extends BaseTable<ProductiveInputsFormAddTable> {

	public static final ProductiveInputsFormAddTable INSTANCE =
		new ProductiveInputsFormAddTable();

	public final Column<ProductiveInputsFormAddTable, Long>
		productiveInputsFormAddId = createColumn(
			"productiveInputsFormAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ProductiveInputsFormAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, String> processType =
		createColumn(
			"processType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, String> tariffCode =
		createColumn(
			"tariffCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, String> manufactureItem =
		createColumn(
			"manufactureItem", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, String> importedCaricom =
		createColumn(
			"importedCaricom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormAddTable, Long>
		productiveInputsFormId = createColumn(
			"productiveInputsFormId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ProductiveInputsFormAddTable() {
		super("nbp_manu_pro_input_add", ProductiveInputsFormAddTable::new);
	}

}