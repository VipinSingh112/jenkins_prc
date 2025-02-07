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
 * The table class for the &quot;nbp_tourism_bona_water_sign&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportSignInfo
 * @generated
 */
public class TourismBonaWaterSportSignInfoTable
	extends BaseTable<TourismBonaWaterSportSignInfoTable> {

	public static final TourismBonaWaterSportSignInfoTable INSTANCE =
		new TourismBonaWaterSportSignInfoTable();

	public final Column<TourismBonaWaterSportSignInfoTable, Long>
		tourismBonaWSSignId = createColumn(
			"tourismBonaWSSignId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaWaterSportSignInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportSignInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportSignInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportSignInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportSignInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportSignInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportSignInfoTable, String>
		applicantName = createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportSignInfoTable, String>
		signApplicantStatus = createColumn(
			"signApplicantStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportSignInfoTable, Date> signDate =
		createColumn(
			"signDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaWaterSportSignInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaWaterSportSignInfoTable() {
		super(
			"nbp_tourism_bona_water_sign",
			TourismBonaWaterSportSignInfoTable::new);
	}

}