/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_new_acco_assesm&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoAssesmentInfo
 * @generated
 */
public class TourismNewAccoAssesmentInfoTable
	extends BaseTable<TourismNewAccoAssesmentInfoTable> {

	public static final TourismNewAccoAssesmentInfoTable INSTANCE =
		new TourismNewAccoAssesmentInfoTable();

	public final Column<TourismNewAccoAssesmentInfoTable, Long>
		TourismNewAccoAssesmentInfoId = createColumn(
			"TourismNewAccoAssesmentInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAccoAssesmentInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, String>
		countryOrigin = createColumn(
			"countryOrigin", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, String> jointVenture =
		createColumn(
			"jointVenture", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, String> localPer =
		createColumn(
			"localPer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, String> foreignPer =
		createColumn(
			"foreignPer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, String>
		capitalInvest = createColumn(
			"capitalInvest", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, String> sourceAttach =
		createColumn(
			"sourceAttach", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, String> shareCapital =
		createColumn(
			"shareCapital", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, String> loanCapital =
		createColumn(
			"loanCapital", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, String> other =
		createColumn("other", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoAssesmentInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAccoAssesmentInfoTable() {
		super(
			"nbp_tourism_new_acco_assesm",
			TourismNewAccoAssesmentInfoTable::new);
	}

}