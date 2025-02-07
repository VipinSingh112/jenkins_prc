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
 * The table class for the &quot;nbp_creative_company_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetails
 * @generated
 */
public class CreativeCompanyDetailsTable
	extends BaseTable<CreativeCompanyDetailsTable> {

	public static final CreativeCompanyDetailsTable INSTANCE =
		new CreativeCompanyDetailsTable();

	public final Column<CreativeCompanyDetailsTable, Long>
		creativeCompanyDetailsId = createColumn(
			"creativeCompanyDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeCompanyDetailsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, String>
		companyBusinessRegistrationNo = createColumn(
			"companyBusinessRegistrationNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, Date>
		dateOfCompanyRegistration = createColumn(
			"dateOfCompanyRegistration", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, String> companyTrn =
		createColumn(
			"companyTrn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, String> companyTcc =
		createColumn(
			"companyTcc", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, String> companyProfile =
		createColumn(
			"companyProfile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeCompanyDetailsTable() {
		super("nbp_creative_company_detail", CreativeCompanyDetailsTable::new);
	}

}