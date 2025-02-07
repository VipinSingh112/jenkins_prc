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
 * The table class for the &quot;nbp_tourism_attrac_sign&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionSignInfo
 * @generated
 */
public class TourismBonaAttractionSignInfoTable
	extends BaseTable<TourismBonaAttractionSignInfoTable> {

	public static final TourismBonaAttractionSignInfoTable INSTANCE =
		new TourismBonaAttractionSignInfoTable();

	public final Column<TourismBonaAttractionSignInfoTable, Long>
		tourismBonAttrSignId = createColumn(
			"tourismBonAttrSignId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaAttractionSignInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionSignInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionSignInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionSignInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionSignInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionSignInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionSignInfoTable, String>
		applicantName = createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionSignInfoTable, String>
		applicantStatus = createColumn(
			"applicantStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionSignInfoTable, Date> signDate =
		createColumn(
			"signDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaAttractionSignInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaAttractionSignInfoTable() {
		super(
			"nbp_tourism_attrac_sign", TourismBonaAttractionSignInfoTable::new);
	}

}