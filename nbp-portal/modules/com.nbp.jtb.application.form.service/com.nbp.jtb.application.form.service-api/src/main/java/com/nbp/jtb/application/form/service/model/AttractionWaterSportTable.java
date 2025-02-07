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
 * The table class for the &quot;nbp_jtb_water_sport_operate&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterSport
 * @generated
 */
public class AttractionWaterSportTable
	extends BaseTable<AttractionWaterSportTable> {

	public static final AttractionWaterSportTable INSTANCE =
		new AttractionWaterSportTable();

	public final Column<AttractionWaterSportTable, Long>
		attractionWaterSportId = createColumn(
			"attractionWaterSportId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AttractionWaterSportTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		waterSportBusinessName = createColumn(
			"waterSportBusinessName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		waterSportMailingaAdd = createColumn(
			"waterSportMailingaAdd", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		waterSportOpLocationAddr = createColumn(
			"waterSportOpLocationAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String> waterSportOpPhone =
		createColumn(
			"waterSportOpPhone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String> waterSportOpEmail =
		createColumn(
			"waterSportOpEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		waterSportOpOwnerName = createColumn(
			"waterSportOpOwnerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		waterSportOpAddressOwner = createColumn(
			"waterSportOpAddressOwner", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		waterSportOpManagerName = createColumn(
			"waterSportOpManagerName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		waterSportOpApplicantName = createColumn(
			"waterSportOpApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		waterSportOpNationality = createColumn(
			"waterSportOpNationality", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		waterSportOpEmployeesNo = createColumn(
			"waterSportOpEmployeesNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		waterSportOpActivityList = createColumn(
			"waterSportOpActivityList", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String> occupyLocation =
		createColumn(
			"occupyLocation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String> proposalSubmitted =
		createColumn(
			"proposalSubmitted", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String>
		foreignNationalsInvolved = createColumn(
			"foreignNationalsInvolved", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, String> workPermitApplied =
		createColumn(
			"workPermitApplied", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AttractionWaterSportTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AttractionWaterSportTable() {
		super("nbp_jtb_water_sport_operate", AttractionWaterSportTable::new);
	}

}