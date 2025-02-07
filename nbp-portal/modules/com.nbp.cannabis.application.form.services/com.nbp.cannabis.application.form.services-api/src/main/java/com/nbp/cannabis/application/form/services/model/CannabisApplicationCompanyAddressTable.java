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
 * The table class for the &quot;nbp_cannabis_com_address&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAddress
 * @generated
 */
public class CannabisApplicationCompanyAddressTable
	extends BaseTable<CannabisApplicationCompanyAddressTable> {

	public static final CannabisApplicationCompanyAddressTable INSTANCE =
		new CannabisApplicationCompanyAddressTable();

	public final Column<CannabisApplicationCompanyAddressTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, Long>
		companyAddressId = createColumn(
			"companyAddressId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CannabisApplicationCompanyAddressTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, String>
		addressType = createColumn(
			"addressType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, String>
		streetName = createColumn(
			"streetName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, String> town =
		createColumn("town", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, String>
		applicationNumber = createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationCompanyAddressTable, Long>
		companyInformationId = createColumn(
			"companyInformationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisApplicationCompanyAddressTable() {
		super(
			"nbp_cannabis_com_address",
			CannabisApplicationCompanyAddressTable::new);
	}

}