/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_insolv_tot_assets&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiIndiTotalDetailOfAssets
 * @generated
 */
public class OsiIndiTotalDetailOfAssetsTable
	extends BaseTable<OsiIndiTotalDetailOfAssetsTable> {

	public static final OsiIndiTotalDetailOfAssetsTable INSTANCE =
		new OsiIndiTotalDetailOfAssetsTable();

	public final Column<OsiIndiTotalDetailOfAssetsTable, Long>
		osiIndiTotalDetailOfAssetsId = createColumn(
			"osiIndiTotalDetailOfAssetsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiIndiTotalDetailOfAssetsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiIndiTotalDetailOfAssetsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiIndiTotalDetailOfAssetsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiIndiTotalDetailOfAssetsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiIndiTotalDetailOfAssetsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiIndiTotalDetailOfAssetsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiIndiTotalDetailOfAssetsTable, String>
		totalValueOfAssetUsedSecu = createColumn(
			"totalValueOfAssetUsedSecu", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiIndiTotalDetailOfAssetsTable, String>
		totalValueOfAssetNotUsedSecu = createColumn(
			"totalValueOfAssetNotUsedSecu", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiIndiTotalDetailOfAssetsTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiIndiTotalDetailOfAssetsTable() {
		super(
			"nbp_osi_insolv_tot_assets", OsiIndiTotalDetailOfAssetsTable::new);
	}

}