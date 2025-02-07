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
 * The table class for the &quot;nbp_creative_com_detail_addres&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsAddress
 * @generated
 */
public class CreativeCompanyDetailsAddressTable
	extends BaseTable<CreativeCompanyDetailsAddressTable> {

	public static final CreativeCompanyDetailsAddressTable INSTANCE =
		new CreativeCompanyDetailsAddressTable();

	public final Column<CreativeCompanyDetailsAddressTable, Long>
		creativeComDetailsAddressId = createColumn(
			"creativeComDetailsAddressId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeCompanyDetailsAddressTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, String>
		addressType = createColumn(
			"addressType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, String>
		streetAddress = createColumn(
			"streetAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, String>
		streetAddressLineTwo = createColumn(
			"streetAddressLineTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, String> city =
		createColumn("city", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, String> country =
		createColumn(
			"country", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, Long>
		CreativeApplicationId = createColumn(
			"CreativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CreativeCompanyDetailsAddressTable, Long>
		creativeCompanyDetailsId = createColumn(
			"creativeCompanyDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CreativeCompanyDetailsAddressTable() {
		super(
			"nbp_creative_com_detail_addres",
			CreativeCompanyDetailsAddressTable::new);
	}

}