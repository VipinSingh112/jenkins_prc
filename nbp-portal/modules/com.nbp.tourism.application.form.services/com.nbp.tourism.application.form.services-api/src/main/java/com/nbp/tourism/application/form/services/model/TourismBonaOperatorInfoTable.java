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
 * The table class for the &quot;nbp_tourism_bona_operator_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaOperatorInfo
 * @generated
 */
public class TourismBonaOperatorInfoTable
	extends BaseTable<TourismBonaOperatorInfoTable> {

	public static final TourismBonaOperatorInfoTable INSTANCE =
		new TourismBonaOperatorInfoTable();

	public final Column<TourismBonaOperatorInfoTable, Long>
		tourismBonaOperatorInfoId = createColumn(
			"tourismBonaOperatorInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismBonaOperatorInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, String> operatorName =
		createColumn(
			"operatorName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, String> operatorNumber =
		createColumn(
			"operatorNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, Date> issueDate =
		createColumn(
			"issueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, Date> expirationDate =
		createColumn(
			"expirationDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, String> categories =
		createColumn(
			"categories", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, String> subCategories =
		createColumn(
			"subCategories", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismBonaOperatorInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismBonaOperatorInfoTable() {
		super(
			"nbp_tourism_bona_operator_info",
			TourismBonaOperatorInfoTable::new);
	}

}