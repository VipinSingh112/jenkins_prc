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
 * The table class for the &quot;nbp_tourism_new_acco_assesment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoAssesment
 * @generated
 */
public class TourismNewAccoAssesmentTable
	extends BaseTable<TourismNewAccoAssesmentTable> {

	public static final TourismNewAccoAssesmentTable INSTANCE =
		new TourismNewAccoAssesmentTable();

	public final Column<TourismNewAccoAssesmentTable, Long>
		TourismNewAccoAssesmentInfoId = createColumn(
			"TourismNewAccoAssesmentInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAccoAssesmentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, String> countryOrigin =
		createColumn(
			"countryOrigin", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, String> jointVenture =
		createColumn(
			"jointVenture", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, String> localPer =
		createColumn(
			"localPer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, String> foreignPer =
		createColumn(
			"foreignPer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, String> capitalInvest =
		createColumn(
			"capitalInvest", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, String> sourceAttach =
		createColumn(
			"sourceAttach", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, String> shareCapital =
		createColumn(
			"shareCapital", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, String> loanCapital =
		createColumn(
			"loanCapital", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, String> other =
		createColumn("other", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAccoAssesmentTable() {
		super(
			"nbp_tourism_new_acco_assesment",
			TourismNewAccoAssesmentTable::new);
	}

}