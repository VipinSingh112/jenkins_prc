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
 * The table class for the &quot;nbp_sez_dev_gen_busi_info_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGenBusinessInfoAdd
 * @generated
 */
public class SezDevGenBusinessInfoAddTable
	extends BaseTable<SezDevGenBusinessInfoAddTable> {

	public static final SezDevGenBusinessInfoAddTable INSTANCE =
		new SezDevGenBusinessInfoAddTable();

	public final Column<SezDevGenBusinessInfoAddTable, Long>
		sezDevGenBusinessInfoAddId = createColumn(
			"sezDevGenBusinessInfoAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevGenBusinessInfoAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, String> buildingNum =
		createColumn(
			"buildingNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, String> townCity =
		createColumn(
			"townCity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, String> parish =
		createColumn(
			"parish", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, String> country =
		createColumn(
			"country", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, String> telephoneNum =
		createColumn(
			"telephoneNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, String> faxNum =
		createColumn(
			"faxNum", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevGenBusinessInfoAddTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevGenBusinessInfoAddTable() {
		super(
			"nbp_sez_dev_gen_busi_info_add",
			SezDevGenBusinessInfoAddTable::new);
	}

}