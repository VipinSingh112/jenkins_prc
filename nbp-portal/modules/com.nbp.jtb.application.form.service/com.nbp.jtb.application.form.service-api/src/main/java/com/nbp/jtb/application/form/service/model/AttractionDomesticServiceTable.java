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
 * The table class for the &quot;nbp_jtb_domestic_service&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticService
 * @generated
 */
public class AttractionDomesticServiceTable
	extends BaseTable<AttractionDomesticServiceTable> {

	public static final AttractionDomesticServiceTable INSTANCE =
		new AttractionDomesticServiceTable();

	public final Column<AttractionDomesticServiceTable, Long>
		attractionDomesticServId = createColumn(
			"attractionDomesticServId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionDomesticServiceTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, String>
		individualsApartment = createColumn(
			"individualsApartment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, String>
		airportAssistance = createColumn(
			"airportAssistance", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, String> entireTour =
		createColumn(
			"entireTour", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, String>
		transfersDeparture = createColumn(
			"transfersDeparture", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, String>
		individualGroups = createColumn(
			"individualGroups", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, String>
		organizedconJunction = createColumn(
			"organizedconJunction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, String>
		dailyTransportation = createColumn(
			"dailyTransportation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, String> entertainment =
		createColumn(
			"entertainment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, Date>
		domesticTourSealDate = createColumn(
			"domesticTourSealDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AttractionDomesticServiceTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionDomesticServiceTable() {
		super("nbp_jtb_domestic_service", AttractionDomesticServiceTable::new);
	}

}