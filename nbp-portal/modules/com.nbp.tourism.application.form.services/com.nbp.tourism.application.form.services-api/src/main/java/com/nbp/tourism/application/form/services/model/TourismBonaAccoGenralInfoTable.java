/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_bona_acco_gen&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoGenralInfo
 * @generated
 */
public class TourismBonaAccoGenralInfoTable
	extends BaseTable<TourismBonaAccoGenralInfoTable> {

	public static final TourismBonaAccoGenralInfoTable INSTANCE =
		new TourismBonaAccoGenralInfoTable();

	public final Column<TourismBonaAccoGenralInfoTable, Long>
		tourismBonaAccoGenralInfoId = createColumn(
			"tourismBonaAccoGenralInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaAccoGenralInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, String>
		establishmentName = createColumn(
			"establishmentName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, String>
		establishmentNewName = createColumn(
			"establishmentNewName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, String>
		generalFacilityRoom = createColumn(
			"generalFacilityRoom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, String>
		existingFacilityRoom = createColumn(
			"existingFacilityRoom", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, String>
		offeredFacilityDetail = createColumn(
			"offeredFacilityDetail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, String>
		plannedFacilityDetail = createColumn(
			"plannedFacilityDetail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, String>
		accomodationToBeOffered = createColumn(
			"accomodationToBeOffered", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, Date> constructionDate =
		createColumn(
			"constructionDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, Date>
		expectedCommenceDate = createColumn(
			"expectedCommenceDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoGenralInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaAccoGenralInfoTable() {
		super("nbp_tourism_bona_acco_gen", TourismBonaAccoGenralInfoTable::new);
	}

}