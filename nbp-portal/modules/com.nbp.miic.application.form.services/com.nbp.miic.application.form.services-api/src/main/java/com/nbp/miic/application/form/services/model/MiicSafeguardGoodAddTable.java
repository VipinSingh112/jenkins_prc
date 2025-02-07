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
 * The table class for the &quot;nbp_miic_safeguard_good&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardGoodAdd
 * @generated
 */
public class MiicSafeguardGoodAddTable
	extends BaseTable<MiicSafeguardGoodAddTable> {

	public static final MiicSafeguardGoodAddTable INSTANCE =
		new MiicSafeguardGoodAddTable();

	public final Column<MiicSafeguardGoodAddTable, Long>
		miicSafeguardGoodAddId = createColumn(
			"miicSafeguardGoodAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiicSafeguardGoodAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, String> tariffHeadingNum =
		createColumn(
			"tariffHeadingNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, String> description =
		createColumn(
			"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, String> amountQuantity =
		createColumn(
			"amountQuantity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, String> amountEstimate =
		createColumn(
			"amountEstimate", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, String> resonForRequest =
		createColumn(
			"resonForRequest", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicSafeguardGoodAddTable, Long> miicApplicationId =
		createColumn(
			"miicApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private MiicSafeguardGoodAddTable() {
		super("nbp_miic_safeguard_good", MiicSafeguardGoodAddTable::new);
	}

}