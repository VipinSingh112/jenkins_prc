/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_film_equipment_list&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmEquipmentList
 * @generated
 */
public class FilmEquipmentListTable extends BaseTable<FilmEquipmentListTable> {

	public static final FilmEquipmentListTable INSTANCE =
		new FilmEquipmentListTable();

	public final Column<FilmEquipmentListTable, Long> filmEquipmentListId =
		createColumn(
			"filmEquipmentListId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmEquipmentListTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> item = createColumn(
		"item", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> serialNumber =
		createColumn(
			"serialNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> weight = createColumn(
		"weight", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> quantity = createColumn(
		"quantity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> unitPrice =
		createColumn(
			"unitPrice", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> description =
		createColumn(
			"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> total = createColumn(
		"total", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> equipmentList =
		createColumn(
			"equipmentList", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, String> flightNumber =
		createColumn(
			"flightNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmEquipmentListTable, Long> filmApplicationId =
		createColumn(
			"filmApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FilmEquipmentListTable() {
		super("nbp_film_equipment_list", FilmEquipmentListTable::new);
	}

}