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
 * The table class for the &quot;nbp_comapny_director_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformation
 * @generated
 */
public class CreativeCompanyDirectorInformationTable
	extends BaseTable<CreativeCompanyDirectorInformationTable> {

	public static final CreativeCompanyDirectorInformationTable INSTANCE =
		new CreativeCompanyDirectorInformationTable();

	public final Column<CreativeCompanyDirectorInformationTable, Long>
		creativeComDirectorInfoId = createColumn(
			"creativeComDirectorInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeCompanyDirectorInformationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		directorFullName = createColumn(
			"directorFullName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		directorTitle = createColumn(
			"directorTitle", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		directorTrn = createColumn(
			"directorTrn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		telephoneNumber = createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		faxNumber = createColumn(
			"faxNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		emailAddress = createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		socialMedia = createColumn(
			"socialMedia", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		profileName = createColumn(
			"profileName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		isOperatorDifferentFromOwner = createColumn(
			"isOperatorDifferentFromOwner", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		operatorFirstName = createColumn(
			"operatorFirstName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		operatorMiddleName = createColumn(
			"operatorMiddleName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		operatorLastName = createColumn(
			"operatorLastName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String> city =
		createColumn("city", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String>
		country = createColumn(
			"country", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String> sex =
		createColumn("sex", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String> trn =
		createColumn("trn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String> cell =
		createColumn("cell", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, String> email =
		createColumn("email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeCompanyDirectorInformationTable() {
		super(
			"nbp_comapny_director_info",
			CreativeCompanyDirectorInformationTable::new);
	}

}