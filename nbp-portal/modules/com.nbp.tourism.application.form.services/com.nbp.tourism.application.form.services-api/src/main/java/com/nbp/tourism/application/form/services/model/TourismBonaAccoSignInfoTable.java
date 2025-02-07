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
 * The table class for the &quot;nbp_tourism_bona_acco_sign&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoSignInfo
 * @generated
 */
public class TourismBonaAccoSignInfoTable
	extends BaseTable<TourismBonaAccoSignInfoTable> {

	public static final TourismBonaAccoSignInfoTable INSTANCE =
		new TourismBonaAccoSignInfoTable();

	public final Column<TourismBonaAccoSignInfoTable, Long>
		tourismBonaAccoSignId = createColumn(
			"tourismBonaAccoSignId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaAccoSignInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoSignInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoSignInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoSignInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoSignInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoSignInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoSignInfoTable, String>
		newSignApplicantName = createColumn(
			"newSignApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoSignInfoTable, String>
		newSignApplicantStatus = createColumn(
			"newSignApplicantStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoSignInfoTable, Date> newSignDate =
		createColumn(
			"newSignDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAccoSignInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaAccoSignInfoTable() {
		super("nbp_tourism_bona_acco_sign", TourismBonaAccoSignInfoTable::new);
	}

}