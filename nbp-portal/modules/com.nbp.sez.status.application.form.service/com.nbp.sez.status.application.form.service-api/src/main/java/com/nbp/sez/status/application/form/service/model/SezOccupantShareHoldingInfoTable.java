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
 * The table class for the &quot;nbp_sez_occ_share_hold_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantShareHoldingInfo
 * @generated
 */
public class SezOccupantShareHoldingInfoTable
	extends BaseTable<SezOccupantShareHoldingInfoTable> {

	public static final SezOccupantShareHoldingInfoTable INSTANCE =
		new SezOccupantShareHoldingInfoTable();

	public final Column<SezOccupantShareHoldingInfoTable, Long>
		sezOccShareHolderId = createColumn(
			"sezOccShareHolderId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezOccupantShareHoldingInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantShareHoldingInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantShareHoldingInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantShareHoldingInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantShareHoldingInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantShareHoldingInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantShareHoldingInfoTable, String>
		occAuthorised = createColumn(
			"occAuthorised", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantShareHoldingInfoTable, String>
		occSubscribed = createColumn(
			"occSubscribed", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantShareHoldingInfoTable, String>
		occShareHolderCounter = createColumn(
			"occShareHolderCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantShareHoldingInfoTable, String>
		occPaidCapital = createColumn(
			"occPaidCapital", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantShareHoldingInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantShareHoldingInfoTable() {
		super(
			"nbp_sez_occ_share_hold_info",
			SezOccupantShareHoldingInfoTable::new);
	}

}