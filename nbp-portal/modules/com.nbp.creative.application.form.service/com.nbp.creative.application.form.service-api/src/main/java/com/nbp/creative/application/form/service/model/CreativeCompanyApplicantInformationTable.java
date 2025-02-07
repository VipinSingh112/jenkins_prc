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
 * The table class for the &quot;nbp_creative_com_appli_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyApplicantInformation
 * @generated
 */
public class CreativeCompanyApplicantInformationTable
	extends BaseTable<CreativeCompanyApplicantInformationTable> {

	public static final CreativeCompanyApplicantInformationTable INSTANCE =
		new CreativeCompanyApplicantInformationTable();

	public final Column<CreativeCompanyApplicantInformationTable, Long>
		creativeCompanyApplicantInfoId = createColumn(
			"creativeCompanyApplicantInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeCompanyApplicantInformationTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, String>
		prefix = createColumn(
			"prefix", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, String>
		firstName = createColumn(
			"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, String>
		lastName = createColumn(
			"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, String> sex =
		createColumn("sex", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, String> trn =
		createColumn("trn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, String>
		countryOfResidence = createColumn(
			"countryOfResidence", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, String>
		nationality = createColumn(
			"nationality", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, String> cell =
		createColumn("cell", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, String>
		email = createColumn(
			"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyApplicantInformationTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeCompanyApplicantInformationTable() {
		super(
			"nbp_creative_com_appli_info",
			CreativeCompanyApplicantInformationTable::new);
	}

}