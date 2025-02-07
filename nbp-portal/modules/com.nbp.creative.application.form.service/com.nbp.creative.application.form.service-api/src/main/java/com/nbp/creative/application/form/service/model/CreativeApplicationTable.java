/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_creative_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplication
 * @generated
 */
public class CreativeApplicationTable
	extends BaseTable<CreativeApplicationTable> {

	public static final CreativeApplicationTable INSTANCE =
		new CreativeApplicationTable();

	public final Column<CreativeApplicationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, Long> CreativeApplicationId =
		createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> practitionerStatus =
		createColumn(
			"practitionerStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> eRegistryNumber =
		createColumn(
			"eRegistryNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> entertainerType =
		createColumn(
			"entertainerType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> IndividualType =
		createColumn(
			"IndividualType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> companyType =
		createColumn(
			"companyType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> primaryCategory =
		createColumn(
			"primaryCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> mainCategories =
		createColumn(
			"mainCategories", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private CreativeApplicationTable() {
		super("nbp_creative_application", CreativeApplicationTable::new);
	}

}