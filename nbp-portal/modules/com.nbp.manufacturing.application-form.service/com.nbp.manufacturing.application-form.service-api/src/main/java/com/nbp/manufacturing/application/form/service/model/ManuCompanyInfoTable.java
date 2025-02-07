/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manufacture_company_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfo
 * @generated
 */
public class ManuCompanyInfoTable extends BaseTable<ManuCompanyInfoTable> {

	public static final ManuCompanyInfoTable INSTANCE =
		new ManuCompanyInfoTable();

	public final Column<ManuCompanyInfoTable, Long> manuCompanyInfoId =
		createColumn(
			"manuCompanyInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ManuCompanyInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> directorName =
		createColumn(
			"directorName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> businessAddress =
		createColumn(
			"businessAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> tccNumber = createColumn(
		"tccNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, Date> incorporationDate =
		createColumn(
			"incorporationDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> factoryAddress =
		createColumn(
			"factoryAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> telephoneNumber =
		createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> companyWebsite =
		createColumn(
			"companyWebsite", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> applicantTRN =
		createColumn(
			"applicantTRN", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> beneficieryTRN =
		createColumn(
			"beneficieryTRN", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, String> parish = createColumn(
		"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoTable, Long> manufacturingApplicationId =
		createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ManuCompanyInfoTable() {
		super("nbp_manufacture_company_info", ManuCompanyInfoTable::new);
	}

}