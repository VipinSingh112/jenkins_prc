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
 * The table class for the &quot;nbp_osi_not_used_security&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AssetsNotUsedAsSecurity
 * @generated
 */
public class AssetsNotUsedAsSecurityTable
	extends BaseTable<AssetsNotUsedAsSecurityTable> {

	public static final AssetsNotUsedAsSecurityTable INSTANCE =
		new AssetsNotUsedAsSecurityTable();

	public final Column<AssetsNotUsedAsSecurityTable, Long>
		assetsNotUsedAsSecurityId = createColumn(
			"assetsNotUsedAsSecurityId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AssetsNotUsedAsSecurityTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, String> assetRealProp =
		createColumn(
			"assetRealProp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, String> assetNoValue =
		createColumn(
			"assetNoValue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, String> assetDescription =
		createColumn(
			"assetDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, String> assetNoCounter =
		createColumn(
			"assetNoCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, String>
		comTotalAssetNotUsedSecurity = createColumn(
			"comTotalAssetNotUsedSecurity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AssetsNotUsedAsSecurityTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AssetsNotUsedAsSecurityTable() {
		super("nbp_osi_not_used_security", AssetsNotUsedAsSecurityTable::new);
	}

}