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
 * The table class for the &quot;nbp_jtb_acco_home_stay_lic&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccoHomeStay
 * @generated
 */
public class AccoHomeStayTable extends BaseTable<AccoHomeStayTable> {

	public static final AccoHomeStayTable INSTANCE = new AccoHomeStayTable();

	public final Column<AccoHomeStayTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, Long> accoHomeStayId = createColumn(
		"accoHomeStayId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AccoHomeStayTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> homeAccoName = createColumn(
		"homeAccoName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> homeOwnerName = createColumn(
		"homeOwnerName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> propertyAddress =
		createColumn(
			"propertyAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> homeTeleNo = createColumn(
		"homeTeleNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> homeMobile = createColumn(
		"homeMobile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> homeEmail = createColumn(
		"homeEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> homeEmployeeNo =
		createColumn(
			"homeEmployeeNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> website = createColumn(
		"website", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> propDirection = createColumn(
		"propDirection", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> numOfBedrooms = createColumn(
		"numOfBedrooms", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> numOfGuestBedroom =
		createColumn(
			"numOfGuestBedroom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> withBathroom = createColumn(
		"withBathroom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> sharedBathroom =
		createColumn(
			"sharedBathroom", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, Date> signDate = createColumn(
		"signDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, String> certifiedBy = createColumn(
		"certifiedBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccoHomeStayTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AccoHomeStayTable() {
		super("nbp_jtb_acco_home_stay_lic", AccoHomeStayTable::new);
	}

}