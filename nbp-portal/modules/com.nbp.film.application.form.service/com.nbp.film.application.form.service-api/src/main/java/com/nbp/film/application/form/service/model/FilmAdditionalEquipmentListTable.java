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
 * The table class for the &quot;nbp_film_additional_equip_list&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmAdditionalEquipmentList
 * @generated
 */
public class FilmAdditionalEquipmentListTable
	extends BaseTable<FilmAdditionalEquipmentListTable> {

	public static final FilmAdditionalEquipmentListTable INSTANCE =
		new FilmAdditionalEquipmentListTable();

	public final Column<FilmAdditionalEquipmentListTable, Long>
		FilmAdditionalEquipmentListId = createColumn(
			"FilmAdditionalEquipmentListId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmAdditionalEquipmentListTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, Date> arrivalDate =
		createColumn(
			"arrivalDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, String>
		airlineShipper = createColumn(
			"airlineShipper", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, String>
		flightVesselNum = createColumn(
			"flightVesselNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, String>
		passengerName = createColumn(
			"passengerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, String> entryPort =
		createColumn(
			"entryPort", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, String>
		customsBroker = createColumn(
			"customsBroker", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, String> flightNumber =
		createColumn(
			"flightNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmAdditionalEquipmentListTable, Long>
		filmApplicationId = createColumn(
			"filmApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FilmAdditionalEquipmentListTable() {
		super(
			"nbp_film_additional_equip_list",
			FilmAdditionalEquipmentListTable::new);
	}

}