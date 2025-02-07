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
 * The table class for the &quot;nbp_manu_com_Info_Address&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoAddress
 * @generated
 */
public class ManuCompanyInfoAddressTable
	extends BaseTable<ManuCompanyInfoAddressTable> {

	public static final ManuCompanyInfoAddressTable INSTANCE =
		new ManuCompanyInfoAddressTable();

	public final Column<ManuCompanyInfoAddressTable, Long>
		manuCompanyInfoAddressId = createColumn(
			"manuCompanyInfoAddressId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ManuCompanyInfoAddressTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, String> factoryAddress =
		createColumn(
			"factoryAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, String> telephoneNumber =
		createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, String> companyWebsite =
		createColumn(
			"companyWebsite", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<ManuCompanyInfoAddressTable, Long> manuCompanyInfoId =
		createColumn(
			"manuCompanyInfoId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private ManuCompanyInfoAddressTable() {
		super("nbp_manu_com_Info_Address", ManuCompanyInfoAddressTable::new);
	}

}