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
 * The table class for the &quot;nbp_tourism_new_acco_signinfo&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoSignInfo
 * @generated
 */
public class TourismNewAccoSignInfoTable
	extends BaseTable<TourismNewAccoSignInfoTable> {

	public static final TourismNewAccoSignInfoTable INSTANCE =
		new TourismNewAccoSignInfoTable();

	public final Column<TourismNewAccoSignInfoTable, Long>
		tourismNewAccoSignInfoId = createColumn(
			"tourismNewAccoSignInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAccoSignInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoSignInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoSignInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoSignInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoSignInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoSignInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoSignInfoTable, String> signApplicantName =
		createColumn(
			"signApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoSignInfoTable, String>
		signApplicantStatus = createColumn(
			"signApplicantStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoSignInfoTable, Date> newSignDate =
		createColumn(
			"newSignDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAccoSignInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAccoSignInfoTable() {
		super(
			"nbp_tourism_new_acco_signinfo", TourismNewAccoSignInfoTable::new);
	}

}