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
 * The table class for the &quot;nbp_sez_dev_shareholding_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareholdingInfo
 * @generated
 */
public class SezDevShareholdingInfoTable
	extends BaseTable<SezDevShareholdingInfoTable> {

	public static final SezDevShareholdingInfoTable INSTANCE =
		new SezDevShareholdingInfoTable();

	public final Column<SezDevShareholdingInfoTable, Long>
		sezDevShareholdingInfoId = createColumn(
			"sezDevShareholdingInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezDevShareholdingInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareholdingInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareholdingInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezDevShareholdingInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareholdingInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevShareholdingInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezDevShareholdingInfoTable, String> authorised =
		createColumn(
			"authorised", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareholdingInfoTable, String> subscribed =
		createColumn(
			"subscribed", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezDevShareholdingInfoTable, String>
		paidUpShareCapital = createColumn(
			"paidUpShareCapital", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevShareholdingInfoTable, String> directorBankrupts =
		createColumn(
			"directorBankrupts", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezDevShareholdingInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezDevShareholdingInfoTable() {
		super(
			"nbp_sez_dev_shareholding_info", SezDevShareholdingInfoTable::new);
	}

}