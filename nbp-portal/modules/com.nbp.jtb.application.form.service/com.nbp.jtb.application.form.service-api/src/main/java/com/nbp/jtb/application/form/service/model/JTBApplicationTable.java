/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jtb_applications&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JTBApplication
 * @generated
 */
public class JTBApplicationTable extends BaseTable<JTBApplicationTable> {

	public static final JTBApplicationTable INSTANCE =
		new JTBApplicationTable();

	public final Column<JTBApplicationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, Long> jtbApplicationId =
		createColumn(
			"jtbApplicationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<JTBApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> entityId = createColumn(
		"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> typeOfApplication =
		createColumn(
			"typeOfApplication", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> categoryTypeValAccomo =
		createColumn(
			"categoryTypeValAccomo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> nonHotelSubCategory =
		createColumn(
			"nonHotelSubCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> jtbTransactionTypeVal =
		createColumn(
			"jtbTransactionTypeVal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> attractionCategoryTypeVal =
		createColumn(
			"attractionCategoryTypeVal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> domesticToursType =
		createColumn(
			"domesticToursType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> otherCategories =
		createColumn(
			"otherCategories", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> operatorName =
		createColumn(
			"operatorName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, Date> dateOfIssue = createColumn(
		"dateOfIssue", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, Date> dateOfExp = createColumn(
		"dateOfExp", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> expiredLicenseAppNumber =
		createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, Date> dateOfExpiration =
		createColumn(
			"dateOfExpiration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<JTBApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private JTBApplicationTable() {
		super("nbp_jtb_applications", JTBApplicationTable::new);
	}

}