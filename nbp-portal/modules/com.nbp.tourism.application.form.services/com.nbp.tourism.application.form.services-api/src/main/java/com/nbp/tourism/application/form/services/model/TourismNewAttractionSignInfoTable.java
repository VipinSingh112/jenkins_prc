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
 * @see TourismNewAttractionSignInfo
 * @generated
 */
public class TourismNewAttractionSignInfoTable
	extends BaseTable<TourismNewAttractionSignInfoTable> {

	public static final TourismNewAttractionSignInfoTable INSTANCE =
		new TourismNewAttractionSignInfoTable();

	public final Column<TourismNewAttractionSignInfoTable, Long>
		tourismNewAttraSignInfoId = createColumn(
			"tourismNewAttraSignInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismNewAttractionSignInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionSignInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionSignInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionSignInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionSignInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionSignInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionSignInfoTable, String>
		newSignApplicantName = createColumn(
			"newSignApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionSignInfoTable, String>
		newSignApplicantStatus = createColumn(
			"newSignApplicantStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionSignInfoTable, Date> newSignDate =
		createColumn(
			"newSignDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismNewAttractionSignInfoTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismNewAttractionSignInfoTable() {
		super(
			"nbp_tourism_attrac_sign", TourismNewAttractionSignInfoTable::new);
	}

}