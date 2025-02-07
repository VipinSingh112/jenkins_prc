/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_pharma_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplication
 * @generated
 */
public class PharmaApplicationTable extends BaseTable<PharmaApplicationTable> {

	public static final PharmaApplicationTable INSTANCE =
		new PharmaApplicationTable();

	public final Column<PharmaApplicationTable, Long> pharmaApplicationId =
		createColumn(
			"pharmaApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PharmaApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> entityId = createColumn(
		"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> requesttype =
		createColumn(
			"requesttype", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> typeOfPharmaProduct =
		createColumn(
			"typeOfPharmaProduct", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> typeOfPharmaDrug =
		createColumn(
			"typeOfPharmaDrug", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> secondaryCategory =
		createColumn(
			"secondaryCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> typeOfProduct =
		createColumn(
			"typeOfProduct", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> subCategoryFirstField =
		createColumn(
			"subCategoryFirstField", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> subCategorySecondField =
		createColumn(
			"subCategorySecondField", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> caseld = createColumn(
		"caseld", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String>
		expiredLicenseAppNumber = createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private PharmaApplicationTable() {
		super("nbp_pharma_application", PharmaApplicationTable::new);
	}

}