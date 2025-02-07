/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_zone_gen_buss_address&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBussinessAddress
 * @generated
 */
public class SezZoneGeneralBussinessAddressTable
	extends BaseTable<SezZoneGeneralBussinessAddressTable> {

	public static final SezZoneGeneralBussinessAddressTable INSTANCE =
		new SezZoneGeneralBussinessAddressTable();

	public final Column<SezZoneGeneralBussinessAddressTable, Long>
		sezZoneGenBussAddressId = createColumn(
			"sezZoneGenBussAddressId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezZoneGeneralBussinessAddressTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, String> zoneName =
		createColumn(
			"zoneName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, String>
		zoneStreetAddress = createColumn(
			"zoneStreetAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, String> zoneTown =
		createColumn(
			"zoneTown", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, String>
		zoneParish = createColumn(
			"zoneParish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, String>
		zoneCountry = createColumn(
			"zoneCountry", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, String>
		addresstype = createColumn(
			"addresstype", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, Long>
		sezZoneGeneralBusinessInfoId = createColumn(
			"sezZoneGeneralBusinessInfoId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<SezZoneGeneralBussinessAddressTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezZoneGeneralBussinessAddressTable() {
		super(
			"nbp_sez_zone_gen_buss_address",
			SezZoneGeneralBussinessAddressTable::new);
	}

}