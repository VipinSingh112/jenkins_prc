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
 * The table class for the &quot;nbp_sez_occ_gen_buss_address&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessAddress
 * @generated
 */
public class SezOccupantGeneralBussinessAddressTable
	extends BaseTable<SezOccupantGeneralBussinessAddressTable> {

	public static final SezOccupantGeneralBussinessAddressTable INSTANCE =
		new SezOccupantGeneralBussinessAddressTable();

	public final Column<SezOccupantGeneralBussinessAddressTable, Long>
		sezOccGenBussAddressId = createColumn(
			"sezOccGenBussAddressId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezOccupantGeneralBussinessAddressTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, String>
		occName = createColumn(
			"occName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, String>
		occStreetAddress = createColumn(
			"occStreetAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, String>
		occTown = createColumn(
			"occTown", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, String>
		occParish = createColumn(
			"occParish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, String>
		occCountry = createColumn(
			"occCountry", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, String>
		addresstype = createColumn(
			"addresstype", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, Long>
		sezOccGenBussId = createColumn(
			"sezOccGenBussId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantGeneralBussinessAddressTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantGeneralBussinessAddressTable() {
		super(
			"nbp_sez_occ_gen_buss_address",
			SezOccupantGeneralBussinessAddressTable::new);
	}

}