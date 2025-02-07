/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_wra_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplication
 * @generated
 */
public class WRAApplicationTable extends BaseTable<WRAApplicationTable> {

	public static final WRAApplicationTable INSTANCE =
		new WRAApplicationTable();

	public final Column<WRAApplicationTable, Long> wraApplicationId =
		createColumn(
			"wraApplicationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<WRAApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, Date> entityId = createColumn(
		"entityId", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> typeOfApplication =
		createColumn(
			"typeOfApplication", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> typeOfTransaction =
		createColumn(
			"typeOfTransaction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> typeOfPermit =
		createColumn(
			"typeOfPermit", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> typeOfTransacPermit =
		createColumn(
			"typeOfTransacPermit", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> userWaterTypeCat =
		createColumn(
			"userWaterTypeCat", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> consumptiveSubCat =
		createColumn(
			"consumptiveSubCat", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> nonConsumptiveSubCat =
		createColumn(
			"nonConsumptiveSubCat", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> industrialTypeSubCat =
		createColumn(
			"industrialTypeSubCat", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> icmDocumentPath =
		createColumn(
			"icmDocumentPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> expiredLicenseAppNumber =
		createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private WRAApplicationTable() {
		super("nbp_wra_application", WRAApplicationTable::new);
	}

}