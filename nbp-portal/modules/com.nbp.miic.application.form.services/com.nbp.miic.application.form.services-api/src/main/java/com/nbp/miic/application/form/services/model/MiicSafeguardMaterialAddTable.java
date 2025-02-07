/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_miic_safeguard_material&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardMaterialAdd
 * @generated
 */
public class MiicSafeguardMaterialAddTable
	extends BaseTable<MiicSafeguardMaterialAddTable> {

	public static final MiicSafeguardMaterialAddTable INSTANCE =
		new MiicSafeguardMaterialAddTable();

	public final Column<MiicSafeguardMaterialAddTable, Long>
		miicSafeguardMaterialAddId = createColumn(
			"miicSafeguardMaterialAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiicSafeguardMaterialAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, String> nameOfProducer =
		createColumn(
			"nameOfProducer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, String>
		addressOfProducer = createColumn(
			"addressOfProducer ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, String> description =
		createColumn(
			"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, String>
		tariffHeadingNum = createColumn(
			"tariffHeadingNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, String> amount =
		createColumn(
			"amount", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, String> quantity =
		createColumn(
			"quantity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, String>
		technologySpecification = createColumn(
			"technologySpecification", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, Date>
		periodOfImportationFrom = createColumn(
			"periodOfImportationFrom", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, Date>
		periodOfImportationTo = createColumn(
			"periodOfImportationTo", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardMaterialAddTable, Long> miicApplicationId =
		createColumn(
			"miicApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private MiicSafeguardMaterialAddTable() {
		super(
			"nbp_miic_safeguard_material", MiicSafeguardMaterialAddTable::new);
	}

}