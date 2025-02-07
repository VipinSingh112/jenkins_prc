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
 * The table class for the &quot;nbp_quarry__info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInformaation
 * @generated
 */
public class QuarryInformaationTable
	extends BaseTable<QuarryInformaationTable> {

	public static final QuarryInformaationTable INSTANCE =
		new QuarryInformaationTable();

	public final Column<QuarryInformaationTable, Long> auarryInfoId =
		createColumn(
			"auarryInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<QuarryInformaationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> location =
		createColumn(
			"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> district =
		createColumn(
			"district", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> parish = createColumn(
		"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> actualSizeOfQuary =
		createColumn(
			"actualSizeOfQuary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> hasQuarrySubmitted =
		createColumn(
			"hasQuarrySubmitted", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> sixCopiesOfLocation =
		createColumn(
			"sixCopiesOfLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> legalAccessToLand =
		createColumn(
			"legalAccessToLand", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> ownerShipEnclosed =
		createColumn(
			"ownerShipEnclosed", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> adjacentPropOwner =
		createColumn(
			"adjacentPropOwner", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> measurement =
		createColumn(
			"measurement", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> landOwnerName =
		createColumn(
			"landOwnerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, String> landOwnerAddress =
		createColumn(
			"landOwnerAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryInformaationTable, Long> quarryApplicationId =
		createColumn(
			"quarryApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private QuarryInformaationTable() {
		super("nbp_quarry__info", QuarryInformaationTable::new);
	}

}