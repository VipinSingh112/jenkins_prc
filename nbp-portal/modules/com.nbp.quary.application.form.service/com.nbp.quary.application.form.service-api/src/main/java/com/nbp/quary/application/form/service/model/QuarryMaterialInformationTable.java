/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_material_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformation
 * @generated
 */
public class QuarryMaterialInformationTable
	extends BaseTable<QuarryMaterialInformationTable> {

	public static final QuarryMaterialInformationTable INSTANCE =
		new QuarryMaterialInformationTable();

	public final Column<QuarryMaterialInformationTable, Long> materialInfoId =
		createColumn(
			"materialInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<QuarryMaterialInformationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, String> typeOfMaterial =
		createColumn(
			"typeOfMaterial", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, String>
		reserveEstimate = createColumn(
			"reserveEstimate", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, String>
		estimateDailyProd = createColumn(
			"estimateDailyProd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, String>
		actualSizeOfQuary = createColumn(
			"actualSizeOfQuary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, String>
		hasQuarrySubmitted = createColumn(
			"hasQuarrySubmitted", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, String>
		sixCopiesOfLocation = createColumn(
			"sixCopiesOfLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, String>
		legalAccessToLand = createColumn(
			"legalAccessToLand", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, String>
		ownerShipEnclosed = createColumn(
			"ownerShipEnclosed", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, String>
		adjacentPropOwner = createColumn(
			"adjacentPropOwner", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationTable, Long>
		quarryApplicationId = createColumn(
			"quarryApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private QuarryMaterialInformationTable() {
		super("nbp_quarry_material_info", QuarryMaterialInformationTable::new);
	}

}