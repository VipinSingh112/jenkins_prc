/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_inso_per&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesInsolventPersoninfo
 * @generated
 */
public class OsiServicesInsolventPersoninfoTable
	extends BaseTable<OsiServicesInsolventPersoninfoTable> {

	public static final OsiServicesInsolventPersoninfoTable INSTANCE =
		new OsiServicesInsolventPersoninfoTable();

	public final Column<OsiServicesInsolventPersoninfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, Long>
		osiServicesInsoId = createColumn(
			"osiServicesInsoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiServicesInsolventPersoninfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, String>
		insolventPersonNature = createColumn(
			"insolventPersonNature", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, String>
		insolventIndiFirstName = createColumn(
			"insolventIndiFirstName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, String>
		insolventIndiLastName = createColumn(
			"insolventIndiLastName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, String>
		insolventCompanyName = createColumn(
			"insolventCompanyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, String>
		insolventAddress = createColumn(
			"insolventAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, String>
		insolventParish = createColumn(
			"insolventParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, String>
		insolventEmailAddress = createColumn(
			"insolventEmailAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, String>
		insolventTelephone = createColumn(
			"insolventTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, Date>
		insolventApplicationDate = createColumn(
			"insolventApplicationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, String>
		insolventTrnNumber = createColumn(
			"insolventTrnNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesInsolventPersoninfoTable, Long>
		osiServicesApplicationId = createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OsiServicesInsolventPersoninfoTable() {
		super(
			"nbp_osi_services_inso_per",
			OsiServicesInsolventPersoninfoTable::new);
	}

}