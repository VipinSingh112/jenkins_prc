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
 * The table class for the &quot;nbp_creactive_company_dia&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformationAddress
 * @generated
 */
public class CreativeCompanyDirectorInformationAddressTable
	extends BaseTable<CreativeCompanyDirectorInformationAddressTable> {

	public static final CreativeCompanyDirectorInformationAddressTable
		INSTANCE = new CreativeCompanyDirectorInformationAddressTable();

	public final Column<CreativeCompanyDirectorInformationAddressTable, Long>
		creativeComDirectorAddressId = createColumn(
			"creativeComDirectorAddressId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeCompanyDirectorInformationAddressTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationAddressTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationAddressTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationAddressTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationAddressTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationAddressTable, String>
		streetAddress = createColumn(
			"streetAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationAddressTable, String>
		streetAddressLineTwo = createColumn(
			"streetAddressLineTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationAddressTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDirectorInformationAddressTable, Long>
		creativeComDirectorInfoId = createColumn(
			"creativeComDirectorInfoId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeCompanyDirectorInformationAddressTable() {
		super(
			"nbp_creactive_company_dia",
			CreativeCompanyDirectorInformationAddressTable::new);
	}

}