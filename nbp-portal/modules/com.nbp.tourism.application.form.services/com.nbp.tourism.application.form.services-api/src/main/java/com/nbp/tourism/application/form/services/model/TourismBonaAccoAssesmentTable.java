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
 * The table class for the &quot;nbp_tourism_bona_aco_asses&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoAssesment
 * @generated
 */
public class TourismBonaAccoAssesmentTable
	extends BaseTable<TourismBonaAccoAssesmentTable> {

	public static final TourismBonaAccoAssesmentTable INSTANCE =
		new TourismBonaAccoAssesmentTable();

	public final Column<TourismBonaAccoAssesmentTable, Long>
		tourismBonaAccoAssesmentId = createColumn(
			"tourismBonaAccoAssesmentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaAccoAssesmentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> countryOrigin =
		createColumn(
			"countryOrigin", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> jointVenture =
		createColumn(
			"jointVenture", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> localPer =
		createColumn(
			"localPer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> foreignPer =
		createColumn(
			"foreignPer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> capitalInvest =
		createColumn(
			"capitalInvest", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> sourceAttach =
		createColumn(
			"sourceAttach", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> shareCapital =
		createColumn(
			"shareCapital", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> loanCapital =
		createColumn(
			"loanCapital", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> other =
		createColumn("other", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		permanentLocalMale = createColumn(
			"permanentLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		permanentLocalFemale = createColumn(
			"permanentLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		permanentForeignMale = createColumn(
			"permanentForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		permanentForeignFemale = createColumn(
			"permanentForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		temporaryLocalMale = createColumn(
			"temporaryLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		temporaryLocalFemale = createColumn(
			"temporaryLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		temporaryForeignMale = createColumn(
			"temporaryForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		temporaryForeignFemale = createColumn(
			"temporaryForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> totalLocalMale =
		createColumn(
			"totalLocalMale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		totalLocalFemale = createColumn(
			"totalLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		totalForeignMale = createColumn(
			"totalForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		totalForeignFemale = createColumn(
			"totalForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String> salaryWages =
		createColumn(
			"salaryWages", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		estimatedExpenditure = createColumn(
			"estimatedExpenditure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		otherExpenditure = createColumn(
			"otherExpenditure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffPermanentLocalMale = createColumn(
			"staffPermanentLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffPermanentLocalFemale = createColumn(
			"staffPermanentLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffForeignLocalMale = createColumn(
			"staffForeignLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffForeignLocalFemale = createColumn(
			"staffForeignLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffTemporaryLocalMale = createColumn(
			"staffTemporaryLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffTemporaryLocalFemale = createColumn(
			"staffTemporaryLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffTemporaryForeignMale = createColumn(
			"staffTemporaryForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffTemporaryForeignFemale = createColumn(
			"staffTemporaryForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffTotalForeignMale = createColumn(
			"staffTotalForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffTotalForeignFemale = createColumn(
			"staffTotalForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffTotalLocalMale = createColumn(
			"staffTotalLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, String>
		staffTotalLocalFemale = createColumn(
			"staffTotalLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoAssesmentTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaAccoAssesmentTable() {
		super("nbp_tourism_bona_aco_asses", TourismBonaAccoAssesmentTable::new);
	}

}