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
 * The table class for the &quot;nbp_tourism_new_acco_employe&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewNumberOFEmployment
 * @generated
 */
public class TourismNewNumberOFEmploymentTable
	extends BaseTable<TourismNewNumberOFEmploymentTable> {

	public static final TourismNewNumberOFEmploymentTable INSTANCE =
		new TourismNewNumberOFEmploymentTable();

	public final Column<TourismNewNumberOFEmploymentTable, Long>
		tourismNewNumberOFEmploymentId = createColumn(
			"tourismNewNumberOFEmploymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewNumberOFEmploymentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		permanentLocalMale = createColumn(
			"permanentLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		permanentLocalFemale = createColumn(
			"permanentLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		permanentForeignMale = createColumn(
			"permanentForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		permanentForeignFemale = createColumn(
			"permanentForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		temporaryLocalMale = createColumn(
			"temporaryLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		temporaryLocalFemale = createColumn(
			"temporaryLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		temporaryForeignMale = createColumn(
			"temporaryForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		temporaryForeignFemale = createColumn(
			"temporaryForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		totalLocalMale = createColumn(
			"totalLocalMale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		totalLocalFemale = createColumn(
			"totalLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		totalForeignMale = createColumn(
			"totalForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		totalForeignFemale = createColumn(
			"totalForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String> salaryWages =
		createColumn(
			"salaryWages", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		estimatedExpenditure = createColumn(
			"estimatedExpenditure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		otherExpenditure = createColumn(
			"otherExpenditure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		perRoomInclusiveCost = createColumn(
			"perRoomInclusiveCost", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		perRoomExclusiveCost = createColumn(
			"perRoomExclusiveCost", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffPermanentLocalMale = createColumn(
			"staffPermanentLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffPermanentLocalFemale = createColumn(
			"staffPermanentLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffPermanentForeignMale = createColumn(
			"staffPermanentForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffPermanentForeignFemale = createColumn(
			"staffPermanentForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffTemporaryLocalMale = createColumn(
			"staffTemporaryLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffTemporaryLocalFemale = createColumn(
			"staffTemporaryLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffTemporaryForeignMale = createColumn(
			"staffTemporaryForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffTemporaryForeignFemale = createColumn(
			"staffTemporaryForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffTotalLocalMale = createColumn(
			"staffTotalLocalMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffTotalLocalFemale = createColumn(
			"staffTotalLocalFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffTotalForeignMale = createColumn(
			"staffTotalForeignMale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		staffTotalForeignFemale = createColumn(
			"staffTotalForeignFemale", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		salariesAndWages = createColumn(
			"salariesAndWages", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, String>
		expectedAnnualFunds = createColumn(
			"expectedAnnualFunds", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewNumberOFEmploymentTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewNumberOFEmploymentTable() {
		super(
			"nbp_tourism_new_acco_employe",
			TourismNewNumberOFEmploymentTable::new);
	}

}