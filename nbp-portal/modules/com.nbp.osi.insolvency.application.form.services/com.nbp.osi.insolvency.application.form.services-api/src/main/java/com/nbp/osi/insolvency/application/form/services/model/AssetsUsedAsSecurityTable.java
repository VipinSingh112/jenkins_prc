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
 * The table class for the &quot;nbp_osi_used_as_security&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AssetsUsedAsSecurity
 * @generated
 */
public class AssetsUsedAsSecurityTable
	extends BaseTable<AssetsUsedAsSecurityTable> {

	public static final AssetsUsedAsSecurityTable INSTANCE =
		new AssetsUsedAsSecurityTable();

	public final Column<AssetsUsedAsSecurityTable, Long>
		assetsUsedAsSecurityId = createColumn(
			"assetsUsedAsSecurityId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AssetsUsedAsSecurityTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, String> assetSecurity =
		createColumn(
			"assetSecurity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, String> assetSecurityHolder =
		createColumn(
			"assetSecurityHolder", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, String> assetDetails =
		createColumn(
			"assetDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, String> assetValue =
		createColumn(
			"assetValue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, String> assetLiability =
		createColumn(
			"assetLiability", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, String> assetNetValue =
		createColumn(
			"assetNetValue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, String> assetCounter =
		createColumn(
			"assetCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, String>
		comTotalAssetUsedSecurity = createColumn(
			"comTotalAssetUsedSecurity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssetsUsedAsSecurityTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AssetsUsedAsSecurityTable() {
		super("nbp_osi_used_as_security", AssetsUsedAsSecurityTable::new);
	}

}