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
 * The table class for the &quot;nbp_tourism_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplication
 * @generated
 */
public class TourismApplicationTable
	extends BaseTable<TourismApplicationTable> {

	public static final TourismApplicationTable INSTANCE =
		new TourismApplicationTable();

	public final Column<TourismApplicationTable, Long> tourismApplicationId =
		createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, String> requestType =
		createColumn(
			"requestType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, String> requestTypeTwo =
		createColumn(
			"requestTypeTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, String> licenseCategory =
		createColumn(
			"licenseCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, String> licenseSubCategory =
		createColumn(
			"licenseSubCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private TourismApplicationTable() {
		super("nbp_tourism_application", TourismApplicationTable::new);
	}

}