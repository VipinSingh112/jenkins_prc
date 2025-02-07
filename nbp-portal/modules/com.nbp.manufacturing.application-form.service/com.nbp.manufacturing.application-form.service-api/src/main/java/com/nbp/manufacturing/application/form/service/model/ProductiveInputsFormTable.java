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
 * The table class for the &quot;nbp_manu_productive_Inputsform&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsForm
 * @generated
 */
public class ProductiveInputsFormTable
	extends BaseTable<ProductiveInputsFormTable> {

	public static final ProductiveInputsFormTable INSTANCE =
		new ProductiveInputsFormTable();

	public final Column<ProductiveInputsFormTable, Long>
		productiveInputsFormId = createColumn(
			"productiveInputsFormId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ProductiveInputsFormTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, String> categoryOfGoods =
		createColumn(
			"categoryOfGoods", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, String> manufactureProducts =
		createColumn(
			"manufactureProducts", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, String> proposedProducts =
		createColumn(
			"proposedProducts", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, String> processType =
		createColumn(
			"processType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, String> tariffCode =
		createColumn(
			"tariffCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, String> manufactureItem =
		createColumn(
			"manufactureItem", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, String> importedCaricom =
		createColumn(
			"importedCaricom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, String>
		rawMaterialPurchased = createColumn(
			"rawMaterialPurchased", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ProductiveInputsFormTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ProductiveInputsFormTable() {
		super("nbp_manu_productive_Inputsform", ProductiveInputsFormTable::new);
	}

}