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
 * The table class for the &quot;nbp_osi_insolvecy_det_asset&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssesmentDetailsOfAsset
 * @generated
 */
public class OsiAssesmentDetailsOfAssetTable
	extends BaseTable<OsiAssesmentDetailsOfAssetTable> {

	public static final OsiAssesmentDetailsOfAssetTable INSTANCE =
		new OsiAssesmentDetailsOfAssetTable();

	public final Column<OsiAssesmentDetailsOfAssetTable, Long>
		osiAssetDetailsId = createColumn(
			"osiAssetDetailsId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiAssesmentDetailsOfAssetTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiAssesmentDetailsOfAssetTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiAssesmentDetailsOfAssetTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiAssesmentDetailsOfAssetTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiAssesmentDetailsOfAssetTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiAssesmentDetailsOfAssetTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiAssesmentDetailsOfAssetTable, String>
		totalAssetUsedAsSecurity = createColumn(
			"totalAssetUsedAsSecurity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiAssesmentDetailsOfAssetTable, String>
		totalAssetNotUsedAsSec = createColumn(
			"totalAssetNotUsedAsSec", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiAssesmentDetailsOfAssetTable, String>
		totalValuesOfAsset = createColumn(
			"totalValuesOfAsset", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiAssesmentDetailsOfAssetTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiAssesmentDetailsOfAssetTable() {
		super(
			"nbp_osi_insolvecy_det_asset",
			OsiAssesmentDetailsOfAssetTable::new);
	}

}