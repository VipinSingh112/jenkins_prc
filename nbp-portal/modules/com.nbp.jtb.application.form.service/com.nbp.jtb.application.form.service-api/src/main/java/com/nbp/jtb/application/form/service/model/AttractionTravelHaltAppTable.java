/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_travel_halt_app&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelHaltApp
 * @generated
 */
public class AttractionTravelHaltAppTable
	extends BaseTable<AttractionTravelHaltAppTable> {

	public static final AttractionTravelHaltAppTable INSTANCE =
		new AttractionTravelHaltAppTable();

	public final Column<AttractionTravelHaltAppTable, Long>
		attractionTravelHaltAppId = createColumn(
			"attractionTravelHaltAppId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionTravelHaltAppTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String>
		travelHaltApplicantName = createColumn(
			"travelHaltApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String>
		travelHaltAddress = createColumn(
			"travelHaltAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String>
		travelHaltTelephone = createColumn(
			"travelHaltTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String> travelHaltEmail =
		createColumn(
			"travelHaltEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String> travelHaltName =
		createColumn(
			"travelHaltName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String>
		travelHaltLocation = createColumn(
			"travelHaltLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String>
		travelHaltTelephoneNum = createColumn(
			"travelHaltTelephoneNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String>
		travelHaltEmployeesNo = createColumn(
			"travelHaltEmployeesNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, Date> travelHaltSignDate =
		createColumn(
			"travelHaltSignDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String> gasStation =
		createColumn(
			"gasStation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String> refreshment =
		createColumn(
			"refreshment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String> drinks =
		createColumn(
			"drinks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String> restaurant =
		createColumn(
			"restaurant", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String> wirelessinternet =
		createColumn(
			"wirelessinternet", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, String> restrooms =
		createColumn(
			"restrooms", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionTravelHaltAppTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionTravelHaltAppTable() {
		super("nbp_jtb_travel_halt_app", AttractionTravelHaltAppTable::new);
	}

}