/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_company_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyInfo
 * @generated
 */
public class CannabisApplicationCompanyInfoTable
	extends BaseTable<CannabisApplicationCompanyInfoTable> {

	public static final CannabisApplicationCompanyInfoTable INSTANCE =
		new CannabisApplicationCompanyInfoTable();

	public final Column<CannabisApplicationCompanyInfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, Long>
		companyInformationId = createColumn(
			"companyInformationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisApplicationCompanyInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, String>
		companyName = createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, String> trn =
		createColumn("trn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, String>
		typeOfCompany = createColumn(
			"typeOfCompany", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, String>
		otherCompanyType = createColumn(
			"otherCompanyType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, String>
		registrationNumber = createColumn(
			"registrationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, String>
		contactPhoneNumber = createColumn(
			"contactPhoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, String>
		emailAddress = createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, String>
		applicationNumber = createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyInfoTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisApplicationCompanyInfoTable() {
		super(
			"nbp_cannabis_company_info",
			CannabisApplicationCompanyInfoTable::new);
	}

}